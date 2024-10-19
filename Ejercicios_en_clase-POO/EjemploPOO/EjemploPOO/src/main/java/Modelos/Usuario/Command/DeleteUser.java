package Model.User.Command;

import Model.User.Query.DTO.UserSelectDTO;

public interface DeleteUser {
    public void DeleteUser(UserSelectDTO user);
}
