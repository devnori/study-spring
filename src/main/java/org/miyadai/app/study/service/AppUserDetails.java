package org.miyadai.app.study.service;

import org.miyadai.app.study.entity.Account;
import org.miyadai.app.study.enums.AccountType;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class AppUserDetails extends User {

	private static final long serialVersionUID = 1L;

	private final Account account;

	public AppUserDetails(Account account) {
		super(account.getUserId(), account.getPassword(),
				AuthorityUtils.createAuthorityList(
						getAuthorityList(account.getAccountType())));
		this.account = account;
	}

	private static String[] getAuthorityList(final String accountType) {
		for (AccountType accountTypeEnum : AccountType.values()) {
			if (accountTypeEnum.toString().equals(accountType)) {
				return new String[] {accountTypeEnum.getRole()};
			}
		}
		return new String[] {AccountType.USER.getRole()};
	}

	public Account getAccount() {
		return account;
	}
}
