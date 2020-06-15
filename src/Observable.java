

/*   Observé  Editeur de la revue   Sujet*/
public interface  Observable {
    public abstract void subscribe(Observer observer);//addObserver
    public abstract void unsubscribe(Observer observer);//removeObserver
    public abstract void notifyObservers();

}
