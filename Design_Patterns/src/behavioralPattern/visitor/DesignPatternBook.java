package behavioralPattern.visitor;

public class DesignPatternBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://github.com/vuchiencong";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}
