package web.models;

/**
 * @author Bakhmai Begaev
 */
public class Car {
    private int id;
    private int series;
    private String carModel;

    public Car() {

    }

    public Car(int id, int series, String carModel) {
        this.id = id;
        this.series = series;
        this.carModel = carModel;
    }

    public int getId() {
        return id;
    }


    public int getSeries() {
        return series;
    }



    public String getCarModel() {
        return carModel;
    }


}
