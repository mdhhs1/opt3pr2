import java.util.Observable;
import java.util.Observer;

public class TransactieObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {


                System.out.println("Transactielijst is gewijzigd! Aantal transacties: " + ((TransactieLijst)o).getTransacties().size());
    }
}
