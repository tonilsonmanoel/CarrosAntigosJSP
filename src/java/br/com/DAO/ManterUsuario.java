/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.controle.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author User
 */
public class ManterUsuario extends DAO{
    public void cadastraUsuario(Usuario u) {
        try {
            abrirBanco();
            String query ="Insert Into login (id,nome,email,senha) values (null,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getSenha());
            ps.execute();
            fecharBanco();
            
        } catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }
  }
    public Usuario Login(String email, String senha) throws Exception {
        Usuario u = new Usuario();
        try {
            abrirBanco();
            String query = "SELECT * FROM login WHERE  email = ? and senha = ?";
            ps= con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2,senha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                u.setPerfil(rs.getInt("perfil"));
            }
            fecharBanco();
            return u;
           
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
        return null;
    }
    public Usuario RecuperarSenha(String email) throws Exception{
        Usuario u = new Usuario();
        try {
            abrirBanco();
            String query="SELECT * FROM login where email = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               u.setId(rs.getInt("id"));
               u.setEmail( rs.getString("email"));
               u.setSenha(rs.getString("senha"));
               u.setNome(rs.getString("nome"));
               u.setPerfil(rs.getInt("perfil"));
            }
            fecharBanco();
            return u;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return null;
      }
    public void AtualizarSenha(String senha,int id){
        try {
            abrirBanco();
            String query = "UPDATE login SET senha = ? where id = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, senha);
            ps.setInt(2, id);
            ps.executeUpdate();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        
    } 
   
    
}
    
