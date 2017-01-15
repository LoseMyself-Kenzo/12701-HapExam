package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.Order;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/11.
 */
public interface OrderMapper extends Mapper<Order> {
    int myUpdate(Order order);
//    List<Order> mySelect();
}
