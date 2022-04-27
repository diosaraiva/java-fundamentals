package com.diosaraiva.javafundamentals;

public enum AppOptionsEnum{
	PATTERNS_ABSTRACT		("design-patterns/creational/abstractfactory"),
	PATTERNS_BUILDER		("design-patterns/creational/builder"),
	PATTERNS_FACTORY		("design-patterns/creational/factorymethod"),
	PATTERNS_OBJECTPOOL		("design-patterns/creational/objectpool"),
	PATTERNS_PROTOTYPE		("design-patterns/creational/prototype"),
	PATTERNS_ADAPTER		("design-patterns/structural/adapter"),
	PATTERNS_BRIDGE			("design-patterns/structural/bridge"),
	PATTERNS_COMPOSITE		("design-patterns/structural/composite"),
	PATTERNS_DECORATOR		("design-patterns/structural/decorator"),
	PATTERNS_FACADE			("design-patterns/structural/facade"),
	PATTERNS_PROXY			("design-patterns/structural/proxy"),
	COLLECTION_ARRAYLIST	("interfaces/collection/arraylist"),
	COLLECTION_LINKEDLIST	("interfaces/collection/linkedlist"),
	COLLECTION_STACK		("interfaces/collection/stack"),
	COLLECTION_VECTOR		("interfaces/collection/vector"),
	UTILS_PROPERTIESREAD	("utils/properties/read"),
	UTILS_REGEXISNUMERIC	("utils/regex/isnumeric");

	private final String enumOption;

	private AppOptionsEnum(String enumOption){
		this.enumOption = enumOption;
	}

	public String getEnumOption(){
		return enumOption;
	}

	public static AppOptionsEnum getEnum(String enumOption){
		for (AppOptionsEnum e : values()){
			if (e.enumOption.equals(enumOption)) return e;
		}
		return null;
	}
}