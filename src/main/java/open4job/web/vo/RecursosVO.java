package open4job.web.vo;

public class RecursosVO {

	private double latitud;
	private double longitud;
	private String servicios;
	private String horario;
	private String titulo;
	private String descripcion;
	private String gradoacc;
	private int id;
	private String tipo;
	private String relacionado;
	private String clasificación;
	private String precio;
	private String email;
	private String url;
	private String accesibilidad;
	private String poblacion;
	private String telefono;

	public RecursosVO() {
	}

	public RecursosVO(int _id, double _latitud, double _longitud,
			String _servicios, String _horario, String _titulo,
			String _descripcion, String _gradoacc, String _tipo,
			String _relacionado, String _clasificación, String _precio,
			String _email, String _url, String _accesibilidad,
			String _poblacion, String _telefono) {
		this.id = _id;
		this.latitud = _latitud;
		this.longitud = _longitud;
		this.servicios = _servicios;
		this.horario = _horario;
		this.titulo = _titulo;
		this.descripcion = _descripcion;
		this.gradoacc = _gradoacc;
		this.tipo = _tipo;
		this.relacionado = _relacionado;
		this.clasificación = _clasificación;
		this.precio = _precio;
		this.email = _email;
		this.url = _url;
		this.accesibilidad = _accesibilidad;
		this.poblacion = _poblacion;
		this.telefono = _telefono;
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

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGradoacc() {
		return gradoacc;
	}

	public void setGradoacc(String gradoacc) {
		this.gradoacc = gradoacc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRelacionado() {
		return relacionado;
	}

	public void setRelacionado(String relacionado) {
		this.relacionado = relacionado;
	}

	public String getClasificación() {
		return clasificación;
	}

	public void setClasificación(String clasificación) {
		this.clasificación = clasificación;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(String accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return ("RecursosVO = [" + "id = " + id + ", latitud = " + latitud
				+ ", longitud = " + longitud + ", servicios = " + servicios
				+ ", horario = " + horario + ", titulo = " + titulo
				+ ", descripcion = " + descripcion + ", gradoacc = " + gradoacc
				+ ", tipo = " + tipo + ", relacionado = " + relacionado
				+ ", clasificación = " + clasificación + ", precio = " + precio
				+ ", email = " + email + ", url = " + url
				+ ", accesibilidad = " + accesibilidad + ", poblacion = "
				+ poblacion + ", telefono = " + telefono + "]");
	}
}
