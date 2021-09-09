package com.danielluque.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielluque.demo.controller.dto.UserDTO;
import com.danielluque.demo.model.User;
import com.danielluque.demo.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
public class UserController {
	@Autowired
	private UserService userService;


	@PostMapping(value = "/crearUsuario/")
	public ResponseEntity<User> crearUsuario(UserDTO userDto){
		User user = new User();
		//user.setEmail(userDto.getEmail());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		return new ResponseEntity<User>(userService.create(user),HttpStatus.CREATED);
	}
	
//	@PatchMapping(value = "/editarUsuario/{idUsuario}")
//	public ResponseEntity<User> editarUsuario(UserDTO userDto,@PathVariable("idUsuario") int idUsuario){
//		User usuario = userService.findById(idUsuario);
//		usuario.setEmail(userDto.getEmail());
//		usuario.setUsername(userDto.getUsername());
//		usuario.setPassword(userDto.getPassword());
//		return new ResponseEntity<User>(userService.update(usuario),HttpStatus.CREATED);		
//	}
	
//	@DeleteMapping(value = "/delete/{idUsuario}")
//	public ResponseEntity<User> deleteUsuario(@PathVariable("idUsuario") int idUsuario){
//		User usuario = userService.findById(idUsuario);
//		userService.delete(usuario);
//		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
//		
//	}
	
//	@GetMapping(value = "/obtenerUsuarios/")
//	public ResponseEntity<List<User>> obtenerUsuarios() {
//		List<User> usuarios = userService.findAll();
//		return new ResponseEntity<List<User>>(usuarios,HttpStatus.ACCEPTED);
//	}

}
