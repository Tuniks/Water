package com.mycompany.water;

import javax.servlet.http.*;

public interface Handler {

    public String processar(
            HttpServletRequest request,
            HttpServletResponse response);
}
