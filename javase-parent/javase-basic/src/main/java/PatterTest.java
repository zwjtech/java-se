import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by zhangWeiJie on 2017/12/24.
 */
public class PatterTest {

    @Test
    public void testPattern(){
        boolean matched = Pattern.matches("^[\\u4e00-\\u9fa5_a-zA-Z0-9\\-]+$", "sdjf-djf");//只能包含中文、大小写字母，数字，中划线及其组合
        System.out.println(matched);
    }
}
