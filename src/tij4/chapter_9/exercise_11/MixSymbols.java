package tij4.chapter_9.exercise_11;

interface Processor {
    String name();

    Object process(Object obj);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using: " + p.name());
        System.out.println(p.process(s));
    }
}

class MixSymbols extends StringProcessor {

    public String mix(String s) {
        return "Mixing " + s;
    }

    @Override
    public String process(Object object) {
        return "MixSymbols.process())";
    }
}

abstract class StringProcessor implements Processor {
    String s = "jj;j;j;j;";

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object object);

    public static void main(String[] args) {
       // Apply.process(new MixSymbols(), s);
    }
}
