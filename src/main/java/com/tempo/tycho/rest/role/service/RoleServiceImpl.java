package com.tempo.tycho.rest.role.service;

import com.tempo.tycho.core.models.Role;
import com.tempo.tycho.persistence.entity.RoleEntity;
import com.tempo.tycho.persistence.repository.RoleRepository;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Role> getAllRoles() {
        return Lists.newArrayList(repository.findAll())
                .stream()
                .map(RoleEntity::toDomain)
                .collect(Collectors.toList());
    }
}
