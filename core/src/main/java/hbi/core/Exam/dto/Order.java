package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.ldap.odm.annotations.Id;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Date;

@Table(name = "hap_om_order_headers")
public class Order extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long headerId;
    @Column(name = "order_number")
    @Condition(operator = LIKE)
    private String orderNumber;
    @Column(name = "company_id")
    @Condition(operator = LIKE)
    private Long companyId;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "request_id")
    private Long requestId;
    @Column(name = "program_id")
    private Long programId;
    @Column(name = "created_by")
    private Long createdBy;
    @Transient
    private String customerName;
    @Transient
    private String companyName;

    public String getCustomerName() {
        return customerName;
    }

    public Order setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Order setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public Order setHeaderId(Long headerId) {
        this.headerId = headerId;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Order setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Order setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Order setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Order setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Order setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @Override
    public Long getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    @Override
    public Long getProgramId() {
        return programId;
    }

    @Override
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    @Override
    public Long getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
}
