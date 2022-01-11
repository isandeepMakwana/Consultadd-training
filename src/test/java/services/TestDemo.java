package services;
import com.consultadd.Demo;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;


public class TestDemo {
    @Test
    public void testSum(){
        Demo demo = new Demo();
        int res = demo.add(2,3);
//        Assert.assertEquals(5,res);
    }
}

