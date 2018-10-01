package com.concretepage.controller;

import com.concretepage.entity.SpindleMachineDetailsBean;
import com.concretepage.service.IMachineSpindleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 4800)
@RestController
@RequestMapping("api")
public class SpindleMachineController {
	@Autowired
	private IMachineSpindleService machineSpindleService;

	/*@GetMapping("article/{id}")
	public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
		Article article = articleService.getArticleById(id);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}*/

	@GetMapping("machinedetails")
	public ResponseEntity<List<SpindleMachineDetailsBean>> getMachineDetails() {
		List<SpindleMachineDetailsBean> list = machineSpindleService.getAllMachineDetails();
		return new ResponseEntity<List<SpindleMachineDetailsBean>>(list, HttpStatus.OK);
	}
	/*@PostMapping("article")
	public ResponseEntity<Void> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
        boolean flag = articleService.addArticle(article);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("article")
	public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
		articleService.updateArticle(article);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		articleService.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	*/
} 