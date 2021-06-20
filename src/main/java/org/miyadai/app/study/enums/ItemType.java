package org.miyadai.app.study.enums;

public enum ItemType {

	COMMODITIES("01", "日用品"),
	GROCERY("02", "食料品"),
	CHEMICALS("03", "薬品"),
	MECHANICAL("04", "精密機器");

	/* コード. */
	private final String code;

	/* 名称. */
	private final String name;

	private ItemType(String code, String name) {
		this.code = code;
		this.name = name;
	}

	/**
	 * コードを取得します.
	 * @return コード
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 名称を取得します.
	 * @return 名称
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return code;
	}
}
