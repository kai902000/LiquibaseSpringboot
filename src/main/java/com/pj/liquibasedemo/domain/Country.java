package com.pj.liquibasedemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "country")
@Data
@Getter @Setter
public class Country
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "iso_code_test")
    private String isoCodeTest;


    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonIgnore
    private Region region;
    
    

}
