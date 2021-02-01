package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean @Named
public class Orders {
	
	List<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		orders.add(new Order("00000001", "This is product 1", (float)11.00, 1));
		orders.add(new Order("00000002", "This is product 2", (float)12.00, 12));
		orders.add(new Order("00000003", "This is product 3", (float)13.00, 13));
		orders.add(new Order("00000004", "This is product 4", (float)14.00, 14));
		orders.add(new Order("00000005", "This is product 5", (float)15.00, 15));
		orders.add(new Order("00000006", "This is product 6", (float)16.00, 16));
		orders.add(new Order("00000007", "This is product 7", (float)17.00, 17));
		orders.add(new Order("00000008", "This is product 8", (float)18.00, 18));
		orders.add(new Order("00000009", "This is product 9", (float)19.00, 19));
		orders.add(new Order("00000010", "This is product 10", (float)10.00, 10));
		orders.add(new Order("00000011", "This is product 11", (float)111.00, 111));
		orders.add(new Order("00000012", "This is product 12", (float)112.00, 112));
		orders.add(new Order("00000013", "This is product 13", (float)113.00, 113));
		orders.add(new Order("00000014", "This is product 14", (float)114.00, 114));
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
