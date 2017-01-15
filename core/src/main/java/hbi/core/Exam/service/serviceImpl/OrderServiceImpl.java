package hbi.core.Exam.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.Exam.dto.Order;
import hbi.core.Exam.dto.OrderVo;
import hbi.core.Exam.mapper.HapArCustomersMapper;
import hbi.core.Exam.mapper.HapOrgCompanyMapper;
import hbi.core.Exam.mapper.OrderMapper;
import hbi.core.Exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/11.
 */
@Service("orderService")
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private HapArCustomersMapper hapArCustomersMapper;
    @Autowired
    private HapOrgCompanyMapper hapOrgCompanyMapper;

    @Override
    public List<Order> mySelect(IRequest request,Order order, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> list = orderMapper.select(order);
        for(int i = 0; i<list.size(); ++i){
            list.get(i).setCompanyName(hapOrgCompanyMapper.getNameById(list.get(i).getCompanyId()));
            list.get(i).setCustomerName(hapArCustomersMapper.getNameById(list.get(i).getCustomerId()));
        }
        return list;
    }

    @Override
    public int myUdpate(IRequest request, @StdWho Order order) {
        int count = orderMapper.myUpdate(order);
        checkOvn(count, order);
        return count;
    }

}
