

public class Number {
    private static Number instance;

    private Number() {
        //
    }


    public static synchronized  Number getInstance() {
        if (instance == null) {
            instance = new Number();
        }
        return instance;
    }
}

