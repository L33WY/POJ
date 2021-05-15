package laby10.zad4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {


    static <T> List unique(List <T> list) {
        Set <T> setList = new HashSet<>(list);
        return (List) setList;
    }
}
