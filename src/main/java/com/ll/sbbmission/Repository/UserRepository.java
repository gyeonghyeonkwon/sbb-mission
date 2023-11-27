package com.ll.sbbmission.Repository;

import com.ll.sbbmission.Entity.user.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser , Long> {
}
