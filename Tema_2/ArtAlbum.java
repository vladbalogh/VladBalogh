package Tema_2;

public class ArtAlbum extends Book {
    public String paperQuality;

    public ArtAlbum(String name, int price, String paperQuality) {
        this.name = name;
        this.price = price;
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString(){
        return "Nume: " + name + " price: " + price + " paper quality: " + paperQuality;

    }
}
