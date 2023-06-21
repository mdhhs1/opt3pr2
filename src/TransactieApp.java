public class TransactieApp {
    public static void main(String[] args) {
        TransactieFactory transactieFactory = new TransactieFactory();
        TransactieLijst transactieLijst = new TransactieLijst();

        // Maak nieuwe transactie en voeg toe aan transactielijst
        Transactie transactie1 = transactieFactory.createTransactie(100.0, "2023-06-20", "Aankoop boek", "Uitgaven");
        transactieLijst.voegTransactieToe(transactie1);

        // Maak nieuwe inkomstentransactie en voeg toe aan transactielijst
        InkomstenTransactie inkomstenTransactie1 = transactieFactory.createInkomstenTransactie(500.0, "2023-06-20", "Salaris", "Inkomsten", "Werkgever");
        transactieLijst.voegInkomstenTransactieToe(inkomstenTransactie1);

        // Print alle transacties
        transactieLijst.printAlleTransacties();

    }
}