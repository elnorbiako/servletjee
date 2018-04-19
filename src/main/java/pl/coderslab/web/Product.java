package pl.coderslab.web;

public class Product {

    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
