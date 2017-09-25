/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.water;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroHandler implements Handler {
    @Override
    public String processar(
            HttpServletRequest request,
            HttpServletResponse response) {

        //String aptoEscolhido = request.getParameter("apto");
        //String proximaPag = request.getParameter("meuForm.funcao");
        if(request.getParameter("funcao").equals("cadastro")){
            return "/cadastro.jsp";
        }
        else if(request.getParameter("funcao").equals("consumo_mensal")){
            return "/consumo_mensal.jsp";
        }
        return "/index.jsp";
    }
}