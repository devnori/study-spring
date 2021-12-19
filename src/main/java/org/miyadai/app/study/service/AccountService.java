package org.miyadai.app.study.service;

import java.util.List;

import org.miyadai.app.study.entity.Account;
import org.miyadai.app.study.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * アカウントサービス.
 * @author nori
 *
 */
@Service
public class AccountService {

	@Autowired
	private AccountMapper accountMapper;

	public List<Account> findAll() {
		return accountMapper.findAll();
	}

	public Account findOne(String userId) {
		return accountMapper.findOne(userId);
	}

	public void save(Account account) {
		accountMapper.save(account);
	}

	public void update(Account account) {
		accountMapper.update(account);
	}

	public void delete(Account account) {
		accountMapper.delete(account);
	}
}
