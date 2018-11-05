package com.codegym.cms.service;

import com.codegym.cms.repository.ThingRepository;
import com.codegym.cms.model.Thing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ThingSeviceImpl implements ThingService {
    @Autowired
    private ThingRepository thingRepository;

    @Override
    public List<Thing> findAll() {
        return thingRepository.findAll();
    }

    @Override
    public Thing findById(Long id) {
        return thingRepository.findById(id);
    }

    @Override
    public void save(Thing thing) {
        thingRepository.save(thing);
    }

    @Override
    public void remove(Long id) {
        thingRepository.remove(id);

    }
}
