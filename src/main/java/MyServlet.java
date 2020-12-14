import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/patients"},loadOnStartup = 1)
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<HTML>\n" +
                "<HEAD>\n" +
                "<TITLE>Your Title Here</TITLE>\n" +
                "</HEAD>\n" +
                "<BODY BGCOLOR=\"FFFFFF\">\n" +
                "<CENTER><IMG SRC=\"clouds.jpg\" ALIGN=\"BOTTOM\"> </CENTER>\n" +
                "<HR>\n" +
                "<a href=\"http://somegreatsite.com\">Link Name</a>\n" +
                "is a link to another nifty site\n" +
                "<H1>This is a Header</H1>\n" +
                "<H2>This is a Medium Header</H2>\n" +
                "Send me mail at <a href=\"mailto:support@yourcompany.com\">\n" +
                "support@yourcompany.com</a>.\n" +
                "<P> This is a new paragraph!\n" +
                "<P> <B>This is a new paragraph!</B>\n" +
                "<BR> <B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>\n" +
                "<HR>\n" +
                "</BODY>\n" +
                "</HTML>");

        req.getServletPath(); // returns he servlet path of the url
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    }
}
