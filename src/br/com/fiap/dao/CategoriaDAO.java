package br.com.fiap.dao;

import br.com.fiap.beans.CategoriaTutorial;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDAO {
    public Connection minhaConexao;

    public CategoriaDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    //insert
    public String inserirCategoria(CategoriaTutorial categoriaTutorial) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into categoria_tutorial (nome_categoria, desc_categoria) values (?, ?)");
        stmt.setString(1,categoriaTutorial.getNome());
        stmt.setString(2,categoriaTutorial.getDescricaoCategoriaTutorial());

        stmt.execute();
        stmt.close();

        return "Categoria inserida com sucesso!";
    }

    //Deletar
    public String deletarCategoria(Integer id_categoria) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement("Delete from categoria_tutorial where id_categoria = ?");
        stmt.setInt(1, id_categoria);
        stmt.execute();
        stmt.close();

        return "Categoria deletada com sucesso!";
    }

    //Update
    public String atualizarCategoria (CategoriaTutorial categoriaTutorial) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement("Update categoria_tutorial set nome_categoria = ?, desc_categoria = ? where id_categoria = ?");
        stmt.setString(1, categoriaTutorial.getNome());
        stmt.setString(2, categoriaTutorial.getDescricaoCategoriaTutorial());
        stmt.setInt(4,categoriaTutorial.getId_categoria());

        stmt.executeUpdate();
        stmt.close();

        return "Categoria atualizada com sucesso!";
    }
}

