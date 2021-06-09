package test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.sfdjy.domain.ComplexHeadUser;
import com.sfdjy.domain.User;
import org.junit.Test;

import java.util.*;

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

    /**
     * @title: 去除一些属性字段
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 22:44 2021/6/8
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcel_SomeNoPropertyField() {
        List<User> data = new ArrayList<>();

        User user = new User(10002, "随风打酱油1", "男",
                9999.99, new Date());
        data.add(user);

        Set<String> set = new HashSet<>();
        set.add("hireDate");
        set.add("userName");

        EasyExcel.write("去除一些属性字段.xlsx", User.class).excludeColumnFiledNames(set).sheet("用户信息").doWrite(data);
    }

    /**
     * @title: 指定有效的列
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 22:50 2021/6/8
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcel_SomePropertyField() {
        List<User> data = new ArrayList<>();

        User user = new User(10003, "随风打酱油1", "男",
                9999.99, new Date());
        data.add(user);

        Set<String> set = new HashSet<>();
        set.add("hireDate");
        set.add("userName");

        EasyExcel.write("指定有效的列.xlsx", User.class).includeColumnFiledNames(set).sheet("用户信息").doWrite(data);
    }

    /**
     * @title: 复杂头写数据
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 9:37 2021/6/9
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcel_ComplexHead() {
        List<ComplexHeadUser> data = new ArrayList<>();

        ComplexHeadUser user = new ComplexHeadUser(20000, "随风打酱油", new Date());
        data.add(user);

        EasyExcel.write("复杂头写数据.xlsx", ComplexHeadUser.class).sheet("复杂头用户信息").doWrite(data);
    }

    /**
     * @title: 重复写同一个sheet
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 9:42 2021/6/9
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcel_RepeatSameSheet() {
        List<User> data = new ArrayList<>();
        User user1 = new User(10001, "随风打酱油1", "男", 9999.99, new Date());
        User user2 = new User(10002, "随风打酱油2", "男", 9999.99, new Date());
        User user3 = new User(10003, "随风打酱油3", "男", 9999.99, new Date());
        User user4 = new User(10004, "随风打酱油4", "男", 9999.99, new Date());
        data.add(user1);
        data.add(user2);
        data.add(user3);
        data.add(user4);

        ExcelWriter excelWriter = EasyExcel.write("重复写同一个sheet.xlsx", User.class).build();

        WriteSheet writeSheet = EasyExcel.writerSheet("用户信息").build();

        for (int i = 0; i < 5; i++) {
            excelWriter.write(data, writeSheet);
        }

        excelWriter.finish();
    }

    /**
     * @title: 重复写不同的sheet
     * @Author: SFDJY
     * @Description:
     * @throws:
     * @Date: 9:45 2021/6/9
     * 声明：此方法源代码版权归SFDJY所有，任何人不得侵权。
     */
    @Test
    public void SFDJY_WriteExcel_RepeatNoSameSheet() {
        List<User> data = new ArrayList<>();
        User user1 = new User(10001, "随风打酱油1", "男", 9999.99, new Date());
        User user2 = new User(10002, "随风打酱油2", "男", 9999.99, new Date());
        User user3 = new User(10003, "随风打酱油3", "男", 9999.99, new Date());
        User user4 = new User(10004, "随风打酱油4", "男", 9999.99, new Date());
        data.add(user1);
        data.add(user2);
        data.add(user3);
        data.add(user4);

        ExcelWriter excelWriter = EasyExcel.write("重复写不同的sheet.xlsx", User.class).build();

        for (int i = 0; i < 5; i++) {
            WriteSheet writeSheet = EasyExcel.writerSheet("用户信息" + i).build();
            excelWriter.write(data, writeSheet);
        }

        excelWriter.finish();
    }
}
