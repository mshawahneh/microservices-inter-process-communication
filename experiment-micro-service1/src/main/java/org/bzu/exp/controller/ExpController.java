package org.bzu.exp.controller;

import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.Callable;

import org.bzu.exp.model.ExpModel;
import org.bzu.exp.repository.ExpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 
 *
 */

/**
 * This class is responsible about providing Device Access RESTfull APIs.
 * 
 */
@RestController
@RequestMapping(value = "/api/v1/service1")
@Slf4j
@CrossOrigin(origins = "*")
public class ExpController {
	
	
	@Autowired
	ExpRepository repo;
	
	/**
	 * 
	 * 
	 * @param deviceInfo
	 * @param deviceId
	 * @return
	 * @throws DeviceExistsException
	 * @throws EngineerExistsException
	 * @throws DeviceInActiveException 
	 * @throws UnknownHostException
	 * @throws DeviceNotFoundException 
	 */
	@PostMapping(value = "/exp/model")
	public Callable<ResponseEntity<ExpModel>> addModel(@RequestBody ExpModel exp){
		log.info("Adding new Doctor {}",exp);

		ExpModel persistedDoctor = repo.save(exp);
		return () -> ResponseEntity
				.ok(persistedDoctor);
	}
	
	/**
	 * 
	 * 
	 * @param deviceInfo
	 * @param deviceId
	 * @return
	 * @throws DeviceExistsException
	 * @throws EngineerExistsException
	 * @throws DeviceInActiveException 
	 * @throws UnknownHostException
	 * @throws DeviceNotFoundException 
	 */
	@PostMapping(value = "/exp/models")
	public Callable<ResponseEntity<List<ExpModel>>> addModelList(@RequestBody List<ExpModel> expList){
		log.info("Adding new Doctor {}",expList);

		 ;
		return () -> ResponseEntity
				.ok(repo.saveAll(expList));
	}
	
	@RequestMapping(path = "/exps", 
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE})
	public @ResponseBody List<ExpModel> getExps(){
		
		return repo.findAll();
	}
	/**
	 * Get all device Access for one device Info.
	 * 
	 * @param deviceId
	 * @return
	 * 
	 */
	@GetMapping(value = "/exp/attributes")
	public Callable<ResponseEntity<List<ExpModel>>> listExpByAttr(@RequestParam(value = "attr") String attr) throws Exception {
		log.info("Fetching All Models by Attr");

		
		return () -> ResponseEntity.ok(repo.findAllByAttr1(attr));
	}
	


	/**
	 * Edit device Access.
	 * 
	 * @param
	 * @return
	 */
	@PutMapping(value = "/exp/model")
	public Callable<ResponseEntity<ExpModel>> editExpModel(@RequestBody ExpModel exp){

		return () -> ResponseEntity.ok(repo.save(exp));
	}

	
	/**
	 * delete network
	 * 
	 */
	@DeleteMapping(value = "/exp/model")
	public Callable<ResponseEntity<String>> deleteDoctor(@RequestBody ExpModel exp){
		
		repo.delete(exp);
		return () -> ResponseEntity.ok("deleted");
	}
}
