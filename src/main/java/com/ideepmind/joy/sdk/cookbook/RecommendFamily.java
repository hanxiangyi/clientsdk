package com.ideepmind.joy.sdk.cookbook;

import java.io.Serializable;

/**
 * @author tby
 * 家庭推荐页
 */
public class RecommendFamily implements Serializable, CookbookAcceptor, QueryIdAcceptor {
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private RecommendPage[] pages;

    /**
     * @return the pages
     */
    public final RecommendPage[] getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public final void setPages(RecommendPage[] pages) {
        this.pages = pages;
    }
    
    public void accept(CookbookVisitor visitor) {
		if (pages != null) {
			for (RecommendPage c : pages) {
				c.accept(visitor);
			}
		}
	}

	@Override
	public void accept(QueryIdVisitor visitor) {
		if (pages != null) {
			for (RecommendPage c : pages) {
				c.accept(visitor);
			}
		}
		
	}
}
