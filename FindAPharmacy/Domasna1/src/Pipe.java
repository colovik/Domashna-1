import java.util.List;
import java.util.ArrayList;


public class Pipe<T> {

    List<Filter<T>> filters = new ArrayList<>();
    public void addFilter (Filter<T> filter){
        filters.add(filter);
    }
    public T runFilter(T input){
        for (Filter<T> filter : filters){
            input = filter.execute(input);
        }
        return input;
    }
}
