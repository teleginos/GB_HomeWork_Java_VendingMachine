public class HotDrink extends Product{

    private int temperature;
    private int volume;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public HotDrink(String name, double price, int volume, int temperature){
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() + '\\' +
                "price = " + super.getPrice() + '\\' +
                "temperature = " + temperature + '\\' +
                "volume = " + volume +
                '}';
    }
}
