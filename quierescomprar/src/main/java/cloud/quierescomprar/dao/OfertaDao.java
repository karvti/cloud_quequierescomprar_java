package cloud.quierescomprar.dao;

import java.util.List;

import cloud.quierescomprar.model.Oferta;
import cloud.quierescomprar.model.OfertaVenta;




public interface OfertaDao {
	
	
	
	public List<Oferta> listaOfertas();
	public int registroOfertaVenta(OfertaVenta objOfertaVenta);
	public List<Oferta> listaOfertasTotal();

	
// Codigo Kid Rivera
	
	public List<Oferta> listaOfertasPorVencer(int dias);
	//public List<OfertaVenta> ListaOfertasMasVendidas();
	
}
