package com.advanced.todo.daggerlearn.bean;

/**
 * @author todo
 * @desc
 * @date 2017/4/29
 */
public class OrangeBean {

	String desc;

	public OrangeBean(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "OrangeBean{" +
				"desc='" + desc + '\'' +
				'}';
	}
}
