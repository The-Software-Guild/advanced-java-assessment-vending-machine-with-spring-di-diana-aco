package VendingMachineController;

import VendingMachineDto.Product;
import VendingMachineService.ServiceLayer;
import VendingMachineService.VendingMachineInsufficentFundsException;
import VendingMachineService.VendingMachineNoItemInventoryException;
import VendingMachineService.VendingMachinePersistenceException;
import VendingMachineUI.VendingMachineView;
import java.util.Scanner;
import java.math.BigDecimal;


import java.math.BigDecimal;

public class VendingMachineController {
    private VendingMachineView view;
    private ServiceLayer service;

    public VendingMachineController(VendingMachineView view, ServiceLayer service) {
        this.view =view;
        this.service =service;
    }


    public void run() throws VendingMachinePersistenceException {
        BigDecimal moneyDeposited = new BigDecimal("0");
        Product chosenProduct = null;
        String keepGoing = "yes";
        String input;
        Scanner scan = new Scanner(System.in);
        while(keepGoing.equals("yes")) {
            boolean isEnoughMoney = false;
            try {
                displayHeader();
                do {
                    productMenu();
                    moneyDeposited = userMoneyInput(moneyDeposited);
                    chosenProduct = getChosenProduct();
                    isEnoughMoney = didUserPutSufficientAmountOfMoney(moneyDeposited, chosenProduct);
                    if (toExitVendingMachine(isEnoughMoney)) {
                        return;
                    }

                } while (!isEnoughMoney);
                displayUserMoneyInput(moneyDeposited);
                displayChangeReturnedToUser(moneyDeposited, chosenProduct);
                updateSoldProduct(chosenProduct);
                service.saveProductList();
            } catch (VendingMachinePersistenceException ex) {
                displayErrorMessage (:ex.getMessage());
            } finally {
                displayFinalMessage();
            }
            view.displayUserResponse();
            keepGoing = scan.nextLine();
        }
    }

    private void updateSoldProduct(Product chosenProduct) {
    }

    private void displayChangeReturnedToUser(BigDecimal moneyDeposited, Product chosenProduct) {

    }

    private void displayUserMoneyInput(BigDecimal moneyDeposited) {

    }

    void displayHeader() {
        view.displayVendingMachineWelcome();
    }

    void productMenu() throws VendingMachinePersistenceException {

    try {
        view.displayProductHeader();
        for (Product p : service.loadProductsInStock().values()) {
            view.displayProduct(:p);
        }
        catch(VendingMachineNoItemInventoryException | VendingMachinePersistenceException ex)
        throw new VendingMachinePersistenceException(ex.getMessage());
    }


    }

    BigDecimal userMoneyInput(BigDecimal amount) {
        return amount.add(view.promptUserMoneyInput());

    }
    Product getChosenProduct() {
    while (true) {
        String productId = view.promptUserProductChoice();
        try {
            Product product = service.getChosenProduct(productId);
            view.displayUserChoiceOfProduct(product);
            return product;
        } catch (VendingMachineNoItemInventoryExeception ex) {
            view.displayErrorMessage(ex.getMessage());
        }
    }
    }
    boolean didUserPutSufficientAmountOfMoney(BigDecimal userAmount,Product product
    ) {
        try {
            service.checkSufficentMoneyToBuyProduct(userAmount, product);
            return true;
        } catch (VendingMachineInsufficentFundsException ex) {
            displayErrorMessage (ex.getMessage ()));


        }





}




