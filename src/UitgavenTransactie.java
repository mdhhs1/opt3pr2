public class UitgavenTransactie extends Transactie {
    public UitgavenTransactie(double bedrag, String datum, String beschrijving, String type) {
        super(bedrag, datum, beschrijving, type);
    }

    @Override
    public void doTransactie() {

                     System.out.println("Uitgaventransactie uitgevoerd: " + getBeschrijving());
        }

    @Override
    public String getType() {
        return "Uitgaven";
    }
}
