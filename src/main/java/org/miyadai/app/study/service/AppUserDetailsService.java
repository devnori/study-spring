package org.miyadai.app.study.service;

import org.miyadai.app.study.entity.Account;
import org.miyadai.app.study.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * ユーザ情報サービス.
 * @author nori
 *
 */
@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		Account account = accountMapper.findOne(userId);
		if (account == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new AppUserDetails(account);
	}
}
