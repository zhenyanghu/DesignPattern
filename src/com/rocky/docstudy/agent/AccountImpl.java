package com.rocky.docstudy.agent;

/**
 * 接口实现类（包含业务逻辑），即：为委托类
 * Created by Rocky on 2018-09-06.
 */
public class AccountImpl implements Account {

	@Override
	public void queryAccount() {
		System.out.println("查询...");
	}

	@Override
	public void updateAccount() {
		System.out.println("修改...");
	}

	
}
