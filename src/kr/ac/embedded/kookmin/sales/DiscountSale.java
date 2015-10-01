package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale 
{
	private double discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale()
	{
	 discount=0;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) 
	{
		setName(theName);
		setPrice(thePrice);
		setDiscount(theDiscount);
	}
	
	public DiscountSale(DiscountSale originalObject)
	{
		if (originalObject == null) 
		{
			System.out.println("Error: null Sale object.");
			System.exit(0);
		}
		// else
		discount = originalObject.discount;
	}
	
	public static void announcement() 
	{
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() 
	{
		return getPrice()*(100-discount)/100;
	}
	
	public double getDiscount() 
	{
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) 
	{
		discount=newDiscount;
	}
	
	public String toString() 
	{
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) 
	{
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			DiscountSale otherSale = (DiscountSale) otherObject;
			return (getName().equals(otherSale.getName()) && (getPrice() == otherSale.getPrice()) && getDiscount() == otherSale.getDiscount());
		}
	}
	
	
	public DiscountSale clone() 
	{
		return new DiscountSale(this);
	}
}
