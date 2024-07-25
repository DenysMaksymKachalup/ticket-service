package com.denys.user.repository;

import com.denys.user.model.Role;
import com.denys.user.model.enumeration.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(RoleName roleName);

}
