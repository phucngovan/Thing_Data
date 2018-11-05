package com.codegym.cms.service;

import com.codegym.cms.model.Thing;

import java.util.List;

public interface ThingService {
List<Thing> findAll();
Thing findById(Long id);
void save(Thing thing);
void remove(Long id);
}
