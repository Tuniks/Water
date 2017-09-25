<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% URL contexto = new URL(
            "http",
            request.getServerName(),
            request.getServerPort(),
            request.getContextPath());%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consumo de Água</title>
        <link rel="stylesheet" type="text/css" 
              href="<%= contexto%>/css/cadastro.css"/>
    </head>

    <body>
        <br>
        <span>WATER</span>
        <br>
        <br>
        <form name="meuForm" id="meuForm" method="GET" action="controller">
            <input type="hidden" name="handler" 
                   value="com.mycompany.water.CadastroHandler"/> <!-- NÃO É P SER ISSO, É P SER CADASTRO HANDLER Q TRATA AS ENTRADAS DAQUI -->
            <input type="hidden" name="funcao"/>
            <span id="consumo_mensal" 
                  class="linkPadrao"
                  onclick="document.meuForm.funcao.value = 'consumo_mensal';document.getElementById('meuForm').submit();">
                consumo
            </span>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <span id="sair" 
                  class="linkPadrao"
                  onclick="document.meuForm.funcao.value = 'sair';document.getElementById('meuForm').submit();">
                sair
            </span>
            <br>
            <br>
            <br>
            <div id="divPrincipal">
                <br>
                Cadastro
                <br>
                <br>
                <table>
                    <tr>
                        <td>Apartamento</td>
                        <td></td>
                        <td><input type="text" value="${sessionScope.apto}" readOnly/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Nome</td>
                        <td></td>
                        <td><input type="text" value="${sessionScope.responsavel}" readOnly/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Telefone</td>
                        <td></td>
                        <td><input type="text" value="${sessionScope.telefone}" readOnly/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td></td>
                        <td><input type="text" value="${sessionScope.email}" readOnly/></td>
                        <td></td>
                    </tr>
                </table>
            </div>
        </form>
    </body>
</html>
