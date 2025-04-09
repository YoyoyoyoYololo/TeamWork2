class Storekeeper {
    private String name;
    private Warehouse warehouse;

    public Storekeeper(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    public void performStockCheck(StockCheck stockCheck) {}
}
