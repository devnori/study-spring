package org.miyadai.app.study.entity;

import java.util.Date;

/**
 * アカウントエンティティ.
 * @author nori
 *
 */
public class Account {

	/* ユーザID. */
	String userId;

	/* パスワード. */
	String password;

	/* ユーザ名. */
	String userName;

	/* アカウント種別. */
	String accountType;

	/* 登録日時. */
	Date insDate;

	/* 登録ユーザ. */
	String insUser;

	/* 更新日時. */
	Date updDate;

	/* 更新ユーザ. */
	String updUser;

	/**
	 * ユーザIDを取得します.
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザIDを設定します.
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * パスワードを取得します.
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定します.
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ユーザ名を取得します.
	 * @return ユーザ名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * ユーザ名を設定します.
	 * @param userName ユーザ名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * アカウント種別を取得します.
	 * @return アカウント種別
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * アカウント種別を設定します.
	 * @param userKbn アカウント種別
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
