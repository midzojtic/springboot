package com.app.veterinar.dao;

import com.app.veterinar.model.ClientModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;

@Repository
public class ClientDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ClientModel> findAllClients() {
        return jdbcTemplate.query("select * from CLIENT", new ClientModelRowMapper());
    }


    class ClientModelRowMapper implements RowMapper<ClientModel> {
        @Override
        public ClientModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            ClientModel client = new ClientModel();
            client.setName(rs.getString("CLIENT_NAME"));
            client.setSurname(rs.getString("CLIENT_SURNAME"));
            client.setEmail(rs.getString("CELL_NUMBER"));
            client.setPhone(rs.getInt("EMAIL"));
            return client;
        }
    }
}
