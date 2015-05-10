package ac.za.cput.company_manager.Service.Implementation;

import ac.za.cput.company_manager.Service.OrderService;
import ac.za.cput.company_manager.domain.Orders;
import ac.za.cput.company_manager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository repository;

    @Override
    public List<Orders> getOrder()
    {
        List<Orders> ordersList = new ArrayList();

        Iterable<Orders> orderIterable = repository.findAll();

        for (Orders orders :orderIterable) {
            ordersList.add(orders);
        }

        return ordersList;
    }
}
