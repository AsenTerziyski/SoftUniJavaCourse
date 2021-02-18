package bakery;

public class Employee {
    //•	name: String
    //•	age: int
    //•	country: String
    private String name;
    private int age;
    private String country;

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        //Employee: {name}, {age} ({country})"
        String output = String.format("Employee: %s, %d (%s)",
                this.name,
                this.age,
                this.country);
        return output;
    }
}
