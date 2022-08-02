package com.Prograde.CrudOperation.Reposotory;

import com.Prograde.CrudOperation.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
