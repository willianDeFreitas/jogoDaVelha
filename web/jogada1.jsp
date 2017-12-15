<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>Exercício Avaliativo</title>
    </head>
    <body>
        <%
            int contaJogada = 1;
            if(request.getAttribute("contaJogada") != null)
                contaJogada += (int)(request.getAttribute("contaJogada"));
        %>
        <div class="corpo">
            <div align="center">
                <h1>Sua vez: <%=(String)request.getParameter("jogador1") %></h1>
            </div><br>
            <form name="formulario" action="Jogo" method="POST">
                <div>
                    <input type="hidden" name="jogador1" 
                    value="<%=(String)request.getParameter("jogador1") %>">                
                </div>
                <div>
                    <input type="hidden" name="jogador2" 
                    value="<%=(String)request.getParameter("jogador2") %>">                
                </div>
		<div>
                    <input type="hidden" name="contaJogada" value="<%=contaJogada%>">                
                </div>
                <div>
                    <input type="hidden" name="quemEnvia" value="<%=1%>">                
                </div>
                <div align="center">
                <table border="1">
                    <tr>
                        <td><input type="text" 
                                    style="text-align:center" size="1" name="1" 
                                    value="<% String a="";
                                               if(request.getAttribute("1") != null)
                                            a = (String)(request.getAttribute("1"));
                                               out.print(a);
                                                                            %>"/></td>
                        <td><input type="text"
                                    style="text-align:center" size="1" name="2"
                                    value="<% String b="";
                                               if(request.getAttribute("2") != null)
                                            b = (String)(request.getAttribute("2"));
                                               out.print(b);
                                                                            %>"/></td>
                        <td><input type="text" 
                                    style="text-align:center" size="1" name="3" 
                                    value="<% String c="";
                                               if(request.getAttribute("3") != null)
                                            c = (String)(request.getAttribute("3"));
                                               out.print(c);
                                                                            %>"/></td>
                    </tr>
                    <tr>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="4"
                                   value="<% String d="";
                                               if(request.getAttribute("4") != null)
                                            d = (String)(request.getAttribute("4"));
                                               out.print(d);
                                                                            %>"/></td>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="5"
                                   value="<% String e="";
                                               if(request.getAttribute("5") != null)
                                            e = (String)(request.getAttribute("5"));
                                               out.print(e);
                                                                            %>"/></td>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="6"
                                   value="<% String f="";
                                               if(request.getAttribute("6") != null)
                                            f = (String)(request.getAttribute("6"));
                                               out.print(f);
                                                                            %>"/></td>                        </td>
                    </tr>
                    <tr>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="7"
                                   value="<% String g="";
                                               if(request.getAttribute("7") != null)
                                            g = (String)(request.getAttribute("7"));
                                               out.print(g);
                                               %>"/></td>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="8"
                                   value="<% String h="";
                                               if(request.getAttribute("8") != null)
                                            h = (String)(request.getAttribute("8"));
                                               out.print(h);
                                                                            %>"/></td>
                        <td><input type="text" 
                                   style="text-align:center" size="1" name="9"
                                   value="<% String i="";
                                               if(request.getAttribute("9") != null)
                                            i = (String)(request.getAttribute("9"));
                                               out.print(i);
                                                                            %>"/></td>
                    </tr>
                </table>
                </div>
                <br>
                <div align="center">
                    <input type="submit" name="ok" value="JOGUEI!"/>
                </div>
            </form>
        </div>
    </body>
</html>
