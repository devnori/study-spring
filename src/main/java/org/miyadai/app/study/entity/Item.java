package org.miyadai.app.study.entity;

import java.util.Date;

/**
 * 品目エンティティ.
 * @author nori
 *
 */
public class Item {

	/* 品目コード. */
	String itemCode;

	/* 品目名. */
	String itemName;

	/* 備考. */
	String note;

	/* 品目種別. */
	String itemType;

	/* ロット管理. */
	String lotMng;

	/* 有効フラグ. */
	String validFlg;

	/* 登録日時. */
	Date insDate;

	/* 登録ユーザ. */
	String insUser;

	/* 更新日時. */
	Date updDate;

	/* 更新ユーザ. */
	String updUser;

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
	 * 備考を設定します.
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
	 * 品目種別を設定します.
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
	 * ロット管理を設定します.
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
	 * 有効フラグを設定します.
	 * @param validFlg 有効フラグ
	 */
	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}

	/**
	 * 登録日時を取得します.
	 * @return 登録日時
	 */
	public Date getInsDate() {
		return insDate;
	}

	/**
	 * 登録日時を設定します.
	 * @param insDate 登録日時
	 */
	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	/**
	 * 登録ユーザを取得します.
	 * @return 登録ユーザ
	 */
	public String getInsUser() {
		return insUser;
	}

	/**
	 * 登録ユーザを設定します.
	 * @param insUser 登録ユーザ
	 */
	public void setInsUser(String insUser) {
		this.insUser = insUser;
	}

	/**
	 * 更新日時を取得します.
	 * @return 更新日時
	 */
	public Date getUpdDate() {
		return updDate;
	}

	/**
	 * 更新日時を設定します.
	 * @param updDate 更新日時
	 */
	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	/**
	 * 更新ユーザを取得します.
	 * @return 更新ユーザ
	 */
	public String getUpdUser() {
		return updUser;
	}

	/**
	 * 更新ユーザを設定します.
	 * @param updUser 更新ユーザ
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
}
