public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        Observer observer3 = new ObserverImpl1();
       // observable.unsubscribe(observer1);
        observable.subscribe(observer1);
       // observable.subscribe(observer2);
       // observable.subscribe(observer3);
        observable.setState(55);
       // observable.setState(30);
       // observable.setState(33);



       observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable1) {
                System.out.println("***Observateur  Anonyme");
            }
        });



        observable.subscribe(obs -> {
            System.out.println("**/*/*/*/*///*/*/*/*/*//*/");
        });
        observable.setState(33);

    }
}
