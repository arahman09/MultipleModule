package AppleHome;

import java.util.ArrayList;
import java.util.List;

public class AppleProducts {

    public static List<String> getProducts() {

        List<String> productsList = new ArrayList<>();

        productsList.add("iPhone Xs Max");
        productsList.add("iPad Mini");
        productsList.add("Mac Book Air");
        productsList.add("Mac Book Pro");
        productsList.add("iMac");

        return productsList;
    }
}