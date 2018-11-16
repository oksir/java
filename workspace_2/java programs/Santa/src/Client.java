
class Disco
{
		String name="funn";
		int estD=101010;
		
	public void Show()
	{
		System.out.println("Name:::"+name);
		System.out.println("estD:::"+estD);
		
	}
}
	
	
	
class Client	







{
	public static void main(String[] args)
	
	{
		Disco Regnant=new Disco();
		Regnant.Show();
		
		Disco Regna=new Disco();
		
		Regna.name="Regnant";
		Regna.estD=1232;
		Regna.Show();
	}

}
