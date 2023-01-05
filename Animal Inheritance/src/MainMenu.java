public class MainMenu
	{
	public static void main(String[] args)
		{
		Animal [] animal = new Animal [4];
		animal[0] = new Bat();
		animal[1] = new Cow();
		animal[2] = new Penguin();
		animal[3] = new Robin();
		
		for (int i = 0; i < animal.length; i++)
			{
			animal[i].hasBaby();
			animal[i].sound();
			animal[i].eats();
			animal[i].habitat();
			System.out.println("--------------------------------------");
			}
		}
	}