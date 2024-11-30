package Tema_2;

public class Novel extends Book {
    public String type;

    public Novel(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString(){
        return "Nume: " + name + " pret: " + price + " type: " + type;

    }
}
