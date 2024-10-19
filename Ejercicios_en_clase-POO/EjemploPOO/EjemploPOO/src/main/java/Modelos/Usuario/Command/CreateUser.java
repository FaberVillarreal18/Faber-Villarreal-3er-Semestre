package Model.User.Command;

import Model.User.Command.DTO.CreateUpdateUserDTO;

import java.sql.SQLException;

public interface CreateUser {
    public void createUser(CreateUpdateUserDTO createUpdateUserDTO) throws SQLException;


}
