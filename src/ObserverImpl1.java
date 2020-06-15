public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
            // Technique Pop (Tiré)
        int state = ((ObservableImpl) observable).getState();
        double res=state*state+9;
        System.out.println("********ObserverImpl1*******/");
        System.out.println("Nouvelle mise à jours : "+state);
        System.out.println("résuktat de calcul :  "+res);
    }
}
