public class VendingMachine {
    private int stock;
    private int price;

    public VendingMachine() {}

    public VendingMachine(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("在庫は0以上の値を設定して下さい");
        }
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("価格は0以上の値を設定して下さい");
        }
    }

    public void showStock() {
        System.out.println("在庫" + stock + "個、価格：" + price + "円");
    }

    public void buy() {
        if (stock > 0) {
            stock--;
            System.out.println("購入しました");
        } else {
            System.out.println("在庫切れです");
        }
    }
}