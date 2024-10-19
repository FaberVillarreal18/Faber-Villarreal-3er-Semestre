package Model.User.UserLogic;

import Model.User.Command.DTO.CreateUpdateUserDTO;

public interface ValidateUser {
    public CreateUpdateUserDTO sanitizeAndValidateUser(CreateUpdateUserDTO createUpdateUserDTO);

}
