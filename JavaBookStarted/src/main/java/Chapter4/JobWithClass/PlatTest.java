package Chapter4.JobWithClass;

public class PlatTest {
    public static void main(String[] args) {
        PlatVed[] staff = new PlatVed[3];

        staff[0] = new PlatVed("Carl Craker", 740, 1996, 10, 11);
        staff[1] = new PlatVed("Kotik Mya", 730, 1998, 11, 23);
        staff[2] = new PlatVed("Myr Ko", 22, 1995, 3,2);

        for (PlatVed e : staff) e.raiseSalary(5);

        for (PlatVed e: staff) System.out.println("name="+ e.getName()+" ,salary="+e.getSalary()+" ,hireDay="+26+e.getHireDay());
    }
}
