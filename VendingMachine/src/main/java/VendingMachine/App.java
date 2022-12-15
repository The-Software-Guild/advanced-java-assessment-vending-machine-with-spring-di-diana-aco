package VendingMachine;


import VendingMachineController.VendingMachineController;
import VendingMachineDao.VendingMachineDao;
import VendingMachineDao.VendingMachineDaoImpl;
import VendingMachineDao.VendingMachineAuditDao;
import VendingMachineDao.VendingMachineAuditDaoImpl;
import VendingMachineService.ServiceLayer;
import VendingMachineService.VendingMachinePersistenceException;
import VendingMachineService.VendingMachineServiceLayerImpl;
import VendingMachineUI.UserIO;
import VendingMachineUI.UserIOImpl;
import VendingMachineUI.VendingMachineView;

public class App {
    public static void main(String[] args) {
        public static void main(String[] args) throws VendingMachinePersistenceException {
            UserIO myIo = new UserIOImpl();
            VendingMachineView myView = new VendingMachineView(myIo);
            VendingMachineDao myDao = new VendingMachineDaoImpl();
            VendingMachineAuditDao myAuditDao = new VendingMachineAuditDaoImpl();
            ServiceLayer myService = new VendingMachineServiceLayerImpl(myDao,);
            VendingMachineController myController = new VendingMachineController(myView,);
            myController.run();

        }


    }
}