package office;

import handler.Handler;
import package_type.Package;

public class Office {

    private static Office instance;

    private Office() {
    }

    public static Office getInstance() {

        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public void handlePackage(Handler handler, Package p) {
        handler.process(p);
    }
}
