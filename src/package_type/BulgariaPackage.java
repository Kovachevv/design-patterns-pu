package package_type;

public class BulgariaPackage extends Package {

    private final RecipientLocation recipientLocation;

    public BulgariaPackage(RecipientLocation recipientLocation) {
        this.recipientLocation = recipientLocation;
    }

    public RecipientLocation getRecipientLocation() {
        return recipientLocation;
    }
}
