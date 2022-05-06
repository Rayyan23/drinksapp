package College.Learning;

import java.util.ArrayList;

public class DrinksMockUp {
    private ArrayList<Drink> drinks = new ArrayList<Drink>();


    public DrinksMockUp(){
        drinks.add(new Drink("Cold Drinks","7up",5));
        drinks.add(new Drink("Hot Drinks","Cappuccino",10));
        drinks.add(new Drink("Milkshakes","Oreo",20));
        drinks.add(new Drink("Cold Drinks","Pepsi",5));
        drinks.add(new Drink("Hot Drinks","Tea",10));
        drinks.add(new Drink("Milkshakes","Kinder",20));
        drinks.add(new Drink("Cold Drinks","Miranda",5));
        drinks.add(new Drink("Hot Drinks","Lemon & Ginger",10));
        drinks.add(new Drink("Milkshakes","Nutella",20));
        drinks.add(new Drink("Cold Drinks","Slush",5));
        drinks.add(new Drink("Hot Drinks","Coffee",10));
        drinks.add(new Drink("Milkshakes","Ferrero",20));
        drinks.add(new Drink("Fresh Juices","Orange",15));
        drinks.add(new Drink("Fresh Juices","Apple",15));
        drinks.add(new Drink("Fresh Juices","Lemon & Mint",15));
        drinks.add(new Drink("Fresh Juices","Pineapple",15));
    }
    public ArrayList<Drink> getDrinks(String cat){
        ArrayList<Drink> result = new ArrayList<>();
        for(Drink d : drinks){
            if(d.getCategory().equals(cat))
                result.add(d);
        }
        return result;
    }

    public String[] getCategories() {
        String[] cat = {"Cold Drinks","Hot Drinks","Milkshakes","Fresh Juices"};
        return cat;
    }

}
