public interface IDatabase<T> {
    
    public void insert(T data);
    
    public boolean delete(T data);
    
    public T updated(T data);
    
    public String select(T[] data);
    
}
