package com.diosaraiva.javafundamentals.designpatterns.behavioral.chainofresponsibility;

/*
 In chain of responsibility, sender sends a request to a chain of objects. The request can be handled by any object in the chain.

 A Chain of Responsibility Pattern says that just "avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request". For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

 In other words, we can say that normally each receiver contains reference of another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

 Advantage of Chain of Responsibility Pattern:
 - It reduces the coupling;
 - It adds flexibility while assigning the responsibilities to objects;
 - It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.
 
 Usage of Chain of Responsibility Pattern:
 It is used:
 - When more than one object can handle a request and the handler is unknown;
 - When the group of objects that can handle the request must be specified in dynamic way.

 https://www.javatpoint.com/chain-of-responsibility-pattern
 */
public class ChainofResponsibility {
	public static void GetChainInfo(){
		Logger chainLogger= ChainofResponsibilityClient.doChaining();  

		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");  
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");  
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
	}
}  