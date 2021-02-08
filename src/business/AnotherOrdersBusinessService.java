package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
	@Override
	public void test() {
		System.out.println("=========Hello from the test method. Order Business Service Version #2");

	}
	
	public AnotherOrdersBusinessService() {
		
		
		orders.add(new Order("00000001q", "Product #1 from alt bs", (float)11.00, 1));
		orders.add(new Order("00000002w", "Product #2 from alt bs", (float)12.00, 12));
		orders.add(new Order("00000003e", "Product #3 from alt bs", (float)13.00, 13));
		orders.add(new Order("00000004r", "Product #4 from alt bs", (float)14.00, 14));
		orders.add(new Order("00000005t", "Product #5 from alt bs", (float)15.00, 15));
		orders.add(new Order("00000006y", "Product #6 from alt bs", (float)16.00, 16));
		orders.add(new Order("00000007u", "Product #7 from alt bs", (float)17.00, 17));
		orders.add(new Order("00000008i", "Product #8 from alt bs", (float)18.00, 18));
		orders.add(new Order("0000000o", "Product #9 from alt bs", (float)19.00, 19));
		orders.add(new Order("00000010p", "Product #10 from alt bs", (float)10.00, 10));
		
		
		
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		this.orders = orders;
		
	}

}
