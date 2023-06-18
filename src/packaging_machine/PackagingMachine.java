package packaging_machine;

import package_type.AbroadPackage;
import package_type.BulgariaPackage;
import package_type.Package;
import package_type.PlovdivPackage;
import package_type.RecipientLocation;

public class PackagingMachine {

    private PackagingMachine(){
    }

    public static Package createPackage(String location) {

        return switch (location.toLowerCase()) {
            case "plovdiv" -> new PlovdivPackage(RecipientLocation.PLOVDIV);
            case "bulgaria" -> new BulgariaPackage(RecipientLocation.BULGARIA);
            case "abroad" -> new AbroadPackage(RecipientLocation.ABROAD);
            default -> throw new RuntimeException("Cannot process the request.");
        };
    }
}
