package com.rocky.docstudy.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理类
 * Created by Rocky on 2018-09-13.
 */
public class MyProxy implements InvocationHandler {

	/**
	 * 委托类的对象
	 */
	private Object target;
	
	/**
	 * 绑定委托对象并返回一个代理类
	 * @param target 委托类的对象
	 * @return
	 */
	public Object getInstance(Object target) {
		//绑定委托对象
		this.target = target;
		//取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	/**
	 * 调用方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("before");
		//执行方法
		result = method.invoke(target, args);
		System.out.println("after");
		return result;
	}

}
