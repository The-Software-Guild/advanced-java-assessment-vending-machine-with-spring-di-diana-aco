package VendingMachineService;

import VendingMachineDao.VendingMachineDao;
import VendingMachineDto.Product;
import VendingMachineDao.VendingMachineAuditDao;


import java.util.List;

public class VendingMachineServiceLayerImpl {
    VendingMachineDao dao;
    private VendingMachineAuditDao auditDao;


    //dependency injection using constructor
    public VendingMachineServiceLayerImpl(VendingMachineDao dao, VendingMachineAuditDao auditDao)
        this.dao =dao;
        this.auditDao =auditDao;



    private void validateProductInStock(String productId) throws VendingMachineNoItemInventoryException
    List <String> ids = dao.getAllProductIds();{
        Product product = dao.getProduct(productId);
        if (!ids.contains(productId) || product.getItemsInStock () < 1))
        throw new VendingMachineNoItemInventoryException("Selected Product is not in stock");

    }


}





