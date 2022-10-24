package com.pruebadev.web.services.users;

import com.pruebadev.web.models.Profile;

public interface IUserService {
    public Profile findOne(Integer id);
    public Profile create(Profile profile);
}
