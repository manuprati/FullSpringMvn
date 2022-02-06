package springmvc1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc1.dao.UserDao;
import springmvc1.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		return userDao.saveUser(user);
	}
}
