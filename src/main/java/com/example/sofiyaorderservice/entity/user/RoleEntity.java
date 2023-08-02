package com.example.sofiyaorderservice.entity.user;

import com.example.sofiyaorderservice.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "role")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoleEntity extends BaseEntity {

    private String name;

    @ManyToMany
    private List<PermissionEntity> permissions;
}
