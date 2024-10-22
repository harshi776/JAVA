public class StringExample {
    public static void main(String[] args) {
        String smartphone = "iPhone"; 
        String smartphone2 = new String("iPhone"); 
        String smartwatch = new String("Apple Watch");
        String tablet = new String("Galaxy Tab");
        String smartwatch2 = new String("Fitbit");
        String accessory = new String("AirPods");
        String phoneCase = new String("OtterBox"); 
        String charger = new String("Anker Charger");
        String earphones = new String("Bose QuietComfort");
        String powerBank = new String("RAVPower");
        String smartphone3 = "Samsung Galaxy";
        String smartphone4 = "Google Pixel";
        String smartphone5 = "OnePlus";
        String smartphone6 = "Nokia";
        String smartphone7 = "Xiaomi";
        String smartphone8 = "Sony Xperia";
        String smartphone9 = "LG V60";
        String smartphone10 = "Motorola Edge";

        System.out.println(smartphone == smartphone2);
        System.out.println(smartphone.equals(smartphone2));

        char[] myChar = smartphone.toCharArray();
        StringBuilder reversedValue = new StringBuilder();
        for (int i = myChar.length - 1; i >= 0; i--) {
            reversedValue.append(myChar[i]);
        }
        System.out.println(reversedValue.toString());
    }
}
