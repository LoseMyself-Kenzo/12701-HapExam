package hbi.core.Exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.Exam.dto.*;
import hbi.core.Exam.service.OrderLineService;
import hbi.core.Exam.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

/**
 * Created by LoseMyself on 2017/1/12.
 */
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
    @Autowired
    @Qualifier("orderLineService")
    private OrderLineService orderLineService;

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseData insert(@RequestBody InventoryVo inventoryVo, HttpServletRequest request) {
//        ResponseData responseDate = new ResponseData();
//        IRequest requestContext = this.createRequestContext(request);
//
//        orderLineService.insertSelective(requestContext, demo);
//
//        responseDate.setMessage(String.format("Primary Key: %d", inventoryVo.getOrderLines().getHeaderId()));
//        return responseDate;
//    }

    @RequestMapping(value="/select",method = RequestMethod.GET)
    public ResponseData select(HttpServletRequest request,
                               @RequestParam(name="headerId", required = false, defaultValue = "") Long header_id,
                               @RequestParam(name = "lineId", required = false, defaultValue = "") Long line_id,
                               @RequestParam(name = "itemCode", required = false, defaultValue = "") String item_code,
                               @RequestParam(name = "itemDescription", required = false, defaultValue = "") String item_description,
                               @RequestParam(name = "item_uom", required = false, defaultValue = "") String item_uom,
                               @RequestParam(name = "orderdQuantity", required = false, defaultValue = "") Long orderd_quantity,
                               @RequestParam(name = "unitSellingPrice", required = false, defaultValue = "") Double unit_selling_price,
                               @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ) {

        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(orderLineService.mySelect(requestContext, new OrderLines().setHeaderId(header_id), page, pageSize));
    }

}
