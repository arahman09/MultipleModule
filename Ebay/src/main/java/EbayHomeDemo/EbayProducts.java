package EbayHomeDemo;

import java.util.ArrayList;
import java.util.List;

public class EbayProducts {

    public static List<String > getProducts(){

        List<String> productsList = new ArrayList<>();

        productsList.add("Gel Pen");
        productsList.add("Winter Hat");
        productsList.add("Vacuum Cleaner ");
        productsList.add("Air Freshener");
        productsList.add("Phone Charger");

        return productsList;

    }
}
