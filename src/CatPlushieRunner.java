public class CatPlushieRunner {
    public static void main(String[] args) {
        CatPlush cat1 = new CatPlush("Eugene",743268,2.99);
        CatPlush cat2 = new CatPlush();
        CatPlush cat3 = new CatPlush("bingus",1,9.99);
        CatPlush cat4 = new CatPlush("binkly",4,7.99);
        CatPlush cat5 = new CatPlush("Khalid ibn ismael shik shak shok bebsi shawarma hummus al karim",7,12.99);



        cat1.printInformation();
        cat1.softnessRating();
        System.out.println("Cuddleable status: " + cat1.cuddleable());

        System.out.println();

        cat2.printInformation();
        cat2.softnessRating();
        System.out.println("Cuddleable status: " + cat2.cuddleable());

        System.out.println();

        cat3.printInformation();
        cat3.softnessRating();
        System.out.println("Cuddleable status: " + cat3.cuddleable());

        System.out.println();

        cat4.printInformation();
        cat4.softnessRating();
        System.out.println("Cuddleable status: " + cat4.cuddleable());

        System.out.println();

        cat5.printInformation();
        cat5.softnessRating();
        System.out.println("Cuddleable status: " + cat5.cuddleable());


    }
}
