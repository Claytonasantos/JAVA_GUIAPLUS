package br.com.fiap.dao;

import br.com.fiap.beans.Perfil;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PerfilDAO {
    public Connection minhaConexao;

    public PerfilDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirPerfil(Perfil perfil) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into perfil (descricao, modo_acesso) values (?, ?)");
        stmt.setString(1,perfil.getDescricaoPerfil());
        stmt.setString(2, perfil.getModoAcesso());

        stmt.execute();
        stmt.close();

        return "Perfil inserido com sucesso!";
    }

    //Deletar
    public String deletarPerfil(Integer id_perfil) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from perfil where id_perfil = ?");
        stmt.setInt(1, id_perfil);
        stmt.execute();
        stmt.close();

        return "Perfil deletado com sucesso!";
    }

    //Update
    public String atualizarPerfil (Perfil perfil) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update perfil set descricao = ?, modo_acesso = ? where id_perfil = ?");
        stmt.setString(1, perfil.getDescricaoPerfil());
        stmt.setString(2, perfil.getModoAcesso());
        stmt.setInt(3, perfil.getId_perfil());

        stmt.executeUpdate();
        stmt.close();

        return "Usuario atualizado com sucesso!";
    }
}

