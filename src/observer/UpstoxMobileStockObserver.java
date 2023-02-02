package observer;

import observables.StockObservable;


public class UpstoxMobileStockObserver implements StockObserver{

	private StockObservable stockObservable;
	
	public UpstoxMobileStockObserver(StockObservable stockObservable) {
		super();
		this.stockObservable = stockObservable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("new price updated on mobile observer");
	}

}
