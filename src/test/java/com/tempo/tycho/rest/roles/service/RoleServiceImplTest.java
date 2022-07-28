package com.tempo.tycho.rest.roles.service;

import com.tempo.tycho.core.models.Role;
import com.tempo.tycho.persistence.entity.RoleEntity;
import com.tempo.tycho.persistence.repository.RoleRepository;
import com.tempo.tycho.rest.role.service.RoleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class RoleServiceImplTest {

    @InjectMocks
    RoleServiceImpl sut;

    @Mock
    RoleRepository repository;

    @Test
    public void getAllRolesShouldReturnAllRoles() {
        // Assemble
        List<RoleEntity> roles = Arrays.asList(
                createRoleEntity(1L, "Role 1"),
                createRoleEntity(2L, "Role 2"),
                createRoleEntity(3L, "Role 3")
        );

        doReturn(roles)
                .when(repository)
                .findAll();

        // Act
        List<Role> actual = sut.getAllRoles();

        // Assert
        assertThat(actual.size()).isEqualTo(roles.size());
    }

    private RoleEntity createRoleEntity(Long id, String name) {
        var roleEntity = new RoleEntity();
        roleEntity.setId(id);
        roleEntity.setName(name);
        return roleEntity;
    }

}
