package stu.codegym.exam.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import stu.codegym.exam.demo.model.City;
import stu.codegym.exam.demo.repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImp implements CityService{

    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Page<City> findAll(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void delete(City city) {
        cityRepository.delete(city);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }
}
