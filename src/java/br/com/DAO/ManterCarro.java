/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.controle.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ManterCarro extends DAO {
    public void Cadastrar(Carro ca) throws SQLException{
       
        try {
            abrirBanco();
            String query = "INSERT INTO carro (codigo,codigousuario,nome,modelo,ano,marca,potencia,imagem) values (null,?,?,?,?,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, ca.getCodigousuario());
            ps.setString(2, ca.getNome());
            ps.setString(3, ca.getModelo());
            ps.setInt(4, ca.getAno());
            ps.setString(5, ca.getModelo());
            ps.setString(6, ca.getPotencia());
            ps.setString(7, ca.getImagem());
            
            ps.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        
        }   
    }
    public ArrayList pesquisarTudo(){
      ArrayList<Carro> listantc= new ArrayList<Carro>();
        try {
            abrirBanco();
            String query = "select * FROM carro";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            Carro ntcben ;
            while (rs.next()){
               ntcben = new Carro();
               ntcben.setCodigo(rs.getInt("codigo"));
               ntcben.setNome(rs.getString("nome"));
               ntcben.setModelo(rs.getString("modelo"));
               ntcben.setAno(rs.getInt("ano"));
               ntcben.setMarca(rs.getString("marca"));
               ntcben.setPotencia(rs.getString("potencia"));
               ntcben.setImagem(rs.getString("imagem"));
               ntcben.setCodigousuario(rs.getInt("codigousuario"));
               listantc.add(ntcben);
            }
            fecharBanco();
            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return listantc;
    }
    
    public void deletar(Carro ca) {
        try {
            abrirBanco();
            String query= "DELETE FROM carro where codigo=?";
            ps =(PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, ca.getCodigo());
            ps.execute();
            fecharBanco();
                    
        } catch (Exception e) {
        }
    }
    
    public Carro pesquisar(int codigo) throws Exception {
    try {
            Carro al = new Carro();
           
            abrirBanco();
            String query = "select * FROM carro where codigo=?";
            ps = con.prepareStatement(query);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               al.setCodigo(rs.getInt("codigo"));
               al.setNome(rs.getString("nome"));
               al.setModelo(rs.getString("modelo"));
               al.setAno(rs.getInt("ano"));
               al.setMarca(rs.getString("marca"));
               al.setPotencia(rs.getString("potencia"));
               al.setImagem(rs.getString("imagem"));
               al.setCodigousuario(rs.getInt("codigousuario"));
             
                return al;
            }
            fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
    return null;
    }
    
    public void editarCarro(Carro ca) throws Exception {
        try{
        abrirBanco();
        String query = "UPDATE carro set nome = ?,modelo = ?,ano = ?,marca = ?,potencia = ?,imagem= ?,codigousuario = ? where codigo = ?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, ca.getNome());
            ps.setString(2, ca.getModelo());
            ps.setInt(3, ca.getAno());
            ps.setString(4, ca.getMarca());
            ps.setString(5, ca.getPotencia());
            ps.setString(6, ca.getImagem());
            ps.setInt(7, ca.getCodigousuario());
            ps.setInt(8, ca.getCodigo());
        ps.executeUpdate();
        fecharBanco();
        } catch (Exception e){
            System.out.println("Erro" + e.getMessage());
        }
    }
}
