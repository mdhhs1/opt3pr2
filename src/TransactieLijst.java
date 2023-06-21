import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
class TransactieLijst extends Observable {
    private List<Transactie> transacties;

    public TransactieLijst() {

        transacties = new ArrayList<>();
    }

    public void voegTransactieToe(Transactie transactie) {
        transacties.add(transactie);
        setChanged();
        notifyObservers();
    }

    public void voegInkomstenTransactieToe(InkomstenTransactie inkomstenTransactie) {
        transacties.add(inkomstenTransactie);
        setChanged();
        notifyObservers();
    }

    public void laadTransacties() {

        // transacties = loadTransacties();
    }

    public void printAlleTransacties() {
        for (Transactie transactie : transacties) {
            transactie.printType();
            System.out.println(transactie.getBeschrijving());
        }
    }


    @Override
    public synchronized void addObserver(Observer observer) {

        super.addObserver(observer);
    }

    @Override
    public synchronized void deleteObserver(Observer observer) {

        super.deleteObserver(observer);
    }

    @Override
    public void notifyObservers() {

        super.notifyObservers();
    }
    public List<Transactie> getTransacties() {

        return this.transacties;
    }

}