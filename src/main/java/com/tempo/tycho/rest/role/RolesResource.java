package com.tempo.tycho.rest.role;

import com.tempo.tycho.core.models.Role;
import com.tempo.tycho.rest.role.model.RoleBean;
import com.tempo.tycho.rest.role.service.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RestController
@RequestMapping("/roles")
public class RolesResource {

    private final RoleService roleService;

    public RolesResource(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleBean> getAll() {
        return toResponse(roleService.getAllRoles());
    }

    private List<RoleBean> toResponse(List<Role> roles) {
        return roles
                .stream()
                .map(r -> new RoleBean(r.getId(), r.getName()))
                .collect(Collectors.toList());
    }

}
