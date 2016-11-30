package com.liuyang.vo;

public class DropDowmVo {
  private String id_fieldName;
  private String name_fieldName;
  private String tableName;
  
  private String where;
  
  
public DropDowmVo(String id_fieldName, String name_fieldName, String tableName, String where) {
	super();
	this.id_fieldName = id_fieldName;
	this.name_fieldName = name_fieldName;
	this.tableName = tableName;
	this.where = where;
}
public String getId_fieldName() {
	return id_fieldName;
}
public void setId_fieldName(String id_fieldName) {
	this.id_fieldName = id_fieldName;
}
public String getName_fieldName() {
	return name_fieldName;
}
public void setName_fieldName(String name_fieldName) {
	this.name_fieldName = name_fieldName;
}
public String getWhere() {
	return where;
}
public void setWhere(String where) {
	this.where = where;
}
public String getTableName() {
	return tableName;
}
public void setTableName(String tableName) {
	this.tableName = tableName;
}

  
}
