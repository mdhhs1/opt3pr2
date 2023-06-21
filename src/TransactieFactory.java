public class TransactieFactory {
    public Transactie createTransactie(double bedrag, String datum, String beschrijving, String type) {
        return new UitgavenTransactie(bedrag, datum, beschrijving, type);
    }

    public InkomstenTransactie createInkomstenTransactie(double bedrag, String datum, String beschrijving, String type, String bron) {
        return new InkomstenTransactie(bedrag, datum, beschrijving, type, bron);
    }
}
