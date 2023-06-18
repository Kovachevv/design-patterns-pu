package handler;

import package_type.Package;
import package_type.RecipientLocation;

public class BulgariaHandler implements Handler {

    private Handler next;

    public BulgariaHandler() {
    }

    @Override
    public void process(Package p) {

        if(p.getRecipientLocation().equals(RecipientLocation.BULGARIA)){
            sendToRecipient();
        }else{
            System.out.println("Bulgaria counter transferring the package to Abroad counter.");
            this.next.process(p);
        }
    }

    @Override
    public void sendToRecipient() {
        System.out.println("Package sent to it's recipient in Bulgaria.");
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
