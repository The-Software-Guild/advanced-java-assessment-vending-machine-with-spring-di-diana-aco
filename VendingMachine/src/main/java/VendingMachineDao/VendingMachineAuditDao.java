package VendingMachineDao;

import VendingMachineService.VendingMachinePersistenceException;

public interface VendingMachineAuditDao {
    public void writeAuditEntry (String entry) throws VendingMachinePersistenceException;

}
