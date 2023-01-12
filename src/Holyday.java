public class Holyday {
    private String name;
    private String date;

    public Holyday(String name, String date){
        this.name = name;
        this.date = date;
    }

    public String getHolyday(){
        return this.name;
    }

    public String getDate(){
        return date;
    }
}
