class TestCerchio {
    public static void main(String[] args) {
	
	double area=0,circonferenza=0;
       
	Cerchio c = new Cerchio(5.0);
	area = c.calcolaArea();
        circonferenza = c.calcolaCirconferenza();

        System.out.println("Area del cerchio: " + area);
        System.out.println("Circonferenza del cerchio: " + circonferenza);
    }
}