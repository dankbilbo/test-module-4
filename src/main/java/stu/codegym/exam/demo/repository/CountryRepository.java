package stu.codegym.exam.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stu.codegym.exam.demo.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

}
