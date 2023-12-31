import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
    List<BottleofWater> productList;

    public List<BottleofWater> getProductList(){
        return productList;
    }

    public void setProductList(List<BottleofWater> productList){
        this.productList = productList;
    }

    public BottleOfWaterVendingMachine(List<BottleofWater> productList) {
        this.productList = productList;
    }

    public BottleofWater getProduct(String name, int volume) {
        for (BottleofWater bottleofWater : productList){
            if (bottleofWater.getName().equals(name) && bottleofWater.getVolume() == volume){
                return bottleofWater;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public void addBottleOfWater(BottleofWater bottleofWater){
        this.productList.add(bottleofWater);
    }
}
