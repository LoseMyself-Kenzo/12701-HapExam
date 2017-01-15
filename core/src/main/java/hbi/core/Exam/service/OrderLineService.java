package hbi.core.Exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import hbi.core.Exam.dto.Inventory;
import hbi.core.Exam.dto.InventoryVo;
import hbi.core.Exam.dto.OrderLines;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/14.
 */
public interface OrderLineService extends IBaseService<OrderLines> {
    List<InventoryVo> mySelect(IRequest request, OrderLines orderLines, int pageNum, int pageSize);
//    OrderLines mySelective(IRequest var1, @StdWho OrderLines var2);
    int myDelete(InventoryVo inventoryVo);
}
