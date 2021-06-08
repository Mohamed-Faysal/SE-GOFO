
public class Playgrounds {
	private double price;
	private int [] times;
	public static int id=0;
	public Playgrounds() {
		id++;
	}
	public void setPrice(double price) {
		this.price=price;
	}
public void setTime(int [] times) {
		this.times=times;
	}
public double getPrice() {
	return price;
}
public int[] getTimes() {
	return times;
}
	public String toString() {
		return "Price is :"+getPrice()+" times: "+getTimes() ;
	}
}
