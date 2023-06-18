package handler;

import package_type.Package;

public interface Handler {

    void process(Package p);
    void sendToRecipient();
}
