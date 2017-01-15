package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.ldap.odm.annotations.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Created by LoseMyself on 2017/1/10.
 */
@Table(name = "hap_ar_customers")
public class Customer extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long customerId;
    @Column(name = "customer_name")
    @Condition(operator = LIKE)
    private String customerName;
    @Column
    @Condition(operator = LIKE)
    private String customerNumber;
    @Column
    private Long companyId;

    public Long getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public Customer setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Customer setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
}
