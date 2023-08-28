package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAll {

	public static void main(String[] args) {
		/*
		 * Collections.replaceAll(list,replacesrc,replaceValue)
		 */
		List<String> strings=new ArrayList<>();
		strings.add("Anusha");
		strings.add("Bhavya");
		strings.add("Catherine");
		Collections.replaceAll(strings, "Anusha", "Anusha Kalyani");
		System.out.println(strings);
	      	}
		
	}
