import handler.AbroadHandler;
import handler.BulgariaHandler;
import handler.PlovdivHandler;
import office.Office;
import package_type.Package;
import packaging_machine.PackagingMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AbroadHandler abroadHandler = new AbroadHandler();
        BulgariaHandler bulgariaHandler = new BulgariaHandler();
        PlovdivHandler plovdivHandler = new PlovdivHandler();
        plovdivHandler.setNext(bulgariaHandler);
        bulgariaHandler.setNext(abroadHandler);

        System.out.print("Choose a location - Plovdiv, Bulgaria, Abroad: ");

        String input = scanner.nextLine();

        Office office = Office.getInstance();

        while (!input.equals("end")) {

            Package currentPackage = PackagingMachine.createPackage(input.toLowerCase());

            office.handlePackage(plovdivHandler, currentPackage);
            System.out.print("Choose a location - Plovdiv, Bulgaria, Abroad: ");

            input = scanner.nextLine();
        }
    }
}
