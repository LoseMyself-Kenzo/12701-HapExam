package hbi.core.Exam.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.Exam.dto.Inventory;
import hbi.core.Exam.dto.InventoryVo;
import hbi.core.Exam.dto.OrderLines;
import hbi.core.Exam.mapper.InventoryMapper;
import hbi.core.Exam.mapper.OrderLineMapper;
import hbi.core.Exam.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LoseMyself on 2017/1/14.
 */
@Service("orderLineService")
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLines> implements OrderLineService {
    @Autowired
    public OrderLineMapper orderLineMapper;
    @Autowired
    public InventoryMapper inventoryMapper;

//    private List<Inventory> listIn;
//    private List<OrderLines> listOrder;
//    private List<InventoryVo> list;

    @Override
    public List<InventoryVo> mySelect(IRequest request, OrderLines orderLines, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrderLines> listOrder = orderLineMapper.select(orderLines);
        List<InventoryVo> list = new ArrayList();

        for(int i = 0; i <listOrder.size(); ++i){
            InventoryVo iv = new InventoryVo();
            iv.setOrderLines(listOrder.get(i));
            iv.setMoney(iv.getOrderLines().getOrderdQuantity()*iv.getOrderLines().getUnitSellingPrice());
            if(iv.getOrderLines().getInventoryItemId() == 1001){
                iv.setItemCode("ITEM001");
                iv.setItemDescription("HFM财务管理软件");
            }else  if(iv.getOrderLines().getInventoryItemId() == 1002){
                iv.setItemCode("ITEM002");
                iv.setItemDescription("HWMS仓储管理系统");
            }else if(iv.getOrderLines().getInventoryItemId() == 1003){
                iv.setItemCode("ITEM003");
                iv.setItemDescription("HAP应用开发平台");
            }else if(iv.getOrderLines().getInventoryItemId() == 1004){
                iv.setItemCode("ITEM004");
                iv.setItemDescription("HEC费用控制系统");
            }else if(iv.getOrderLines().getInventoryItemId() == 1005){
                iv.setItemCode("ITEM005");
                iv.setItemDescription("HFS财务共享系统");
            }
            iv.setItemUom("EA");
            list.add(iv);
        }
        return list;
    }

    @Override
    public int myDelete(InventoryVo inventoryVo) {
        int ret = this.orderLineMapper.myDelete(inventoryVo.getOrderLines().getHeaderId());
        this.checkOvn(ret, inventoryVo.getOrderLines());
        return ret;
    }

}
