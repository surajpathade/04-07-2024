package javaclassandobject;

public class car {

	public static void main(String[] args) 
	{
		
		//fields(variables)
		private String carColor;
		private String carModel;
		private int manufacturingYear;
		private double carPrice;
		private String ACFeature;
		
		//default constructor: because no parameters are taken in Constructor signature
		public Car() 
		{
			// TODO Auto-generated constructor stub
		}
		
		public Car(String carColor, String carModel, int manufacturingYear, double carPrice, String aCFeature) {

			this.carColor = carColor;
			this.carModel = carModel;
			this.manufacturingYear = manufacturingYear;
			this.carPrice = carPrice;
			ACFeature = aCFeature;
			
		}

		//behavior(methods)	
		//start
		public String startCar()
		{
			return "Car Started";
		}
		//stop
		public String stopCar()
		{
			return "Car Stoped";
		}
		public String moveCar()
		{
			return "Car Moving Forward";
		}
		
		public String reverseCar()
		{
			return "Car Moving Backward";
		}
		
		public void getCarDetails()
		{
			System.out.println(carColor);
			System.out.println(carModel);
			System.out.println(manufacturingYear);
			System.out.println(carPrice);
			System.out.println(ACFeature);
		
		
		
	

	}

}
