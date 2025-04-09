import java.util.Date;
import java.util.List;

// Агуулах
class Warehouse {
    private String name;
    private Storekeeper storekeeper;
    private List<Item> items;

    public Warehouse(String name, Storekeeper storekeeper) {
        this.name = name;
        this.storekeeper = storekeeper;
    }

    public void receiveItems(Receipt receipt) {}
    public void issueItems(Issue issue) {}
    public Report generateReport(Date startDate, Date endDate) { return null; }
}