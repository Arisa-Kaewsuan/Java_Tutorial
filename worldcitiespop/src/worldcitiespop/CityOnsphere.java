package worldcitiespop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CityOnsphere
{
	public static City parse(String line)
	{
		City city = new City();
		String[] ss = line.split(",");
		city.Country = ss[0];
		city.City = ss[1];
		city.AccentCity = ss[2];
		city.Region = ss[3];
		if (ss[4] == "")
		{
			city.Population = Long.parseLong(ss[4]);
		}
		city.Latitude = Double.parseDouble(ss[5]);
		city.Longitude = Double.parseDouble(ss[6]);
		return city;

	}
	
	public static double getDistance(City city1 , City city2)
	{
		double theta1 , theta2 , lamda1 , lamda2 ;
		theta1 = city1.Latitude / 180.0 * Math.PI;
		theta2 = city2.Latitude / 180.0 * Math.PI;
		lamda1 = city1.Longitude / 180.0 * Math.PI;
		lamda2 = city2.Longitude / 180.0 * Math.PI;
		double delta_theta = theta2 - theta1;
		double delta_lamda = lamda2 - lamda1;
		
		double a = Math.pow((Math.cos(theta2)*Math.sin(delta_lamda)),2);
		double b = Math.pow((Math.cos(theta1)*Math.sin(theta2)-Math.sin(theta1)*Math.cos(theta2)*Math.cos(delta_lamda)),2);
		double c = Math.sin(theta1)*Math.sin(theta2)+Math.cos(theta1)*Math.cos(theta1)*Math.cos(theta2);
		double delta_ror = Math.atan(Math.sqrt(a+b)/c);
		return 6371*delta_ror;
	}

	public static void main(String[] args)
	{
		Scanner p = new Scanner(System.in);
		System.out.println("Please Input Your City : ");
		String cityname = p.nextLine().trim().toLowerCase();
		System.out.println("Please Input Your Courntry : ");
		String countryname = p.nextLine().trim().toLowerCase();
		System.out.println("Please Input Length (km) : ");
		double k = p.nextDouble();
        Scanner filesc = null;
		try
		{
			City city_A = null;
			filesc = new Scanner(new BufferedReader(new FileReader(new File("D:\\Desktop\\citypop"))));
			filesc.nextLine();
			while (filesc.hasNext())
			{
				String s = filesc.nextLine();
				City city = parse(s);
				if(city.City.equals(cityname) && city.Country.equals(countryname) )
				{
					city_A = city;
					break;
				}
				//System.out.println(city);
				//if(city.City.equals("chiangmai"))
				//{
				//   city_A = city;
				//}
				//if(city.City.equals("bangkok"))
				//{
				//   city_B = city;
				//}
				//if(city_A != null && city_B != null)
				//{
				//   break;
				//}
			}
			//System.out.println(city_A);
			//System.out.println(city_B);
			//System.out.println(getDistance(city_A , city_B));
			
			filesc.close();
			if(city_A == null)
			{
				System.out.println("City Not Found");
				return;
			}
			filesc = new Scanner(new BufferedReader(new FileReader(new File("D:\\Desktop\\citypop"))));
			filesc.nextLine();
			while (filesc.hasNext())
			{
				String s = filesc.nextLine();
				City city = parse(s);
				double dist = getDistance(city,city_A);
				if(Math.abs(dist) < k)
				{
					System.out.println(dist);
					System.out.println(city);
				}
			}
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
