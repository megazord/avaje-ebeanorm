package com.avaje.tests.model.basic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.avaje.ebean.annotation.CacheStrategy;

/**
 * Cached bean for testing caching implementation.
 */
@CacheStrategy
@Entity
@Table(name = "o_cached_bean")
public class OCachedBean {

  @Id
  Long id;

  String name;
  
  @ManyToMany
  List<Country> countries = new ArrayList<Country>();

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }
}