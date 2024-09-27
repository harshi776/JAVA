public class Variable {
    public static void main(String[] args) {
        byte temperature = 30;
        byte humidity = 55;
        byte windSpeed = 20;
        byte visibility = 12;
        byte cloudCover = 7;
        byte uvIndex = 5;
        byte precipitationChance = 15;
        byte airQualityIndex = 50;

        // Short and int variables (corrected) - reassigned values
        short totalPopulation = 2000;
        short areaSize = 400;
        int averageIncome = 60000; // Changed to int
        short numberOfSchools = 30;
        short numberOfHospitals = 12;
        short averageAge = 40;
        short numberOfParks = 10;
        short transportationCount = 60;

        
        System.out.println("Byte Variables:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Visibility: " + visibility);
        System.out.println("Cloud Cover: " + cloudCover);
        System.out.println("UV Index: " + uvIndex);
        System.out.println("Precipitation Chance: " + precipitationChance);
        System.out.println("Air Quality Index: " + airQualityIndex);

        
        System.out.println("\nShort and Int Variables:");
        System.out.println("Total Population: " + totalPopulation);
        System.out.println("Area Size: " + areaSize);
        System.out.println("Average Income: " + averageIncome);
        System.out.println("Number of Schools: " + numberOfSchools);
        System.out.println("Number of Hospitals: " + numberOfHospitals);
        System.out.println("Average Age: " + averageAge);
        System.out.println("Number of Parks: " + numberOfParks);
        System.out.println("Transportation Count: " + transportationCount);
    }
}
