package com.yach.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Zuul过滤器（网关过滤器）
 * Created by Yach on 2019/5/24.
 */
@Component //注入ioc
public class MyFilter extends ZuulFilter {

    /**
     * zuul不同生命周期的过滤
     * @return pre（路由之前），routing（路由之时），post（路由之后），error（发生错误调用）
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否拦截（可以写判断）
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体的逻辑代码
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s >>> %s",request.getMethod(),request.getRequestURL().toString()));
        Object token  = request.getParameter("token");
        if (token == null){
            System.err.println("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);

            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("ok");
        return null;
    }
}
