package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "car_series")
    private Car car;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public String toString() {
        return "ID = " + getId() + "/n"
                + "First Name = " + getFirstName() + "/n"
                + "Last Name = " + getLastName() + "/n"
                + "Email = " + getEmail() + "/n"
                + "Car = " + getCar().toString();
    }

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String email, Car car) {
        this.car = car;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
