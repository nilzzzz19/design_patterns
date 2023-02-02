package observer;

import observables.StockObservable;

public class UpstoxWebStockObserver implements StockObserver{

	private StockObservable stockObservable;
	
	public UpstoxWebStockObserver(StockObservable stockObservable) {
		super();
		this.stockObservable = stockObservable;
	}

	@Override
	public void update() {
		System.out.println("price updated in web view observer");
		
	}

}
