package com.rocky.docstudy.agent;
/**
 * 测试Account
 * Created by Rocky on 2018-09-06.
 */
public class TestAccount {

	public static void main(String[] args) {
		//传入要调用的业务对象
		AccountProxy account = new AccountProxy(new AccountImpl());
		account.queryAccount();
		account.updateAccount();
	}
}
