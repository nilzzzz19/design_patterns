package observables;

import java.util.ArrayList;
import java.util.List;

import observer.StockObserver;

public class StockObservableImpl implements StockObservable {
	private List<StockObserver> stockObserverList = new ArrayList<>();
	private double price;

	@Override
	public void add(StockObserver stockObserver) {
		stockObserverList.add(stockObserver);
	}

	@Override
	public void remove(StockObserver stockObserver) {
		stockObserverList.remove(stockObserver);
	}

	//can write business logic here or in the setter.
	@Override
	public void notifyObservers() {
		for(StockObserver stockObserver: stockObserverList) {
			stockObserver.update(); //updating observers on state change.
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}
	
	
	

}
