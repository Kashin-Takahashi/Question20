public class MainApp {
    public static void main(String[] args) {

        SnackVendingMachine snackMachine = new SnackVendingMachine(10, 150, "ポテトチップス");
        DrinkVendingMachine drinkMachine = new DrinkVendingMachine(20, 120, "コーラ");

        IFVendingMachine[] machines = {snackMachine, drinkMachine};

        for (IFVendingMachine machine : machines) {
            machine.showStock();
            machine.buy();
            machine.refillStock(5);
            machine.showStock();
            System.out.println("--------------------");
        }
    }
}