package eu.perfin.controllers;

//import eu.perfin.enums.TransactionTypeEnum;

import eu.perfin.utils.PerfinException;
import eu.perfin.enums.TransactionTypeEnum;


public interface CalculationsInterface {
	
	public String calculateTotalPerCategory(String categoryId) throws PerfinException;
	
	public String calculateTotalPerTransactionType(TransactionTypeEnum myType) throws PerfinException;

	public String calculateTotalIncomes() throws PerfinException;
	
	public String calculateTotalExpenses() throws PerfinException;
	
	public String calculatePresentCapitalAmount() throws PerfinException;

}
