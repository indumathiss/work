import java.util.Scanner;

public class Generate_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account holder name:");
		String acc_name=sc.next();
		System.out.println("Enter the account number:");
		String acc_no=sc.next();
		System.out.println("Enter the account type(Savings/Current/Loan):");
		String acc_type=sc.next();
		String output="";
		int arr[]=new int[11];
		if(acc_type.equalsIgnoreCase("Savings")||acc_type.equalsIgnoreCase("Current")||acc_type.equalsIgnoreCase("Loan"))
		{
			output+=acc_type.substring(0,2)+acc_no.substring(0,1);
			
			int sum=0;
			if(acc_no.length()==11)
			{
				for(int i=0;i<acc_no.length();i++)
				{
					arr[i]=Character.getNumericValue(acc_no.charAt(i));
				}
				
				for(int i=0;i<5;i++)
					sum+=arr[i];
				int ans = 0;
				if(sum>9)
				{
					ans=sumdigit(sum);
					output+=ans+acc_name.substring(0,1);
				}
				else
					output+=sum+acc_name.substring(0,1);
				
				int sum1=0;
				int ans1=0;
				for(int i=5;i<10;i++)
					sum1+=arr[i];
				if(sum1>9)
				{
					ans1=sumdigit(sum1);
				output+=ans1+acc_name.substring(acc_name.length()-1)+arr[10];
				}
				else
					output+=sum1+acc_name.substring(acc_name.length()-1)+arr[10];
				System.out.println(output);
				
			}
			else
				System.out.println("Enter the valid account number");
		}
		else
			System.out.println("Enter a valid account type");
		
		
		
	}

	private static int sumdigit(int sum) {
		// TODO Auto-generated method stub
		
		int n=sum;
		sum=0;
		while(n!=0) {
		
		sum+=n%10;
		
		n/=10;
		}
		//System.out.println(sum);
		if(sum>9)
		{
			System.out.println("asghdsgfysd");
			sum=sumdigit(sum);
		}
		return sum;
		
	}

}
