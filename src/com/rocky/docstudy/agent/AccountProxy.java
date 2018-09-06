package com.rocky.docstudy.agent;
/**
 * 代理类（增强AccountImpl的功能）
 * Created by Rocky on 2018-09-06.
 */
public class AccountProxy implements Account {

	private Account account;
	
	public AccountProxy(Account account) {
		this.account = account;
	}
	
	@Override
	public void queryAccount() {
		System.out.println("处理业务之前...");
		account.queryAccount();
		System.out.println("处理业务之后...");
	}

	@Override
	public void updateAccount() {
		System.out.println("处理业务之前...");
		account.updateAccount();
		System.out.println("处理业务之后...");
	}

	
}
