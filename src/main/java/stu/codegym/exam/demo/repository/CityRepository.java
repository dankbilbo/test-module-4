package stu.codegym.exam.demo.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.codegym.exam.demo.model.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
