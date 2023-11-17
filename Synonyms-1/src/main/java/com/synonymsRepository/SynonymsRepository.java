package com.synonymsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synonymsWord.Synonyms;
@Repository
public interface SynonymsRepository extends JpaRepository<Synonyms, Long>{

}
