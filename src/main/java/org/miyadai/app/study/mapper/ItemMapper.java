package org.miyadai.app.study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.miyadai.app.study.entity.Item;

/**
 * 品目マッパー.
 * @author nori
 *
 */
@Mapper
public interface ItemMapper {

	List<Item> findAll();

	Item findOne(String itemCode);

	void save(Item item);

	void update(Item item);

	void delete(Item item);
}
