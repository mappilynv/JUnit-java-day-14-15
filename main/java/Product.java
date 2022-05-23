public class Product {
    public String productName;
    public double productCost;
    public int productQuantity;


    public Product(String productName, double productCost, int productQuantity){
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double totalCost(){
        double total = productCost*productQuantity;
        System.out.println("Total cost is "+total);
        return total;
    }

    public String printProduct(){
        System.out.println(productName+" costs "+productCost+" and "+productQuantity+" were purchased");
        return productName+" costs "+productCost+" and "+productQuantity+" were purchased";
    }
}
