package worldcitiespop;

import java.io.PrintWriter;
import java.util.Scanner;

public class Sort_country_by_population
{

	public static void main(String[] args)
	{
		Scanner sc = null;
		try
		{
			ArreyList<City> citys = new ArrayList<City>();
			int i = 0;
			sc = new Scanner(new File(""));
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				String[] ss = s.split(";");
				City c = new City();
				System.out.println(i);
				c.id = Integer.parseInt(ss[0].substring(1 , ss[0].length()-1));
				c.name = (ss[1].substring(1 , ss[1].length()-1));
				c.country = (ss[2].substring(1 , ss[2].length()-1));
				if(ss[3].equals(""))
				{
					
				}else
				{
					c.district = (ss[3].substring(1 , ss[3].length()-1));
				}
				c.population = Long.parseLong(ss[4].substring(1,ss[4].length()-1));
				
				city.add(c);
				i++;
				if(i > 4000)
				{
					break;
				}
				City[] city_array = new City[ciyts.size()];
				city_array = citys.toArray(city_array);
				Arrays0.sort(city_array , new Comparator<City>() {
					@Override
					public int compare(City o1 , City o2)
					{
						if(o1.population<o2.population) return -1;
						if(o1.population>o2.population) return 1 ;
						return 0;
					}
				});
				
				for(i = 0 ; i < city_array.length/2 ; i++)
				{
					City temp = city_array[i];
					city_array[i] = city_array[city_array.length-i-1];
					city_array[city_array.length-i-1] = temp;
				}
				
				for(int j = 0 ; i < city_array.length ; j++)
				{
					System.out.println(city_array[j]);
				}
				
				PrintWriter pw = new PrintWriter(new File("output.txt"));
				for(int j = 0 ; j < city_array.length ; j++)
				{
					pw.println(city_array[j]);
				}
				pw.close();
			}
				
			}catch(FileNotFoundException e/)
		}


}
