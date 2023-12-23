package ex0;

import ex0.Ex.SomeBean;

public class Main {
    public static void main(String[] args) {
        ((SomeBean) (Injector.inject(new SomeBean()))).foo();
    }
}
