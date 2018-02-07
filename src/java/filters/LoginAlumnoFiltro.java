/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RamsesMtnz
 */
@WebFilter(filterName = "LoginAlumnoFiltro", urlPatterns = {"/pages/LoginAlumno.xhtml"})
public class LoginAlumnoFiltro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest sRequest = (HttpServletRequest) request;
        HttpServletResponse sResponse = (HttpServletResponse) response;
        Object tokenAlumno = sRequest.getSession().getAttribute("tokenAlumno");
        

        if (tokenAlumno != null) {
            sResponse.sendRedirect("/FdO-3.0/pages/Alumnos/Principal.xhtml");
        }
        
//if(sr.getRequestURI());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
   
    
}
