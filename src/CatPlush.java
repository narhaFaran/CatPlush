public class CatPlush {

    //instance variables
    String name;
    int softness; //from 1-10
    double price;

    //Cat constructor
    public CatPlush(String name, int softness, double price) {
        this.name = name;
        this.softness = softness;
        this.price = price;
    }

    //default constructor (no parameters)
    public CatPlush() {
        this.name = "plush";
        this.softness = 1;
        this.price = 0.99;
    }

    public String getName() {
        return name;
    }

    public int getSoftness() {
        return softness;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Softness: " + getSoftness() + "/10");
        System.out.println("Price: $" + getPrice());
    }

    public void softnessRating() {
        System.out.println("Softness rating: ");
        if(getSoftness()<3) {
            System.out.print("Hmmm.... yeah you need a different plushie");
        } else if (getSoftness()>=3 && getSoftness()<6) {
            System.out.print("This plush is a solid choice");
        } else if(getSoftness()>=6 && getSoftness()<10) {
            System.out.print("Great!");
        }else {
            System.out.print("INCREDIBLE!");
        }
        System.out.println();
    }

    public boolean cuddleable() {
        if (getSoftness() > 6) {
            return true;
        } else {
            return false;
        }
    }
}
