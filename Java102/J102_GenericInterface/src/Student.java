public class Student<T> implements IDatabase<T>{

    @Override
    public void insert(T data) {
        System.out.println(data + " is added.");
        
    }

    @Override
    public boolean delete(T data) {
        if (data == null) {
            return false;
        }else {
            return true;
        }
        
    }

    @Override
    public T updated(T data) {
        return data;
    }

    @Override
    public String select(T[] data) {
        String str = "";
        for (T t : data) {
            str += t + " ";
        }
        return str;
    }
    
}
