package com.company.Spring.ducktype;

public class Main {
    public static void main(String[] args) {
        Duck duck=new Duck();
        Frog frog=new Frog();
        System.out.println(frog);
        System.out.println(duck);
        IQuackable[] quakers = new IQuackable[] {
                DuckHandler.Cast(IQuackable.class, duck),
                DuckHandler.Cast(IQuackable.class, frog)
        };
        for(IQuackable q : quakers) {
            q.quack();
        }
        for (Object q :quakers)
        {
            System.out.println(DuckHandler.UnCast(Object.class, q));
        }

    }
}
