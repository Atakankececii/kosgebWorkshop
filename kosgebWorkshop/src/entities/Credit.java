package entities;



public class Credit {
    private int id;
    private CreditType creditType;

    public Credit() {
    }

    public Credit(int id, CreditType creditType) {
        this.id = id;
        this.creditType = creditType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CreditType getCreditType() {
        return creditType;
    }

    public void setCreditType(CreditType creditType) {
        this.creditType = creditType;
    }
}
