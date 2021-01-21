package com.brunoaguiar.crud.resourcies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunoaguiar.crud.entities.Client;
import com.brunoaguiar.crud.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {

	@Autowired
	private ClientService service;
	
	//responseEntity is an object that encapsulates an HTTP response.
	@GetMapping // means this is an end point
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Bruno", "200.000", 50.0, null, 6));
		list.add(new Client(2L, "Sara", "500.000.000", 20.0, null, 2));

		return ResponseEntity.ok().body(list);
						
	}
}
