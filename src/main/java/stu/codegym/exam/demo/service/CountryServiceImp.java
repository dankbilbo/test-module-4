package stu.codegym.exam.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import stu.codegym.exam.demo.model.Country;
import stu.codegym.exam.demo.repository.CountryRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CountryServiceImp implements CountryService{

    private CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Country country) {

    }

    @Override
    public void delete(Country country) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
