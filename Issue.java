import java.util.Date;
import java.util.List;


class Issue {
    private Date date;
    private List<Item> items;
    private String issuedTo;

    public Issue(Date date, List<Item> items, String issuedTo) {
        this.date = date;
        this.items = items;
        this.issuedTo = issuedTo;
    }
}
