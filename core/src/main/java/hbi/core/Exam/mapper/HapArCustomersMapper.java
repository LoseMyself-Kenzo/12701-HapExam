package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.Customer;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/11.
 */
public interface HapArCustomersMapper extends Mapper<Customer> {
    List<Customer> lovSelect();
    String getNameById(Long customer_id);
}
