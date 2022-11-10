public class TestHomeWork1 {
    public static void main(String[] args) {
        HomeWork1 tallycounter=new HomeWork1(4);
        tallycounter.click();
        tallycounter.click();
        tallycounter.click();
        System.out.println(tallycounter.getCount());
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        System.out.println(tallycounter.getCount());


    }
}
