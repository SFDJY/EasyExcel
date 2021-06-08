package test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.sfdjy.domain.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName SFDJY_EasyExcelTest.java
 * @Author: SFDJY
 * @Description Java操作Excel
 * @Date:Create in 21:54 2021/6/8
 * 声明：此源代码版权归SFDJY所有，任何人不得侵权。
 */
// 视频第11节木有看喔
public class SFDJY_EasyExcelTest {
    /**
     * @title: 向Excel文档中写数据方式一
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 22:16 2021/6/8
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcelOne() {
        List<User> data = new ArrayList<>();

        User user = new User(10000, "随风打酱油1", "男",
                9999.999, new Date());
        data.add(user);

        EasyExcel.write("写数据方式一.xlsx", User.class).sheet("用户信息").doWrite(data);
    }

    /**
     * @title: 向Excel文档中写数据方式二
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 22:21 2021/6/8
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcelTwo() {
        List<User> data = new ArrayList<>();

        User user = new User(10001, "随风打酱油1", "男",
                9999.99, new Date());
        data.add(user);

        ExcelWriter excelWriter = EasyExcel.write("写数据方式二.xlsx", User.class).build();

        WriteSheet writeSheet = EasyExcel.writerSheet("用户信息").build();

        excelWriter.write(data, writeSheet);

        excelWriter.finish();
    }


}
