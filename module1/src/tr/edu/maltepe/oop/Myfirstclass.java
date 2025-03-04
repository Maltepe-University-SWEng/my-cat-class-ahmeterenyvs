package tr.edu.maltepe.oop;


class Class {
    private String name;
    private int age;

    // Constructor
    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to simulate meowing
    public void meow() {
        System.out.println(name + " says Meow!");
    }

}
