package ma.project.entities;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PharmacieGard  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDubut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	@ManyToMany
	private Garde gard;
	@ManyToMany
	private Pharmacie pharmacie;
	
	public PharmacieGard() {
		super();
	}
	
	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDubut() {
		return dateDubut;
	}
	public void setDateDubut(Date dateDubut) {
		this.dateDubut = dateDubut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Garde getGard() {
		return gard;
	}
	public void setGard(Garde gard) {
		this.gard = gard;
	}

	
}
