package com.synonymsService;

import java.util.List;

import com.synonymsWord.Synonyms;

public interface SynonymsService {
		
	public Synonyms addWord(Synonyms synonyms);
	public Synonyms updateWord(Synonyms synonyms, Long id);
	public void deleteWord(Long id);
	public List<Synonyms> fetchWord();
	
	
}
