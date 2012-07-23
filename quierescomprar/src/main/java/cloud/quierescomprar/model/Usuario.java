package cloud.quierescomprar.model;

// Generated 22/07/2012 08:18:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "bd_quequierescomprar_empresa")
public class Usuario implements java.io.Serializable {

	private UsuarioId id;
	private Empresa empresa;
	private String apePaterno;
	private String apeMaterno;
	private String nombre;
	private String nroDocId;
	private String codSexo;
	private String direccion;
	private String celular;
	private String telefono;
	private Set<OfertaVenta> ofertaVentas = new HashSet<OfertaVenta>(0);

	public Usuario() {
	}

	public Usuario(UsuarioId id, Empresa empresa, String apePaterno,
			String apeMaterno, String nombre, String nroDocId, String codSexo,
			String direccion, String celular, String telefono) {
		this.id = id;
		this.empresa = empresa;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.nombre = nombre;
		this.nroDocId = nroDocId;
		this.codSexo = codSexo;
		this.direccion = direccion;
		this.celular = celular;
		this.telefono = telefono;
	}

	public Usuario(UsuarioId id, Empresa empresa, String apePaterno,
			String apeMaterno, String nombre, String nroDocId, String codSexo,
			String direccion, String celular, String telefono,
			Set<OfertaVenta> ofertaVentas) {
		this.id = id;
		this.empresa = empresa;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.nombre = nombre;
		this.nroDocId = nroDocId;
		this.codSexo = codSexo;
		this.direccion = direccion;
		this.celular = celular;
		this.telefono = telefono;
		this.ofertaVentas = ofertaVentas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "CEmpresa", column = @Column(name = "C_EMPRESA", nullable = false)),
			@AttributeOverride(name = "email", column = @Column(name = "EMAIL", nullable = false, length = 40)) })
	public UsuarioId getId() {
		return this.id;
	}

	public void setId(UsuarioId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C_EMPRESA", nullable = false, insertable = false, updatable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Column(name = "APE_PATERNO", nullable = false, length = 20)
	public String getApePaterno() {
		return this.apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	@Column(name = "APE_MATERNO", nullable = false, length = 20)
	public String getApeMaterno() {
		return this.apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	@Column(name = "NOMBRE", nullable = false, length = 40)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "NRO_DOC_ID", nullable = false, length = 20)
	public String getNroDocId() {
		return this.nroDocId;
	}

	public void setNroDocId(String nroDocId) {
		this.nroDocId = nroDocId;
	}

	@Column(name = "COD_SEXO", nullable = false, length = 1)
	public String getCodSexo() {
		return this.codSexo;
	}

	public void setCodSexo(String codSexo) {
		this.codSexo = codSexo;
	}

	@Column(name = "DIRECCION", nullable = false, length = 100)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "CELULAR", nullable = false, length = 30)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "TELEFONO", nullable = false, length = 30)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<OfertaVenta> getOfertaVentas() {
		return this.ofertaVentas;
	}

	public void setOfertaVentas(Set<OfertaVenta> ofertaVentas) {
		this.ofertaVentas = ofertaVentas;
	}

}
