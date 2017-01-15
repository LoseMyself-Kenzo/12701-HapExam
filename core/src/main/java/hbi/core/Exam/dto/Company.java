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
@Table(name = "hap_org_companys")
public class Company extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long companyId;
    @Column(name = "company_name")
    @Condition(operator = LIKE)
    private String companyName;
    @Column
    @Condition(operator = LIKE)
    private String companyNumber;

    public Long getCompanyId() {
        return companyId;
    }

    public Company setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public Company setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
        return this;
    }
}
