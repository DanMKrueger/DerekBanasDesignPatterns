package com.collabera.observer;

public class GrabStocks {

	public static void main(String args[]) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.1);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.1);
		
		stockGrabber.unregister(observer1);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.1);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.00);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.00);

		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		
		
	}
	
}
