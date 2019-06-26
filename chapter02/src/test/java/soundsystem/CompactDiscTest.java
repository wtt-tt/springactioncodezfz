package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:soundsystem.xml"})
public class CompactDiscTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNull(){
        cd.play();
        System.out.println("打印对象了"+cd);
        Assert.assertNotNull(cd);
    }
}
