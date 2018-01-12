package com.yangzl.practice.web;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
@Controller
public class TestController {
	@RequestMapping("/getMenu.do")
	@ResponseBody
	public String getMenu(){
		List<MenuEntity> menuList = new ArrayList<MenuEntity>();
		MenuEntity menu = new MenuEntity();
		menu.setUrl("/t1");
		menu.setTitle("1头");
		menu.setIcon("1哈");
		MenuEntity menu2 = new MenuEntity();
		menu2.setUrl("/t2");
		menu2.setTitle("2头");
		menu2.setIcon("2哈");
		MenuEntity menu3 = new MenuEntity();
		menu3.setUrl("/t3");
		menu3.setTitle("3头");
		menu3.setIcon("3哈");
		MenuEntity menu4 = new MenuEntity();
		menu4.setUrl("/t21");
		menu4.setTitle("4头");
		menu4.setIcon("4哈");
		MenuEntity submenu = new MenuEntity();
		submenu.setUrl("/t21");
		submenu.setTitle("21头");
		submenu.setIcon("21哈");
		MenuEntity submenu2 = new MenuEntity();
		submenu2.setUrl("/t22");
		submenu2.setTitle("22头");
		submenu2.setIcon("22哈");
		MenuEntity submenu3 = new MenuEntity();
		submenu3.setUrl("/t23");
		submenu3.setTitle("23头");
		submenu3.setIcon("23哈");
		List<MenuEntity> submenuList = new ArrayList<MenuEntity>();
		submenuList.add(submenu);
		submenuList.add(submenu2);
		submenuList.add(submenu3);
		menu4.setSubMenu(submenuList);
		menuList.add(menu);
		menuList.add(menu2);
		menuList.add(menu3);
		menuList.add(menu4);
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("menuList",menuList);
		return JSON.toJSONString(retMap);
	} 

}
