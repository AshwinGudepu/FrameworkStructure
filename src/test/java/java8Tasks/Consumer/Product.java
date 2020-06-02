package java8Tasks.Consumer;

import java.io.Serializable;

public class Product implements Serializable {

    public String name;
    public String category;
    public String grade;
    public int price;

    public Product(String name, String category, String grade, int price) {
        this.name = name;
        this.category = category;
        this.grade = grade;
        this.price = price;
    }

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
                ", price=" + price +
                '}';
    }
}
