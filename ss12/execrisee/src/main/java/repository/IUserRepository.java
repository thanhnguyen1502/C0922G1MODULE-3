package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> selectAllUsers();
    boolean insertUser(User user) throws SQLException;
    User selectUser(int id);
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    List<User> SearchByCountry(String CountrySearch);
    List<User> sortByName();
}
