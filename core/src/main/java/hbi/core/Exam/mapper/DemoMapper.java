package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.Demo;

/**
 * Created by LoseMyself on 2017/1/9.
 */
public interface DemoMapper extends Mapper<Demo> {
    int myUpdate(Demo demo);
}
