public class SnackVendingMachine extends VendingMachine implements IFVendingMachine {
    private String snackType;

    public SnackVendingMachine(int stock, int price, String snackType) {
        super(stock, price);
        this.snackType = snackType;
    }

    @Override
    public void showStock() {
        System.out.println("スナック自販機 - 在庫" + getStock() + "個、価格：" + getPrice() + "円、商品：" + snackType);
    }

    @Override
    public void buy() {
        int stock = getStock();
        if (stock > 0) {
            setStock(stock - 1);
            System.out.println("スナック自販機 - 商品(" + snackType + ")購入しました");
        } else {
            System.out.println("スナック自販機 - 商品(" + snackType + ")在庫切れです");
        }
    }

    @Override
    public void refillStock(int amount) {
        setStock(getStock() + amount);
        System.out.println("スナック自販機 - " + snackType + "の在庫を" + amount + "個補充しました");
    }
}