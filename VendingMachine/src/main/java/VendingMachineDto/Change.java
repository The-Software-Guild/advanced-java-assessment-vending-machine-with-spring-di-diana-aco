package VendingMachineDto;

import java.math.BigDecimal;

public class Change {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    //Constructor to initialize the change

    public Change(BigDecimal amount) {
        this.quarters = amount.divide(new BigDecimal("25")).intValue();
        amount = amount.remainder(new BigDecimal("25"));
        this.dimes = amount.divide(new BigDecimal("10")).intValue();
        amount = amount.remainder(new BigDecimal("10"));
        this.nickels = amount.divide(new BigDecimal("5")).intValue();
        this.pennies = amount.divide(new BigDecimal("1")).intValue();
    }
//Getter methods
    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }
}
