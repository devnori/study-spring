package org.miyadai.app.study.controller;

import java.util.Date;

import org.miyadai.app.study.entity.Item;
import org.miyadai.app.study.enums.ItemType;
import org.miyadai.app.study.form.ItemForm;
import org.miyadai.app.study.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 品目コントローラ.
 * @author nori
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	/**
	 * 品目情報一覧.
	 * @param form アクションフォーム
	 * @param model モデル
	 * @return 入力画面HTML名
	 */
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public String index(Model model) {

		// リスト設定
		model.addAttribute("itemList", itemService.findAll());
		model.addAttribute("itemTypeList", ItemType.values());

		return "item/index";
	}

	/**
	 * 品目情報入力.
	 * @param form アクションフォーム
	 * @param model モデル
	 * @return 入力画面HTML名
	 */
	@RequestMapping(value = "/item/input", method = RequestMethod.GET)
	public String input(@ModelAttribute ItemForm form, Model model) {

		// 初期値セット
		if (StringUtils.isEmpty(form.getLotMng())){
			form.setLotMng("1");
		}
		if (StringUtils.isEmpty(form.getValidFlg())){
			form.setValidFlg("1");
		}

		// リスト設定
		model.addAttribute("itemTypeList", ItemType.values());

		return "item/input";
	}

	/**
	 * 品目情報入力確認.
	 * @param formアクションフォーム
	 * @param result フォームバインド結果
	 * @param model モデル
	 * @return 入力確認画面HTML名
	 */
	@RequestMapping(value = "/item/confirm", method = RequestMethod.POST)
	public String confirm(
			@ModelAttribute @Validated ItemForm form, BindingResult result, Model model) {

		// 入力チェックエラー有無判定
		if (result.hasErrors()) {
			// エラーありの場合は再度入力画面を表示
			return input(form, model);
		}

		// リスト設定
		model.addAttribute("itemTypeList", ItemType.values());

		// 有効フラグの値変換
		if ("1".equals(form.getValidFlg())) {
			form.setValidFlg("1");
		} else {
			form.setValidFlg("0");
		}

		return "item/confirm";
	}

	/**
	 * 品目情報登録.
	 * @param form アクションフォーム
	 * @param result フォームバインド結果
	 * @param model モデル
	 * @return 登録完了画面HTML名
	 */
	@RequestMapping(value = "/item/store", method = RequestMethod.POST)
	public String store(
			@ModelAttribute @Validated ItemForm form, BindingResult result, Model model) {

		// 入力チェックエラー有無判定
		if (result.hasErrors()) {
			// エラーありの場合はシステムエラー（パラメータ改ざん）
			return "redirect:/errors";
		}

		// フォームの値をエンティティにコピー
		Item item = new Item();
		BeanUtils.copyProperties(form, item);

		// 有効フラグの値変換
		if ("1".equals(item.getValidFlg())) {
			item.setValidFlg("1");
		} else {
			item.setValidFlg("0");
		}

		// 共通項目をセット
		Date now = new Date();
		item.setInsDate(now);
		item.setInsUser("dummy");	// セッション管理ができたらユーザをセット
		item.setUpdDate(now);
		item.setUpdUser("dummy");	// セッション管理ができたらユーザをセット

		try {
			// DBへデータを保存
			itemService.save(item);
		} catch (DuplicateKeyException dke) {
			result.addError(new FieldError(result.getObjectName(), "itemCode", "入力した品目は既に登録されています。"));
			return input(form, model);
		}

		return "item/complete";
	}
}
