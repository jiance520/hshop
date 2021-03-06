package com.action;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SessionFilter implements Filter {

    public void destroy() {

    }

    public void doFilter(ServletRequest arg0, ServletResponse arg1,
                         FilterChain arg2) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;

        String uri = request.getRequestURI();
        //System.out.println(" uri = "+uri);
        String qs = request.getQueryString();
        //System.out.println(" qs = "+qs);
        /*
		 * /EasyBuy/shopping.jsp
		 * /EasyBuy/ShopAction
		 */
        String path = uri.substring(uri.lastIndexOf("/") + 1);
        //System.out.println(" path = "+path);
        ArrayList<String> cklist = new ArrayList<String>();
            cklist.add("vip.html");
            cklist.add("friendship.html");
            cklist.add("feature.html");
            cklist.add("brand.html");
            cklist.add("orderstate.html");
            cklist.add("supplier.html");
            cklist.add("system.html");
            cklist.add("product_show.jsp");
            cklist.add("product.html");
            cklist.add("express.html");
            cklist.add("sellorder.html");
            cklist.add("product_edit.jsp");
            cklist.add("hmanager.html");
            cklist.add("manager.html");
            cklist.add("product_add.html");
            cklist.add("advert.html");
            cklist.add("service.html");
        System.out.println("filterpath:" + path);
        if (cklist.contains(path)) {
            Object uobj = request.getSession().getAttribute("users");
            if (uobj == null) {
                response.sendRedirect("../deng_index.jsp");
            } else {
                arg2.doFilter(arg0, arg1);
            }
        } else {
            arg2.doFilter(arg0, arg1);
        }

    }

    public void init(FilterConfig arg0) throws ServletException {

    }

}
