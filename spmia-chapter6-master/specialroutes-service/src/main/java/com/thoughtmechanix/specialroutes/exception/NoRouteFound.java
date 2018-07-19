package com.thoughtmechanix.specialroutes.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoRouteFound extends RuntimeException{

	private static final long serialVersionUID = 980293658287919674L;
}
