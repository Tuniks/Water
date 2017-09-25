package com.mycompany.water;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CondominoDAO extends BaseDAO {
    boolean doRead(CondominosDTO dto) {
        try {
            Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(
               "SELECT * FROM condominos WHERE apto=?;");
            //pstmt.setInt(1, (new Integer(dto.getApto())).intValue());
            pstmt.setString(1, dto.getApto());
            ResultSet rst = pstmt.executeQuery();
            rst.next();
            dto.setResponsavel(rst.getString("responsavel"));
            dto.setTelefone(rst.getString("telefone"));
            dto.setEmail(rst.getString("email"));
            
            pstmt = con.prepareStatement(
                "SELECT * FROM medidas WHERE apto=?;");
            pstmt.setString(1, dto.getApto());
            rst = pstmt.executeQuery();
            ArrayList<ParametrosHidroDTO> medidas = new ArrayList<>();
            
            while(rst.next()){
                ParametrosHidroDTO medidahidro = new ParametrosHidroDTO();
                medidahidro.setApto(dto.getApto());
                medidahidro.setDatahora(rst.getString("datahora"));
                medidahidro.setNropulsos(rst.getInt("nropulsos"));
                medidahidro.setNropulsosacumulados(rst.getInt("nropulsosacumulados"));
                medidahidro.setSerialmedidas(rst.getInt("serialmedidas"));
                medidahidro.setHidrometro(rst.getInt("hidrometro"));
                medidahidro.setM3noperiodo(rst.getFloat("m3noperiodo"));
                medidahidro.setM3acumulados(rst.getFloat("m3acumulados"));
                medidahidro.setCustoacumulado(rst.getFloat("custoacumulado"));
                medidas.add(medidahidro);
                System.out.println(rst.getString("datahora"));
            }
            dto.setMedidas(medidas);
            con.close();
                        
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
