package com.synonymsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.synonymsService.SynonymsService;
import com.synonymsWord.Synonyms;

@RestController
public class SynonymsController {
	@Autowired
	SynonymsService synonymsService;
	
	@PostMapping("/synonyms")
	public Synonyms addWord(@RequestBody Synonyms synonyms) {
		return this.synonymsService.addWord(synonyms);
	}

	@PutMapping("/synonyms/{id}")
	public Synonyms updateWord(@RequestBody Synonyms synonyms,@PathVariable Long id) {
		return this.synonymsService.updateWord(synonyms, id);
	}

	@DeleteMapping("/synonyms/{id}")
	public void deleteWord(@PathVariable Long id) {
		this.synonymsService.deleteWord(id);
	}

	@GetMapping("/synonyms")
	public List<Synonyms> fetchWord() {
		return this.synonymsService.fetchWord();
	}
	
	
}
