class TestCerchio {
    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio(5.0);
	Cilindro cilindro = new Cilindro("nome", 5,9);
        double area = cerchio.area();
        double circonferenza = cerchio.circonferenza();
	double areacilindro=cilindro.areacilindro();
	double volumecilindro=cilindro.volumecilindro();
	    
        System.out.println("Area del cerchio: " + area);
        System.out.println("Circonferenza del cerchio: " + circonferenza);
	System.out.println("area del cilindro: " + areacilindro);
	System.out.println("volume del cilindro: " + volumecilindro);
    }
}