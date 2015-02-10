package open4job.web.vo;

public class AparcamientosAccesosVO {

	private double latitud;
	private double longitud;
	private String titulo;
	private String icono;
	private String tipo;
	private int id;

	public AparcamientosAccesosVO() {
	}

	public AparcamientosAccesosVO(int _id, double _latitud, double _longitud,
			String _titulo, String _icono, String _tipo) {
		this.id = _id;
		this.latitud = _latitud;
		this.longitud = _longitud;
		this.titulo = _titulo;
		this.icono = _icono;
		this.tipo = _tipo;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return ("AparcamientosAccesosVO = [" + "id = " + id + ", latitud = "
				+ latitud + ", longitud = " + longitud + ", titulo = " + titulo
				+ ", icono = " + icono + ", tipo = " + tipo + "]");
	}

}
