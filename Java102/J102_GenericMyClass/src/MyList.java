public class MyList<T> {
    
    // MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
    // MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
    // size() : dizideki eleman sayısını verir.
    // getCapacity() : dizinin kapasite değerini verir.
    // add(T data) : Sınıfa ait diziye eleman ekleme. Eğer dizi de yer yok ise dizi boyutu 2 katına çıkartılmalıdır.
    
    // get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
    // remove(int index): verilen indisteki veriyi silmeli ve sonrasında ki verileri sola doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
    // set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
    // String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
    
    // int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
    // int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
    // boolean isEmpty() : Listenin boş olup olmadığını söyler.
    // T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.
    // clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.
    // MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
    // boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
    
    
    private int capacity = 10;
    private T[] array;
    private int numOfElement = 0;
    
    public MyList() {
        this.array = (T[]) new Object[capacity];
    }
    
    public MyList(int capacity) {
        this.capacity = capacity;
    }
    
    public int size() {
        return numOfElement;
    }
    
    public void add(T data) {
        if (this.numOfElement == this.capacity) {
            T[] newArr = (T[]) new Object[this.capacity * 2];
            for (int i = 0; i < this.capacity; i++) {
                newArr[i] = this.array[i];
            }
            this.capacity = this.capacity * 2;
            this.array = newArr;
        }
        this.array[numOfElement] = data;
        numOfElement++;
    }
    
    public T get(int index) {
        return this.array[index];
    }
    
    public void set(int index, T data) {
        this.array[index] = data;
    }
    
    public void remove(int index) {
        for (int i = index; i < this.capacity-1; i++) {
            this.array[i] = this.array[i+1];
        }
        this.numOfElement--;
    }
    
    public String toStringList() {
        String str = "";
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] != null) {
                str += this.array[i] + ",";
                /*if (this.array[i+1] == null) {
                    str += this.array[i];
                }else {
                    str += this.array[i] + ", ";
                }*/
            }
        }
        return "[" + str + "]";
    }
    
    public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] == data) {
                index = i;
                break;
            }else {
                index = -1;
            }
        }
        return index;
    }
    
    public int lastIndexOf(T data) {
        int index = -1;
        for (int i = this.capacity-1; i > 0; i--) {
            if (this.array[i] == data) {
                index = i;
            }
        }
        return index;
    }
    
    public boolean isEmpty() {
        boolean isIn = true;
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] != null) {
                isIn = false;
                break;
            }
        }
        return isIn;
    }
    
    public T[] toArray() {
        T[] arr = (T[]) new Object[this.capacity];
        for (int i = 0; i < 10; i++) {
            arr[i] = this.array[i];
        }
        //this.array = arr;
        //return this.array;
        return arr;
    }
    
    public void clear() {
        for (int i = 0; i < 10; i++) {
            this.array[i] = null;
        }
    }
    
    public MyList<T> subList(int start, int finish) {

    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
