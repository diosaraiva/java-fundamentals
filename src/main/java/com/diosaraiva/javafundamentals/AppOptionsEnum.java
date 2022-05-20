package com.diosaraiva.javafundamentals;

import com.diosaraiva.javafundamentals.designpatterns.behavioral.chainofresponsibility.ChainofResponsibilityPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.command.CommandPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.interpreter.InterpreterPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.iterator.IteratorPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.mediator.MediatorPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.memento.MementoPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.observer.ObserverPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.state.StatePattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.strategy.StrategyPattern;
import com.diosaraiva.javafundamentals.designpatterns.behavioral.template.TemplatePattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.abstractfactory.AbstractFactoryPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.builder.BuilderPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod.FactoryMethodPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.objectpool.ObjectPoolPattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.prototype.PrototypePattern;
import com.diosaraiva.javafundamentals.designpatterns.creational.singleton.SingletonPattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.adapter.AdapterPattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.bridge.BridgePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.composite.CompositePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.decorator.DecoratorPattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.facade.FacadePattern;
import com.diosaraiva.javafundamentals.designpatterns.structural.proxy.ProxyPattern;
import com.diosaraiva.javafundamentals.interfaces.collection.Lists;
import com.diosaraiva.javafundamentals.interfaces.map.Maps;

public enum AppOptionsEnum{
	PATTERNS_CHAINOFRESPONSIBILITY	("design-patterns/behavioral/chainofresponsibility"),
	PATTERNS_COMMAND				("design-patterns/behavioral/command"),
	PATTERNS_INTERPRETER			("design-patterns/behavioral/interpreter"),
	PATTERNS_ITERATOR				("design-patterns/behavioral/iterator"),
	PATTERNS_MEDIATOR				("design-patterns/behavioral/mediator"),
	PATTERNS_MEMENTO				("design-patterns/behavioral/memento"),
	PATTERNS_OBSERVER				("design-patterns/behavioral/observer"),
	PATTERNS_STATE					("design-patterns/behavioral/state"),
	PATTERNS_STRATEGY				("design-patterns/behavioral/strategy"),
	PATTERNS_TEMPLATE				("design-patterns/behavioral/template"),
	PATTERNS_ABSTRACT				("design-patterns/creational/abstractfactory"),
	PATTERNS_BUILDER				("design-patterns/creational/builder"),
	PATTERNS_FACTORY				("design-patterns/creational/factorymethod"),
	PATTERNS_OBJECTPOOL				("design-patterns/creational/objectpool"),
	PATTERNS_PROTOTYPE				("design-patterns/creational/prototype"),
	PATTERNS_SINGLETON				("design-patterns/creational/singleton"),
	PATTERNS_ADAPTER				("design-patterns/structural/adapter"),
	PATTERNS_BRIDGE					("design-patterns/structural/bridge"),
	PATTERNS_COMPOSITE				("design-patterns/structural/composite"),
	PATTERNS_DECORATOR				("design-patterns/structural/decorator"),
	PATTERNS_FACADE					("design-patterns/structural/facade"),
	PATTERNS_PROXY					("design-patterns/structural/proxy"),
	COLLECTION_LIST					("interfaces/collection/lists"),
	MAP_MAPS						("interfaces/map/maps");

	public static void runOptionEnum(String option) throws Exception{
		switch (getEnum(option)){

		case PATTERNS_CHAINOFRESPONSIBILITY: 	ChainofResponsibilityPattern.ChainofResponsibilityDemo();	break;
		case PATTERNS_COMMAND:				 	CommandPattern.CommandDemo();								break;
		case PATTERNS_INTERPRETER:			 	InterpreterPattern.InterpreterPatternDemo();				break;
		case PATTERNS_ITERATOR:			 		IteratorPattern.IteratorPatternDemo();						break;
		case PATTERNS_MEDIATOR:			 		MediatorPattern.MediatorPatternDemo();						break;
		case PATTERNS_MEMENTO:			 		MementoPattern.MementoPatternDemo();						break;
		case PATTERNS_OBSERVER:			 		ObserverPattern.ObserverPatternDemo();						break;
		case PATTERNS_STATE:			 		StatePattern.StatePatternDemo();							break;
		case PATTERNS_STRATEGY:			 		StrategyPattern.StrategyPatternDemo();						break;
		case PATTERNS_TEMPLATE:			 		TemplatePattern.TemplatePatternDemo();						break;
		case PATTERNS_ABSTRACT: 				AbstractFactoryPattern.AbstractFactoryPatternDemo();		break;
		case PATTERNS_BUILDER:					BuilderPattern.BuilderPatternDemo();	 					break;
		case PATTERNS_FACTORY:					FactoryMethodPattern.FactoryMethodPatternDemo();			break;
		case PATTERNS_OBJECTPOOL: 				ObjectPoolPattern.ObjectPoolPatternDemo();					break;
		case PATTERNS_PROTOTYPE: 				PrototypePattern.PrototypePatternDemo();					break;
		case PATTERNS_SINGLETON: 				SingletonPattern.SingletonPatternDemo();					break;
		case PATTERNS_ADAPTER: 					AdapterPattern.AdapterPatternDemo();						break;
		case PATTERNS_BRIDGE: 					BridgePattern.BridgePatternDemo();							break;
		case PATTERNS_COMPOSITE: 				CompositePattern.CompositePatternDemo();					break;
		case PATTERNS_DECORATOR: 				DecoratorPattern.DecoratorPatternDemo();					break;
		case PATTERNS_FACADE: 					FacadePattern.FacadePatternDemo();							break;
		case PATTERNS_PROXY: 					ProxyPattern.ProxyPatternDemo();							break;
		case COLLECTION_LIST:	 				Lists.printAllLists();										break;
		case MAP_MAPS:							Maps.printAllMaps();										break;

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