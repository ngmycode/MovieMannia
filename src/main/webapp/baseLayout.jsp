<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        
           
    </head>
    <body>
       <table>
            <tr>
             <td>
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td >
                    <tiles:insertAttribute name="menu" />
                </td>
                <td >
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
               
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>
