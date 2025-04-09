import java.util.Date;
import java.util.List;


class Receipt {
    private Date date;
    private List<Item> items;
    private String receivedBy;

    public Receipt(Date date, List<Item> items, String receivedBy) {
        this.date = date;
        this.items = items;
        this.receivedBy = receivedBy;
    }
}