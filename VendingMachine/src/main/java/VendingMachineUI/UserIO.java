package VendingMachineUI;

import java.math.BigDecimal;

public interface UserIO {
    void print(String welcome_to_the_vending_machine);

    BigDecimal readBigDecimal(String s);

    String readString(String s);
}
