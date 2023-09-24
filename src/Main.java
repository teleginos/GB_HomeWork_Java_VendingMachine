import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BottleofWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleofWater("OOPSeminar", 7, 2));
        listProduct.add(new BottleofWater("OOPlec", 7, 1));
        listProduct.add(new BottleofWater("Dz", 5, 4));
        listProduct.add(new BottleofWater("Java", 20, 100));
        listProduct.add(new BottleofWater("Test", 11, 5));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);

        System.out.println(vendingMachine.getProduct("OOPSeminar"));
        System.out.println(vendingMachine.getProduct("qwer"));
        System.out.println(vendingMachine.getProduct("Test"));
        System.out.println(vendingMachine.getProduct("Dz", 4));

        System.out.println("-".repeat(100)+"\n"+"HotDrink"+"\n");

        List<HotDrink> listHotDrink = new ArrayList<>();
        listHotDrink.add(new HotDrink("Latte", 200, 400, 75));
        listHotDrink.add(new HotDrink("Raf", 170, 300, 80));
        listHotDrink.add(new HotDrink("Americano", 150, 300, 90));
        listHotDrink.add(new HotDrink("Espresso", 100, 100, 85));
        HotDrinkVendingMachine vendingMachineHotDrink = new HotDrinkVendingMachine(listHotDrink);

        System.out.println(vendingMachineHotDrink.getProduct("Latte"));
        System.out.println(vendingMachineHotDrink.getProduct("Raf"));
        System.out.println(vendingMachineHotDrink.getProduct("Americano"));
        System.out.println(vendingMachineHotDrink.getProduct("Espresso"));

    }
}