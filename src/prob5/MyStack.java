package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	
	public MyStack(int numb) {
		this.buffer = new String[numb];
		top = -1;
	}
	
	public void push(String word) {
		String[] temp;
		top++;
		buffer[top] = word;
		if(buffer.length<top) {
			for (int i = 0; i < temp.length; i++) {
				
			}
			
		}
	}
	
	public String resize(String[] buffer) {
		String temp[] = new String[buffer.length + 1];
		for (int i = buffer.length; i >-1; i--) {
			for (int j = 0; j < temp.length; j++) {
				temp[j] = buffer[i];
				String result = temp[j];
			}
		}
		
		
		return result;
	}
	
	public String pop() {
		String result = buffer[top];
		top--;
		return result; 
		
	}
	
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else{
			return false;
		}
	}
	
}