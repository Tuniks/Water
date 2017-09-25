<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
              href="<%= contexto%>/css/consumo_mensal.css"/>
    </head>

    <body>
        <br>
        <span>WATER</span>
        <br>
        <br>
        <form name="meuForm" id="meuForm" method="GET" action="controller">
            <input type="hidden" name="handler" 
                   value="com.mycompany.water.CadastroHandler"/>
            <input type="hidden" name="funcao"/>
            <span id="cadastro" 
                  class="linkPadrao"
                  onclick="document.meuForm.funcao.value = 'cadastro';document.getElementById('meuForm').submit();">
                cadastro
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
                Consumo Mensal <span id="tituloApto"> - APTO ${sessionScope.apto}</span>
                <br>
                <div id="divTabela">
                    <table>
                        <tr>
                            <td>Data-hora<br>da medida</td>
                            <td>Leitura no<br>hidrômetro</td>
                            <td>Pulsos<br>medidos</td>
                            <td>m<sup>3</sup> no<br>período</td>
                            <td>Pulsos acumulados<br>no mês</td>
                            <td>m<sup>3</sup><br>acumulados<br>no mês</td>
                            <td>Custo (R$)<br>acumulado<br>no mês</td>
                        </tr>
                        <br>
                        <c:forEach items="${sessionScope.medidas}" var="medida">
                            <tr>
                            <td>${medida.getDatahora()}</td>
                            <td>${medida.getHidrometro()}</td>
                            <td>${medida.getNropulsos()}</td>
                            <td>${medida.getM3noperiodo()}</td>
                            <td>${medida.getNropulsosacumulados()}</td>
                            <td>${medida.getM3acumulados()}</td>
                            <td><fmt:formatNumber type="currency" currencySymbol="R$" value="${medida.getCustoacumulado()}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <br>
            </div>
        </form>
    </body>
</html>
