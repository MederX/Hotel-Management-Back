package com.Mederdev.Havenplace.service.interfac;
import com.Mederdev.Havenplace.dto.LoginRequest;
import com.Mederdev.Havenplace.dto.Response;
import com.Mederdev.Havenplace.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}