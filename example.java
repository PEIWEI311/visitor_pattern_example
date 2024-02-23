// Visitor interface
interface SportsVisitor {
    void visit(Football football);
    void visit(Basketball basketball);
    void visit(Tennis tennis);
}

// Concrete visitor
class SportsEquipmentChecker implements SportsVisitor {
    @Override
    public void visit(Football football) {
        System.out.println("Checking football equipment...");
        // Logic to check football equipment
    }

    @Override
    public void visit(Basketball basketball) {
        System.out.println("Checking basketball equipment...");
        // Logic to check basketball equipment
    }

    @Override
    public void visit(Tennis tennis) {
        System.out.println("Checking tennis equipment...");
        // Logic to check tennis equipment
    }
}

// Element interface
interface Sports {
    void accept(SportsVisitor visitor);
}

// Concrete elements
class Football implements Sports {
    @Override
    public void accept(SportsVisitor visitor) {
        visitor.visit(this);
    }
}

class Basketball implements Sports {
    @Override
    public void accept(SportsVisitor visitor) {
        visitor.visit(this);
    }
}

class Tennis implements Sports {
    @Override
    public void accept(SportsVisitor visitor) {
        visitor.visit(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Sports[] sports = { new Football(), new Basketball(), new Tennis() };

        SportsVisitor equipmentChecker = new SportsEquipmentChecker();

        for (Sports sport : sports) {
            sport.accept(equipmentChecker);
        }
    }
}
