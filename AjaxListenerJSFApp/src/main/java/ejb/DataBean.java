/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.TblContinents;
import entity.TblCountries;
import entity.TblDistricts;
import entity.TblStates;
import entity.TblTalukas;
import entity.TblVillages;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class DataBean {
    @PersistenceContext(unitName = "mypu")
    EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

public Collection<TblContinents> getAllContinents()
{
    return em.createNamedQuery("TblContinents.findAll").getResultList();
}

public Collection<TblCountries> getAllCountries(Integer continentid)
{
    TblContinents continent = em.find(TblContinents.class, continentid);
    return continent.getTblCountriesCollection();
}

public Collection<TblStates> getAllStates(Integer countryid)
{
    TblCountries country= em.find(TblCountries.class, countryid);
    return country.getTblStatesCollection();
}

public Collection<TblDistricts> getAllDistricts(Integer stateid)
{
    TblStates state= em.find(TblStates.class, stateid);
    return state.getTblDistrictsCollection();
}

public Collection<TblTalukas> getAllTalukas(Integer districtid)
{
    TblDistricts district= em.find(TblDistricts.class, districtid);
    return district.getTblTalukasCollection() ;
}

public Collection<TblVillages> getAllVillages(Integer talukaid)
{
    TblTalukas taluka= em.find(TblTalukas.class, talukaid);
   
    return taluka.getTblVillagesCollection(); 
}

}
