package package_type;

public class PlovdivPackage extends Package {

    private final RecipientLocation recipientLocation;

    public PlovdivPackage(RecipientLocation recipientLocation) {
        this.recipientLocation = recipientLocation;
    }

    public RecipientLocation getRecipientLocation() {
        return recipientLocation;
    }
}
