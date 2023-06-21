// Transactie klasse
public abstract class Transactie {
    private double bedrag;
    private String datum;
    private String beschrijving;
    private String type;

    public Transactie(double bedrag, String datum, String beschrijving, String type) {
        this.bedrag = bedrag;
        this.datum = datum;
        this.beschrijving = beschrijving;
        this.type = type;
    }

    public double getBedrag() {


        return bedrag;
    }


    public String getDatum() {

        return datum;
    }

    public String getBeschrijving() {

        return beschrijving;
    }



    // Template methode
    public final void voerTransactieUit() {
        printType();
        doTransactie();
        printBeschrijving();
    }
    public void printType() {

        System.out.println("Type: " + getType());
    }
    // Primitieve operaties
    public abstract void doTransactie();
    public abstract String getType();
    public void printBeschrijving() {

        System.out.println("Beschrijving: " + getBeschrijving());
    }
}
