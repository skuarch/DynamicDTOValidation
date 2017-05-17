package application.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.model.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@PostMapping
	@ResponseBody
	public Customer post(@Valid @RequestBody Customer customer, BindingResult result) throws Exception {
		
		if(result.hasErrors()){
			throw new Exception(result.getAllErrors().get(0).toString());
		}else {
			return new Customer();			
		}
		
	}
	
}
