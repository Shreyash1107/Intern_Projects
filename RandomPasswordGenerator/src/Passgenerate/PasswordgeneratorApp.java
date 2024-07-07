package Passgenerate;
import static java.lang.System.*;
import java.security.SecureRandom;
import java.util.Scanner;
public class PasswordgeneratorApp
{
		final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String lowercase =  "abcdefghijklmnopqrstuvwxyz";
		final String specialchar = "!@#$%^&*()-_+=<>?";
		final String dig = "0123456789";
		final String allchar = uppercase + lowercase + specialchar + dig;
		
		SecureRandom Rand = new SecureRandom();   //For Random Password Generation
		
		public String randompass(int len)
		{
			if(len<1)
			{
				out.println("Passsword length must of more than 0");
			}
			StringBuilder pass = new StringBuilder(len);
			pass.append(uppercase.charAt(Rand.nextInt(uppercase.length())));
			pass.append(lowercase.charAt(Rand.nextInt(lowercase.length())));
			pass.append(specialchar.charAt(Rand.nextInt(specialchar.length())));
			pass.append(dig.charAt(Rand.nextInt(dig.length())));
			
			for(int i=4;i<len;i++)
			{
				pass.append(allchar.charAt(Rand.nextInt(allchar.length())));
			}
			 return shufflepass(pass.toString());
		}
		public String shufflepass(String str)
		{
			char [] ch = str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int rindex = Rand.nextInt(ch.length);
				char temp = ch[i];
				ch[i] = ch[rindex];
				ch[rindex] = temp;
			}
			return new String(ch);
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			out.println("Enter Password Length you want:");
			int passlen = sc.nextInt();
			PasswordgeneratorApp passgen = new PasswordgeneratorApp();
			String randompass = passgen.randompass(passlen);
			out.println("Random Generated Password is " + randompass);
		}
}