package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.OrderLines;

/**
 * Created by LoseMyself on 2017/1/14.
 */
public interface OrderLineMapper extends Mapper<OrderLines> {
    int myDelete(Long headerId);
}
