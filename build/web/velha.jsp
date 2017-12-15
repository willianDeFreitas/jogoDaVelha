<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>Exercício Avaliativo</title>
    </head>
    <body>
        <div class="corpo">
            <div align="center"> <h1>Velha!!</h1></div><br>
            <form name="formulario" action="index.jsp" method="POST">
                <div align="center">
                <table border="1">
                    <tr>
                        <td><h4>Tentem outra vez.</h4></td>
                    </tr>
                </table>
                </div>
                
                <div align="center">
                    <input type="submit" name="ok" value="Voltar"/>
                </div><br>
            </form>
            <form name="formulario" action="Jogo" method="POST">
                <input type="hidden" name="jogador1" 
                    value="<%=(String)request.getParameter("jogador1") %>">                
                <input type="hidden" name="jogador2" 
                    value="<%=(String)request.getParameter("jogador2") %>">                
                <input type="hidden" name="quemEnvia" value="<%=4%>">
                <input type="hidden" name="contaJogada" value="<%=0%>">
                <div align="center">
                    <input type="submit" name="ok" value="Jogar outra vez!"/>
                </div>
             </form>
        </div>
    </body>
</html>
