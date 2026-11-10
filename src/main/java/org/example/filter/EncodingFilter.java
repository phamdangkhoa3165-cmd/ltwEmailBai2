package org.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

//Đánh chặn TẤT CẢ các đường dẫn URL (/*) trước khi đến được Servlet
@WebFilter("/*")
public class EncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        //Ép kiểu mã hóa dữ liệu đầu vào và đầu ra thành UTF-8
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //Cho phép Request đi tiếp tới Servlet mục tiêu
        chain.doFilter(request, response);
    }
}