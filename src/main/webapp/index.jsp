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
              href="<%= contexto%>/css/log.css"/>
    </head>

    <body>
        <br>
        <span>WATER</span>
        <br>
        <br>
        <br>
        <span id="labelApto">Apartamento</span>
        <br>
        <br>
        <form method="get" action="controller">
            <input type="hidden" name="handler" 
                   value="com.mycompany.water.LoginHandler"/>
            <select id="apto" name="apto">
                <option value="000">Síndico</option>
                <option value="101">101</option>
                <option value="102">102</option>
                <option value="201">201</option>
                <option value="202">202</option>
                <option value="301">301</option>
                <option value="302">302</option>
                <option value="401">401</option>
                <option value="402">402</option>
                <option value="501">501</option>
                <option value="502">502</option>
                <option value="601">601</option>
                <option value="602">602</option>
            </select>
            <br>
            <br>
            <input id="submit" type="submit" value="entrar"/>
        </form>
    </body>
</html>