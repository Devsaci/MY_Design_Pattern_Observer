import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state = 10;// stat of Observable
    private List<Observer> observers = new ArrayList<>();// Relation One to Many

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;// state change
        this.notifyObservers();//notification du changement de l'état de Observable
    }

    public int getState() {
        return state;
    }
}
