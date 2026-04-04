package main.model;

public class Bank {
    private String bankName;
    private String accountNumber;
    private String logoPath;

    public Bank(String bankName, String accountNumber, String logoPath) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.logoPath = logoPath;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getLogoPath() {
        return logoPath;
    }
}