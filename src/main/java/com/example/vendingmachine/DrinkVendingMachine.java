public class DrinkVendingMachine extends VendingMachine implements IFVendingMachine {
    private String drinkType;

    public DrinkVendingMachine(int stock, int price, String drinkType) {
        super(stock, price);
        this.drinkType = drinkType;
    }

    @Override
    public void showStock() {
        System.out.println("飲み物自販機 - 在庫" + getStock() + "個、価格：" + getPrice() + "円、商品：" + drinkType);
    }

    @Override
    public void buy() {
        int stock = getStock();
        if (stock > 0) {
            setStock(stock - 1);
            System.out.println("飲み物自販機 - 商品(" + drinkType + ")購入しました");
        } else {
            System.out.println("飲み物自販機 - 商品(" + drinkType + ")在庫切れです");
        }
    }

    @Override
    public void refillStock(int amount) {
        setStock(getStock() + amount);
        System.out.println("飲み物自販機 - " + drinkType + "の在庫を" + amount + "個補充しました");
    }
}