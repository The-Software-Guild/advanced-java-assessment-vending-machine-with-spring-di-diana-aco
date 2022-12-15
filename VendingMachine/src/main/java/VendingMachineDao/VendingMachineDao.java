package VendingMachineDao;

import VendingMachineDto.Product;
import VendingMachineService.VendingMachinePersistenceException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VendingMachineDao {

    Product addProduct(String productId, Product product);

    List<Product> getAllProducts();

    List<String> getAllProductIds();

    Product getProduct(String productId);

    Product updateProduct(String productId, Product product);

    Product removeProduct(String productId);

    Map<String, Product> loadProductsFromFile() throws VendingMachinePersistenceException;

    void writeProductsToFile() throws VendingMachinePersistenceException;



}
