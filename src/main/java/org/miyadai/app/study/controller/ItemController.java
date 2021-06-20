package org.miyadai.app.study.controller;

import org.miyadai.app.study.enums.ItemType;
import org.miyadai.app.study.form.ItemForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
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

		return "item/complete";
	}
}
