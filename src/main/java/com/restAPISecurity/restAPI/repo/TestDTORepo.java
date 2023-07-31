package com.restAPISecurity.restAPI.repo;

import com.restAPISecurity.restAPI.model.TestDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDTORepo extends JpaRepository<TestDTO, Integer> {
}
