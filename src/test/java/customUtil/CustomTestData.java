package customUtil;

import java.util.Random;

public class CustomTestData {

    public CustomTestData() {

    }

    public String PhoneNumberGeneration() {
        Random rnd = new Random();
        int num = rnd.nextInt(99) + 10;
        int num2 = rnd.nextInt(999) + 100;
        int num3 = rnd.nextInt(99999) + 10000;
        return "08" + num + num2 + num3;
    }

    public String addressLabel() {
        return "Jungle";
    }

    public String recipientName() {
        return "[Muhammad Rizki Pratama]-[Candidate QA]";
    }

    public String postalCode() {
        return "16439";
    }

    public String addressDetails() {
        return "Perumahan Alam Pancoran Mas Blok. E No.01";
    }

}
