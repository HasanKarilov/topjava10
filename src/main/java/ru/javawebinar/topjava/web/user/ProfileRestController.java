package ru.javawebinar.topjava.web.user;

import ru.javawebinar.topjava.AuthorizedUser;
import ru.javawebinar.topjava.model.User;

/**
 * Created by hanaria on 5/18/17.
 */
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(AuthorizedUser.id());
    }

    public void delete() {
        super.delete(AuthorizedUser.id());
    }

    public void update(User user) {
        super.update(user, AuthorizedUser.id());
    }
}