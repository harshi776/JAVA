public class FinancialInstitutionInfo {
    
    public static void main(String[] args) {
        
        FinancialInstitution institution1 = new FinancialInstitution("Canara Bank", "Koramangala", 123, "Harshitha");
        FinancialInstitution institution2 = new FinancialInstitution("Axis Bank", "Banashankari", 250, "Heena");
        FinancialInstitution institution3 = new FinancialInstitution("Karnataka Bank", "Indiranagara", 1230, "Meghana.");
        FinancialInstitution institution4 = new FinancialInstitution("Bank of Baroda", "Udupi", 546, "Ananya");
        FinancialInstitution institution5 = new FinancialInstitution("Canara Bank", "Vijaynagara", 654, "Ashwini");
        FinancialInstitution institution6 = new FinancialInstitution("Kotak Bank", "Rajajinagara", 325, "Bharti");
        FinancialInstitution institution7 = new FinancialInstitution("Syndicate Bank", "Koramangala", 130, "Indu");
        FinancialInstitution institution8 = new FinancialInstitution();
        FinancialInstitution institution9 = new FinancialInstitution();
        FinancialInstitution institution10 = new FinancialInstitution();

        institution1.institutionDetails();
        System.out.println("******************************************");

        institution2.institutionDetails();
        System.out.println("******************************************");

        institution3.institutionDetails();
        System.out.println("******************************************");

        institution4.institutionDetails();
        System.out.println("******************************************");

        institution5.institutionDetails();
        System.out.println("******************************************");

        institution6.institutionDetails();
        System.out.println("******************************************");

        institution7.institutionDetails();
        System.out.println("******************************************");
    }
}
