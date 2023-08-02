package com.example.sofiyaorderservice.entity.user;

import com.example.sofiyaorderservice.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "permissions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PermissionEntity extends BaseEntity {

    private String permission;
}
