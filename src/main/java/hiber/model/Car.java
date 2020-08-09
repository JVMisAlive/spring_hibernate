package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;

    @Override
    public String toString() {
        return "ID = " + getId() + "/n"
                + "Car Name = " + getName() + "/n"
                + "Car Series = " + getSeries() + "/n";
    }

    @Column(name = "car_name")
    private String name;

    @Column(name = "car_series")
    private int series;

    public Car() {
    }

    public Car(String name, int series) {
        this.id = id;
        this.name = name;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
