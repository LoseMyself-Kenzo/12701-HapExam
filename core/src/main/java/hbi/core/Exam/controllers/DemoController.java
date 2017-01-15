package hbi.core.Exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.Exam.dto.Demo;
import hbi.core.Exam.dto.InventoryVo;
import hbi.core.Exam.dto.Order;
import hbi.core.Exam.service.IDemoService;
import hbi.core.Exam.service.OrderLineService;
import hbi.core.Exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;


/**
 * Created by LoseMyself on 2017/1/9.
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {
    @Autowired
    @Qualifier("demoService")
    IDemoService demoService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderLineService orderLineService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseData insert(@RequestBody Demo demo, HttpServletRequest request) {
        ResponseData responseDate = new ResponseData();
        IRequest requestContext = this.createRequestContext(request);
        demoService.insertSelective(requestContext, demo);
        responseDate.setMessage(String.format("Primary Key: %d", demo.getId()));
        return responseDate;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseData update(@RequestBody Demo demo, HttpServletRequest request) {
        ResponseData responseData = new ResponseData();
        IRequest requestContext = this.createRequestContext(request);
        demoService.myUdpate(requestContext, demo);
        responseData.setMessage(String.format("Primary Key: %d", demo.getId()));
        return responseData;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseData delete(@RequestBody InventoryVo inventoryVo, HttpServletRequest request) {
        ResponseData responseData = new ResponseData();
        orderLineService.myDelete(inventoryVo);
        responseData.setMessage(String.format("Primary Key: %d", inventoryVo.getOrderLines().getHeaderId()));
        return responseData;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseData select(HttpServletRequest request,
                               @RequestParam(name = "headerId", required = false, defaultValue = "") Long header_id,
                               @RequestParam(name = "orderNumber", required = false, defaultValue = "") String order_number,
                               @RequestParam(name = "companyId", required = false, defaultValue = "") Long company_id,
                               @RequestParam(name = "customerId", required = false, defaultValue = "") Long customer_id,
                               @RequestParam(name = "orderStatus", required = false, defaultValue = "") String order_status,
                               @RequestParam(name = "page", required = false, defaultValue = "1") int page,
                               @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ) {
        IRequest requestContext = this.createRequestContext(request);
        return new ResponseData(orderService.mySelect(requestContext,new Order().setOrderNumber(order_number).setHeaderId(header_id).setCompanyId(company_id).setCustomerId(customer_id), page, pageSize));
    }

}
