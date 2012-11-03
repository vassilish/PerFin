package eu.perfin.controllers;

import eu.perfin.utils.PerfinException;
import eu.perfin.data.PFTransaction;

public interface TransactionsInterface {

	public String addTransaction(PFTransaction transaction) throws PerfinException;
	
	public String removeTransaction(String transactionId) throws PerfinException;
	
}
