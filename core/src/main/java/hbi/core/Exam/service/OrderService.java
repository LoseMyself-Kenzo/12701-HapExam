package hbi.core.Exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import hbi.core.Exam.dto.Order;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/11.
 */
public interface OrderService extends IBaseService<Order>{
    List<Order> mySelect(IRequest request,Order order, int pageNum, int pageSize);
    int myUdpate(IRequest request, @StdWho Order order);
}
