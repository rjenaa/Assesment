public class HireDate {
    private int month;
    private int date;
    private int year;

    public HireDate(int month, int date, int year){
        this.month = month;
        this.date = date;
        this.year = year;
    }

    @Override
    public String toString() {
        return "HireDate: " + month +
                "/" + date +
                "/" + year;
    }
}
