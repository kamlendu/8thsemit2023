/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean;

import ejb.DataBean;
import entity.TblContinents;
import entity.TblCountries;
import entity.TblDistricts;
import entity.TblStates;
import entity.TblTalukas;
import entity.TblVillages;
import java.io.Serializable;
import java.util.Collection;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author root
 */
@Named(value = "location")
@SessionScoped
public class Location implements Serializable {
    @EJB DataBean db;
   
    int continentid;
    int countryid;
    int stateid;
    int districtid;
    int talukaid;
    int villageid;
    Collection<TblContinents> continents;
    Collection<TblCountries> countries;
    Collection<TblStates> states;
    Collection<TblDistricts> districts;
    Collection<TblTalukas> talukas;
    Collection<TblVillages> villages;

    public int getContinentid() {
        return continentid;
    }

    public void setContinentid(int continentid) {
        this.continentid = continentid;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public int getDistrictid() {
        return districtid;
    }

    public void setDistrictid(int districtid) {
        this.districtid = districtid;
    }

    public int getTalukaid() {
        return talukaid;
    }

    public void setTalukaid(int talukaid) {
        this.talukaid = talukaid;
    }

    public int getVillageid() {
        return villageid;
    }

    public void setVillageid(int villageid) {
        this.villageid = villageid;
    }

    public Collection<TblContinents> getContinents() {
        return db.getAllContinents();
    }

    public void setContinents(Collection<TblContinents> continents) {
        this.continents = continents;
    }

    public Collection<TblCountries> getCountries() {
        if(continentid==0)
          return db.getAllCountries(1) ; 
        return db.getAllCountries(continentid);
    }

    public void setCountries(Collection<TblCountries> countries) {
        this.countries = countries;
    }

    public Collection<TblStates> getStates() {
         if(countryid==0)
            return db.getAllStates(1);
        return db.getAllStates(countryid);
    }

    public void setStates(Collection<TblStates> states) {
        this.states = states;
    }

    public Collection<TblDistricts> getDistricts() {
        System.out.println("states "+stateid);
         if(stateid==0)
             return db.getAllDistricts(1);
        
        return db.getAllDistricts(stateid);
    }

    public void setDistricts(Collection<TblDistricts> districts) {
        this.districts = districts;
    }

    public Collection<TblTalukas> getTalukas() {
        System.out.println("district:" +districtid);
            if(districtid==0)
                return db.getAllTalukas(1);
        return db.getAllTalukas(districtid);
    }

    public void setTalukas(Collection<TblTalukas> talukas) {
        this.talukas = talukas;
    }

    public Collection<TblVillages> getVillages() {
            if(talukaid==0)
                return db.getAllVillages(1);
        return db.getAllVillages(talukaid);
    }

    public void setVillages(Collection<TblVillages> villages) {
        this.villages = villages;
    }
    
    
    
    
    /**
     * Creates a new instance of Location
     */
    public Location() {
    }
    
}
