
/**
 * Write a description of class TargetStore here.
 *
 * @author Anish Gupta
 * @version 9/27/21
 */
public class TargetStore
{
    String name;
    int productNum;
    double price;
    int quantity;

    public TargetStore(String name, int productNum, double price, int quantity)
    {
        this.name = name;
        this.productNum = productNum;
        this.price = price;
        this.quantity = quantity;
    }
    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setProductNum(int productNum)
    {
        this.productNum = productNum;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    // getters
    public String getName()
    {
        return this.name;
    }

    public int getProductNum()
    {
        return this.productNum;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public String toString()
    {
        return String.format("%-10s %10d   $%6.2f %10d\n", this.name, this.productNum, this.price, this.quantity);
    }
}