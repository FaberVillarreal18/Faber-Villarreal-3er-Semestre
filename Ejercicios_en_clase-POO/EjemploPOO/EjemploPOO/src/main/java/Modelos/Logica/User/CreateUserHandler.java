package Model.Logic.User;

import Model.User.Command.DTO.CreateUpdateUserDTO;

import java.sql.SQLException;

public class CreateUserHandler implements Model.User.Command.CreateUser {

    private static final String CREATE = "INSERT INTO user (cedula, )";

    @Override
    public void createUser(CreateUpdateUserDTO createUpdateUserDTO) throws SQLException {

    }
}
