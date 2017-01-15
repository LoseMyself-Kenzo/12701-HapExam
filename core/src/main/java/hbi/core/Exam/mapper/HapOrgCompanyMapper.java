package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.Company;

import java.util.List;

/**
 * Created by LoseMyself on 2017/1/10.
 */
public interface HapOrgCompanyMapper extends Mapper<Company> {
    List<Company> lovSelect();
    String getNameById(Long company_id);
}
