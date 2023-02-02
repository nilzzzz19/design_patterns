package observer;

import observables.StockObservable;
import observables.StockObservableImpl;

public class Main {

	public static void main(String[] args) {
		StockObservable stockObservable = new StockObservableImpl();
		
		UpstoxMobileStockObserver observer1 = new UpstoxMobileStockObserver(stockObservable);
		UpstoxWebStockObserver observer2 = new UpstoxWebStockObserver(stockObservable);
		
		stockObservable.add(observer1);
		stockObservable.add(observer2);
		
		stockObservable.setPrice(23.13);

	}

}
