import java.util.Date;
import java.util.List;


class Report {
    private Date startDate;
    private Date endDate;
    private List<Item> items;

    public Report(Date startDate, Date endDate, List<Item> items) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.items = items;
    }
}