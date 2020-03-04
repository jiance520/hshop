package com.test;


import com.HshopApp;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.runner.RunWith;
import java.util.*;
import org.junit.*;
import org.springframework.transaction.annotation.Transactional;

//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的App启动类
@SpringBootTest(classes = HshopApp.class)
//由于是Web项目，Junit需要模拟ServletContext，
// 因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class TestBean {
    @Autowired
    private IManagerService imanagerService ;
    @Autowired
    private IAdvertService iAdvertService;
    @Autowired
    private ICommentsService iCommentsService;
    @Autowired
    private IExpressService iExpressService;
    @Autowired
    private IFriendshipService iFriendshipService;
    @Autowired
    private IGradeService iGradeService;
    @Autowired
    private IManagerService iManagerService;
    @Autowired
    private IOrderstateService iOrderstateService;
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProduct_brandService iProduct_brandService;
    @Autowired
    private IProduct_cpuService iProduct_cpuService;
    @Autowired
    private IProduct_dvdromService iProduct_dvdromService;
    @Autowired
    private IProduct_featureService iProduct_featureService;
    @Autowired
    private IProduct_genreService iProduct_genreService;
    @Autowired
    private IProduct_graphicsService iProduct_graphicsService;
    @Autowired
    private IProduct_harddiskService iProduct_harddiskService;
    @Autowired
    private IProduct_osService iProduct_osService;
    @Autowired
    private IProduct_romService iProduct_romService;
    @Autowired
    private IProduct_screenService iProduct_screenService;
    @Autowired
    private IProduct_styleService iProduct_styleService;
    @Autowired
    private ISellorderService iSellorderService;
    @Autowired
    private ISellproductService iSellproductService;
    @Autowired
    private IServiceService iServiceService;
    @Autowired
    private IShopcartService iShopcartService;
    @Autowired
    private IShoplogService iShoplogService;
    @Autowired
    private ISupplierService iSupplierService;
    @Autowired
    private IVipService iVipService;

    @Test
    @Transactional
    @Rollback
    public void testAll(){
        List list = iProduct_romService.selectRomAll();
        System.out.println(" list = "+list);
    }
}
