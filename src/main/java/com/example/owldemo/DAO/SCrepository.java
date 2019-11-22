package com.example.owldemo.DAO;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.example.owldemo.SC.safetyScan;


public interface SCrepository extends CrudRepository<safetyScan,Integer>{
    List<safetyScan> findByPackageName(String packageName);

}
