
public class Circulo_CBE extends FiguraGeometrica_CBE {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_CBE(double r, String tipoFigura) {
		super(tipoFigura);
		if (r < 0) {
                    radio = Math.abs(r);
                } else {
                radio = r;
                }
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
