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
@Table(name = "tbl_talukas")
@NamedQueries({
    @NamedQuery(name = "TblTalukas.findAll", query = "SELECT t FROM TblTalukas t"),
    @NamedQuery(name = "TblTalukas.findById", query = "SELECT t FROM TblTalukas t WHERE t.id = :id"),
    @NamedQuery(name = "TblTalukas.findByName", query = "SELECT t FROM TblTalukas t WHERE t.name = :name")})
public class TblTalukas implements Serializable {

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
    @JoinColumn(name = "district_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblDistricts districtId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "talukaId")
    private Collection<TblVillages> tblVillagesCollection;

    public TblTalukas() {
    }

    public TblTalukas(Integer id) {
        this.id = id;
    }

    public TblTalukas(Integer id, String name) {
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

    public TblDistricts getDistrictId() {
        return districtId;
    }

    public void setDistrictId(TblDistricts districtId) {
        this.districtId = districtId;
    }

    public Collection<TblVillages> getTblVillagesCollection() {
        return tblVillagesCollection;
    }

    public void setTblVillagesCollection(Collection<TblVillages> tblVillagesCollection) {
        this.tblVillagesCollection = tblVillagesCollection;
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
        if (!(object instanceof TblTalukas)) {
            return false;
        }
        TblTalukas other = (TblTalukas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TblTalukas[ id=" + id + " ]";
    }
    
}
