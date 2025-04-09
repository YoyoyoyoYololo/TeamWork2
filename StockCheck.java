import java.util.Date;
import java.util.List;


class StockCheck {
    private Date date;
    private Item item;
    private int actualQuantity;

    public StockCheck(Date date, Item item, int actualQuantity) {
        this.date = date;
        this.item = item;
        this.actualQuantity = actualQuantity;
    }
}