
public class Car   {
    private int price;
    private String model;
    private int ps;

    public Car(int price, String model, int ps) {
        this.price = price;
        this.model = model;
        this.ps = ps;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getModel() {
        return model;
    }



    public int getPs() {
        return ps;
    }

    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ps=" + ps +
                '}';
    }





}

