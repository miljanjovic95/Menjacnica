package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta v) {
		valute.addLast(v);
	}

	@Override
	public void obrisiKurs(Valuta v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
