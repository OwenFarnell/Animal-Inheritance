public class Cow extends Mammal
	{
	public Cow()
		{
		name = "Cow";
		food = "Grass";
		habitat = "Meadow";
		}

	public void sound()
		{
		System.out.println("The " + name + " goes Moo!");
		}
	}