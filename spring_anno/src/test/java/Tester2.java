import com.bjpowernode.service.AccountDaoService;
import com.bjpowernode.service.imp.AccountDaoServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.sql.SQLException;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(BlockJUnit4ClassRunner.class)
public class Tester2 {
    @Autowired
    private AccountDaoServiceImp accountDaoService;


    @Test
    public void fun1(){
        try {
            accountDaoService.ById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
