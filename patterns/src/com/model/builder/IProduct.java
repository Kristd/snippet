package com.model.builder;

public abstract class IProduct {
	private String m_desc;
	
	public void consStr(String str) {
		if(null == m_desc) {
			m_desc = str;
		}
		else {
			m_desc += str;
		}
	}
	
	public void Show() {
		System.out.print(m_desc + '\n');
	}
}
