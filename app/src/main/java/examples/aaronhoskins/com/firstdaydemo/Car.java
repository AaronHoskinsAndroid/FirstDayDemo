package examples.aaronhoskins.com.firstdaydemo;

public class Car {
    private String make;
    private String model;
    private String year;
    private String engine;
    private String transmissionType;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public static class Builder{

        Car car = new Car();

        public Builder make(String make) {
            car.setMake(make);
            return this;
        }

        public Builder model(String model) {
            car.setModel(model);
            return this;
        }

        public Builder year(String year) {
            car.setYear(year);
            return this;
        }

        public Builder engine(String engine) {
            car.setEngine(engine);
            return this;
        }

        public Builder transmission(String trans) {
            car.setTransmissionType(trans);
            return this;
        }

        public Car build() {
            return car;
        }

    }
}
