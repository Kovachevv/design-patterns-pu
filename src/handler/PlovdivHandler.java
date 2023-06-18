package handler;

import package_type.Package;
import package_type.RecipientLocation;

public class PlovdivHandler implements Handler{

    private Handler next;

    public PlovdivHandler(){
    }

    @Override
    public void process(Package p) {

        if (p.getRecipientLocation().equals(RecipientLocation.PLOVDIV)) {
            sendToRecipient();
        } else {
            System.out.println("Plovdiv counter transferring the package to Bulgaria counter.");
            this.next.process(p);
        }
    }

    @Override
    public void sendToRecipient() {
        System.out.println("Package sent to it's recipient in Plovdiv.");
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
