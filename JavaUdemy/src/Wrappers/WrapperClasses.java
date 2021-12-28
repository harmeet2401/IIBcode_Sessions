package Wrappers;

public class WrapperClasses {
    public static void main(String[] args) {
        byte by = 19;
        Byte b = new Byte(by);
        Integer c = new Integer(19);
        Float d = new Float(192.00);
        Double e = new Double(17677d);
        Character f = new Character('a');
        Long g = new Long(988199l);

        System.out.println("Byte wrappr objects ::"+ b.getClass() + " " + b.shortValue() );
        System.out.println("Integer wrappr objects ::"+ c.getClass() + " " + c.shortValue() );
        System.out.println("Float wrappr objects ::"+ d.getClass() + " " + d.shortValue() );
        System.out.println("Double wrappr objects ::"+ e.getClass() + " " + e.shortValue() );
        System.out.println("Character wrappr objects ::"+ f.getClass() + " " + f );
        System.out.println("Long wrappr objects ::"+ g.getClass() + " " + g.shortValue() );
    }
}
