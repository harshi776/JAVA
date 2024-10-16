public class FinancialInstitution {
    
    String institutionName;
    String branch;
    int institutionIFSCcode;
    String manager;

    public FinancialInstitution() {
        System.out.println("No param constructor");
    }

    public FinancialInstitution(String institutionName, String branch, int IFSCcode, String manager) {
        this.institutionName = institutionName;
        this.branch = branch;
        this.institutionIFSCcode = IFSCcode;
        this.manager = manager;
    }

    public static void mortgageLoans() {
        
    }

    public static void insurance() {

    }

    public static void fundsCreditCards() {
    
    }

    public void institutionDetails() {
        System.out.println("Institution Name : " + institutionName);
        System.out.println("Branch : " + branch);
        System.out.println("Institution IFSC code : " + institutionIFSCcode);
        System.out.println("Manager : " + manager);
    }
}
