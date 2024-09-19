package com.example.inicial1.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServices implements BaseService {


    @Override
    public List findAll() throws Exception {
        return List.of();
    }

    @Override
    public Object findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Object save(Object entity) throws Exception {
        return null;
    }

    @Override
    public Object update(Long id, Object entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
