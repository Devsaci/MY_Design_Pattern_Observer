import java.util.ArrayList;
import java.util.List;

public class ObservableImpl extends Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {

    }

    @Override
    public void unsubscribe(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
