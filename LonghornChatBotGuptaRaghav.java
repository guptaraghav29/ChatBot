public class LonghornChatBotGuptaRaghav
{
	private String sentence;
	
	public void replyToUser(String sentence)
	{
		this.sentence = sentence;
		if(sentence.length() == 0)
		{
			System.out.println("I didn't recieve a command. What do you wish?");	
		}
		else if (sentence.contains("hola") ||
				(sentence.contains("namaste")) ||
				(sentence.contains("hi")) ||
				(sentence.contains("hello")) ||
				(sentence.contains("hey")) ||
				(sentence.contains("hola"))  ||
				(sentence.contains("yo")) ||
				(sentence.contains("what's up")) ||
				(sentence.contains("que pasa")) ||
				(sentence.contains("hello")))
		{
			System.out.println("Hey! How are you doing?");	
		}	
		
		else if((sentence.contains("good")||
				(sentence.contains("Great")) ||
				(sentence.contains("not so well")) ||
				(sentence.contains("terrible"))||
				(sentence.contains("amazing")) ||
				(sentence.contains("ight")) ||
				(sentence.contains("decent")) ||
				(sentence.contains("ok"))  ||
				(sentence.contains("okay")) ||
				(sentence.contains("cool"))))
		{
			System.out.println("That's great to know. What's your favorite soccer team?");	
		}
		
		else if((sentence.contains("barcelona") ||
				(sentence.contains("madrid"))  ||
				(sentence.contains("liverpool"))  ||
				(sentence.contains("manchester united")) ||
				(sentence.contains("bayern"))  ||
				(sentence.contains("juventus")) ||
				(sentence.contains("milan"))  ||
				(sentence.contains("roma")) ||
				(sentence.contains("quakes"))  ||
				(sentence.contains("dortmund"))))
		{
			System.out.println("Ah! Favorite player though?");	
		}
		
		else if((sentence.contains("messi")) ||
				(sentence.contains("ronaldo")) ||
				(sentence.contains("xavi")) ||
				(sentence.contains("iniesta")) ||
				(sentence.contains("puyol")) ||
				(sentence.contains("ramos")) ||
				(sentence.contains("lukaku")) ||
				(sentence.contains("beckham")) ||
				(sentence.contains("pele")) ||
				(sentence.contains("neymar")))
		{
			System.out.println("Cool! My favorite is MESSI!! He's a legendary player. Out of this world.");
			System.out.println("Anways, your favorite movie?");			
		}
		
		else if((sentence.contains("football") ||
				(sentence.contains("hockey")) ||
				(sentence.contains("tennis")) ||
				(sentence.contains("swimming")) ||
				(sentence.contains("track")) ||
				(sentence.contains("basketball")) ||
				(sentence.contains("baseball")) ||
				(sentence.contains("volleyball")) ||
				(sentence.contains("racing")) ||
				(sentence.contains("hiking"))))
		{
			System.out.println("Cool that you like that sport! I only like soccer though.");
			System.out.println("Anways, your favorite movie?");
		}
		else if((sentence.contains("avengers")) ||
				(sentence.contains("maze runner")) ||
				(sentence.contains("divergent")) ||
				(sentence.contains("king"))  ||
				(sentence.contains("harry potter") ||
				(sentence.contains("hunger games")) ||
				(sentence.contains("godfather")) ||
				(sentence.contains("ronaldo movie")) ||
				(sentence.contains("mad max")) ||
				(sentence.contains("bond")) ||
				(sentence.contains("bourne")) ||
				(sentence.contains("007")) ||
				(sentence.contains("star wars")) ||
				(sentence.contains("lord of the rings")) ||
				(sentence.contains("pirates")) ||
				(sentence.contains("fast and furious"))))
		{
			System.out.println("Nice. My favorite movie is Despicable Me 3.");
			System.out.println("Your favorite hobby though?");
		}
		else if((sentence.contains("hiking") ||
				(sentence.contains("sleep")) ||
				(sentence.contains("watching tv")) ||
				(sentence.contains("programming")) ||
				(sentence.contains("teaching")) ||
				(sentence.contains("music")) ||
				(sentence.contains("study")) ||
				(sentence.contains("play")) ||
				(sentence.contains("cook")) ||
				(sentence.contains("eat"))))
		{
			System.out.println("Ah. My favorite hobby is to answer your questions!");	
		}
		else
		{
			System.out.println("??? Try again.");	
		}
	}
	
		
}