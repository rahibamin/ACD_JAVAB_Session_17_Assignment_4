package tags;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class ImageTag extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
      JspWriter out = getJspContext().getOut();
      out.println("<img src=\"img/world.jpg\" height=\"200\" width=\"200\">");
      out.println("<img src=\"img/tool.gif\" height=\"200\" width=\"200\">");
      out.println("<img src=\"img/gabulldogs.gif\" height=\"200\" width=\"200\">");
   }
   }
