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
            
            <div align="center"> <h1>Jogo da Velha</h1></div><br>
            <form name="formulario" action="jogada1.jsp" method="POST">
                
                <table align="center">
                    <div>
                        <tr>
                            <td>Jogador 1 --></td>
                            <td><input type="text" name="jogador1" required/></td>
                            <td>Joga com: "o"</td>
                        <tr>
                    </div>
                    <div>
                        <tr>
                            <td>Jogador 2 --></td>
                            <td><input type="text" name="jogador2" required/></td>
                            <td>Joga com: "x"</td>
                        <tr>
                    </div><br>
                </table>
                
                <div align="center">
                    <input type="submit" name="ok" value="OK"/>
                </div>
            </form>
        </div>
    </body>
</html>
