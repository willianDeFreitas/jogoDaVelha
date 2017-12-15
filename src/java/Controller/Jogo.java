package Controller;
/*@autor Karioca*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*@autor Karioca*/
@WebServlet(name = "Jogo", urlPatterns = {"/Jogo"})
public class Jogo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        int contaJogada = Integer.parseInt(request.getParameter("contaJogada"));   
        String[] jogada1 = new String[9];
        String name1= (String)request.getParameter("jogador1");
        String name2= (String)request.getParameter("jogador2");
        
        if((String)request.getParameter("1")!=null){
            String jogada1a = (String)request.getParameter("1");
            jogada1[0]= jogada1a;    
        }else{
            jogada1[0]= "";
        }
        if((String)request.getParameter("2")!=null){
            String jogada1b = (String)request.getParameter("2");
            jogada1[1]= jogada1b;    
        }else{
            jogada1[1]="";
        }
        if((String)request.getParameter("3")!=null){
            String jogada1c = (String)request.getParameter("3");
            jogada1[2]= jogada1c;    
        }else{
            jogada1[2]= "";
        }
        if((String)request.getParameter("4")!=null){
            String jogada1d = (String)request.getParameter("4");
            jogada1[3]= jogada1d;
        }else{
            jogada1[3]= "";
        }
        if((String)request.getParameter("5")!=null){
            String jogada1e = (String)request.getParameter("5");
            jogada1[4]= jogada1e;    
        }else{
            jogada1[4]= "";
        }
        if((String)request.getParameter("6")!=null){
            String jogada1f = (String)request.getParameter("6");
            jogada1[5]= jogada1f;    
        }else{
            jogada1[5]= "";
        }
        if((String)request.getParameter("7")!=null){
            String jogada1g = (String)request.getParameter("7");
            jogada1[6]= jogada1g;    
        }else{
            jogada1[6]= "";
        }
        if((String)request.getParameter("8")!=null){
            String jogada1h = (String)request.getParameter("8");
            jogada1[7]= jogada1h;    
        }else{
            jogada1[7]= "";
        }
        if((String)request.getParameter("9")!=null){
            String jogada1i = (String)request.getParameter("9");
            jogada1[8]= jogada1i;    
        }else{
            jogada1[8]= "";
        }
		
        request.setAttribute("1", jogada1[0]);
        request.setAttribute("2", jogada1[1]);
        request.setAttribute("3", jogada1[2]);
        request.setAttribute("4", jogada1[3]);
        request.setAttribute("5", jogada1[4]);
        request.setAttribute("6", jogada1[5]);
        request.setAttribute("7", jogada1[6]);
        request.setAttribute("8", jogada1[7]);
        request.setAttribute("9", jogada1[8]);
        
        
        request.setAttribute("jogador1", name1);
        request.setAttribute("jogador2", name2);
		
	if(contaJogada>=5){	
            if(("o".equals(jogada1[0]) && "o".equals(jogada1[1]) && "o".equals(jogada1[2]))
            ||("x".equals(jogada1[0]) && "x".equals(jogada1[1]) && "x".equals(jogada1[2]))){
                if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
                    request.setAttribute("vencedor", name1);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                }else{
                    request.setAttribute("vencedor", name2);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}
            }
            if(("o".equals(jogada1[3]) && "o".equals(jogada1[4]) && "o".equals(jogada1[5]))
            ||("x".equals(jogada1[3]) && "x".equals(jogada1[4]) && "x".equals(jogada1[5]))){
                    if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
			request.setAttribute("vencedor", name1);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }else{
			request.setAttribute("vencedor", name2);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }
            }
            if(("o".equals(jogada1[6]) && "o".equals(jogada1[7]) && "o".equals(jogada1[8])) ||
            ("x".equals(jogada1[6]) && "x".equals(jogada1[7]) && "x".equals(jogada1[8]))){
                    if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
			request.setAttribute("vencedor", name1);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }else{
			request.setAttribute("vencedor", name2);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }
            }
            if(("o".equals(jogada1[0]) && "o".equals(jogada1[3]) && "o".equals(jogada1[6])) 
            ||("x".equals(jogada1[0]) && "x".equals(jogada1[3]) && "x".equals(jogada1[6]))){
                    if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
			request.setAttribute("vencedor", name1);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }else{
                    	request.setAttribute("vencedor", name2);
                        request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                    }
            }
            if(("o".equals(jogada1[1]) && "o".equals(jogada1[4]) && "o".equals(jogada1[7]))
            ||("x".equals(jogada1[1]) && "x".equals(jogada1[4]) && "x".equals(jogada1[7]))){
                if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
                    request.setAttribute("vencedor", name1);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}else{
                    request.setAttribute("vencedor", name2);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}
            }
            if(("o".equals(jogada1[2]) && "o".equals(jogada1[5]) && "o".equals(jogada1[8]))
            ||("x".equals(jogada1[2]) && "x".equals(jogada1[5]) && "x".equals(jogada1[8]))){
		if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
                    request.setAttribute("vencedor", name1);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                }else{
                    request.setAttribute("vencedor", name2);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}
            }
            if(("o".equals(jogada1[0]) && "o".equals(jogada1[4]) && "o".equals(jogada1[8]))
            ||("x".equals(jogada1[0]) && "x".equals(jogada1[4]) && "x".equals(jogada1[8]))){
		if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
                    request.setAttribute("vencedor", name1);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}else{
                    request.setAttribute("vencedor", name2);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}
            }
            if(("o".equals(jogada1[2]) && "o".equals(jogada1[4]) && "o".equals(jogada1[6])) ||
            ("x".equals(jogada1[2]) && "x".equals(jogada1[4]) && "x".equals(jogada1[6]))){
		if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
                    request.setAttribute("vencedor", name1);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
                }else{
                    request.setAttribute("vencedor", name2);
                    request.getRequestDispatcher("vencedor.jsp").forward(request, response);
		}
            }
            if((contaJogada>=8)&& (jogada1[0]!=null && jogada1[1]!=null &&
            jogada1[2]!=null && jogada1[3]!=null && jogada1[4]!=null && 
            jogada1[5]!=null && jogada1[6]!=null && jogada1[7]!=null &&
            jogada1[8]!=null)){
		request.getRequestDispatcher("velha.jsp").forward(request, response);
            }
        }else{
            ++contaJogada;
        }   
        request.setAttribute("contaJogada", contaJogada);
		
        if((Integer.parseInt(request.getParameter("quemEnvia")))==1){
            request.getRequestDispatcher("jogada2.jsp").forward(request, response);
        }else if((Integer.parseInt(request.getParameter("quemEnvia")))==2){
            request.getRequestDispatcher("jogada1.jsp").forward(request, response);
        }else if(((Integer.parseInt(request.getParameter("quemEnvia")))==3)||
        ((Integer.parseInt(request.getParameter("quemEnvia")))==4)){
            request.setAttribute("1", "");
            request.setAttribute("2", "");
            request.setAttribute("3", "");
            request.setAttribute("4", "");
            request.setAttribute("5", "");
            request.setAttribute("6", "");
            request.setAttribute("7", "");
            request.setAttribute("8", "");
            request.setAttribute("9", "");
            request.setAttribute("contaJogada", 0);
            request.setAttribute("jogador1", name1);
            request.setAttribute("jogador2", name2);
            request.getRequestDispatcher("jogada1.jsp").forward(request, response);
        }
        
   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
/*@autor Karioca*/
}
