package com.yangzl.practice.web;

import java.util.List;

public class MenuEntity {
	private String url;
	private String title;
	private String icon;
	private List<MenuEntity> subMenu;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<MenuEntity> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<MenuEntity> subMenu) {
		this.subMenu = subMenu;
	}
	
}
