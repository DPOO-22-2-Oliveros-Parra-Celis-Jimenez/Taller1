package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class Modificacion {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		System.out.println("Hola, mundo!!!! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ✧ﾟ･: *ヽ(◕ヮ◕ヽ)");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println("La lista de arriba es inheretne a la funcion: cargarArchivo.");
		Map<String, Integer> mapPais = calc.paisConMasMedallistas();
		Set<String> SetPais = mapPais.keySet();
		String nombrePais = SetPais.iterator().next();
		System.out.println("\nEl país con más medallas es "+ nombrePais + " con un total de " + mapPais.get(nombrePais)+".");
	}
}
