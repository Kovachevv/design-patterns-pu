package package_type;

public class AbroadPackage extends Package {

    private final RecipientLocation recipientLocation;

    public AbroadPackage(RecipientLocation recipientLocation) {
        this.recipientLocation = recipientLocation;
    }

    public RecipientLocation getRecipientLocation() {
        return recipientLocation;
    }
}
