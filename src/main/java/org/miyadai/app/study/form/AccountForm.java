package org.miyadai.app.study.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * アカウントフォーム.
 * @author nori
 *
 */
public class AccountForm implements Serializable {

	/* ユーザID. */
	@NotBlank
	@Size(min = 1, max = 50)
	private String userId;

	/* パスワード. */
	@NotBlank
	@Size(min = 1, max = 50)
	private String password;

	/* ユーザ名. */
	@NotBlank
	@Size(min = 1, max = 200)
	private String userName;

	/* アカウント種別. */
	@NotNull
	@Pattern(regexp = "01|02|03")
	private String accountType;

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
	 * @param itemName パスワード
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
	 * @param accountType アカウント種別
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
