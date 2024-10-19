package Model.User.Command;

import Model.User.Command.DTO.CreateUpdateUserDTO;

public interface UpdateUser {

    public void updateUser(CreateUpdateUserDTO createUpdateUserDTO);
}
