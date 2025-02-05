package com.example.springpractice.service;

import com.example.springpractice.dto.UserDTO;
import com.example.springpractice.entity.User;
import com.example.springpractice.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

    public UserDTO getUserById(String id){
        User user=userRepo.getUserById(id);
        return modelMapper.map(user,UserDTO.class);
    }

    public UserDTO getUserByUserIdAndAddress(String id,String adress){
        User user=userRepo.getUserByUserIdAndAddress(id, adress);
        return modelMapper.map(user,UserDTO.class);
    }

}
