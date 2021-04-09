package yc.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import yc.MyAppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= MyAppConfig.class)
public class StudentBizImplTest {

    //@Resource(name="studentBizImpl")
    @Autowired
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