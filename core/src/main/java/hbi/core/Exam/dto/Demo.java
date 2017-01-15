package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

/**
 * Created by LoseMyself on 2017/1/9.
 */
@Table(name = "hbi_demo1")
public class Demo extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long id;
    @Column(name = "name")
    @Condition(operator = LIKE)
    private String name;
    @Column
    @Condition(operator = LIKE)
    private String tel;
    @Transient
    private String aaaa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Demo setName(String name) {
        this.name = name;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public Demo setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getAaaa() {
        return aaaa;
    }

    public void setAaaa(String aaaa) {
        this.aaaa = aaaa;
    }
}
