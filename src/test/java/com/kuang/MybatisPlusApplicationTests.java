package com.kuang;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kuang.mapper.UserMapper;
import com.kuang.pojo.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    // 继承了BaseMapper，所有的方法都来自己父类
    // 我们也可以编写自己的扩展方法！
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        // 参数是一个 Wrapper ，条件构造器，这里我们先不用 null
        // 查询全部用户
        List<Users> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
//
//    // 测试插入
//    @Test
//    public void testInsert(){
//        Users users = new Users();
//        users.setName("狂神说Java");
//        users.setAge(3);
//        users.setEmail("24736743@qq.com");
//
//        int result = userMapper.insert(users); // 帮我们自动生成id
//        System.out.println(result); // 受影响的行数
//        System.out.println(users); // 发现，id会自动回填
//    }
//
//    // 测试更新
//    @Test
//    public void testUpdate(){
//        Users users = new Users();
//        // 通过条件自动拼接动态sql
//        users.setId(1240620674645544965L);
//        users.setName("关注公众号：狂神说");
//        users.setAge(20);
//        // 注意：updateById 但是参数是一个 对象！
//        int i = userMapper.updateById(users);
//        System.out.println(i);
//    }
//
//    // 测试乐观锁成功！
//    @Test
//    public void testOptimisticLocker(){
//        // 1、查询用户信息
//        Users users = userMapper.selectById(1L);
//        // 2、修改用户信息
//        users.setName("kuangshen");
//        users.setEmail("24736743@qq.com");
//        // 3、执行更新操作
//        userMapper.updateById(users);
//    }
//
//
//    // 测试乐观锁失败！多线程下
//    @Test
//    public void testOptimisticLocker2(){
//
//        // 线程 1
////        Users users = userMapper.selectById(1L);
////        users.setName("kuangshen111");
////        users.setEmail("24736743@qq.com");
////
////        // 模拟另外一个线程执行了插队操作
////        Users users2 = userMapper.selectById(1L);
////        users2.setName("kuangshen222");
////        users2.setEmail("24736743@qq.com");
////        userMapper.updateById(users2);
////
////        // 自旋锁来多次尝试提交！
////        userMapper.updateById(users); // 如果没有乐观锁就会覆盖插队线程的值！
//    }
//
//    // 测试查询
//    @Test
//    public void testSelectById(){
//        Users users = userMapper.selectById(1L);
//        System.out.println(users);
//    }
//
//    // 测试批量查询！
//    @Test
//    public void testSelectByBatchId(){
//        List<Users> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
//        users.forEach(System.out::println);
//    }
//
//    // 按条件查询之一使用map操作
//    @Test
//    public void testSelectByBatchIds(){
//        HashMap<String, Object> map = new HashMap<>();
//        // 自定义要查询
//        map.put("name","狂神说Java");
//        map.put("age",3);
//
//        List<Users> users = userMapper.selectByMap(map);
//        users.forEach(System.out::println);
//    }
//
//    // 测试分页查询
//    @Test
//    public void testPage(){
//        //  参数一：当前页
//        //  参数二：页面大小
//        //  使用了分页插件之后，所有的分页操作也变得简单的！
//        Page<Users> page = new Page<>(2,5);
//        userMapper.selectPage(page,null);
//
//        page.getRecords().forEach(System.out::println);
//        System.out.println(page.getTotal());
//
//    }
//
//
//    // 测试删除
//    @Test
//    public void testDeleteById(){
//        userMapper.deleteById(1L);
//    }
//
//    // 通过id批量删除
//    @Test
//    public void testDeleteBatchId(){
//        userMapper.deleteBatchIds(Arrays.asList(1240620674645544961L,1240620674645544962L));
//    }
//
//    // 通过map删除
//    @Test
//    public void testDeleteMap(){
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("name","狂神说Java");
//        userMapper.deleteByMap(map);
//    }



}
