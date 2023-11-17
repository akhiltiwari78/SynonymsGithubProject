package com.synonymsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synonymsRepository.SynonymsRepository;
import com.synonymsWord.Synonyms;
@Service
public class SynonymsServiceImplement implements SynonymsService {
	
	@Autowired
	 SynonymsRepository synonymsRepository;

	@Override
	public Synonyms addWord(Synonyms synonyms) {
		return this.synonymsRepository.save(synonyms);
	}

	@Override
	public Synonyms updateWord(Synonyms synonyms, Long id) {
		synonyms.setId(id);
		return this.synonymsRepository.save(synonyms);
	}

	@Override
	public void deleteWord(Long id) {
		this.synonymsRepository.deleteById(id);
		
	}

	@Override
	public List<Synonyms> fetchWord() {
		return this.synonymsRepository.findAll();
	}
	
	

}
