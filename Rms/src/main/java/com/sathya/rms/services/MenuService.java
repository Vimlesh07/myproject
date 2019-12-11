package com.sathya.rms.services;

import com.sathya.rms.entities.Menu;

public interface MenuService {
	
public Iterable<Menu> getAllMenu();
	
	public Menu insertMenu(Menu menu);
	
   public Menu updateMenu(Menu menu);
   
   public void deleteMenu(Integer id);

}
