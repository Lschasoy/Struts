package pqActionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class TiendaActionForm extends org.apache.struts.action.ActionForm {
    
       private String nombre;
       private String apellido;
       private String email;
       private String codigoPostal;
       private String login;
       private String password1;
       private String password2;


       public String getNombre() {
        return nombre;
       }

       public void setNombre(String nombre) {
        this.nombre = nombre;
       }

       public String getApellido() {
        return apellido;
       }

       public void setApellido(String apellido) {
        this.apellido = apellido;
       }
      
       public String getEmail() {
          return email;
       }

       public void setEmail(String email) {
           this.email = email;
        }

       public String getCodigoPostal() {
        return codigoPostal;
       }

       public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
       }

       public String getLogin() {
        return login;
       }

       public void setLogin(String login) {
        this.login = login;
       }

       public String getPassword1() {
        return password1;
       }

       public void setPassword1(String password1) {
        this.password1 = password1;
       }

       public String getPassword2() {
        return password2;
       }

       public void setPassword2(String password2) {
        this.password2 = password2;
       }

        public TiendaActionForm() {
             super();
        }

        public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
             ActionErrors errors = new ActionErrors();
            if (getNombre() == null || getNombre().length() < 1) {
         errors.add("nombre", new ActionMessage("error.nombre.requerido"));
        }
        if (getApellido() == null || getApellido().length() < 1) {
         errors.add("apellido", new ActionMessage("error.apellido.requerido"));
        }
            
         if (getCodigoPostal() == null || getCodigoPostal().length() < 1) {
          errors.add("codigoPostal", new ActionMessage("error.codigoPostal.requerido"));
         } else if (!codigoPostal.matches("\\d{5}")) {
          errors.add("codigoPostal", new ActionMessage("error.codigoPostal.incorrecto"));
         }

         if (getLogin() == null || getLogin().length() < 1) {
          errors.add("login", new ActionMessage("error.login.requerido"));
         }

         if (getPassword1() == null || getPassword1().length() < 1) {
          errors.add("password1", new ActionMessage("error.password.requerido"));
         } else if (getPassword1().trim().length() < 8) {
          errors.add("password1", new ActionMessage("error.password.incorrecto"));
         }

         if (getPassword2() == null || getPassword2().length() < 1) {
          errors.add("password2", new ActionMessage("error.confirmarPassword.requerido"));
         } else if (!getPassword1().equals(getPassword2())) {
          errors.add("password2", new ActionMessage("error.confirmarPassword.incorrecto"));
         } 


             return errors;
         }      
}// end  of class
