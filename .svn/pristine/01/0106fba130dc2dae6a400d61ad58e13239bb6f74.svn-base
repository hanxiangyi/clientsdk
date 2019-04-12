package com.ideepmind.joy.sdk.cookbook;

import com.ideepmind.joy.sdk.PageData;

public class FoodPage extends PageData implements FoodAcceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 食材
	 */
	private FoodIntro[] foods;

	/**
	 * @return the foods
	 */
	public FoodIntro[] getFoods() {
		return foods;
	}

	/**
	 * @param foods the foods to set
	 */
	public void setFoods(FoodIntro[] foods) {
		this.foods = foods;
	}

	@Override
	public void accept(CookbookVisitor visitor) {
		if (foods != null) {
			for (FoodIntro f : foods) {
				visitor.visitFood(f);
			}
		}
		
	}

	
}
