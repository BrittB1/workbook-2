package Donut;

public class donuts {
    String description; //declared w/o sny modifiers
    int calories;
    double price;

    // two string method; can print out value of object if you need to see it
    // IntelliJ also has a tool to generate to string feature to generate two string method
    public String toString(){
        return description + calories;
    }
}
