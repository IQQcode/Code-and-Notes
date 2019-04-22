import java.util.Scanner;

abstract class Coffeeproduce {

    public final void prepareRecipe() {
        boilerwater();
        brew();
        pourInCup();
        if (customerswantCondiments()) {
            addCondiments();
        }
    }


    public abstract void brew();
    public abstract void addCondiments();


    public final void boilerwater() {
        System.out.println("Boiling water");
    }

    public final void pourInCup() {
        System.out.println("Pouer drinking into cups");
    }

/**
     * 钩子方法，子类可以选择性的覆写此方法
     * @return true
     */

    public boolean customerswantCondiments() {
        return true;
    }
}


class Coffee extends Coffeeproduce {
    public void brew() {
        System.out.println("Dripping Coffee through filteer");
    }

    public void addCondiments() {
        System.out.println("Adding suger and milk!");
    }

    public boolean customerwantsCondiments() {
        System.out.println("Do you want to add Suger or milk in your coffee?");
        //System.out.println("Y / N");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equals("Y")) {
            return true;
        }else {
           return false;
        }
    }
}


class Tea extends Coffeeproduce {
    public void brew() {
        System.out.println("Making tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}


public class MethodChange {
    public static void main(String[] args) {
        Coffeeproduce coffee = new Coffee();
        Coffeeproduce tea = new Tea();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        //System.out.println("\nMaking tea...");
        //tea.prepareRecipe();
    }
}
