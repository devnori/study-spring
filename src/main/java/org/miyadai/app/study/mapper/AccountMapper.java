package org.miyadai.app.study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.miyadai.app.study.entity.Account;

/**
 * アカウントマッパー.
 * @author nori
 *
 */
@Mapper
public interface AccountMapper {

	List<Account> findAll();

	Account findOne(String userId);

	void save(Account account);

	void update(Account account);

	void delete(Account account);
}
