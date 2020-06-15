public class ObserverImpl2 implements Observer {


    private int counter;

    @Override
    public void update(Observable observable) {
        // Technique Pop (Tiré)
        int state = ((ObservableImpl) observable).getState();
        if (state % 2 == 0) ++counter;
        System.out.println("********ObserverImpl2*******/");
        System.out.println("Nouvelle mise à jours : " + ((state % 2) == 0 ? "Pair" : "Impair"));
        System.out.println("Le conteur est :  "+counter);
        System.out.println("*********************************");
    }
}
