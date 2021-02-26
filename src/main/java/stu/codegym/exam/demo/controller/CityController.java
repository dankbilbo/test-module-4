package stu.codegym.exam.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import stu.codegym.exam.demo.model.City;
import stu.codegym.exam.demo.service.CityService;
import stu.codegym.exam.demo.service.CountryService;

@Controller
@RequestMapping
public class CityController {
    @Autowired
    private CityService cityService;
    @Autowired
    private CountryService countryService;

    @GetMapping
    public ModelAndView list(@PageableDefault(size = 6)Pageable pageable){
        return new ModelAndView("home","listAllCity",cityService.findAll(pageable));
    }

    @PostMapping("/add")
    public ModelAndView add(@Validated @ModelAttribute City city, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("add","plainCity", city)
                    .addObject("countries", countryService.findAll());
        }
        return new ModelAndView("add","plainCity", new City())
                .addObject("message","success");
    }

    @GetMapping("/add")
    public ModelAndView addForm(){
        return new ModelAndView("add","plainCity", new City())
                .addObject("countries", countryService.findAll());
    }

    @GetMapping("{id}")
    public ModelAndView info(@PathVariable Long id){
        return new ModelAndView("single","city", cityService.findById(id));
    }

    @GetMapping("/edit")
    public ModelAndView editForm(@RequestParam Long id){
        return new ModelAndView("edit", "editCity",cityService.findById(id).get())
                .addObject("countries",countryService.findAll());
    }

    @PostMapping("/edit")
    public ModelAndView edit(@Validated @ModelAttribute City city, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("edit","editcity",city)
                    .addObject("countries",countryService.findAll());
        }
        cityService.save(city);
        return new ModelAndView();
    }
    @GetMapping("/delete")
    public String delete(@RequestParam Long id){
        return "home";
    }
//    @GetMapping("/search")
//    public ModelAndView searchByName(@RequestParam String name){
//        return new ModelAndView("search","listSearchedCity", cityService.f);
//    }

}
