package com.wego.web.mappers;


import org.springframework.stereotype.Repository;

import com.wego.web.domains.UserDTO;
@Repository
public interface UserMapper {
	public UserDTO selectUserById(UserDTO param);
	public void insertUser(UserDTO param);

}
