import java.util.ArrayList;
import processing.core.PImage;


public class SetMovieInfo {
	
	SetMovieInfo()
	{
		PImage img = null;
		ArrayList<showTime> sTimes = null;
		
		Global.movies.add(new Movie(img, "Argo", 
				"Ben Affleck, Bryan Cranston, Alan Arkin, John Goodman", 
				"Drama/Thriller", 
				"2h", 
				"8.3", 
				"14A", 
				"Warning: This movie contains coarse Language, disturbing content, and tobacco use.",
				"Chronicles the life-or-death covert operation to rescue six Americans, which unfolded behind the scenes of the Iran hostage crisis--the truth of " +
				"which was unknown by the public for decades. On November 4, 1979, as the Iranian revolution reaches its boiling point, militants storm the U.S. embassy " +
				"in Tehran, taking 52 Americans hostage. But, in the midst of the chaos, six Americans manage to slip away and find refuge in the home of the Canadian " +
				"ambassador. Knowing it is only a matter of time before the six are found out and likely killed, a CIA \"exfiltration\" specialist named " +
				"Tony Mendez (Affleck) comes up with a risky plan to get them safely out of the country. A plan so incredible, it could only happen in the movies."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Cloud Atlas", 
				"Tom Hanks, Halle Berry, Jim Sturgess, Hugo Weaving, Jim Broadbent", 
				"Drama/Mystery/Sci-Fi", 
				"2h 52min", 
				"8.2", 
				"14A", 
				"Warning: This movie contains coarse language, sexual content, nudity, and graphic violence.",
				"Explores how the actions and consequences of individual lives impact one another throughout the past, the present and the future. " +
				"Action, mystery and romance weave dramatically through the story as one soul is shaped from a killer into a hero and a single act of kindness " +
				"ripples across centuries to inspire a revolution in the distant future."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Flight", 
				"Denzel Washington, Bruce Greenwood, Brian Geraghty, Don Cheadle, John Goodman", 
				"Drama", 
				"2h 19min", 
				"7.7", 
				"18A", 
				"Warning: This movie contains coarse language, nudity, and substance abuse.",
				"When a plane malfunctions mid-flight, a pilot struggling with substance abuse makes averts disaster by making a daring crash-landing. " +
				"At first lauded as a hero, his actions and history are called into question when the FAA begins to investigate."
				, sTimes));		

		Global.movies.add(new Movie(img, 
				"Hotel Transylvania", 
				"Adam Sandler, Andy Samberg, Selena Gomez, Kevin James", 
				"Animation/Comedy/Family", 
				"1h 31min", 
				"7.2", 
				"PG", "Warning: This movie contains some scary scenes and cartoon/animation action.",
				"Welcome to the Hotel Transylvania, Dracula's lavish five-stake resort, where monsters and their families can live it up, free to be the monsters " +
				"they are without humans to bother them. On one special weekend, Dracula has invited some of the world's most famous monsters - Frankenstein and his wife, " +
				"the Mummy, the Invisible Man, a family of werewolves, and more - to celebrate his daughter Mavis' 118th birthday. For Drac, catering to these infamous " +
				"friends is no problem - but his world could come crashing down when a human stumbles on the hotel for the first time and befriends Mavis."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Lincoln", 
				"Daniel Day-Lewis, Sally Field, David Strathairn, Tommy Lee Jones, Joseph Gordon-Levitt", 
				"Biography/Documentary/History/War", 
				"2h 30min", 
				"8.1", 
				"PG", 
				"Warning: This movie is not recommended for children and contains offensive language, and tobacco use.",
				"In a nation divided by war and the strong winds of change, Abraham Lincoln, during his final months in office, pursues a course of action designed " +
				"to end the war, unite the country and abolish slavery. With the moral courage and fierce determination to succeed, his choices during this critical " +
				"moment will change the fate of generations to come."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Looper", 
				"Bruce Willis, Joseph Gordon-Levitt, Emily Blunt", 
				"Action/Sci-Fi", 
				"1h 58min", 
				"8.0", 
				"14A", 
				"Warning: This movie contains coarse language and graphic violence.",
				"In the future, time travel will be invented - but it will be illegal and only available on the black market. When the mob wants to get rid of someone, " +
				"they will send their target 30 years into the past, where a \"looper\" - a hired gun, like Joe - is waiting to mop up. Joe is getting rich and " +
				"life is good until the day the mob decides to \"close the loop,\" sending back Joe's future self for assassination."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Paranormal Activity 4", 
				"Katie Featherston, Kathryn Newton, Stephen Dunham", 
				"Horror/Suspense", 
				"1h 28min", 
				"4.5", 
				"14A", 
				"Warning: This movie contains coarse language, and distrubing content.",
				"Strange things have begun happening ever since the new neighbors moved in next door."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Pitch Perfect ", 
				"Anna Kendrick, Skylar Astin, Ben Platt, Brittany Snow, Anna Camp, Rebel Wilson", 
				"Comedy/Music", 
				"1h 52min", 
				"7.6", 
				"PG", 
				"Warning: This movie contains offensive language and crude content.",
				"Beca is that girl who'd rather listen to what's coming out of her headphones than what's coming out of anyone's mouth. Arriving at " +
				"Barden University, she finds herself not right for any clique but is somehow muscled into one that she would never have picked on her own: " +
				"alongside mean girls, sweet girls and weird girls whose only thing in common is how good they sound when they sing together. When Beca takes this " +
				"acoustic singing group out of their world of traditional arrangements and perfect harmonies into all-new mash-ups, they fight to climb their way to the " +
				"top of the cutthroat world of college music competitions."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Skyfall ", 
				"Daniel Craig, Judi Dench, Javier Bardem, Ralph Fiennes, Naomie Harris", 
				"Action/Adventure/Thriller", 
				"2h 23min", 
				"8.1", 
				"PG", 
				"Warning: This movie contains violence.",
				"Bond's loyalty to M is tested as her past comes back to haunt her. As MI6 comes under attack, 007 must track down and destroy the threat, " +
				"no matter how personal the cost."
				, sTimes));
		
		Global.movies.add(new Movie(img, "The Man with the Iron Fists ", 
				"Russell Crowe, Lucy Liu, Rick Yune, RZA, Cung Le, Jamie Chung, Dave 'Batista' Batista", 
				"Action/Adventure", 
				"1h 36 min", 
				"6.6", 
				"18A", 
				"Warning: This movie contains Brutal violence, coarse language, and gory scenes.",
				"Warriors, assassins and a lone outsider hero descend on one fabled village in China for a winner-takes-all battle for a fortune in gold."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Wreck-It Ralph", 
				"John C Reilly, Jack McBrayer, Jane Lynch, Sarah Silverman", 
				"Animation", 
				"1h 48min", 
				"8.3", 
				"PG", 
				"Warning: This movie contains cartoon/animation action.",
				"Wreck-It Ralph is an obsolete video game character who longs to be as beloved as his game's perfect Good Guy, Fix-It Felix. When a modern, " +
				"first-person shooter game arrives featuring tough-as-nails Sergeant Calhoun, Ralph sneaks into the game with the hopes of winning a medal and " +
				"proving his heroism. Unfortunately, he wrecks everything, accidentally unleashing a deadly enemy that threatens every game in the arcade."
				, sTimes));
		
		Global.movies.add(new Movie(img, "Here Comes The Boom", 
				"Kevin James, Salma Hayek, Henry Winkler", 
				"Action/Comedy", 
				"1h 45min", 
				"6.2", 
				"PG", 
				"Warning: This movie contains violence.",
				"Former collegiate wrestler Scott Voss is a 42-year-old apathetic biology teacher in a failing high school. When cutbacks threaten to cancel " +
				"the music program and lay off its teacher, Scott begins to raise money by moonlighting as a mixed martial arts fighter. Everyone thinks Scott is crazy - " +
				"most of all the school nurse, Bella - but in his quest, Scott gains something he never expected as he becomes a sensation that rallies the entire school."
				, sTimes));
				
	}

}
