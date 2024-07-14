package com.example.springpractice.repo;

import com.example.springpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value="SELECT * from User where id = ?1",nativeQuery = true)
    User getUserById(String userId);

    @Query(value="SELECT * from User Where id=?1 AND address=?2",nativeQuery = true)
    User getUserByUserIdAndAddress(String userId,String address);

    //if its a UPDATE query use as follow
//    @Modifying
//    @Query
}
