package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta v) {
		valute.add(v);
	}

	@Override
	public void obrisiKurs(Valuta v) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().get(GregorianCalendar.DAY_OF_MONTH) == v.getDatum()
					.get(GregorianCalendar.DAY_OF_MONTH)
					&& valute.get(i).getDatum().get(GregorianCalendar.MONTH) == v.getDatum()
							.get(GregorianCalendar.MONTH)
					&& valute.get(i).getDatum().get(GregorianCalendar.YEAR) == v.getDatum()
							.get(GregorianCalendar.YEAR)) {
				valute.remove(valute.get(i));
				return;
			}
		}
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getDatum().get(GregorianCalendar.DAY_OF_MONTH) == datum
					.get(GregorianCalendar.DAY_OF_MONTH)
					&& valute.get(i).getDatum().get(GregorianCalendar.MONTH) == datum.get(GregorianCalendar.MONTH)
					&& valute.get(i).getDatum().get(GregorianCalendar.YEAR) == datum.get(GregorianCalendar.YEAR)) {
				return valute.get(i);
			}
		}
		return null;
	}

}
