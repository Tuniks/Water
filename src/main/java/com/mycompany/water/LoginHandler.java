/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.water;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandler implements Handler {
    @Override
    public String processar(
            HttpServletRequest request,
            HttpServletResponse response) {

        //String aptoEscolhido = request.getParameter("apto");
        CondominosDTO dto = new CondominosDTO();
        dto.setApto(request.getParameter("apto"));

        boolean sucesso = (new CondominoDAO()).doRead(dto);
        if (sucesso){
           request.getSession().setAttribute("apto", dto.getApto());
           request.getSession().setAttribute("responsavel", dto.getResponsavel());
           request.getSession().setAttribute("email", dto.getEmail());
           request.getSession().setAttribute("telefone", dto.getTelefone());
           request.getSession().setAttribute("medidas", dto.getMedidas());
        }
        else {
           request.getSession().setAttribute("apto", dto.getApto());
           request.getSession().setAttribute("responsavel", "FAIL");
           request.getSession().setAttribute("email", "FAIL");
           request.getSession().setAttribute("telefone", "FAIL");
            
        }        
        return "/cadastro.jsp";
    }
}
