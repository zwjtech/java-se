import org.junit.Test;

/**
 * Created by zhangWeiJie on 2017/12/25.
 */
public class ThreadLocalTest {

    @Test
    public void testThreadLocal(){
        ThreadLocal<String> resource=new ThreadLocal();
        resource.set("Hi");
    }
}
