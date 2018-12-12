package pl.travel.office.classes;

public class Date {

    private String date;

    public Date(String date) {
        this.date = date;
    }

    public static String setDate(String date, String separator){
        String[] splitted = date.split(separator);
        return new java.util.Date(Integer.valueOf(splitted[0]), Integer.valueOf(splitted[1]), Integer.valueOf(splitted[2])).toString();
    }

    @Override
    public String toString() {
        return " " + date + " ";
    }
}
