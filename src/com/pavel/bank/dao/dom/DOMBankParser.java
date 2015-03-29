package com.pavel.bank.dao.dom;

import com.pavel.bank.entity.Account;
import com.pavel.bank.entity.AccountType;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMBankParser {
    private static final DOMBankParser instance = new DOMBankParser();

    public static DOMBankParser getInstance(){return instance;}

    public static List<Account> getAccounts(String resourceName) throws SAXException, IOException{
        DOMParser parser = new DOMParser();
        parser.parse("Bank.xml");
        Document document = parser.getDocument();

        Element root = document.getDocumentElement();
        List<Account> accounts = new ArrayList<Account>();
        NodeList accountNodes = root.getElementsByTagName("account");
        Account account = null;
        for (int i = 0; i < accountNodes.getLength(); i++){
            account = new Account();
            Element accountElement = (Element)accountNodes.item(i);
            account.setIBAN(accountElement.getAttribute("IBAN"));
            account.setNameOfBank(getSingleChild(accountElement, "nameOfBank").getTextContent().trim());
            account.setCountry(getSingleChild(accountElement, "country").getTextContent().trim());
            account.setTypeOfAccount(AccountType.valueOf(getSingleChild(accountElement, "typeOfAccount").getTextContent().trim().toUpperCase()));
            account.setDepositor(getSingleChild(accountElement, "depositor").getTextContent().trim());
            account.setAccountID(Long.parseLong(getSingleChild(accountElement, "accountID").getTextContent().trim()));
            account.setAmount(Double.parseDouble(getSingleChild(accountElement, "amount").getTextContent().trim()));
            account.setAnnualProfit(Float.parseFloat(getSingleChild(accountElement, "annualProfit").getTextContent().trim()));
            account.setTerm(Float.parseFloat(getSingleChild(accountElement, "term").getTextContent().trim()));
            accounts.add(account);
        }
        return accounts;
    }

    private static Element getSingleChild(Element element, String childName){
        NodeList nodeList = element.getElementsByTagName(childName);
        Element child = (Element)nodeList.item(0);
        return child;
    }

}
