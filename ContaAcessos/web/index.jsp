<%-- 
    Document   : index
    Created on : 18/10/2017, 11:07:46
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conta Acessos</title>
    </head>
    <body OnLoad="document.form1.nome.focus();">
        
        <div align="center">
            <h1>Conta Requisições ao Servlet!</h1>            
        </div>
        <br>
        
        <% int acessos = 0;
           if(request.getAttribute("conta") != null)
               acessos=(Integer)(request.getAttribute("conta"));          
        %>
        
        <form name="form1" action="Contador" method="POST">
            <div>
                <input type="hidden" name="acessos" value="<%= acessos %>">                
            </div>
            <div>
                Usuário: <input type="text" name="nome">                
            </div>
            <br>
            <div>
                Senha: <input type="text" name="senha">                
            </div>
            <br>
            <div>
                <input type="submit" value="OK">                
            </div>
            <br>
            <div align="center">
                <h3> REQUISIÇÕES: <%= acessos %> </h3>               
            </div>
        </form>
            
    </body>
</html>
