package com.lsoe.coolreader;

/**
 * TODO: Describe purpose and behavior of CoolCSVColumn
 */
public class CoolColumn {

	private String columnName;
	private int columnIndex;
	private Class<?> columnType; // must be java full qualifier class name

	@SuppressWarnings("unused")
	private CoolColumn() {
	}

	public CoolColumn(String columnName, int columnIndex) {
		this(columnName, columnIndex, String.class);
	}

	public CoolColumn(String columnName, int columnIndex,
			Class<?> columnTypeClass) {
		this.columnName = columnName;
		this.columnIndex = columnIndex;
		this.columnType = columnTypeClass;
	}

	public String getColumnName() {
		return columnName;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public Class<?> getColumnType() {
		return columnType;
	}

}