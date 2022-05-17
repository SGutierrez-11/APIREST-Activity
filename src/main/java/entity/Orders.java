package entity;

public class Orders {

    private int id;
    private long creationDate;
    private long payDate;
    private int isPay;
    private int amountProduct;
    private int userId;

    public Orders() {
    }

    public Orders(int id, long creationDate, long payDate, int isPay, int amountProduct, int userId) {
        this.id = id;
        this.creationDate = creationDate;
        this.payDate = payDate;
        this.isPay = isPay;
        this.amountProduct = amountProduct;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getPayDate() {
        return payDate;
    }

    public void setPayDate(long payDate) {
        this.payDate = payDate;
    }

    public int getIsPay() {
        return isPay;
    }

    public void setIsPay(int isPay) {
        this.isPay = isPay;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
