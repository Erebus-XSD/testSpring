package yc.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import yc.MyAppConfig;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= MyAppConfig.class)
public class StudentBizImplTest {

    @Resource(name="studentBizImpl")
    //@Autowired //按类型导入 如果有多个相同的 例如mybetisDao和jpaDao 会报错
    private StudentBiz sbi;

    @Test
    public void testAdd() {
        sbi.add("张三");
    }

    @Test
    public void testUpdate() {
        sbi.update("张三");
    }

    @Test
    public void testFind() {
        sbi.find("张三");
    }
}