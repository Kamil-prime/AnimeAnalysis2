public class animeObject {
    public String name= "";
    public String season= "";
    public String genre = "";
    public String genre2= "";
    public int relDate;
    public double rate;



    public animeObject(String name, String season, String genre, String genre2, int relDate, double rate){
        this.name= name;
        this.season= season;
        this.genre= genre;
        this.genre2= genre2;
        this.relDate= relDate;
        this.rate= rate;

    }

    @Override
    public String toString() {
        return name + "," + season + "," + genre + "," + genre2 + "," + relDate + "," + rate;

    }
}