package capstone.bcs.lifo.repositories;

import capstone.bcs.lifo.model.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail,Long> {

}
