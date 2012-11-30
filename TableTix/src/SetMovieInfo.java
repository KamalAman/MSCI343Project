import java.util.ArrayList;
import processing.core.PImage;


public class SetMovieInfo {
	
	SetMovieInfo()
	{
		PImage argoImage = Global.applet.loadImage("..//Image//Posters//argo.jpg");
		PImage cloudatlasImage = Global.applet.loadImage("..//Image//Posters//cloudatlas.jpg");
		PImage flightImage = Global.applet.loadImage("..//Image//Posters//flight.jpg");
		PImage hctbImage = Global.applet.loadImage("..//Image//Posters//HereComesTheBoom.jpg");
		PImage hoteltranImage = Global.applet.loadImage("..//Image//Posters//hoteltransylvania.jpg");
		PImage lincolnImage = Global.applet.loadImage("..//Image//Posters//Lincoln.jpg");
		PImage looperImage = Global.applet.loadImage("..//Image//Posters//looper.jpg");
		PImage paranormImage = Global.applet.loadImage("..//Image//Posters//paranormalactivity4.jpg");
		PImage pitchperfectImage = Global.applet.loadImage("..//Image//Posters//pitchperfect.jpg");
		PImage skyfallImage = Global.applet.loadImage("..//Image//Posters//skyfall.jpg");
		PImage tmwtifImage = Global.applet.loadImage("..//Image//Posters//themanwiththeironfists.jpg");
		PImage wreckitralphImage = Global.applet.loadImage("..//Image//Posters//wreckitralph.jpg");
		
		ArrayList<ShowTime> sTimes = null;
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(3, 45));
		sTimes.add(new ShowTime(6, 15));
		sTimes.add(new ShowTime(10, 55));
		Global.movies[0] = (new Movie(argoImage, "Argo", 
				"Ben Affleck, Bryan Cranston, Alan Arkin, John Goodman", 
				"Drama/Thriller", 
				"2h", 
				"8.3", 
				"14A", 
				"This movie contains coarse Language, disturbing content, and tobacco use.",
				"On November 4, 1979, Iranian militants storm the U.S. embassy in Tehran, taking 52 Americans hostage. In the midst" +
				" of the chaos, six Americans manage to slip away and find refuge in the home of the Canadian " +
				"ambassador. Knowing it is only a matter of time before the six are found out and likely killed, a CIA " +
				"specialist comes up with a risky plan to get them safely out of the country."
				, sTimes, 1));
	
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(2, 40));
		sTimes.add(new ShowTime(5, 10));
		sTimes.add(new ShowTime(7, 45));
		sTimes.add(new ShowTime(10, 15));
		Global.movies[1] = (new Movie(cloudatlasImage, "Cloud Atlas", 
				"Tom Hanks, Halle Berry, Jim Sturgess, Hugo Weaving, Jim Broadbent", 
				"Drama/Mystery/Sci-Fi", 
				"2h 52min", 
				"8.2", 
				"14A", 
				"This movie contains coarse language, sexual content, nudity, and graphic violence.",
				"Explores how the actions and consequences of individual lives impact one another throughout the past, the present and the future. " +
				"Action, mystery and romance weave dramatically through the story as one soul is shaped from a killer into a hero and a single act of kindness " +
				"ripples across centuries to inspire a revolution in the distant future."
				, sTimes, 2));	
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(4, 30));
		sTimes.add(new ShowTime(7, 35));
		sTimes.add(new ShowTime(10, 40));
		Global.movies[2] = (new Movie(flightImage, "Flight", 
				"Denzel Washington, Bruce Greenwood, Brian Geraghty, Don Cheadle, John Goodman", 
				"Drama", 
				"2h 19min", 
				"7.7", 
				"18A", 
				"This movie contains coarse language, nudity, and substance abuse.",
				"When a plane malfunctions mid-flight, a pilot struggling with substance abuse makes averts disaster by making a daring crash-landing. " +
				"At first lauded as a hero, his actions and history are called into question when the FAA begins to investigate."
				, sTimes, 3));	
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(3, 35));
		sTimes.add(new ShowTime(5, 05));
		sTimes.add(new ShowTime(9, 45));		
		Global.movies[3] = (new Movie(hctbImage, "Here Comes The Boom", 
				"Kevin James, Salma Hayek, Henry Winkler", 
				"Action/Comedy", 
				"1h 45min", 
				"6.2", 
				"PG", 
				"This movie contains violence.",
				"Former collegiate wrestler Scott Voss is a biology teacher in a failing high school. When cutbacks threaten to cancel " +
				"the music program and lay off its teacher, he begins to raise money by moonlighting as a mixed martial arts fighter. Everyone thinks he is crazy. " +
				"He gains something he never expected as he rallies the entire school."
				, sTimes, 4));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(12, 40));
		sTimes.add(new ShowTime(3, 25));
		sTimes.add(new ShowTime(8, 15));
		Global.movies[4] = (new Movie(hoteltranImage, 
				"Hotel Transylvania", 
				"Adam Sandler, Andy Samberg, Selena Gomez, Kevin James", 
				"Animation/Comedy/Family", 
				"1h 31min", 
				"7.2", 
				"PG","This movie contains some scary scenes and cartoon/animation action.",
				"Welcome to the Hotel Transylvania, Dracula's lavish five-stake resort, where monsters can live it up, free to be the monsters " +
				"they are without humans to bother them. Dracula has invited the most famous monsters to celebrate his daughter's birthday. His world " +
				"could come crashing down when a human stumbles on the hotel for the first time."
				, sTimes, 5));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(12, 30));
		sTimes.add(new ShowTime(3, 50));
		sTimes.add(new ShowTime(7, 10));
		sTimes.add(new ShowTime(10, 30));
		Global.movies[5] = (new Movie(lincolnImage, "Lincoln", 
				"Daniel Day-Lewis, Sally Field, David Strathairn, Tommy Lee Jones, Joseph Gordon-Levitt", 
				"Biography/Documentary/History/War", 
				"2h 30min", 
				"8.1", 
				"PG", 
				"This movie is not recommended for children and contains offensive language, and tobacco use.",
				"In a nation divided by war and the strong winds of change, Abraham Lincoln, during his final months in office, pursues a course of action designed " +
				"to end the war, unite the country and abolish slavery. With the moral courage and fierce determination to succeed, his choices during this critical " +
				"moment will change the fate of generations to come."
				, sTimes, 6));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(1, 15));
		sTimes.add(new ShowTime(3, 35));
		sTimes.add(new ShowTime(7, 25));
		sTimes.add(new ShowTime(10, 40));
		Global.movies[6] = (new Movie(looperImage, "Looper", 
				"Bruce Willis, Joseph Gordon-Levitt, Emily Blunt", 
				"Action/Sci-Fi", 
				"1h 58min", 
				"8.0", 
				"14A", 
				"This movie contains coarse language and graphic violence.",
				"In the future, time travel will be invented - but it will be illegal and only available on the black market. When the mob wants to get rid of someone, " +
				"they will send their target 30 years into the past, where a \"looper\" - a hired gun, like Joe - is waiting to mop up. Joe is getting rich and " +
				"life is good until the day the mob decides to \"close the loop,\" sending back Joe's future self for assassination."
				, sTimes, 7));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(1, 30));
		sTimes.add(new ShowTime(4, 30));
		sTimes.add(new ShowTime(7, 35));
		sTimes.add(new ShowTime(10, 40));
		Global.movies[7] = (new Movie(paranormImage, "Paranormal Activity 4", 
				"Katie Featherston, Kathryn Newton, Stephen Dunham", 
				"Horror/Suspense", 
				"1h 28min", 
				"4.5", 
				"14A", 
				"This movie contains coarse language, and distrubing content.",
				"Strange things have begun happening ever since the new neighbors moved in next door."
				, sTimes, 8));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(12, 55));
		sTimes.add(new ShowTime(3, 25));
		sTimes.add(new ShowTime(5, 55));
		sTimes.add(new ShowTime(8, 25));
		sTimes.add(new ShowTime(10, 55));
		Global.movies[8] = (new Movie(pitchperfectImage, "Pitch Perfect ", 
				"Anna Kendrick, Skylar Astin, Ben Platt, Brittany Snow, Anna Camp, Rebel Wilson", 
				"Comedy/Music", 
				"1h 52min", 
				"7.6", 
				"PG", 
				"This movie contains offensive language and crude content.",
				"Beca finds herself not right for any clique. She is somehow muscled into one that she would never have picked on her own: " +
				"alongside mean, sweet and weird girls whose only thing in common is how good they sound when they sing together. When she takes this " +
				"group out of their world of traditional arrangements, they fight to get to the " +
				"top of the world of college music competitions."
				, sTimes, 9));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(12, 50));
		sTimes.add(new ShowTime(3, 45));
		sTimes.add(new ShowTime(4, 10));
		sTimes.add(new ShowTime(7, 30));
		sTimes.add(new ShowTime(11, 00));
		Global.movies[9] = (new Movie(skyfallImage, "Skyfall ", 
				"Daniel Craig, Judi Dench, Javier Bardem, Ralph Fiennes, Naomie Harris", 
				"Action/Adventure/Thriller", 
				"2h 23min", 
				"8.1", 
				"PG", 
				"This movie contains violence.",
				"Bond's loyalty to M is tested as her past comes back to haunt her. As MI6 comes under attack, 007 must track down and destroy the threat, " +
				"no matter how personal the cost."
				, sTimes, 10));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(3, 05));
		sTimes.add(new ShowTime(6, 55));
		sTimes.add(new ShowTime(9, 35));
		Global.movies[10] = (new Movie(tmwtifImage, "The Man with the Iron Fists ", 
				"Russell Crowe, Lucy Liu, Rick Yune, RZA, Cung Le, Jamie Chung, Dave 'Batista' Batista", 
				"Action/Adventure", 
				"1h 36 min", 
				"6.6", 
				"18A", 
				"This movie contains Brutal violence, coarse language, and gory scenes.",
				"Warriors, assassins and a lone outsider hero descend on one fabled village in China for a winner-takes-all battle for a fortune in gold."
				, sTimes, 11));
		
		sTimes = new ArrayList<ShowTime>();
		sTimes.add(new ShowTime(2, 55));
		sTimes.add(new ShowTime(5, 30));
		sTimes.add(new ShowTime(8, 05));
		sTimes.add(new ShowTime(10, 35));		
		Global.movies[11] = (new Movie(wreckitralphImage, "Wreck-It  Ralph", 
				"John C Reilly, Jack McBrayer, Jane Lynch, Sarah Silverman", 
				"Animation", 
				"1h 48min", 
				"8.3", 
				"PG", 
				"This movie contains cartoon/animation action.",
				"Wreck-It Ralph is an obsolete video game character who longs to be as beloved as his game's perfect Good Guy, Fix-It Felix. When a modern, " +
				"first-person shooter game arrives, Ralph sneaks into the game with the hopes of winning a medal and " +
				"proving his heroism. Unfortunately, he wrecks everything, accidentally unleashing a deadly enemy that threatens every game in the arcade."
				, sTimes, 12));
				
	}
}
