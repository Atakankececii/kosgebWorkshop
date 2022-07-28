package entities;

import java.util.List;

public class CreditAttribute {
    private int id;
    private Credit credit;
    private List<Attribute> attributes;

    public CreditAttribute() {
    }

    public CreditAttribute(int id, Credit credit, List<Attribute> attributes) {
        this.id = id;
        this.credit = credit;
        this.attributes = attributes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
