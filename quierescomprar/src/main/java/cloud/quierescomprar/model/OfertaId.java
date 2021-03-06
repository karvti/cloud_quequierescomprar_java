package cloud.quierescomprar.model;

// Generated 22/07/2012 08:18:53 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OfertaId generated by hbm2java
 */
@Embeddable
public class OfertaId implements java.io.Serializable {

	private short CEmpresa;
	private String COferta;

	public OfertaId() {
	}

	public OfertaId(short CEmpresa, String COferta) {
		this.CEmpresa = CEmpresa;
		this.COferta = COferta;
	}

	@Column(name = "C_EMPRESA", nullable = false)
	public short getCEmpresa() {
		return this.CEmpresa;
	}

	public void setCEmpresa(short CEmpresa) {
		this.CEmpresa = CEmpresa;
	}

	@Column(name = "C_OFERTA", nullable = false, length = 6)
	public String getCOferta() {
		return this.COferta;
	}

	public void setCOferta(String COferta) {
		this.COferta = COferta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OfertaId))
			return false;
		OfertaId castOther = (OfertaId) other;

		return (this.getCEmpresa() == castOther.getCEmpresa())
				&& ((this.getCOferta() == castOther.getCOferta()) || (this
						.getCOferta() != null && castOther.getCOferta() != null && this
						.getCOferta().equals(castOther.getCOferta())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCEmpresa();
		result = 37 * result
				+ (getCOferta() == null ? 0 : this.getCOferta().hashCode());
		return result;
	}

}
