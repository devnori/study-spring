package org.miyadai.app.study.service;

import java.util.List;

import org.miyadai.app.study.entity.Item;
import org.miyadai.app.study.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 品目サービス.
 * @author nori
 *
 */
@Service
public class ItemService {

	@Autowired
	private ItemMapper itemMapper;

	public List<Item> findAll() {
		return itemMapper.findAll();
	}

	public Item findOne(String itemCode) {
		return itemMapper.findOne(itemCode);
	}

	public void save(Item item) {
		itemMapper.save(item);
	}

	public void update(Item item) {
		itemMapper.update(item);
	}

	public void delete(Item item) {
		itemMapper.delete(item);
	}
}
