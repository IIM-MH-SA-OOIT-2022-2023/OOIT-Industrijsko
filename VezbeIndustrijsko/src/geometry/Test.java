package geometry;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Point p1 = new Point();
		//Point p2 = new Point();
		
		//p1.y = 50;
		//p1.selected = true;
		
		//System.out.println(p1.y);
		//System.out.println(p1.selected);
		
		//System.out.println(p2.x);
		
		//p2 = p1;
		//p1.x = 12;
		
		//System.out.println(p2.x);
		
		/*System.out.println(p1.getX());
		p1.setX(15);
		System.out.println(p1.getX());*/
		
		//VEZBE 4
		/*p1.setX(5);
		p1.setY(5);
		p2.setX(1);
		p2.setY(2);
		
		System.out.println(p1.distance(p2.getX(), p2.getY()));
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1);
		System.out.println(l1.getEndPoint());
		System.out.println(l1.getEndPoint().getX());*/
		
								//Vezbe 5
		/*Point p1 = new Point(15,10,true);
		System.out.println(p1.getX());
		
		Line l1 = new Line(p1, new Point(5,5),false);
		Rectangle r1 = new Rectangle(new Point(50,50),20,20,true);
		
		
		
		//Podesiti x koordinatu gornje leve tacke pravougaonika na zbir vrednosti x koordinate pocetne
		// tacke linije l1 i y koordinate tacke p1
		
		r1.getUpperLeft().setX(l1.getStartPoint().getX() + p1.getY());
		System.out.println(p1);*/
		
		
									//VEZBE 6
		/*Point p1 = new Point(5,4);
		Point p2 = new Point(5,4);
		System.out.println(p1.equals(p2));
		
		Line l1 = new Line(p1,p2);
		System.out.println(l1.equals(l1));
		Rectangle r1 = new Rectangle(p1,15,15);
		System.out.println(r1.equals(r1));
		Circle c1 = new Circle(p2,15);
		System.out.println(c1.equals(c1));*/
		
									//VEZBE 8
		
		/*Circle c1 = new Circle(new Point(5,5),50);
		Circle c2 = new Circle(new Point(10,10),40);
		Circle c3 = new Circle(new Point(25,5),30);
		Circle c4 = new Circle(new Point(1,1),100);
		
		Circle[] krugovi = {c1,c2,c3,c4};
		System.out.println("Trenutni raspored u nizu:");
		for(Circle c: krugovi) {
			System.out.println(c.toString());
		}
		
		System.out.println("Uredjen raspored u nizu:");
		Arrays.sort(krugovi);
		for(Circle c: krugovi) {
			System.out.println(c.toString());
		}*/
			
								//VEZBE 10
		
		/*Scanner scanner = new Scanner(System.in);
		try {
			int mojBroj = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Vas unos nije dobar, unesite broj");
		}
		finally{
			System.out.println("Ovaj deo koda se uvek izvrsava");
		}*/
		
		Circle c1 = new Circle();
		
		try {
			c1.setRadius(-5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
