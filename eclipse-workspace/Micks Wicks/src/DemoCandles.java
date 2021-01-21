
public class DemoCandles extends ScentedCandle {

	

	public static void main(String[] args)  {
		Candle candle1 = new Candle();
		ScentedCandle candle2 = new ScentedCandle();
		candle1.setColor("Blue");
		System.out.println("COLOR: " + candle1.getColor());
		candle1.setHeight(5);
		System.out.println("HEIGHT: " + candle1.getHeight() + " inches");
		candle1.setPrice(price);
		System.out.println("PRICE: $" + candle1.getPrice());
		
		System.out.println("\n********SCENTED CANDLE********");
		candle2.setColor("Yellow");
		System.out.println("COLOR: " + candle2.getColor());
		candle2.setHeight(8);
		System.out.println("HEIGHT: " + candle2.getHeight() + " inches");
		candle2.setPrice(price);
		System.out.println("PRICE: $" + candle2.getPrice());
		
		
		
		
		
		
		
		

	}

}
