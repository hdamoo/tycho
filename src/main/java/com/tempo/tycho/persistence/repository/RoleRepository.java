package com.tempo.tycho.persistence.repository;

import com.tempo.tycho.persistence.entity.RoleEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long>,
        QuerydslPredicateExecutor<RoleEntity> {
}
