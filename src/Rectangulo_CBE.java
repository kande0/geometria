/**
 * Esta clase representa un objeto Rectángulo.
 * @autor Carlos Blasco Espada 
 * @versión 1.2
 */
public class Rectangulo_CBE extends FiguraGeometrica_CBE {
	private double l1;
	private double l2;
	
        /**
         * Constructor de la clase Rectangulo.
         * 
         * @param tipoFigura El tipo de figura que se está creando.
	 * @param lG Longitud del lado grande.
	 * @param lP Longitud del lado pequeño.
        */
	public Rectangulo_CBE(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
        
        /**
	 * Calcula el área del rectángulo.
	 * @return El área del rectángulo.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
        /**
	 * Calcula el perímetro del rectángulo.
	 * @return El perímetro del rectángulo.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
