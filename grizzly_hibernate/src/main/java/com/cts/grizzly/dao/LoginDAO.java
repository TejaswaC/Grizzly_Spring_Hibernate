package com.cts.grizzly.dao;

import com.cts.product.bean.Login;

public interface LoginDAO {

	public Login authenticate(String userName, String password);
}
