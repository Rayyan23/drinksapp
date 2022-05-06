package College.Learning;

import androidx.annotation.NonNull;

public class Drink {
    private String category;
    private String name;
    private int unitPrice;

    public Drink(String category, String name, int unitPrice) {
        this.category = category;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    @NonNull
    @Override
    public String toString() {
        return getName() + " , Price: "+getUnitPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
