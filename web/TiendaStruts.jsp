<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <body bgcolor="#81BEF7">
       <html:form action="Tienda">
            
            <div style="left: 210px; top: 10px; font-size: 24px;
                 font-weight: bold; position: absolute">
             <bean:message key="literal.bienvenida" />
            </div>
            <div style="left: 250px; top: 40px; font-size: 10px; position: absolute">
              <bean:message key="literal.mensajeEnvios" />
            </div> 

            <div style="left: 28px; top: 80px; position: absolute">
             <bean:message key="literal.nombre" />*
            </div>
            <div style="left: 28px; top: 100px; position: absolute">
             <html:text property="nombre" size="40" /> 
            </div> 
            <div style="left: 28px; top: 123px; position: absolute">
             <html:errors property="nombre" />
            </div> 

            <div style="left: 320px; top: 80px; position: absolute">
             <bean:message key="literal.apellido" />*
            </div> 
            <div style="left: 320px; top: 100px; position: absolute">
             <html:text property="apellido" size="40" />
            </div>
            <div style="left: 320px; top: 123px; position: absolute">
             <html:errors property="apellido" />
            </div> 
           
          <div style="left: 28px; top: 140px; position: absolute">
           <bean:message key="literal.email" />*
          </div> 
          <div style="left: 28px; top: 160px; position: absolute">
           <html:text property="email" size="40" />
          </div> 
          <div style="left: 28px; top: 183px; position: absolute">
           <html:errors property="email" />
          </div> 

            <div style="left: 320px; top: 140px; position: absolute">
             <bean:message key="literal.codigoPostal" />*
            </div> 
            <div style="left: 320px; top: 160px; position: absolute">
             <html:text property="codigoPostal" size="5" />
            </div>
            <div style="left: 320px; top: 183px; position: absolute">
             <html:errors property="codigoPostal" />
            </div> 
            <div style="left: 28px; top: 200px; position: absolute">
             <bean:message key="literal.login" />*
            </div> 
            <div style="left: 28px; top: 220px; position: absolute">
             <html:text property="login" size="40" />
            </div>
            <div style="left: 28px; top: 243px; position: absolute">
             <html:errors property="login" />
            </div> 
            <div style="left: 28px; top: 260px; position: absolute">
             <bean:message key="literal.password" />*
            </div> 
            <div style="left: 28px; top: 280px; position: absolute">
            <html:password property="password1" size="40" />
            </div>
            <div style="left: 28px; top: 303px; position: absolute">
             <html:errors property="password1" />
            </div> 

            <div style="left: 320px; top: 260px; position: absolute">
             <bean:message key="literal.confirmarPassword" />*
            </div> 
            <div style="left: 320px; top: 280px; position: absolute">
             <html:password property="password2" size="40" />
            </div>
            <div style="left: 320px; top: 303px; position: absolute">
             <html:errors property="password2" />
            </div>
             <div style="left: 230px; top: 440px; position: absolute">
             <html:reset>
              <bean:message key="literal.restaurar" />
             </html:reset>
            </div> 
            <div style="left: 320px; top: 440px; position: absolute">
             <html:submit>
              <bean:message key="literal.enviar" />
             </html:submit>
            </div> 
          </html:form>

    </body>
    </html>
    