package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	GregorianCalendar datum;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.isEmpty())
			throw new RuntimeException("Naziv valute nije dobro unet");
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.isEmpty())
			throw new RuntimeException("Skraceni naziv valute nije dobro unet");
		this.skraceniNaziv = skraceniNaziv;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new RuntimeException("Prodajni kurs nije dobro unet");
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new RuntimeException("Srednji kurs nije dobro unet");
		this.srednjiKurs = srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new RuntimeException("Kupovni kurs nije dobro unet");
		this.kupovniKurs = kupovniKurs;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Datum nije dobro unet");
		this.datum = datum;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", prodajniKurs=" + prodajniKurs
				+ ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs + ", datum=" + datum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Valuta))
			return false;
		Valuta v = (Valuta) obj;
		if (!naziv.equals(v.getNaziv())) {
			return false;
		}
		return true;
	}

}
