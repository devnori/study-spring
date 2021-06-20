package org.miyadai.app.study.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 品目フォーム.
 * @author nori
 *
 */
public class ItemForm implements Serializable {

	/* 品目コード. */
	@NotBlank
	@Size(min = 10, max = 10)
	private String itemCode;

	/* 品目名. */
	@NotBlank
	@Size(min = 1, max = 256)
	private String itemName;

	/* 備考. */
	@Size(min = 0, max = 2000)
	private String note;

	/* 品目種別. */
	@NotNull
	@Pattern(regexp = "01|02|03|04")
	private String itemType;

	/* ロット管理. */
	@NotNull
	@Pattern(regexp = "1|0")
	private String lotMng;

	/* 有効フラグ */
	@Pattern(regexp = "on")
	private String validFlg;

	/**
	 * 品目コードを取得します.
	 * @return 品目コード
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * 品目コードを設定します.
	 * @param itemCode 品目コード
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * 品目名を取得します.
	 * @return 品目名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 品目名を設定します.
	 * @param itemName 品目名
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 備考を取得します.
	 * @return 備考
	 */
	public String getNote() {
		return note;
	}

	/**
	 * 備考設定します.
	 * @param note 備考
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * 品目種別を取得します.
	 * @return 品目種別
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * 品目種別設定します.
	 * @param itemType 品目種別
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * ロット管理を取得します.
	 * @return ロット管理
	 */
	public String getLotMng() {
		return lotMng;
	}

	/**
	 * ロット管理設定します.
	 * @param lotMng ロット管理
	 */
	public void setLotMng(String lotMng) {
		this.lotMng = lotMng;
	}

	/**
	 * 有効フラグを取得します.
	 * @return 有効フラグ
	 */
	public String getValidFlg() {
		return validFlg;
	}

	/**
	 * 有効フラグ設定します.
	 * @param validFlg 有効フラグ
	 */
	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}
}
