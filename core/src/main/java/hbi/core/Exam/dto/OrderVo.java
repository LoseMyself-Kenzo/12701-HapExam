package hbi.core.Exam.dto;

import com.hand.hap.system.dto.BaseDTO;

/**
 * Created by LoseMyself on 2017/1/11.
 */
public class OrderVo extends BaseDTO {
    private Order order;
    private String companyNmae;
    private String customerName;

    public Order getOrder() {
        return order;
    }

    public OrderVo setOrder(Order order) {
        this.order = order;
        return this;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public OrderVo setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderVo setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
