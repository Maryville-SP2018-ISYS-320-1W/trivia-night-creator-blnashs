package edu.maryville.isys320.TriviaNight;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class BuildTriviaNightPresentation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "//Users//joedent//TriviaNight.pptx";
		SlideShowBuilder builder = new SlideShowBuilder();
		QuestionsManager qm = new QuestionsManager("data");
		
		builder.buildSlideShow(qm.getCategories(), qm.getQuestions(), qm.getAnswers(), fileName);
//		builder.printSlideShowInfo("Sample.pptx");

	}
	
}


String [ ] Categories = new String [ ] {“History”, “Sports”, “State” “Names”};
Arrays.sorts(Categories);
Int I = 0
For(String temp: Categories){
System.out.println(“Categories” + i++ + “:” + temp);
}
}
}


Public String getBar (int i)
Throws AlsCustomException
{
If (i == 0)
{
//throw our custom exception
Throw new AlsCustomException(“Please hit return…”);
}
Else
{
Return “Thanks”;
}
}
}


Set<String1> words = new HashSet<String1>( );
Scanner in = new Scanner(new File(“categories.txt”));
While (in.hasNext( ) ) {
String question = in.next();
question.add(question);
System.out.println(“History” = + question());
}
}
}
Set<String2> words = new HashSet<String2>( );
Scanner in = new Scanner(new File(“categories.txt”));
While (in.hasNext( ) ) {
String question = in.next();
question.add(question);
System.out.println(“Sports” = + question());
}
}
}

Set<String3> words = new HashSet<String3>( );
Scanner in = new Scanner(new File(“categories.txt”));
While (in.hasNext( ) ) {
String question = in.next();
question.add(question);
System.out.println(“State Names” = + question());
}
}
}
