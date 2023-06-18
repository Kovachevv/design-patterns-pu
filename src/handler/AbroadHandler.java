package handler;

import package_type.Package;

public class AbroadHandler implements Handler {

    @Override
    public void process(Package p) {
        sendToRecipient();
    }

    @Override
    public void sendToRecipient() {
        System.out.println("Package sent to it's recipient Abroad.");
    }
}
