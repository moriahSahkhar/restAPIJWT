package com.restAPISecurity.restAPI.auth;

import com.restAPISecurity.restAPI.model.TestDTO;
import com.restAPISecurity.restAPI.repo.TestDTORepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping(path = "api/test", produces = "application/xml")
@AllArgsConstructor
public class TestController {

	private TestDTORepo testDTORepo;
	
	@GetMapping
	public String getMsg() {
		return "Hello";
	}

	@GetMapping("/getXML")
	public ResponseEntity<TestDTO> get()
	{

		TestDTO model = new TestDTO();
		model.setFname("Max");
		model.setLname("Kross");
		model.setDob("05-09-2001");

		return ResponseEntity.ok().body(model);
	}

	@PostMapping
	public ResponseEntity<TestDTO> save(@RequestBody TestDTO testDTO){
		return ResponseEntity.ok().body(testDTORepo.save(testDTO));
	}
}
