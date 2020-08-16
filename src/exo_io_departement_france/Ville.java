package exo_io_departement_france;

public class Ville {
	
	private String id;
	
	private String departement;
	private String slug;
	private String nom;
	private String nomSimple;
	private String nomReel;
	private String nomSoundex;
	private String nomMetaphone;
	private String codePostal;
	private String numeroDeCommune;
	private String codeCommune;
	private String arrondissement;
	private String canton;
	private String population2010;
	private String population1999;
	private String population2012;
	private String densite2010;
	
	private String surfaceSuperficie;
	private String longitudeLatitudeDegre;
	private String longitudeLatitudeGRD;
	private String longitudeLatitudeDMS;
	private String altitudeMinimaleMaximale;
	private String supp1;
	private String supp2;
	private String supp3;
	private String supp4;
	private String supp5;
	
	
	
	
	public Ville() {}
	
	public Ville(String id, String departement, String slug, String nom, String nomSimple, String nomReel,
			String nomSoundex, String nomMetaphone, String codePostal, String numeroDeCommune, String codeCommune,
			String arrondissement, String canton, String population2010, String population1999, String population2012,
			String densite2010, String surfaceSuperficie, String longitudeLatitudeDegre, String longitudeLatitudeGRD,
			String longitudeLatitudeDMS, String altitudeMinimaleMaximale, String supp1, String supp2, String supp3,
			String supp4, String supp5) {
		this.id = id;
		this.departement = departement;
		this.slug = slug;
		this.nom = nom;
		this.nomSimple = nomSimple;
		this.nomReel = nomReel;
		this.nomSoundex = nomSoundex;
		this.nomMetaphone = nomMetaphone;
		this.codePostal = codePostal;
		this.numeroDeCommune = numeroDeCommune;
		this.codeCommune = codeCommune;
		this.arrondissement = arrondissement;
		this.canton = canton;
		this.population2010 = population2010;
		this.population1999 = population1999;
		this.population2012 = population2012;
		this.densite2010 = densite2010;
		this.surfaceSuperficie = surfaceSuperficie;
		this.longitudeLatitudeDegre = longitudeLatitudeDegre;
		this.longitudeLatitudeGRD = longitudeLatitudeGRD;
		this.longitudeLatitudeDMS = longitudeLatitudeDMS;
		this.altitudeMinimaleMaximale = altitudeMinimaleMaximale;
		this.supp1 = supp1;
		this.supp2 = supp2;
		this.supp3 = supp3;
		this.supp4 = supp4;
		this.supp5 = supp5;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNomSimple() {
		return nomSimple;
	}
	public void setNomSimple(String nomSimple) {
		this.nomSimple = nomSimple;
	}
	public String getNomReel() {
		return nomReel;
	}
	public void setNomReel(String nomReel) {
		this.nomReel = nomReel;
	}
	public String getNomSoundex() {
		return nomSoundex;
	}
	public void setNomSoundex(String nomSoundex) {
		this.nomSoundex = nomSoundex;
	}
	public String getNomMetaphone() {
		return nomMetaphone;
	}
	public void setNomMetaphone(String nomMetaphone) {
		this.nomMetaphone = nomMetaphone;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getNumeroDeCommune() {
		return numeroDeCommune;
	}
	public void setNumeroDeCommune(String numeroDeCommune) {
		this.numeroDeCommune = numeroDeCommune;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	public String getArrondissement() {
		return arrondissement;
	}
	public void setArrondissement(String arrondissement) {
		this.arrondissement = arrondissement;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getPopulation2010() {
		return population2010;
	}
	public void setPopulation2010(String population2010) {
		this.population2010 = population2010;
	}
	public String getPopulation1999() {
		return population1999;
	}
	public void setPopulation1999(String population1999) {
		this.population1999 = population1999;
	}
	public String getPopulation2012() {
		return population2012;
	}
	public void setPopulation2012(String population2012) {
		this.population2012 = population2012;
	}
	public String getDensite2010() {
		return densite2010;
	}
	public void setDensite2010(String densite2010) {
		this.densite2010 = densite2010;
	}
	public String getSurfaceSuperficie() {
		return surfaceSuperficie;
	}
	public void setSurfaceSuperficie(String surfaceSuperficie) {
		this.surfaceSuperficie = surfaceSuperficie;
	}
	public String getLongitudeLatitudeDegre() {
		return longitudeLatitudeDegre;
	}
	public void setLongitudeLatitudeDegre(String longitudeLatitudeDegre) {
		this.longitudeLatitudeDegre = longitudeLatitudeDegre;
	}
	public String getLongitudeLatitudeGRD() {
		return longitudeLatitudeGRD;
	}
	public void setLongitudeLatitudeGRD(String longitudeLatitudeGRD) {
		this.longitudeLatitudeGRD = longitudeLatitudeGRD;
	}
	public String getLongitudeLatitudeDMS() {
		return longitudeLatitudeDMS;
	}
	public void setLongitudeLatitudeDMS(String longitudeLatitudeDMS) {
		this.longitudeLatitudeDMS = longitudeLatitudeDMS;
	}
	public String getAltitudeMinimaleMaximale() {
		return altitudeMinimaleMaximale;
	}
	public void setAltitudeMinimaleMaximale(String altitudeMinimaleMaximale) {
		this.altitudeMinimaleMaximale = altitudeMinimaleMaximale;
	}
	public String getSupp1() {
		return supp1;
	}
	public void setSupp1(String supp1) {
		this.supp1 = supp1;
	}
	public String getSupp2() {
		return supp2;
	}
	public void setSupp2(String supp2) {
		this.supp2 = supp2;
	}
	public String getSupp3() {
		return supp3;
	}
	public void setSupp3(String supp3) {
		this.supp3 = supp3;
	}
	public String getSupp4() {
		return supp4;
	}
	public void setSupp4(String supp4) {
		this.supp4 = supp4;
	}
	public String getSupp5() {
		return supp5;
	}
	public void setSupp5(String supp5) {
		this.supp5 = supp5;
	}

	@Override
	public String toString() {
		return id + "," + departement + "," + slug + "," + nom + ","
				+ nomSimple + "," + nomReel + "," + nomSoundex + "," + nomMetaphone
				+ "," + codePostal + "," + numeroDeCommune + "," + codeCommune
				+ "," + arrondissement + "," + canton + "," + population2010
				+ "," + population1999 + "," + population2012 + ","
				+ densite2010 + "," + surfaceSuperficie + ","
				+ longitudeLatitudeDegre + "," + longitudeLatitudeGRD + ","
				+ longitudeLatitudeDMS + "," + altitudeMinimaleMaximale + "," + supp1
				+ "," + supp2 + "," + supp3 + "," + supp4 + "," + supp5;
	}

	
	
	
	/*
	 * dep_59.csv
	 * dep_83.csv
	 */
	
}
