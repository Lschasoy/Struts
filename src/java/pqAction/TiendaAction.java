package pqAction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import pqActionForm.TiendaActionForm;

/**
 *
 * @author alumno
 */
public class TiendaAction extends org.apache.struts.action.Action {



    private static Connection conexion;
    private static CallableStatement procedimiento;
 
    private final static String SUCCESS = "success";
    
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       
      
	try {
            
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                conexion =DriverManager.getConnection("jdbc:oracle:thin:@LOCALHOST:1521:XE","system", "javaoracle");

            
           procedimiento = conexion.prepareCall("{call Insertar_AltaUsuario(?,?,?,?,?,?)}");
        procedimiento.setString(1,((TiendaActionForm)form).getNombre());
        procedimiento.setString(2,((TiendaActionForm)form).getApellido());	
        procedimiento.setString(3,((TiendaActionForm)form).getEmail());	
        procedimiento.setString(4,((TiendaActionForm)form).getCodigoPostal());
        procedimiento.setString(5,((TiendaActionForm)form).getLogin());
        procedimiento.setString(6,((TiendaActionForm)form).getPassword1());
        

            procedimiento.executeUpdate();
                         
        }
        catch( SQLException sqle ) {

                System.out.println( sqle );	
        }finally{
                conexion.close();
        }
             return mapping.findForward("correcto");
        }

}
