package transport;

public class Transport {

    private String brand;
    private String model;
    private String color;
    private int maxSpeed;
    private final String assemblyCountry;

    private final int year;

    public Transport(String brand, String model, String color, int maxSpeed, String assemblyCountry, int year) {

        this.brand = validationBrand(brand);
        this.model = validationModel(model);
        this.color = validationColor(color);
        this.maxSpeed = validationMaxSpeed(maxSpeed);

        if (assemblyCountry == null || assemblyCountry.isEmpty()) {
            assemblyCountry = assemblyCountry = "default";
        }
        this.assemblyCountry = assemblyCountry;
        if (year <= 2000) {
            year = 2000;
        }
        this.year = year;
    }
//    public Transport(){
//
//    }

    public  String validationBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            brand = brand = "default";
        }
        return brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public  String validationModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            model = model = "default";
        }
        return model = model;
    }

    public String getModel() {
        return this.model;
    }

    public  String validationColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            color = color = "default";
        }
        return color = color;
    }


    public String getcolor() {
        return this.color;
    }

    public static int validationMaxSpeed(int maxSpeed) {
        if (maxSpeed > -1 || maxSpeed < 400) {
            maxSpeed = maxSpeed = 0;
        }
        return maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

///////////////////////////////////////////////////
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getAssemblyCountry(){
        return this.assemblyCountry;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", year=" + year +
                '}';
    }
}
