public class stack{
    private int top = -1;
    private int rear = -1;
public int stackFk = 0;
public Object[] hi; 


    public stack(int i) {
       hi = new Object[i];
    }


    public void push(Object oB) {
        
        top = top +1;
        hi[top] = oB;
    }

    public Object pop(){
        top--;
        return hi[top+1];
    }

    public Object pop2(){ 
  rear++;
        if(rear < top){
            return 0;
        } else {
            return hi[rear];
        }
    }
}