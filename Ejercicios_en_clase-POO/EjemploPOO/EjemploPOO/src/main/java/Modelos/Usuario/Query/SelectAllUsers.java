package Model.User.Query;

import Model.User.Query.DTO.UserSelectDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface SelectAllUsers {
    private List<UserSelectDTO> SELECT_ALL_USER() throws SQLException {
        return new ArrayList<UserSelectDTO>();
    }
}
