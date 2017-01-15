package hbi.core.Exam.service.serviceImpl;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.Exam.dto.Demo;
import hbi.core.Exam.mapper.DemoMapper;
import hbi.core.Exam.mapper.HapArCustomersMapper;
import hbi.core.Exam.mapper.HapOrgCompanyMapper;
import hbi.core.Exam.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LoseMyself on 2017/1/9.
 */
@Service("demoService")
public class IDemoServiceImpl extends BaseServiceImpl<Demo> implements IDemoService {
    @Autowired
    private DemoMapper demoMapper;
    @Autowired
    private HapArCustomersMapper hapArCustomersMapper;
    @Autowired
    private HapOrgCompanyMapper hapOrgCompanyMapper;

    @Override
    public int myUdpate(IRequest request, @StdWho Demo demo) {
        int count = demoMapper.myUpdate(demo);

        checkOvn(count, demo);
        return count;
    }
}
