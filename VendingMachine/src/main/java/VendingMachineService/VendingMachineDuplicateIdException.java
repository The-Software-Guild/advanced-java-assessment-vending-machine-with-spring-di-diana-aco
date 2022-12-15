package VendingMachineService;

public class VendingMachineDuplicateIdException extends Exception {

    public VendingMachineInsufficentFundsException( String message) {
        super(message);
    }

    public VendingMachineInsufficentFundsException (String message, Throwable cause) {
        super(message, cause);
    }
}
