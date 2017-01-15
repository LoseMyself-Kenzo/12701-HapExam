package hbi.core.Exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import hbi.core.Exam.dto.Demo;

/**
 * Created by LoseMyself on 2017/1/9.
 */
public interface IDemoService extends IBaseService<Demo> {
    int myUdpate(IRequest request, @StdWho Demo demo);

}
