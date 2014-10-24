
public class PrintMessage
{
	private String message ;
	
	//constructor
	public PrintMessage(String message)
	{
		this.message = message ;
	}
	
	//print the message 
	public String printMessage()
	{
		System.out.println(message) ;
		return message ;
	}
}
