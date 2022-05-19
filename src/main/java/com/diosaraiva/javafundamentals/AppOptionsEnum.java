package com.diosaraiva.javafundamentals;

import java.io.IOException;

import com.diosaraiva.javafundamentals.designpatterns.behavioral.chainofresponsibility.ChainofResponsibility;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.command.Command;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.interpreter.Interpreter;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.iterator.IteratorPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.mediator.Mediator;
import com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory.AbstractFactory;
import com.diosaraiva.javafundamentals.designpatterns.creational.builder.Builder;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethod;
import com.diosaraiva.javafundamentals.designpatterns.creational.objectpool.ObjectPoolPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.prototype.PrototypePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.adapter.Adapter;
import com.diosaraiva.javafundamentals.designpatterns.structural.bridge.Bridge;
import com.diosaraiva.javafundamentals.designpatterns.structural.composite.Composite;
import com.diosaraiva.javafundamentals.designpatterns.structural.decorator.Decorator;
import com.diosaraiva.javafundamentals.designpatterns.structural.facade.Facade;
import com.diosaraiva.javafundamentals.designpatterns.structural.proxy.Proxy;
import com.diosaraiva.javafundamentals.interfaces.collection.Lists;
import com.diosaraiva.javafundamentals.interfaces.map.Maps;
import com.diosaraiva.javafundamentals.utils.properties.PropertiesUtils;
import com.diosaraiva.javafundamentals.utils.regex.RegexUtils;

public enum AppOptionsEnum{
	PATTERNS_CHAINOFRESPONSIBILITY	("design-patterns/behavioral/chainofresponsibility"),
	PATTERNS_COMMAND				("design-patterns/behavioral/command"),
	PATTERNS_INTERPRETER			("design-patterns/behavioral/interpreter"),
	PATTERNS_ITERATOR				("design-patterns/behavioral/iterator"),
	PATTERNS_MEDIATOR				("design-patterns/behavioral/mediator"),
	PATTERNS_ABSTRACT				("design-patterns/creational/abstractfactory"),
	PATTERNS_BUILDER				("design-patterns/creational/builder"),
	PATTERNS_FACTORY				("design-patterns/creational/factorymethod"),
	PATTERNS_OBJECTPOOL				("design-patterns/creational/objectpool"),
	PATTERNS_PROTOTYPE				("design-patterns/creational/prototype"),
	PATTERNS_ADAPTER				("design-patterns/structural/adapter"),
	PATTERNS_BRIDGE					("design-patterns/structural/bridge"),
	PATTERNS_COMPOSITE				("design-patterns/structural/composite"),
	PATTERNS_DECORATOR				("design-patterns/structural/decorator"),
	PATTERNS_FACADE					("design-patterns/structural/facade"),
	PATTERNS_PROXY					("design-patterns/structural/proxy"),
	COLLECTION_LIST					("interfaces/collection/lists"),
	MAP_MAPS						("interfaces/map/maps"),
	UTILS_PROPERTIESREAD			("utils/properties/read"),
	UTILS_REGEXISNUMERIC			("utils/regex/isnumeric");

	public static void runOptionEnum(String option) throws IOException{
		switch (getEnum(option)){

		case PATTERNS_CHAINOFRESPONSIBILITY: 	ChainofResponsibility.GetChainInfo();	break;
		case PATTERNS_COMMAND:				 	Command.OpenAndSave();					break;
		case PATTERNS_INTERPRETER:			 	Interpreter.InfixToPostfix();			break;
		case PATTERNS_ITERATOR:			 		IteratorPattern.PrintNames();			break;
		case PATTERNS_MEDIATOR:			 		Mediator.CallMediator();				break;
		case PATTERNS_ABSTRACT: 				AbstractFactory.GetLoan();				break;
		case PATTERNS_BUILDER:					Builder.BuildCds(); 					break;
		case PATTERNS_FACTORY:					FactoryMethod.GenerateBill();			break;
		case PATTERNS_OBJECTPOOL: 				ObjectPoolPattern.TestObjectPool();		break;
		case PATTERNS_PROTOTYPE: 				PrototypePattern.PrintRecords();		break;
		case PATTERNS_ADAPTER: 					Adapter.GetCreditCard();				break;
		case PATTERNS_BRIDGE: 					Bridge.askQuestions();					break;
		case PATTERNS_COMPOSITE: 				Composite.getCashiers();				break;
		case PATTERNS_DECORATOR: 				Decorator.orderFood();					break;
		case PATTERNS_FACADE: 					Facade.getMobileShop();					break;
		case PATTERNS_PROXY: 					Proxy.grantAccess();					break;
		case COLLECTION_LIST:	 				Lists.printAllLists();					break;
		case MAP_MAPS:							Maps.printAllMaps();					break;
		case UTILS_PROPERTIESREAD: 				PropertiesUtils.ReadProperties();		break;
		case UTILS_REGEXISNUMERIC: 				RegexUtils.testIsNumeric();				break;

		}
	}

	public String getEnumOption(){
		return enumOption;
	}

	private final String enumOption;

	private AppOptionsEnum(String enumOption){
		this.enumOption = enumOption;
	}

	private static AppOptionsEnum getEnum(String enumOption){
		for (AppOptionsEnum e : values()){
			if (e.enumOption.equals(enumOption)) return e;
		}
		return null;
	}
}