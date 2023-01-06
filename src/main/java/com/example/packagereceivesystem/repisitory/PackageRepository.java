package com.example.packagereceivesystem.repisitory;

import com.example.packagereceivesystem.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package,String> {
}
