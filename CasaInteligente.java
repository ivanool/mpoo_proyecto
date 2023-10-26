package proyectocasainte;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CasaInteligente {

	public static void main(String[] args) {
		ArrayList<Habitaciones> listaCuartos = new ArrayList<>();
		ArrayList<DispositivosInteligentes> listaDispTot = new ArrayList<>();
		int n;

		do {
			n = mostrarMenuPrincipal();
			switch (n) {
				case 1:
					ingresarCuartos(listaCuartos);
					break;
				case 2:
					ingresarDispositivos(listaCuartos, listaDispTot);
					break;
				case 3:
					encenderDispositivo(listaDispTot);
					break;
				case 4:
					apagarDispositivo(listaDispTot);
					break;
				case 5:
					mostrarDispositivosEnHabitaciones(listaCuartos);
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Saliendo del programa. Hasta luego.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
			}

		} while (n != 6);
	}

	public static int mostrarMenuPrincipal() {
		String[] MenuPpal = {"1. Ingresar cuarto", "2. Ingresar dispositivos a conectar", "3. Encender dispositivos", "4. Apagar dispositivos", "5. Mostrar dispositivos en habitaciones", "6. Salir"};
		return JOptionPane.showOptionDialog(
				null, "Seleccione lo que guste realizar: ", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, MenuPpal, MenuPpal[0]) + 1;
	}
	public static void mostrarDispositivosEnHabitaciones(ArrayList<Habitaciones> listaCuartos) {
		if (listaCuartos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay cuartos registrados para mostrar dispositivos.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
			return;
		}
		StringBuilder mensaje = new StringBuilder("Dispositivos en cada habitación:\n");
		for (Habitaciones cuarto : listaCuartos) {
			mensaje.append(cuarto.getNombre()).append(":\n");
			DispositivosInteligentes[] dispositivos = cuarto.getDispositivosInteligentes();
			for (DispositivosInteligentes dispositivo : dispositivos) {
				if (dispositivo != null) {
					mensaje.append("Nombre: ").append(dispositivo.getNombre()).append(", Estado: ");
					mensaje.append(dispositivo.obtenerEstado() ? "Encendido" : "Apagado").append(", ");
					if (dispositivo instanceof TermostatoInte) {
						mensaje.append("Temperatura: ").append(((TermostatoInte) dispositivo).getTemperatura()).append("°C, ");
					}
					mensaje.append("\n");
				}
			}
			mensaje.append("\n");
		}
		JOptionPane.showMessageDialog(null, mensaje.toString(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void ingresarCuartos(ArrayList<Habitaciones> listaCuartos) {
		String[] TipoCuarto = {"Sala de estar", "Cocina", "Dormitorio"};
		String nombreCuarto = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del cuarto: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);
		int tipoCuarto = mostrarMenuTipoCuarto(TipoCuarto);
		if (tipoCuarto >= 0) {
			int maxDispositivos = verNumero("Ingrese la cantidad máxima de dispositivos inteligentes para esta habitación: ");
			ingresarCuarto(listaCuartos, tipoCuarto, nombreCuarto, maxDispositivos);
		}
	}

	public static int mostrarMenuTipoCuarto(String[] tipos) {
		String message = "¿Qué tipo de cuarto es? Seleccione una opción:";
		String title = "Casa Inteligente";
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
	}

	public static void ingresarCuarto(ArrayList<Habitaciones> listaCuartos, int tipoCuarto, String nombreCuarto, int maxDispositivos) {
		Habitaciones cuarto = null;
		switch (tipoCuarto) {
			case 0:
				cuarto = new Saladeestar(nombreCuarto, maxDispositivos);
				break;
			case 1:
				cuarto = new Cocina(nombreCuarto, maxDispositivos);
				break;
			case 2:
				cuarto = new Dormitorio(nombreCuarto, maxDispositivos);
				break;
		}
		if (cuarto != null) {
			listaCuartos.add(cuarto);
			JOptionPane.showMessageDialog(null, "El cuarto " + cuarto.getNombre() + " se ha registrado con éxito.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void ingresarDispositivos(ArrayList<Habitaciones> listaCuartos, ArrayList<DispositivosInteligentes> listaDispTot) {
		if (listaCuartos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "ERROR: Registre primero un cuarto para poder hacer esta acción.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String[] subclases = {"Aire Acondicionado", "Cafetera", "Horno", "Luces Inteligentes", "Termostato Inteligente", "Seguridad Inteligente"};
		int seleccionSubclase = JOptionPane.showOptionDialog(null, "Seleccione la subclase de dispositivo inteligente:", "Casa Inteligente", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, subclases, subclases[0]);
		if (seleccionSubclase >= 0) {
			String subclaseSeleccionada = subclases[seleccionSubclase];
			DispositivosInteligentes dispositivo = null;
			int idDispositivo = verNumero("Ingrese el ID del dispositivo o presione 0 para asignar automáticamente: ");
			String nombreDispositivo = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del dispositivo: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);
			String[] habitacionesDisponibles = new String[listaCuartos.size()];
			for (int i = 0; i < listaCuartos.size(); i++) {
				habitacionesDisponibles[i] = listaCuartos.get(i).getNombre();
			}
			String habitacionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione la habitación a la que desea asignar el dispositivo:", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE, null, habitacionesDisponibles, habitacionesDisponibles[0]);
			if (habitacionElegida != null) {
				for (Habitaciones cuarto : listaCuartos) {
					if (cuarto.getNombre().equals(habitacionElegida)) {
						if (subclaseSeleccionada.equals("Termostato Inteligente")) {
							int temperatura = verNumero("Ingrese la temperatura deseada: ");
							dispositivo = new TermostatoInte(idDispositivo, nombreDispositivo, false, temperatura);
						} else {
							dispositivo = new DispositivosInteligentes(idDispositivo, nombreDispositivo, false);
						}
						if (dispositivo != null) {
							cuarto.addDispositivosInteligentes(dispositivo);
							listaDispTot.add(dispositivo);
							if (dispositivo instanceof TermostatoInte) {
								JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo.getNombre() + " se ha registrado con éxito en la habitación " + cuarto.getNombre() + " con temperatura establecida en " + ((TermostatoInte) dispositivo).getTemperatura() + "°C.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo.getNombre() + " se ha registrado con éxito en la habitación " + cuarto.getNombre(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
				}
			}
		}
	}

public static void encenderDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
	if (listaDispTot.isEmpty()) {
		JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para encender.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
		return;
	}

	int idDispositivo = verNumero("Ingrese el ID del dispositivo a encender: ");

	for (DispositivosInteligentes dispositivo : listaDispTot) {
		if (dispositivo.getId() == idDispositivo) {
			dispositivo.encender();
			if (dispositivo instanceof TermostatoInte) {
				int nuevaTemperatura = verNumero("Ingrese la nueva temperatura deseada: ");
				((TermostatoInte) dispositivo).setTemperatura(nuevaTemperatura);
				JOptionPane.showMessageDialog(null, "El dispositivo ha sido encendido y la temperatura se ha establecido en " + nuevaTemperatura + "°C.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "El dispositivo ha sido encendido.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
			}
			return;
		}
	}
	JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
}

	public static void apagarDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
		if (listaDispTot.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para apagar.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
			return;
		}
		int idDispositivo = verNumero("Ingrese el ID del dispositivo a apagar: ");
		for (DispositivosInteligentes dispositivo : listaDispTot) {
			if (dispositivo.getId() == idDispositivo) {
				dispositivo.apagar();
				JOptionPane.showMessageDialog(null, "El dispositivo ha sido apagado.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
	}

	public static int verNumero(String mensaje) {
		int numero = 0;
		boolean esNumeroValido = false;
		do {
			String input = JOptionPane.showInputDialog(null, mensaje, "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);

			try {
				numero = Integer.parseInt(input);
				esNumeroValido = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
			}

		} while (!esNumeroValido);
		return numero;
	}
}