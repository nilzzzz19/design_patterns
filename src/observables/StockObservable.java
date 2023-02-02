package observables;

import observer.StockObserver;

public interface StockObservable {

	public void add(StockObserver stockObserver);
	public void remove(StockObserver stockObserver);
	public void notifyObservers();
	public void setPrice(double price);
	
}
