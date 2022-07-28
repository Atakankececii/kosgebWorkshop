package entities;

public class Attribute {
    private int id;
    private String name;
    private double value;
    private CreditAttribute creditAttribute;

    public Attribute(){

    }

    public Attribute(int id, String name, double value, CreditAttribute creditAttribute) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.creditAttribute = creditAttribute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CreditAttribute getCreditAttribute() {
        return creditAttribute;
    }

    public void setCreditAttribute(CreditAttribute creditAttribute) {
        this.creditAttribute = creditAttribute;
    }
}
