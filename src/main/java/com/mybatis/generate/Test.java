package com.mybatis.generate;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int aa = 2<<3;
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("aaa", 123);
		map.put("bbb", 123);
 		System.out.println(map.get("bbb").equals(map.get("aaa")));
	}
}
