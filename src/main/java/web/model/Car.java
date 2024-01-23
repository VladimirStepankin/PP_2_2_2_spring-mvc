package web.model;

public class Car {
    private String carBrand;
    private String model;
    private int year;

    public Car(String carBrand, String model, int year) {
        this.carBrand = carBrand;
        this.model = model;
        this.year = year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
               "carBrand='" + carBrand + '\'' +
               ", model='" + model + '\'' +
               ", year=" + year +
               '}';
    }
}
