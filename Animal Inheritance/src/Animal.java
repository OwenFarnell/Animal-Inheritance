public abstract class Animal
	{
	protected String name;
	protected String food;
	protected String habitat;

	public abstract void sound();
	public abstract void hasBaby();

	public void eats()
		{
		System.out.println("The " + name + " likes eating " + food + ".");
		}
	public void habitat()
		{
		System.out.println("The " + name + " lives in the " + habitat + ".");
		}
	}