package ex1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Stock {
	private HashSet<Article>articlesMg = new HashSet<Article>() ;
	private HashMap<String, Integer>stockMg = new HashMap<String,Integer>();
	public boolean addNouvArticle(Article a, int qt )
	{
	if(stockMg.containsKey(a.getNom()))
	return false;
	articlesMg.add(a) ;
	stockMg.put(a.getNom(), qt);
	return true;
	}
	public boolean verifArticle(String a )
	{
	//1)  à compléter 
		if(stockMg.containsKey(a))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public Article getArticle(String a )
	{
		if(this.verifArticle(a)==true) {
			for(Article a1:articlesMg) {
				if(a1.getNom().equals(a)) {
					return a1;
				}
			}
			}
		return null;
	}
	public boolean removeArticle(String a )
	{
		if(!stockMg.containsKey(a))
			return false;
		Iterator<Article> it=articlesMg.iterator();
		while(it.hasNext()) {
			if(it.next().getNom().equals(a))	
			{
				articlesMg.remove(it);
				stockMg.remove(a);
			}

		}
		return false;
	}
	public int getQt(String a)
	{
	if(!stockMg.containsKey(a))
	return -1;
	else
	return stockMg.get(a);
	}
	public void sortStock( )
	{
	//3)  à compléter 
	}



	
}
