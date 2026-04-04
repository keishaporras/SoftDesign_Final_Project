package main.model;

import java.util.ArrayList;

public class BankStore {

    private static ArrayList<Bank> banks = new ArrayList<>();

    public static void addBank(Bank bank){
        banks.add(bank);
    }

    public static ArrayList<Bank> getBanks(){
        return banks;
    }
}