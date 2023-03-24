/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
@Table(name = "tbl_states")
@NamedQueries({
    @NamedQuery(name = "TblStates.findAll", query = "SELECT t FROM TblStates t"),
    @NamedQuery(name = "TblStates.findById", query = "SELECT t FROM TblStates t WHERE t.id = :id"),
    @NamedQuery(name = "TblStates.findByName", query = "SELECT t FROM TblStates t WHERE t.name = :name")})
public class TblStates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblCountries countryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stateId")
    private Collection<TblDistricts> tblDistrictsCollection;

    public TblStates() {
    }

    public TblStates(Integer id) {
        this.id = id;
    }

    public TblStates(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TblCountries getCountryId() {
        return countryId;
    }

    public void setCountryId(TblCountries countryId) {
        this.countryId = countryId;
    }

    public Collection<TblDistricts> getTblDistrictsCollection() {
        return tblDistrictsCollection;
    }

    public void setTblDistrictsCollection(Collection<TblDistricts> tblDistrictsCollection) {
        this.tblDistrictsCollection = tblDistrictsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblStates)) {
            return false;
        }
        TblStates other = (TblStates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TblStates[ id=" + id + " ]";
    }
    
}
