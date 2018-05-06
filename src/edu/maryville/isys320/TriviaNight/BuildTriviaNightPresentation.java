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


String [ ] Categories = new String [ ] {“History”, “Sports”};
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



ArrayList<Sports> myA1 = new ArrayList ();
For (int cnt = 0; cnt < 2; cnt++) {
Sports xx = new Sports ();
xx.setQuestion(“The Pro Football Hall of Fame is found in this state”);
xx.setQuestion(“In 1936, the world’s first ski lift began operation at Sun Valley Ski Resort, in this state.”);
myAl.add(xx);
}
}
}

ArrayList<History> myA1 = new ArrayList ();
For (int cnt = 0; cnt < 7; cnt++) {
History xx = new History ();
xx.setQuestion(“The world’s first transcontinental railroad joined east to west in this state in 1869”);
xx.setQuestion(“This state was the first state after the original colonies to join the union”);
xx.setQuestion(“In 1954, the first nuclear submarine, Nautilus, was launched from Groton Submarine Base.  Which state is it?”);
xx.setQuestion(“Amelia Earhart, the first woman to fly solo across the Atlantic, was from this state.”);
xx.setQuestion(“Mount Katahdin in this state is the starting point of the Appalachian Trail.”);
xx.setQuestion(“This state was the site of “Custer’s Last Stand” on June 25, 1876.”);
xx.setQuestion(“In 1950 a bear cub was rescued from a forest fire in this state.  He became known as Smoky the Bear.”);
myAl.add(xx);
}
}
}


For int I = o; I < <array>.length; i++) {
<do something with array(i)>;
}
}
}