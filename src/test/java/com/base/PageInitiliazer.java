package com.base;

import com.pages.MainPage;

public class PageInitiliazer extends Base {

	protected static MainPage mp;

	public static void initializeAllPage() {
		mp = new MainPage();

	}
}