
package chapter10_assignment;


public class PieceWorker extends Employee{
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return "PieceWorker: " + super.toString();
    }

}
