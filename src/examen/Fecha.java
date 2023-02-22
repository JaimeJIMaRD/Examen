package examen;

public class Fecha {
	public static boolean validarFecha(int mes, int anio, int dia) {
		boolean fechaValida = extracted();
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}

	public static boolean extracted() {
		boolean fechaValida = false;
		return fechaValida;
	}
}