package Model.User.Query;

import Model.User.Query.DTO.UserSelectDTO;

import java.sql.SQLException;

public interface SelectUserById {
    public UserSelectDTO selectUserById(int id) throws SQLException;

    public UserSelectDTO selectUserByCedula(int cedula) throws SQLException;

}
