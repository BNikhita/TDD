
public class CharacterRemove {
public String CharRemove(String string)
{
	int length=string.length();
	int i;
	String str="";
	if(length==0)
	{
		return "";
	}
	else if((length==1 && string.equals("A")) || (length==2 && string.equals("AA")))
	{
		return "";
	}
	else 
	{
	for(i=0;i<length;i++)
	{
		if(i<2 && string.charAt(i)=='A')
			continue;
		else
			str=str+string.charAt(i);
	}
	}
	return str;
}
}
