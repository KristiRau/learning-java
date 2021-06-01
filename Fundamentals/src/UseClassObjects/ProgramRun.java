package UseClassObjects;

public class ProgramRun {
    public static void main(String[] args) {
        Demand demandObj = new Demand("Kristi", "Tomatoes",5);
        Supply supplyObj = new Supply("SDA", "Tomatoes",7);

        if (demandObj.product.equals(supplyObj.product)){
            int pay = demandObj.calculatePayment(supplyObj.rate);
            System.out.println("Your Bill: $" + pay);
            if (pay > 10) { supplyObj.sayThankyou(demandObj.custName);}
        }
        else {
            System.out.println("Supplier doesnt sell your Product");
        }


    }//xxxxxxxxxx
}//xxxxxx
