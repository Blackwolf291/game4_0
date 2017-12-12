package nl.shadeblackwolf.denversgame.testHelpers;

import java.util.function.Predicate;

public interface PredicateHelp {
    static <T> Predicate<T> not(Predicate<T> p){
        return p.negate();
    }
}
