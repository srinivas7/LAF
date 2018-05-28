package com.abn.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.abn.model.UserLogin;


@CrossOrigin(origins = "*")
@RestController
public class HomeController {

	
	@Consumes({MediaType.APPLICATION_JSON})
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<String> login(@RequestBody UserLogin userLogin) {
                String login;
                HashMap<String, String> userInfo = new HashMap();
                userInfo.put("aaa", "aaa");
                userInfo.put("bbb", "bbb");
                userInfo.put("ccc", "ccc");
                
                String enteredUN = userLogin.getUserName();
                String enteredPWD = userLogin.getPwd();
                
                for (HashMap.Entry<String, String> entry : userInfo.entrySet()) {
        		    System.out.println(entry.getKey() + " = " + entry.getValue());
        		}
                
                System.out.println(userInfo.get(userLogin.getUserName()));
                if(userInfo.containsKey(userLogin.getUserName()) && userLogin.getPwd().equals(userInfo.get(userLogin.getUserName()))) {
                	System.out.println("valid login");
                	login = "valid login";
                }else {
                	System.out.println("in-valid login");
                	login = "in-valid login";
                }
                return new ResponseEntity<String >(login, HttpStatus.OK);
	}
	
	
}
