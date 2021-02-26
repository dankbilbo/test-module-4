package stu.codegym.exam.demo.model;


import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotBlank
    @Size(min = 1, max = 20)
    @UniqueElements
    private String name;

    @NotNull
    @Min(value = 0)
    private Double area;

    @NotNull
    @Min(value = 0)
    private Long population;

    @NotNull
    private Double gdp;

    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


    public City() {
    }


    public City(@NotNull @Size(min = 1, max = 20) String name, @NotNull @Min(value = 0) Double area, @NotNull @Min(value = 0) Long population, @NotNull Double gdp, String desc, @NotNull Country country) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.description = desc;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getGdp() {
        return gdp;
    }

    public void setGdp(Double gdp) {
        this.gdp = gdp;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
