class DynamicArr {
    
    private int currIdx;
    private int arr[];
    
    // const
    public DynamicArr() {
        arr = new int[2];
        currIdx = 0;
    }
    
    //add
    public void add(int ele) {
        
        // resize
        if(size() >= arr.length) {
            resize();
        }
        
        arr[currIdx] = ele;
        currIdx++;
    }
    
    //get
    public int get(int idx) {
        // is valid
        if(size() <= idx || idx < 0) {
            // raise an exception
            return -1;
        }
        return arr[idx];
    }
    
    //isEmpty
    public boolean isEmpty() {
        
        if(currIdx == 0) {
            return true;
        }
        
        return false;
    }
    
    // set
    public void set(int idx, int val) {
        //is valid
        if(size() <= idx || idx < 0) {
            // raise an exception
            return;
        }
        
        arr[idx] = val;
        
    }
    
    // contains
    public boolean contains(int ele) {
        
        // linear search
        for(int i = 0; i < size(); i++) {
            if(arr[i] == ele) return true;
        }
        
        return false;
    }
    
    // remove 
    // 1. remove by idx
    // 2. remove by ele
    public void remove(int idx) {
        //is valid
        if(size() <= idx || idx < 0) {
            // raise an exception
            return;
        }
        
        for(int i = idx + 1; i < size(); i++) {
            arr[i-1] = arr[i];
        }
        
        currIdx--;
        
    }
    
    // toString
    public String toString() {
        
        String ans = "[ ";
        for(int i = 0;  i < size(); i++) {
            ans += arr[i] +" ";
        }
        ans += "]";
        
        return ans;
    }
    
    
    
    public void resize() {
        
        int temp[] = new int[arr.length * 2];
        
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        
        arr = temp;
    }
    
    public int size() {
        return this.currIdx;
    }
    
}


public class MyClass {
    public static void main(String args[]) {
        
        DynamicArr da = new DynamicArr();
        
        da.add(1);
        da.add(4);
        da.add(10);
        
        System.out.println(da);
        
        // get
        System.out.println(da.get(2));
        
        // size
        System.out.println(da.size());
        
        da.set(0, 100);
        System.out.println(da);
        
        System.out.println(da.contains(100));
        System.out.println(da.contains(50));
        
        // remove
        da.remove(1);
        System.out.println(da);
      
      
    }
}
