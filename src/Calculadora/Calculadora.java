package Calculadora;

/*- [ ]  Divis�o
- [ ]  Pot�ncia
- [ ]  Raiz Quadrada
- [ ]  Resto da divis�o
 */
public class Calculadora {
	public float somar(float num1, float num2) {
		return num1 + num2;
	}

	public float subtrair(float num1, float num2) {
		return num1 - num2;
	}

	public float multiplicar(float num1, float num2) {
		return num1 * num2;
	}

	public float dividir(float divisor, float dividendo) {
		return divisor / dividendo;
	}
	
	public float potencia(float base, float expoente) {
		return (float) Math.pow(base, expoente);
	}

	public float raizQuadrada(float num) {
		return (float) Math.sqrt(num);
	}
}
