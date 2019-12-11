package com.sathya.rms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.rms.data.MenuRepository;
import com.sathya.rms.entities.Menu;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
    private MenuRepository menuRepository;
	

	public Iterable<Menu> getAllMenu() {
		return menuRepository.findAll();
	}

	@Transactional
	public Menu insertMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	@Transactional
	public Menu updateMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	
	public void deleteMenu(Integer id) {
	 menuRepository.deleteById(id);

	}

}
