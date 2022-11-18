/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean;

import br.com.DAO.ManterCarro;
import br.com.controle.Carro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class ServletEditar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int codigo = Integer.valueOf(request.getParameter("codigo"));
            Carro ca = new Carro();
            
            try {
                ManterCarro dao = new ManterCarro();
                ca = dao.pesquisar(codigo);
                String msg = "";
                if (ca == null) {
                    msg = "Não foram encontrados registro.";
                    RequestDispatcher enviar = request.getRequestDispatcher("Listar.jsp");
                    enviar.forward(request, response);

                } else {
                    request.setAttribute("aCodigo", ca.getCodigo());
                    request.setAttribute("aNome", ca.getNome());
                    request.setAttribute("aModelo", ca.getModelo());
                    request.setAttribute("aAno", ca.getAno());
                    request.setAttribute("aMarca", ca.getMarca());
                    request.setAttribute("aPotencia", ca.getPotencia());
                    request.setAttribute("aImagem", ca.getImagem());
                    request.setAttribute("aCodigoUsuario", ca.getCodigousuario());
                    RequestDispatcher rd = request.getRequestDispatcher("editar_carro.jsp");
               rd.forward(request, response);
                }
                
            } catch (Exception e) {
                out.println("Erro" + e.getMessage());
            }
            
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

}
