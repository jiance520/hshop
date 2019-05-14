package com.action;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.util.JdbcUtil;
import com.util.PoiUtil;
import com.util.UserPasswordUtil;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.session.Configuration;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.service.*;
import com.entity.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController implements ServletContextAware {
    private ServletContext application;
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
    @Override
    public void setServletContext(ServletContext servletContext) {
        application = servletContext;
    }
    @ResponseBody
    @RequestMapping(value = "/expressAllAction", produces = {"application/json; charset=UTF-8"})
    public String expressAllAction() {
        String js = "";
        System.out.println("---expressAllAction");
        List list = iExpressService.selectAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/orderStateAllAction", produces = {"application/json; charset=UTF-8"})
    public String orderStateAllAction() {
        String js = "";
        System.out.println("---orderStateAllAction");
        List list = iOrderstateService.selectOrderStateAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/vipAllAction", produces = {"application/json; charset=UTF-8"})
    public String vipAllAction() {
        String js = "";
        System.out.println("---vipAllAction");
        List list = iVipService.selectAll();
        js = JSON.toJSONString(list,SerializerFeature.WriteMapNullValue,SerializerFeature.PrettyFormat);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/genreAllAction", produces = {"application/json; charset=UTF-8"})
    public String genreAllAction() {
        String js = "";
        System.out.println("---genreAllAction");
        List list = iProduct_genreService.selectGenreAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/brandAllAction", produces = {"application/json; charset=UTF-8"})
    public String brandAllAction() {
        String js = "";
        System.out.println("---brandAllAction");
        Map map = new HashMap();
        List list = iProduct_brandService.select_brandAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/supplierAllAction", produces = {"application/json; charset=UTF-8"})
    public String supplierAllAction() {
        String js = "";
        System.out.println("---supplierAllAction");
        List list = iSupplierService.selectSupplierAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/screenAllAction", produces = {"application/json; charset=UTF-8"})
    public String screenAllAction() {
        String js = "";
        System.out.println("---screenAllAction");
        List list = iProduct_screenService.selectScreenAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/styleAllAction", produces = {"application/json; charset=UTF-8"})
    public String styleAllAction() {
        String js = "";
        System.out.println("---styleAllAction");
        List list = iProduct_styleService.selectStyleAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/osAllAction", produces = {"application/json; charset=UTF-8"})
    public String osAllAction() {
        String js = "";
        System.out.println("---osAllAction");
        List list = iProduct_osService.selectOsAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/romAllAction", produces = {"application/json; charset=UTF-8"})
    public String romAllAction() {
        String js = "";
        System.out.println("---romAllAction");
        List list = iProduct_romService.selectRomAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/diskAllAction", produces = {"application/json; charset=UTF-8"})
    public String diskAllAction() {
        String js = "";
        System.out.println("---diskAllAction");
        List list = iProduct_harddiskService.selectDiskAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/grapAllAction", produces = {"application/json; charset=UTF-8"})
    public String grapAllAction() {
        String js = "";
        System.out.println("---grapAllAction");
        List list = iProduct_graphicsService.selectGrapAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/dvdAllAction", produces = {"application/json; charset=UTF-8"})
    public String dvdAllAction() {
        String js = "";
        System.out.println("---dvdAllAction");
        List list = iProduct_dvdromService.selectDvdAll();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/cpuAllAction", produces = {"application/json; charset=UTF-8"})
    public Object cpuAllAction() {
        String js = "";
        System.out.println("---cpuAllAction");
        List list = iProduct_cpuService.selectCpuAction();
        js = JSON.toJSONString(list);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/featAllAction", produces = {"application/json; charset=UTF-8"})
    public String featAllAction() {
        String js = "";
        System.out.println("---featAllAction");
        List list = iProduct_featureService.selectFeatAll();
        js = JSON.toJSONString(list);
        return js;
    }

//    加载订单,每次发送给主页的数据只有rows行！当前页，如果要导出全部数据，需要重新查询
    @ResponseBody
    @RequestMapping(value = "/sellorderAllAction",produces = "application/json;chart=UTF-8")
    public Object sellorderAllAction(Integer page,Integer rows,String sort,String order,String searchvalue){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        if("已付款".equals(searchvalue)){
            pagemap.put("paystate",1);
        }
        if("未付款".equals(searchvalue)){
            pagemap.put("paystate",0);
        }
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        List backlist = iSellorderService.selectSellOrderMapSearchAll(pagemap);
        System.out.println("backlist:"+backlist);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==backlist.size()){
                break;
            }
            pagelist.add(backlist.get(startIndex+i));
        }
        datagridmap.put("total",backlist.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("backlist:"+backlist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="/add_sellorderAction",produces={"application/json;chart=UTF-8"})
    public String add_sellorderAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Sellorder sellorder = new Sellorder();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(map.get("logdate"));
        sellorder.setLogdate(date);
        sellorder.setOrdernum(map.get("ordernum"));
        sellorder.setPaytype(map.get("paytype"));
        sellorder.setPostaddr(map.get("postaddr"));
        sellorder.setPostname(map.get("postname"));
        sellorder.setPostphone(map.get("postphone"));
        sellorder.setRemark(map.get("remark"));
        sellorder.setExpressid(Long.parseLong((String)map.get("expressid")));// todo
        sellorder.setSum(BigDecimal.valueOf(Long.parseLong((String)map.get("sum"))));
        sellorder.setPaystate(Long.valueOf((String)map.get("paystate")));
        sellorder.setOrderstateid(Long.parseLong((String)map.get("orderstateid")));
        sellorder.setVipid(Long.parseLong((String)map.get("vipid")));
        sellorder.setState(Long.parseLong((String)map.get("state")));
        System.out.println("sellorder:"+sellorder);
        int num = iSellorderService.insertSelective(sellorder);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/del_sellorderAction",produces={"application/json;chart=UTF-8"})
    public String del_sellorderAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long soid = Long.parseLong(row.get("SOID"));
        int num  = iSellorderService.deleteByPrimaryKey(soid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @RequestMapping("/update_sellorderAction")
    public void update_sellorderAction(HttpServletResponse response,@RequestParam Map<String,String> row) throws Exception{
        PrintWriter out = response.getWriter();
        System.out.println("row"+row);
        Sellorder sellorder = new Sellorder();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(row.get("LOGDATE"));
        sellorder.setLogdate(date);
        sellorder.setOrdernum((String)row.get("ORDERNUM"));
        sellorder.setPaytype((String)row.get("PAYTYPE"));
        sellorder.setPostaddr((String)row.get("POSTADDR"));
        sellorder.setPostname((String)row.get("POSTNAME"));
        sellorder.setPostphone((String)row.get("POSTPHONE"));
        sellorder.setRemark((String)row.get("REMARK"));
        sellorder.setSoid(Long.parseLong((String)row.get("SOID")));
        sellorder.setExpressid(Long.parseLong((String)row.get("EXPRESSID")));// todo
        sellorder.setSum(BigDecimal.valueOf(Long.parseLong((String)row.get("SUM"))));
        sellorder.setPaystate(Long.valueOf((String)row.get("PAYSTATE")));
        sellorder.setOrderstateid(Long.parseLong((String)row.get("ORDERSTATEID")));
        sellorder.setVipid(Long.parseLong((String)row.get("VIPID")));
        sellorder.setState(Long.parseLong((String)row.get("STATE")));
        System.out.println("sellorder:"+sellorder);
        int num = iSellorderService.updateByPrimaryKeySelective(sellorder);
        if(num > 0){
            out.print("true");
        }else{
            out.print("false");
        }
        out.flush();
        out.close();
    }
    //    导出搜索的xlsx
    @ResponseBody
    @RequestMapping(value = "/out_sellorderAction",produces = "application/json;chart=UTF-8")
    public Object out_sellorderAction(String osort,String oorder,String ovalue,HttpServletResponse response) throws Exception {
        if("undefined".equals(oorder)){
            oorder=null;
        }
        if("undefined".equals(osort)){
            osort=null;
        }
        if("undefined".equals(ovalue)){
            ovalue=null;
        }
        System.out.println("osort:"+osort);
        System.out.println("oorder:"+oorder);
        System.out.println("ovalue:"+ovalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",ovalue);
        if("已付款".equals(ovalue)){
            pagemap.put("paystate",1);
        }
        if("未付款".equals(ovalue)){
            pagemap.put("paystate",0);
        }
        pagemap.put("sort",osort);
        pagemap.put("order",oorder);

//        Configuration configuration = new Configuration();
//        configuration.setCallSettersOnNulls(true);
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setConfiguration(configuration);
//解决spring boot整合mybatis时 返回map value为空字段不显示
        List backlist = iSellorderService.selectSellOrderMapSearchAll(pagemap);
        System.out.println("backlist:"+backlist);
        PoiUtil.outxlsx(backlist,response);
        String js = JSON.toJSONString(backlist, SerializerFeature.WriteMapNullValue,SerializerFeature.PrettyFormat);
//        System.out.println("测试js:"+js);
        return js;
    }
    //    导入新增或修改xlsx
//    ,@RequestParam(value="excelfile")MultipartFile file
    @ResponseBody
    @RequestMapping(value = "in_sellorderAction")/*,method= RequestMethod.POST,不能用这个，否则无法输出内容*/
    public Object in_sellorderAction(MultipartFile excelfile) throws Exception {
        String path = application.getRealPath("img/product")+ File.separator;
        System.out.println("-----img/product:"+path);
        List<HashMap<String,Object>> mapList = PoiUtil.inxlsx(excelfile);
        int num = 0;
        for(int i=0;i<mapList.size(); i++){
            Sellorder sellorder = new Sellorder();
            HashMap map = mapList.get(i);
            System.out.println("map:"+map);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
            //        DateFormat dateFormat = new SimpleDateFormat("yyyy\\MM\\dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
            Date date = dateFormat.parse((String)map.get("LOGDATE"));
            sellorder.setLogdate(date);
            sellorder.setOrdernum((String)map.get("ORDERNUM"));
            sellorder.setPaytype((String)map.get("PAYTYPE"));
            sellorder.setPostaddr((String)map.get("POSTADDR"));
            sellorder.setPostname((String)map.get("POSTNAME"));
            sellorder.setPostphone((String)map.get("POSTPHONE"));
            sellorder.setRemark((String)map.get("REMARK"));
//            sellorder.setSoid(Long.parseLong((String)map.get("SOID")));
            sellorder.setExpressid(Long.parseLong((String)map.get("EXPRESSID")));
            sellorder.setSum(BigDecimal.valueOf(Long.parseLong((String)map.get("SUM"))));
            sellorder.setPaystate(Long.valueOf((String)map.get("PAYSTATE")));
            sellorder.setOrderstateid(Long.parseLong((String)map.get("ORDERSTATEID")));
            sellorder.setVipid(Long.parseLong((String)map.get("VIPID")));
            sellorder.setState(Long.parseLong((String)map.get("STATE")));
            num = iSellorderService.insertSelective(sellorder);
        }
        String js = JSON.toJSONString(num);
        System.out.println("测试js:"+js);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/out_productAction",produces = "application/json;chart=UTF-8")
    public Object out_productAction(String osort, String oorder, String ovalue, HttpServletResponse response, org.apache.catalina.servlet4preview.http.HttpServletRequest request) throws Exception {
        System.out.println("-----out_productAction:");
        if("undefined".equals(oorder)){//排序方式
            oorder=null;
        }
        if("undefined".equals(osort)){//排序字段
            osort=null;
        }
        if("undefined".equals(ovalue)){//模糊查询值
            ovalue=null;
        }
//        if("undefined".equals(arr)){//批量查询的字段
//            arr=null;
//        }
        System.out.println("osort:"+osort);
        System.out.println("oorder:"+oorder);
        System.out.println("ovalue:"+ovalue);
        Map pagemap = new HashMap();
        pagemap.put("searchvalue",ovalue);
        pagemap.put("sort",osort);
        pagemap.put("order",oorder);
        String arrstr = request.getParameter("arrid");
        if(!"".equals(arrstr)&&arrstr!=null){
            String[] arrid = arrstr.split(",");
            Long[] arrlong = new Long[arrid.length];
            for(int i=0;i<arrid.length;i++){
                arrlong[i] = Long.valueOf(arrid[i]);
                System.out.println("-----arrlong[i]:"+arrlong[i]);
            }
            pagemap.put("arrlong",arrlong);//批量查询的字段
        }
        else {
            pagemap.put("arrlong",null);//批量查询的字段
        }
        List listMap = iProductService.selectProductListMap(pagemap);
        System.out.println("listMap:"+listMap);
        PoiUtil.outxlsx(listMap,response);
        String js = JSON.toJSONString(listMap, SerializerFeature.WriteMapNullValue,SerializerFeature.PrettyFormat);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "in_productAction")/*,method= RequestMethod.POST,不能用这个，也不能用ajax,否则无法输出内容*/
    public Object in_productAction(MultipartFile excelfile) throws Exception {
        String path = application.getRealPath("img/product")+ File.separator;
        System.out.println("-----img/product:"+path);
        List<HashMap<String,Object>> mapList = PoiUtil.inxlsx(excelfile);
        int num = 0;
        for(int i=0;i<mapList.size(); i++){
            HashMap map = mapList.get(i);
            System.out.println("map:"+map);
            Product product = new Product();
            Long brandid = Long.parseLong((String)map.get("BRANDID"));
            product.setProductid(Long.parseLong((String)map.get("PRODUCTID")));
            product.setAlarmnum(Long.parseLong((String)map.get("ALARMNUM")));
            product.setDiscount(Long.parseLong((String)map.get("DISCOUNT")));
            product.setIsdiscount(Long.parseLong((String)map.get("ISDISCOUNT")));
            product.setOneimg((String)map.get("ONEIMG"));
            product.setPrice(Double.parseDouble((String)map.get("PRICE")));
            product.setProductnum(Long.parseLong((String)map.get("PRODUCTNUM")));
            product.setProductname((String)map.get("PRODUCTNAME"));
            product.setProductno(map.get("PRODUCTNO"));

            product.setCpuunitid(Long.parseLong((String)map.get("CPUUNITID")));


            product.setGenreid(Long.parseLong((String)map.get("GENREID")));

            product.setHarddiskid(Long.parseLong((String)map.get("HARDDISKID")));

            product.setRomid(Long.parseLong((String)map.get("ROMID")));
            product.setScreenid(Long.parseLong((String)map.get("SCREENID")));
            product.setProductstyleid(Long.parseLong((String)map.get("PRODUCTSTYLEID")));

            product.setSupplierid(Long.parseLong((String)map.get("SUPPLIERID")));
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
//DateFormat dateFormat = new SimpleDateFormat("yyyy\\MM\\dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
            Date date = dateFormat.parse((String)(String)map.get("LOGDATE"));
            product.setLogdate(date);
            product.setBrandid(brandid);
            Object dvd_driveid = map.get("DVDROMID");
            Object feat_driveid = map.get("FEATUREID");
            Object grap_driveid = map.get("GRAPHICSID");
            Object osid = map.get("PRODUCTOSID");
            Object twoimg = map.get("THREEIMG");
            Object threeimg = map.get("TWOIMG");
            Object productdesc = map.get("PRODUCTDESC");
            if(dvd_driveid!=null&&!"".equals(dvd_driveid)){
                product.setDvdromid(Long.parseLong((String)dvd_driveid));/*允许为空*/
            }
            if(feat_driveid!=null&&!"".equals(feat_driveid)){
                product.setFeatureid(Long.parseLong((String)feat_driveid));/*允许为空*/
            }
            if(grap_driveid!=null&&!"".equals(grap_driveid)){
                product.setGraphicsid(Long.parseLong((String)grap_driveid));/*允许为空*/
            }
            if(osid!=null&&!"".equals(osid)){
                product.setProductosid(Long.parseLong((String)osid));/*允许为空*/
            }
            if(threeimg!=null&&!"".equals(threeimg)){
                product.setThreeimg((String)threeimg);/*允许为空*/
            }
            if(twoimg!=null&&!"".equals(twoimg)){
                product.setTwoimg((String)twoimg);/*允许为空*/
            }
            if(productdesc!=null&&!"".equals(productdesc)){
                product.setProductdesc((String)productdesc);/*允许为空*//*这里保存网页-----content:<p><img src="http://localhost:8090/hshop/ueditor/jsp/upload/image/20180907/1536332182883037701.png" title="1536332182883037701.png" alt="2018-08-22_215314.png"/></p>*/
            }
            Product obj = iProductService.selectByPrimaryKey(Long.parseLong((String)map.get("PRODUCTID")));
            System.out.println("-----obj:"+obj);
            if(obj==null){
                num = iProductService.insertSelective(product);
            }
            else {
                System.out.println("-----产品已存在:");
            }
        }
        String js = JSON.toJSONString(num);
        System.out.println("测试js:"+js);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/productAllAction",produces = "application/json;chart=UTF-8")
    public Object productAllAction(Integer page,Integer rows,String sort,String order,String searchvalue,String productid){
//        List list = iProductService.selectProductListMap();
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("productid:"+productid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("productid",productid);
        List productListMap = iProductService.selectProductListMap(pagemap);
        System.out.println("productListMap:"+productListMap);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==productListMap.size()){
                break;
            }
            pagelist.add(productListMap.get(startIndex+i));
        }
        datagridmap.put("total",productListMap.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }

    @RequestMapping("/productMapAction")
    public ModelAndView productMapAction(Integer productid,ModelAndView mav,HttpSession session){
        System.out.println("-----productid:"+productid);
        Map map = iProductService.selectProductMap(productid);
        session.setAttribute("product",map);
        mav.setViewName("redirect:deng_web/product_edit.jsp");
        return mav;
    }
    @ResponseBody
    @RequestMapping(value = "/productMapAjax",produces = "application/json;chart=UTF-8")
    public String productMapAjax(Integer productid,HttpSession session){
        System.out.println("-----productMapAjax  id:"+productid);
        Map map = iProductService.selectProductMap(productid);
        String js = JSON.toJSONString(map);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/add_productAction",produces = {"application/json; charset=UTF-8"})
    public String add_productAction(HttpServletRequest request,@RequestParam(required=false) MultipartFile[] files,@RequestParam Map<String,Object> formdatamap) throws IOException {
//        @RequestParam(required=false) 允许上传文件为空
        System.out.println("-----files:"+files);
        String productdesc = request.getParameter("productdesc");/*允许为空*/
        String genreid = request.getParameter("genreid");
        String brandid = request.getParameter("brandid");
        String productname = request.getParameter("productname");
        String productno = request.getParameter("productno");
        String price = request.getParameter("price");
        String productnum = request.getParameter("productnum");
        String alarmnum = request.getParameter("alarmnum");
//        String oneimg = request.getParameter("oneimg");
//        String twoimg = request.getParameter("twoimg");
//        String threeimg = request.getParameter("threeimg");
        String oneimg = "";
        String twoimg = "";
        String threeimg = "";
        String ssid = request.getParameter("ssid");
        String screen_driveid = request.getParameter("screen_driveid");
        String styleid = request.getParameter("styleid");
        String osid = request.getParameter("osid");/*允许为空*/
        String rom_driveid = request.getParameter("rom_driveid");
        String disk_driveid = request.getParameter("disk_driveid");
        String grap_driveid = request.getParameter("grap_driveid");/*允许为空*/
        String dvd_driveid = request.getParameter("dvd_driveid");/*允许为空*/
        String cpu_driveid = request.getParameter("cpu_driveid");
        String feat_driveid = request.getParameter("feat_driveid");/*允许为空*/
        Product add_product = new Product();
        add_product.setAlarmnum(Long.parseLong(alarmnum));
//        add_product.setProductid(Long.parseLong(productid));/*允许为空*/
        add_product.setDiscount((long)0);/*允许为空*/
        add_product.setIsdiscount((long)0);/*允许为空*/
        add_product.setProductnum(Long.parseLong(productnum));
        add_product.setBrandid(Long.parseLong(brandid));
        add_product.setCpuunitid(Long.parseLong(cpu_driveid));
        add_product.setGenreid(Long.parseLong(genreid));
        add_product.setHarddiskid(Long.parseLong(disk_driveid));
        if(dvd_driveid!=null&&!"".equals(dvd_driveid)){
            add_product.setDvdromid(Long.parseLong(dvd_driveid));/*允许为空*/
        }
        if(feat_driveid!=null&&!"".equals(feat_driveid)){
            add_product.setFeatureid(Long.parseLong(feat_driveid));/*允许为空*/
        }
        if(grap_driveid!=null&&!"".equals(grap_driveid)){
            add_product.setGraphicsid(Long.parseLong(grap_driveid));/*允许为空*/
        }
        if(osid!=null&&!"".equals(osid)){
            add_product.setProductosid(Long.parseLong(osid));/*允许为空*/
        }
        add_product.setRomid(Long.parseLong(rom_driveid));
        add_product.setScreenid(Long.parseLong(screen_driveid));
        add_product.setProductstyleid(Long.parseLong(styleid));
        add_product.setSupplierid(Long.parseLong(ssid));/*非空*/
        add_product.setPrice(Double.parseDouble(price));
        add_product.setLogdate(new Date());/*非空*/
        add_product.setProductno(productno);
//        String realPath = application.getRealPath("\\img\\product")+File.separator;
        String path = "D:\\source\\apache-tomcat-7.0.86\\webapps\\img\\product";//用于上传文件时写入本地路径
        String webpath = "http://localhost:8090/img/product/";//图片服务器访问路径,保存在数据库
        int imagenum = 0;
        if(files!=null){
            for (MultipartFile file : files) {
                //判断文件非空，上传
                if(!file.isEmpty()){
                    String type = file.getContentType();
                    long size = file.getSize();
                    System.out.println("文件类型："+type+"\t文件大小："+size);

                    //随机字符串
                    String uuid = UUID.randomUUID().toString();
                    System.out.println(" uuid = "+uuid);

                    //文件名称
                    String fname = file.getOriginalFilename();
                    System.out.println("  name = "+fname);
                    if(imagenum==0){
                        oneimg = webpath+uuid+fname;/*由于打war包，路径会影响，这里使用本地磁盘绝对路径*/
                    }
                    else if(imagenum==1){
                        twoimg = webpath+uuid+fname;
                    }
                    else if(imagenum==2){
                        threeimg = webpath+uuid+fname;
                    }
                    //目标文件
                    File webfile = new File(path,uuid+fname);

                    //上传：将上传文件流写入目标文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), webfile);
                }
                imagenum++;
            }
        }
        add_product.setOneimg(oneimg);
        add_product.setProductname(productname);
        if(threeimg!=null&&!"".equals(threeimg)){
            add_product.setThreeimg(threeimg);/*允许为空*/
        }
        if(twoimg!=null&&!"".equals(twoimg)){
            add_product.setTwoimg(twoimg);/*允许为空*/
        }
        if(productdesc!=null&&!"".equals(productdesc)){
            add_product.setProductdesc(productdesc);/*允许为空*//*这里保存网页-----content:<p><img src="http://localhost:8090/hshop/ueditor/jsp/upload/image/20180907/1536332182883037701.png" title="1536332182883037701.png" alt="2018-08-22_215314.png"/></p>*/
        }
        System.out.println("-----add_product:"+add_product);
        int num = iProductService.insertSelective(add_product);
        System.out.println("-----oneimg:"+oneimg);
        System.out.println("-----twoimg:"+twoimg);
        System.out.println("-----threeimg:"+threeimg);
        System.out.println("-----productdesc:"+productdesc);
        String js = JSON.toJSONString(num);
        return js;
    }
    @ResponseBody
    @RequestMapping(value = "/update_productAction",produces = "application/json;chart=UTF-8")
    public String update_productAction(HttpServletRequest request,HttpServletResponse response,@RequestParam Map<String,String> map,@RequestParam(required=false) MultipartFile[] files) throws Exception{
        System.out.println("map"+map);
        Product product = new Product();
//        product.setBrandid(Long.parseLong((String)map.get("BRANDID")));
//        product.setProductid(Long.parseLong((String)map.get("PRODUCTID")));
//        product.setAlarmnum(Long.parseLong((String)map.get("ALARMNUM")));
//        product.setDiscount(Long.parseLong((String)map.get("DISCOUNT")));
//        product.setIsdiscount(Long.parseLong((String)map.get("ISDISCOUNT")));
//        product.setPrice(Double.parseDouble((String)map.get("PRICE")));
//        product.setProductnum(Long.parseLong((String)map.get("PRODUCTNUM")));
//        product.setProductname((String)map.get("PRODUCTNAME"));
//        product.setProductno(map.get("PRODUCTNO"));
//        product.setCpuunitid(Long.parseLong((String)map.get("CPUUNITID")));
//        product.setGenreid(Long.parseLong((String)map.get("GENREID")));
//        product.setHarddiskid(Long.parseLong((String)map.get("HARDDISKID")));
//        product.setRomid(Long.parseLong((String)map.get("ROMID")));
//        product.setScreenid(Long.parseLong((String)map.get("SCREENID")));
//        product.setProductstyleid(Long.parseLong((String)map.get("PRODUCTSTYLEID")));
//        product.setSupplierid(Long.parseLong((String)map.get("SUPPLIERID")));
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
////DateFormat dateFormat = new SimpleDateFormat("yyyy\\MM\\dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
//        Date date = dateFormat.parse((String)(String)map.get("LOGDATE"));
//        product.setLogdate(date);
        String productid = request.getParameter("productid");
        String productdesc = request.getParameter("productdesc");/*允许为空*/
        String genreid = request.getParameter("genreid");
        String brandid = request.getParameter("brandid");
        String productname = request.getParameter("productname");
        String productno = request.getParameter("productno");
        String price = request.getParameter("price");
        String productnum = request.getParameter("productnum");
        String alarmnum = request.getParameter("alarmnum");
        String ssid = request.getParameter("ssid");
        String screen_driveid = request.getParameter("screen_driveid");
        String styleid = request.getParameter("styleid");
        String osid = request.getParameter("osid");/*允许为空*/
        String rom_driveid = request.getParameter("rom_driveid");
        String disk_driveid = request.getParameter("disk_driveid");
        String grap_driveid = request.getParameter("grap_driveid");/*允许为空*/
        String dvd_driveid = request.getParameter("dvd_driveid");/*允许为空*/
        String cpu_driveid = request.getParameter("cpu_driveid");
        String feat_driveid = request.getParameter("feat_driveid");/*允许为空*/
        String oneimg = "";
        String twoimg = "";
        String threeimg = "";
        product.setAlarmnum(Long.parseLong(alarmnum));
        product.setProductid(Long.parseLong(productid));/*允许为空*/
        product.setDiscount((long)0);/*允许为空*/
        product.setIsdiscount((long)0);/*允许为空*/
        product.setProductnum(Long.parseLong(productnum));
        product.setBrandid(Long.parseLong(brandid));
        product.setCpuunitid(Long.parseLong(cpu_driveid));
        product.setGenreid(Long.parseLong(genreid));
        product.setHarddiskid(Long.parseLong(disk_driveid));
        product.setRomid(Long.parseLong(rom_driveid));
        product.setScreenid(Long.parseLong(screen_driveid));
        product.setProductstyleid(Long.parseLong(styleid));
        product.setSupplierid(Long.parseLong(ssid));/*非空*/
        product.setPrice(Double.parseDouble(price));
//        product.setLogdate(date);/*非空*/
        product.setProductno(productno);
        //        String realPath = application.getRealPath("\\img\\product")+File.separator;
        String path = "D:\\source\\apache-tomcat-7.0.86\\webapps\\img\\product";//用于上传文件时写入本地路径
        String webpath = "http://localhost:8090/img/product/";//图片服务器访问路径,保存在数据库
        int imagenum = 0;
        if(files!=null){
            for (MultipartFile file : files) {
                //判断文件非空，上传
                if(!file.isEmpty()){
                    String type = file.getContentType();
                    long size = file.getSize();
                    System.out.println("文件类型："+type+"\t文件大小："+size);

                    //随机字符串
                    String uuid = UUID.randomUUID().toString();
                    System.out.println(" uuid = "+uuid);

                    //文件名称
                    String fname = file.getOriginalFilename();
                    System.out.println("  name = "+fname);
                    if(imagenum==0){
                        oneimg = webpath+uuid+fname;/*由于打war包，路径会影响，这里使用本地磁盘绝对路径*/
                    }
                    else if(imagenum==1){
                        twoimg = webpath+uuid+fname;
                    }
                    else if(imagenum==2){
                        threeimg = webpath+uuid+fname;
                    }
                    //目标文件
                    File webfile = new File(path,uuid+fname);

                    //上传：将上传文件流写入目标文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), webfile);
                }
                imagenum++;
            }
        }
        product.setOneimg(oneimg);
        if(threeimg!=null&&!"".equals(threeimg)){
            product.setThreeimg(threeimg);/*允许为空*/
        }
        if(twoimg!=null&&!"".equals(twoimg)){
            product.setTwoimg(twoimg);/*允许为空*/
        }
        if(dvd_driveid!=null&&!"".equals(dvd_driveid)){
            product.setDvdromid(Long.parseLong(dvd_driveid));/*允许为空*/
        }
        if(feat_driveid!=null&&!"".equals(feat_driveid)){
            product.setFeatureid(Long.parseLong(feat_driveid));/*允许为空*/
        }
        if(grap_driveid!=null&&!"".equals(grap_driveid)){
            product.setGraphicsid(Long.parseLong(grap_driveid));/*允许为空*/
        }
        if(osid!=null&&!"".equals(osid)){
            product.setProductosid(Long.parseLong(osid));/*允许为空*/
        }
        if(productdesc!=null&&!"".equals(productdesc)){
            product.setProductdesc(productdesc);/*允许为空*//*这里保存网页-----content:<p><img src="http://localhost:8090/hshop/ueditor/jsp/upload/image/20180907/1536332182883037701.png" title="1536332182883037701.png" alt="2018-08-22_215314.png"/></p>*/
        }
        int num = iProductService.updateByPrimaryKeySelective(product);
        System.out.println("-----oneimg:"+oneimg);
        System.out.println("-----twoimg:"+twoimg);
        System.out.println("-----threeimg:"+threeimg);
        System.out.println("-----productdesc:"+productdesc);
        String js = JSON.toJSONString(num);
        return js;
    }
    @ResponseBody
    @RequestMapping(value="/del_productAction",produces={"application/json;chart=UTF-8"})
    public String del_productAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        int num  = iProductService.deleteByPrimaryKey(Long.parseLong((String)row.get("PRODUCTID")));
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/del_productsAction",produces={"application/json;chart=UTF-8"})
    public String del_productsAction(@RequestParam(value="arr[]") String[] arr){
        System.out.println("arr:"+arr.toString());
        int num = 0;
        for(int i=0;i<arr.length;i++){
            num = iProductService.deleteByPrimaryKey(Long.parseLong(arr[i]));
        }
        String js = JSON.toJSONString(num);
        return js;
    }
    @ResponseBody
    @RequestMapping(value="/brandAllAjax",produces={"application/json;chart=UTF-8"})
    public Object brandAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long brandid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("brandid:"+brandid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("brandid",brandid);
        List select_brandMap = iProduct_brandService.select_brandMap(pagemap);
        System.out.println("select_brandMap:"+select_brandMap);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==select_brandMap.size()){
                break;
            }
            pagelist.add(select_brandMap.get(startIndex+i));
        }
        datagridmap.put("total",select_brandMap.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_brandAction",produces={"application/json;chart=UTF-8"})
    public String add_brandAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Product_brand product_brand = new Product_brand();
        product_brand.setImg(map.get("img"));
        product_brand.setInfomation(map.get("infomation"));
        product_brand.setLogorder(Long.valueOf(map.get("logorder")));
        product_brand.setName(map.get("name"));
        product_brand.setUrl(map.get("url"));
        int num = iProduct_brandService.insertSelective(product_brand);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_brandAction",produces={"application/json;chart=UTF-8"})
    public String update_brandAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Product_brand product_brand = new Product_brand();
        product_brand.setBrandid(Long.valueOf(map.get("BRANDID")));
        product_brand.setImg(map.get("IMG"));
        product_brand.setInfomation(map.get("INFOMATION"));
        product_brand.setLogorder(Long.valueOf(map.get("LOGORDER")));
        product_brand.setName(map.get("NAME"));
        product_brand.setUrl(map.get("URL"));
        int num = iProduct_brandService.updateByPrimaryKeySelective(product_brand);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_brandAction",produces={"application/json;chart=UTF-8"})
    public String del_brandAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long brandid = Long.parseLong(row.get("BRANDID"));
        int num  = iProduct_brandService.deleteByPrimaryKey(brandid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/advertAllAjax",produces={"application/json;chart=UTF-8"})
    public Object advertAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long aid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("aid:"+aid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("aid",aid);
        List mapList = iAdvertService.select_advertMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_advertAction",produces={"application/json;chart=UTF-8"})
    public String add_advertAction(@RequestParam Map<String,String> map){
        System.out.println("map:"+map);
        Advert advert = new Advert();
        advert.setImg(map.get("img"));
        advert.setLink(map.get("link"));
        advert.setTitle(map.get("title"));
        int num = iAdvertService.insertSelective(advert);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_advertAction",produces={"application/json;chart=UTF-8"})
    public String update_advertAction(@RequestParam Map<String,String> map){
        System.out.println("map:"+map);
        Advert advert = new Advert();
        advert.setAid(Long.valueOf(map.get("AID")));
        advert.setImg(map.get("IMG"));
        advert.setLink(map.get("LINK"));
        advert.setTitle(map.get("TITLE"));
        int num = iAdvertService.updateByPrimaryKeySelective(advert);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_advertAction",produces={"application/json;chart=UTF-8"})
    public String del_advertAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long aid = Long.parseLong(row.get("AID"));
        int num  = iAdvertService.deleteByPrimaryKey(aid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/featureAllAjax",produces={"application/json;chart=UTF-8"})
    public Object featureAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long featureid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("featureid:"+featureid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("featureid",featureid);
        List mapList = iProduct_featureService.select_featMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_featureAction",produces={"application/json;chart=UTF-8"})
    public String add_featureAction(@RequestParam Map<String,String> map){
        System.out.println("map:"+map);
        Product_feature product_feature = new Product_feature();
        product_feature.setName(map.get("name"));
        product_feature.setParameter(map.get("parameter"));
        product_feature.setRemark(map.get("remark"));
        int num = iProduct_featureService.insertSelective(product_feature);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_featureAction",produces={"application/json;chart=UTF-8"})
    public String update_featureAction(@RequestParam Map<String,String> map){
        System.out.println("map:"+map);
        Product_feature product_feature = new Product_feature();
        product_feature.setFeatureid(Long.valueOf(map.get("FEATUREID")));
        product_feature.setName(map.get("NAME"));
        product_feature.setParameter(map.get("PARAMETER"));
        product_feature.setRemark(map.get("REMARK"));
        int num = iProduct_featureService.updateByPrimaryKeySelective(product_feature);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_featureAction",produces={"application/json;chart=UTF-8"})
    public String del_featureAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long featureid = Long.parseLong(row.get("FEATUREID"));
        int num  = iProduct_featureService.deleteByPrimaryKey(featureid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/supplierAllAjax",produces={"application/json;chart=UTF-8"})
    public Object supplierAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long ssid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("ssid:"+ssid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("ssid",ssid);
        List mapList = iSupplierService.select_supplierMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_supplierAction",produces={"application/json;chart=UTF-8"})
    public String add_supplierAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Supplier supplier = new Supplier();
        supplier.setAddress(map.get("address"));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(map.get("logdate"));
        supplier.setLogdate(date);
        supplier.setName(map.get("name"));
        supplier.setPhone(map.get("phone"));
        int num = iSupplierService.insertSelective(supplier);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_supplierAction",produces={"application/json;chart=UTF-8"})
    public String update_supplierAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Supplier supplier = new Supplier();
        supplier.setSsid(Long.valueOf(map.get("SSID")));
        supplier.setAddress(map.get("ADDRESS"));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(map.get("LOGDATE"));
        supplier.setLogdate(date);
        supplier.setName(map.get("NAME"));
        supplier.setPhone(map.get("PHONE"));
        int num = iSupplierService.updateByPrimaryKeySelective(supplier);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_supplierAction",produces={"application/json;chart=UTF-8"})
    public String del_supplierAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long ssid = Long.parseLong(row.get("SSID"));
        int num  = iSupplierService.deleteByPrimaryKey(ssid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/expressAllAjax",produces={"application/json;chart=UTF-8"})
    public Object expressAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long eid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("eid:"+eid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("eid",eid);
        List mapList = iExpressService.select_expressMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_expressAction",produces={"application/json;chart=UTF-8"})
    public String add_expressAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Express express = new Express();
        express.setAddress(map.get("address"));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(map.get("logdate"));
        express.setLogdate(date);
        express.setName(map.get("name"));
        express.setPhone(map.get("phone"));
        express.setFax(map.get("fax"));
        express.setPrice(Double.valueOf(map.get("price")));
        int num = iExpressService.insertSelective(express);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_expressAction",produces={"application/json;chart=UTF-8"})
    public String update_expressAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Express express = new Express();
        express.setEid(Long.valueOf(map.get("EID")));
        express.setAddress(map.get("ADDRESS"));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
        Date date = dateFormat.parse(map.get("LOGDATE"));
        express.setLogdate(date);
        express.setFax(map.get("FAX"));
        express.setName(map.get("NAME"));
        express.setPhone(map.get("PHONE"));
        express.setPrice(Double.valueOf(map.get("PRICE")));
        int num = iExpressService.updateByPrimaryKeySelective(express);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_expressAction",produces={"application/json;chart=UTF-8"})
    public String del_expressAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long eid = Long.parseLong(row.get("EID"));
        int num  = iExpressService.deleteByPrimaryKey(eid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/orderstateAllAjax",produces={"application/json;chart=UTF-8"})
    public Object orderstateAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long stateid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("stateid:"+stateid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("stateid",stateid);
        List mapList = iOrderstateService.select_orderstateMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_orderstateAction",produces={"application/json;chart=UTF-8"})
    public String add_orderstateAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Orderstate orderstate = new Orderstate();
        orderstate.setRemark(map.get("remark"));
        orderstate.setStatetype(map.get("statetype"));
        int num = iOrderstateService.insertSelective(orderstate);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_orderstateAction",produces={"application/json;chart=UTF-8"})
    public String update_orderstateAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Orderstate orderstate = new Orderstate();
        orderstate.setStateid(Long.valueOf(map.get("STATEID")));
        orderstate.setRemark(map.get("REMARK"));
        orderstate.setStatetype(map.get("STATETYPE"));
        int num = iOrderstateService.updateByPrimaryKeySelective(orderstate);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_orderstateAction",produces={"application/json;chart=UTF-8"})
    public String del_orderstateAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long stateid = Long.parseLong(row.get("STATEID"));
        int num  = iOrderstateService.deleteByPrimaryKey(stateid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/serviceAllAjax",produces={"application/json;chart=UTF-8"})
    public Object serviceAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long serviceid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("serviceid:"+serviceid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("serviceid",serviceid);
        List mapList = iServiceService.select_serviceMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_serviceAction",produces={"application/json;chart=UTF-8"})
    public String add_serviceAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Service service = new Service();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
        Date logdate = dateFormat.parse(map.get("logdate"));
        Date managedate = dateFormat.parse(map.get("managedate"));
        service.setLogdate(logdate);
        service.setManagedate(managedate);
        service.setContent(map.get("content"));
        service.setManageremark(map.get("manageremark"));
        service.setManagestatus(Long.valueOf(map.get("managestatus")));
        service.setOrdernum(map.get("ordernum"));
        service.setRemark(map.get("remark"));
        service.setTitle(map.get("title"));
        service.setVipid(Long.valueOf(map.get("vipid")));
        int num = iServiceService.insertSelective(service);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_serviceAction",produces={"application/json;chart=UTF-8"})
    public String update_serviceAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Service service = new Service();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
        Date logdate = dateFormat.parse(map.get("LOGDATE"));
        Date managedate = dateFormat.parse(map.get("MANAGEDATE"));
        service.setLogdate(logdate);
        service.setManagedate(managedate);
        service.setServiceid(Long.valueOf(map.get("SERVICEID")));
        service.setContent(map.get("CONTENT"));
        service.setManageremark(map.get("MANAGEREMARK"));
        service.setManagestatus(Long.valueOf(map.get("MANAGESTATUS")));
        service.setOrdernum(map.get("ORDERNUM"));
        service.setRemark(map.get("REMARK"));
        service.setTitle(map.get("TITLE"));
        service.setVipid(Long.valueOf(map.get("VIPID")));
        int num = iServiceService.updateByPrimaryKeySelective(service);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_serviceAction",produces={"application/json;chart=UTF-8"})
    public String del_serviceAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long serviceid = Long.parseLong(row.get("SERVICEID"));
        int num  = iServiceService.deleteByPrimaryKey(serviceid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/friendshipAllAjax",produces={"application/json;chart=UTF-8"})
    public Object friendshipAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long fid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("fid:"+fid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("fid",fid);
        List mapList = iFriendshipService.select_friendshipMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_friendshipAction",produces={"application/json;chart=UTF-8"})
    public String add_friendshipAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Friendship friendship = new Friendship();
        friendship.setLink(map.get("link"));
        friendship.setName(map.get("name"));
        friendship.setRemark(map.get("remark"));
        int num = iFriendshipService.insertSelective(friendship);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_friendshipAction",produces={"application/json;chart=UTF-8"})
    public String update_friendshipAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Friendship friendship = new Friendship();
        friendship.setFid(Long.valueOf(map.get("FID")));
        friendship.setLink(map.get("LINK"));
        friendship.setName(map.get("NAME"));
        friendship.setRemark(map.get("REMARK"));
        int num = iFriendshipService.updateByPrimaryKeySelective(friendship);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_friendshipAction",produces={"application/json;chart=UTF-8"})
    public String del_friendshipAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long fid = Long.parseLong(row.get("FID"));
        int num  = iFriendshipService.deleteByPrimaryKey(fid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/vipAllAjax",produces={"application/json;chart=UTF-8"})
    public Object vipAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long vid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("vid:"+vid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("vid",vid);
        List mapList = iVipService.select_vipMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_vipAction",produces={"application/json;chart=UTF-8"})
    public String add_vipAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Vip vip = new Vip();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);//创建带有时区的日期格式。
        Date borndate = dateFormat.parse(map.get("borndate"));
        Date logdate = dateFormat.parse(map.get("logdate"));
        vip.setAddress(map.get("address"));
        vip.setBorndate(borndate);
        vip.setEmail(map.get("email"));
        vip.setGender(Long.valueOf(map.get("gender")));
        vip.setLogdate(logdate);
        vip.setName(map.get("name"));
        vip.setPassword(map.get("password"));
        vip.setPhone(map.get("phone"));
        vip.setPoint(Long.valueOf(map.get("point")));
        vip.setStatus(Long.valueOf(map.get("status")));
        vip.setUsername(map.get("username"));
        vip.setGradeid(Long.valueOf(map.get("gradeid")));
        vip.setQuestion(map.get("question"));
        vip.setAnswer(map.get("answer"));
        int num = iVipService.insertSelective(vip);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_vipAction",produces={"application/json;chart=UTF-8"})
    public String update_vipAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Vip vip = new Vip();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);//创建带有时区的日期格式。
        Date borndate = dateFormat.parse(map.get("BORNDATE"));
        Date logdate = dateFormat.parse(map.get("LOGDATE"));
        vip.setAddress(map.get("ADDRESS"));
        vip.setBorndate(borndate);
        vip.setVid(Long.valueOf(map.get("VID")));
        vip.setEmail(map.get("EMAIL"));
        vip.setGender(Long.valueOf(map.get("GENDER")));
        vip.setLogdate(logdate);
        vip.setName(map.get("NAME"));
        vip.setPassword(map.get("PASSWORD"));
        vip.setPhone(map.get("PHONE"));
        vip.setPoint(Long.valueOf(map.get("POINT")));
        vip.setStatus(Long.valueOf(map.get("STATUS")));
        vip.setUsername(map.get("USERNAME"));
        vip.setGradeid(Long.valueOf(map.get("GRADEID")));
        vip.setQuestion(map.get("QUESTION"));
        vip.setAnswer(map.get("ANSWER"));
        int num = iVipService.updateByPrimaryKeySelective(vip);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_vipAction",produces={"application/json;chart=UTF-8"})
    public String del_vipAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long vid = Long.parseLong(row.get("VID"));
        int num  = iVipService.deleteByPrimaryKey(vid);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="/managerAllAjax",produces={"application/json;chart=UTF-8"})
    public Object managerAllAjax(Integer page,Integer rows,String order,String sort,String searchvalue,Long mid){
        System.out.println("page:"+page);
        System.out.println("rows:"+rows);
        System.out.println("sort:"+sort);
        System.out.println("order:"+order);
        System.out.println("mid:"+mid);
        System.out.println("searchvalue:"+searchvalue);
        Map pagemap = new HashMap();
        Map datagridmap = new HashMap();
        pagemap.put("searchvalue",searchvalue);
        Integer startIndex = 0;
        if(page!=null){
            startIndex=(page-1)*rows;
        }
        if(rows==null){
            rows=8;
        }
//        pagemap.put("startindex",startIndex);
//        pagemap.put("rows",rows);
        pagemap.put("sort",sort);
        pagemap.put("order",order);
        pagemap.put("mid",mid);
        List mapList = imanagerService.select_managerMap(pagemap);
        System.out.println("mapList:"+mapList);
        List pagelist = new ArrayList();
        for(int i = 0;i<rows;i++){
            if(startIndex+i==mapList.size()){
                break;
            }
            pagelist.add(mapList.get(startIndex+i));
        }
        datagridmap.put("total",mapList.size());/*total是固定写法，如果是分页，这里是总记录数*/
        datagridmap.put("rows",pagelist);/*这里是每一个分页的数据，包括模糊查询的分页*/
        System.out.println("pagelist:"+pagelist);
        return datagridmap;
    }
    @ResponseBody
    @RequestMapping(value="add_managerAction",produces={"application/json;chart=UTF-8"})
    public String add_managerAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Manager manager = new Manager();
        manager.setName(map.get("name"));
        manager.setPassword(map.get("password"));
        manager.setStatus(Long.valueOf(map.get("status")));
        manager.setUsername(map.get("username"));
        int num = imanagerService.insertSelective(manager);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="update_managerAction",produces={"application/json;chart=UTF-8"})
    public String update_managerAction(@RequestParam Map<String,String> map) throws ParseException {
        System.out.println("map:"+map);
        Manager manager = new Manager();
        manager.setMid(Long.valueOf(map.get("MID")));
        manager.setName(map.get("NAME"));
        manager.setPassword(map.get("PASSWORD"));
        manager.setStatus(Long.valueOf(map.get("STATUS")));
        manager.setUsername(map.get("USERNAME"));
        int num = imanagerService.updateByPrimaryKeySelective(manager);
        String json = JSON.toJSONString(num);
        return json;
    }
    @ResponseBody
    @RequestMapping(value="del_managerAction",produces={"application/json;chart=UTF-8"})
    public String del_managerAction(@RequestParam Map<String,String> row){
        System.out.println("row:"+row);
        long mid = Long.parseLong(row.get("MID"));
        int num  = imanagerService.deleteByPrimaryKey(mid);
        String json = JSON.toJSONString(num);
        return json;
    }
    //初始化后台首页
    @ResponseBody
    @RequestMapping(value = "indexAction",produces = "application/json;chart=UTF-8")
    public Object indexAction(){
        int productNum = iProductService.selectAll().size();
        int sellproductNum = iSellproductService.selectAll().size();
        int vipNum = iVipService.selectAll().size();
        int order1Num = iSellorderService.selectByStateId(Long.valueOf(1)).size();
        int order3Num = iSellorderService.selectByStateId(Long.valueOf(3)).size();
        HashMap map  = new HashMap();
        map.put("productNum",productNum);
        map.put("sellproductNum",sellproductNum);
        map.put("vipNum",vipNum);
        map.put("order1Num",order1Num);
        map.put("order3Num",order3Num);
        List<Map<String,Object>> sellList = iSellproductService.selectSellInfo();
        List namelist = new ArrayList();
        List numlist = new ArrayList();
        for(Map sellmap:sellList){
            namelist.add(sellmap.get("NAME"));
            numlist.add(sellmap.get("NUM"));
        }
        map.put("namelist",namelist);
        map.put("numlist",numlist);
//        System.out.println(map);
//        String js = JSON.toJSONString(map,SerializerFeature.WriteMapNullValue,SerializerFeature.PrettyFormat);
        return map;
    }
    @RequestMapping("loginAction")
    public ModelAndView loginAction(ModelAndView mav,String username, String password, HttpSession session,HttpServletRequest request) throws Exception {
        System.out.println("-----password:"+password);
        System.out.println("-----username:"+username);
        System.out.println("-----username:"+request.getParameter("username"));
        Map map = new HashMap();
        map.put("username",username);
        String pwd_encoded = UserPasswordUtil.encode(password);//进行加密
        System.out.println("-----pwd_encoded:"+pwd_encoded);
        map.put("password",pwd_encoded);
//        map.put("password",password);
        Manager manager = imanagerService.selectLogin(map);
//        以下注释部分用来代替注册用户
//        if(manager==null){
//            manager = new Manager();
//            manager.setUsername(username);
//            manager.setPassword(pwd_encoded);
//            manager.setStatus((long)0);
//            manager.setName("管理员");
//            int num = imanagerService.insertSelective(manager);
//            System.out.println("-----manager:"+manager);
//        }
        if(manager!=null){
            session.setAttribute("users",manager);
        }
        request.setAttribute("username",username);
        Map<String,Manager> hashmap = new HashMap<String,Manager>();
        if(manager!=null) {
//            mav.addAllObjects(hashmap);
            mav.addObject("manager",manager);
            mav.setViewName("redirect:/deng_web/hmanager.html?username="+username);
            return mav;
        }else {
            mav.setViewName("../deng_index");
            return mav;
        }
    }
    @ResponseBody
    @RequestMapping(value="exitAction",produces={"application/json;chart=UTF-8"})
    public Object exitAction(HttpSession session) throws IOException {
        session.removeAttribute("users");
        String js = "";
        js = JSON.toJSONString("true");
        return js;
    }
//登陆验证码
    @ResponseBody
    @RequestMapping(value = "CheckCodeAction",produces = "application/json;chart=UTF-8")
    public String checkCodeAction( String value, HttpSession session){
        Object  vobj = session.getAttribute("rand");
        if(value.equalsIgnoreCase((String)vobj)){
            System.out.println("验证码正确");
            return "true";
        }
        else{
            System.out.println("验证码错误");
            return "false";
        }
    }
    @ResponseBody
    @RequestMapping("ImageAction")
    public void imageAction(String value, HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
        String StrFont=this.randstr();
        //对session赋值
        HttpSession ses=request.getSession();
        ses.setAttribute("rand",StrFont);
        System.out.println("-----rand:"+StrFont);
        String fontName="宋体";
        int fontSize=30;
        int width=105;
        int height=40;
        Font font=new Font(fontName,Font.BOLD,fontSize);
        BufferedImage StrImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d=(Graphics2D)StrImage.getGraphics();
        //设置背景色
        g2d.setBackground(getRandColor(100,200));
        //填充背景
        g2d.clearRect(0,0,width,height);
        //设置字体色
        g2d.setFont(font);
        g2d.setColor(Color.BLACK);
        /*
                      写入随机字符串
        StrFont - 要呈现的 String
        x - 呈现 String 位置的 x 坐标
        y - 呈现 String 位置的 y 坐标
        */
        g2d.drawString(StrFont,1,30);
        //释放此图形的上下文以及它使用的所有系统资源
        g2d.dispose();

        response.setHeader("pragma", "no-cache");
        response.setHeader("cache-control", "no-cache");
        response.setDateHeader("expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream os = response.getOutputStream();
        //写入输出流
        ImageIO.write(StrImage,"jpg",os);
        //刷新输出流
        os.flush();
        //关闭输出流
        os.close();
    }
    //取得随机字符串
    protected String randstr(){
        String str="";
        String charstr="23456789ABDEFIJLQRTYabdefghijqrty";
        char[] arrchar=charstr.toCharArray();
        int length=arrchar.length;
        length=length-1;
        Random rd=new Random();
        char ct;
        int it;
        for(int i=0;i<6;i++)
        {
            it=rd.nextInt(length);
            ct=arrchar[it];
            str=str+String.valueOf(ct);
        }
        return "123456";//str
    }
    //获得随机颜色
    protected Color getRandColor(int fc, int bc){
        Random random = new Random();
        if(fc>255) fc=255;
        if(bc>255) bc=255;
        int r=fc+random.nextInt(bc-fc);
        int g=fc+random.nextInt(bc-fc);
        int b=fc+random.nextInt(bc-fc);
        return new Color(r,g,b);
    }

    public static void main(String[] args) {
    }
}
