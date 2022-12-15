package VendingMachineUI;

import VendingMachineDto.Change;
import VendingMachineDto.CoinValue;
import VendingMachineDto.Product;

import java.math.BigDecimal;

public class VendingMachineView {
    public UserIO io;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    public void displayVendingMachineWelcome() {
        io.print("Welcome to the Vending Machine");
    }
    public void displayProductHeader(){
        io.print("No\tProduct\t\tPrice");
        io.print("-------------------------");
    }
    public void displayProduct(Product product) {
        io.print(product.getProductId() + "\t" + product.getProductName()+ "\t\t" +product.getPrice());
    }
    public BigDecimal promptUserMoneyInput () {
        return io.readBigDecimal("\nPlease put in Money: ");
    }
    public String promptUserProductChoice (){
        return io.readString("Please Choose the product you would like to buy (Enter a number): ");

    }
    public void displayUserChoiceOfProduct(Product product) {
        io.print("You have chosen " + product.getProductName()+ " . ");
    }
    public void displayUserMoneyInput(BigDecimal amount) {
        io.print("You have deposited $ " + amount + " . ");
    }
    public void displayChangeDue(Change change) {
        io.print("The change due:");
        io.print(CoinValue.QUARTERS+ " : " + change.getQuarters());
        io.print(CoinValue.DIMES+ " : " + change.getDimes());
        io.print(CoinValue.NICKELS+ " : " + change.getNickels());
        io.print(CoinValue.PENNIES+ " : " + change.getPennies());
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("===ERROR===");
        io.print("errorMsg");
    }
    public boolean toExit() {
        String answer = io.readString("Do you want to exit Vending Machine?(y/n)".)
                if (answer.startsWith("y")) {
                    return true;
                } else {
                    return false;
                }
    }
    public void displayFinalMessage() {
        io.print("Thank you for using the Vending Machine");
    }
    public void displayUserResponse()
    {
        io.print("***Would you like to make another selection?");

    }
}
