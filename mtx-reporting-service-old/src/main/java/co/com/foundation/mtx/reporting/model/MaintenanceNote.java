package co.com.foundation.mtx.reporting.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MAINTENANCE_NOTE")
@Cacheable(false)
@NamedQueries({
    @NamedQuery(name = "MaintenanceNote.findAll", query = "SELECT m FROM MaintenanceNote m")
    , @NamedQuery(name = "MaintenanceNote.findById", query = "SELECT m FROM MaintenanceNote m WHERE m.id = :id")
    , @NamedQuery(name = "MaintenanceNote.findByNote", query = "SELECT m FROM MaintenanceNote m WHERE m.note = :note")
    , @NamedQuery(name = "MaintenanceNote.findByPart", query = "SELECT m FROM MaintenanceNote m WHERE m.part = :part")})
public class MaintenanceNote implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 200)
    @Column(name = "NOTE")
    private String note;
    @Size(max = 40)
    @Column(name = "PART")
    private String part;
    @JoinColumn(name = "MAINTENANCE_ID", referencedColumnName = "ID")
    @ManyToOne
    private MaintenanceExecution maintenanceId;

    public MaintenanceNote() {
    }

    public MaintenanceNote(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public MaintenanceExecution getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(MaintenanceExecution maintenanceId) {
        this.maintenanceId = maintenanceId;
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
        if (!(object instanceof MaintenanceNote)) {
            return false;
        }
        MaintenanceNote other = (MaintenanceNote) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.foundation.mtx.reporting.model.MaintenanceNote[ id=" + id + " ]";
    }
    
}
