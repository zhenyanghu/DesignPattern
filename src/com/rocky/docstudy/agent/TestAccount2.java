package com.rocky.docstudy.agent;

/**
 * 测试动态代理
 * Created by Rocky on 2018-09-13.
 */
public class TestAccount2 {

	public static void main(String[] args) {
		MyProxy proxy = new MyProxy();
		// 在这里进行真正的对象传入
		Account account = (Account) proxy.getInstance(new AccountImpl());
		account.queryAccount();
		account.updateAccount();
	}
}
