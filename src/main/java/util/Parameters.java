package util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vlusslus on 24.03.2018.
 */
public class Parameters {

    public static void setParametersOnJSP(HttpServletRequest req, HttpServletResponse resp, Object servlet) throws IOException, ServletException{
        req.setAttribute("servletName", servlet.getClass().getName());
        req.setAttribute("randomParameter", Double.toString(Math.random()));
        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }

}
