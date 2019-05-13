//importing Scanner for user input.
import java.util.Scanner;

public class LonghornChatBotTesterGuptaRaghav
{
	public static void main(String [] args)
	{

		Scanner keyboard = new Scanner(System.in);

		LonghornChatBotGuptaRaghav userInputChatBot = new LonghornChatBotGuptaRaghav();
		String input;

		System.out.println("");
		System.out.println("Welcome");
		System.out.println("At any time you wish to leave, please reply with a 'stop'");
		System.out.println("");
		System.out.println("Hello! It's a pleasure to meet you. Please type something and I'll do my best to respond.");
		System.out.println("");
		input = keyboard.nextLine().toLowerCase();

		while(!(input.contains("stop")))
		{

			userInputChatBot.replyToUser(input);
			input = keyboard.nextLine().toLowerCase();
		}
		System.out.println("Thanks for keeping me company. Have a GREAT DAY!!!");


	}
}
