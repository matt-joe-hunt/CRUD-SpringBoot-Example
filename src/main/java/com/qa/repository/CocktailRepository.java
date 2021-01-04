package com.qa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.domain.Cocktail;

public interface CocktailRepository extends JpaRepository<Cocktail, Long>  {


}