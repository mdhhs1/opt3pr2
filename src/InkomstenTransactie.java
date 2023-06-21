
public class InkomstenTransactie extends Transactie {
    private String bron;

    public InkomstenTransactie(double bedrag, String datum, String beschrijving, String type, String bron) {
        super(bedrag, datum, beschrijving, type);
        this.bron = bron;
    }

    public String getBron() {

        return bron;
    }

    public void setBron(String bron) {

        this.bron = bron;
    }

    @Override
    public String getType() {

        return "Inkomsten";
    }

    @Override
    public void doTransactie() {

        System.out.println("Inkomstentransactie uitgevoerd: " + getBeschrijving());
    }
}
