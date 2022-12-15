package VendingMachineService;

import VendingMachineDto.Change;
import VendingMachineDto.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ServiceLayer {
    public Map< String, Product> loadProductsInStock() throws VendingMachinePersistenceException,;
    public void saveProductList() throws VendingMachinePersistenceException;
    public Product getChosenProduct (String productId) throws VendingMachineNoItemInventoryException;
    public void checkSufficentMoneytoBuyProduct (BigDecimal inputAmount, Product product) throws VendingMachineInsufficentFundsException;
    public Change calculateChange (BigDecimal amount, Product product);
    public void updateProductSale (Product product) throws VendingMachineNoItemInventoryException,




    }
