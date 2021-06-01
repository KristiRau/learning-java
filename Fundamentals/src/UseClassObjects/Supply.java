package UseClassObjects;

public class Supply {
    String supplierName,product;
    int rate;


    public Supply(String supplierName, String product, int rate) {
        this.supplierName = supplierName;
        this.product = product;
        this.rate = rate;
    }

    public void sayThankyou(String customer) {
        System.out.println("Thank you, " + customer + "!!!");
    }



    // make another method, that says thank you, when the bill is more than 10 HOMEWORK!!!!!!!!!!


}
