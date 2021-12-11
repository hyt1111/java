import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MySystem {
	
	public static final MyReader in = new MyReader();
	
	private MySystem() {
		; 
	}
}


class MyReader {

	private BufferedReader bufferedReader;

	private String prompt = "? ";
	
	public MyReader() {
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String getPrompt() {
		return this.prompt;
	}
	
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	public String getString(String question) {
		System.out.print(question + this.prompt);
		String input = "";
		
		try {
			input = this.bufferedReader.readLine();
		} catch(IOException e) {
			
			; 
		}
		return input;
	}
	
	public boolean getBoolean(String question) {
		boolean input;
		String base = this.getString(question);
		input = Boolean.parseBoolean(base);
		return input;
	}
	
	public byte getByte(String question) {
		byte input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Byte.parseByte(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}


	public short getShort(String question) {
		short input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Short.parseShort(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
	
	public int getInt(String question) {
		int input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Integer.parseInt(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
	
	public long getLong(String question) {
		long input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Long.parseLong(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
	
	public char getChar(String question) {
		char input;
		while(true) {
			String base = this.getString(question);
			if(base.length() == 1) {
				input = base.charAt(0);
				break;
			}
		}
		return input;
	}
	
	public float getFloat(String question) {
		float input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Float.parseFloat(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
	
	public double getDouble(String question) {
		double input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Double.parseDouble(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
}