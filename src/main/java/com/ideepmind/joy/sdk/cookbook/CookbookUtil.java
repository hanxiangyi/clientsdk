package com.ideepmind.joy.sdk.cookbook;

import java.util.ArrayList;
import java.util.List;

public class CookbookUtil {
	public static List<String> getCookNames(CookbookAcceptor acceptor) {
		final List<String> nameList = new ArrayList<>();
		acceptor.accept(new CookbookVisitor() {					
			@Override
			public void visitCookbook(Cookbook cookbook) {
				nameList.add(cookbook.getName());
			}
		});
		return nameList;
	}

	public static List<Cookbook> getCookbooks(CookbookAcceptor acceptor) {
		final List<Cookbook> list = new ArrayList<>();
		acceptor.accept(new CookbookVisitor() {					
			@Override
			public void visitCookbook(Cookbook cookbook) {
				list.add(cookbook);
			}
		});
		return list;
	}
	
	public static List<FoodIntro> getFoods(FoodAcceptor acceptor) {
		final List<FoodIntro> list = new ArrayList<>();
		acceptor.accept(new CookbookVisitor() {					
			@Override
			public void visitFood(FoodIntro cookbook) {
				list.add(cookbook);
			}
		});
		return list;
	}
}
