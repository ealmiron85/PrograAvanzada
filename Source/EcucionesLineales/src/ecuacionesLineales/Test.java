package ecuacionesLineales;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VectorMath v1 = new VectorMath(4);
		VectorMath v2 = new VectorMath(4);
		VectorMath v3 = new VectorMath(4);
		float[] componentes1 = {1,1,1,1};
		float[] componentes2 = {2,-20,2,2};
		float[] componentes3 = {2,5,8,4};
		v1.setComponentes(componentes1);
		v2.setComponentes(componentes2);
		v3.setComponentes(componentes3);
//		System.out.println(v1.equals(v2));
//		System.out.println(v1.equals(v3));
//		MatrizMath mat1 = new MatrizMath("matriz.in");
//		MatrizMath mat2 = new MatrizMath("matriz2.in");
		MatrizMath mat4 = new MatrizMath("matriz.in");
		//System.out.println(mat1.toString());
		System.out.println(mat4.toString());
		System.out.println("**************");
		float matriz[][]=mat4.getComponentes();
		mat4.tratarDiagonalPrincipal(matriz);
		
		String resultado="";
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				resultado += matriz[i][j]+" ";
			}
			resultado += "\n";
		}
		System.out.println(resultado);
		
		
		
	}

}
