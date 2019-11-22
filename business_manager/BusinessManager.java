// This is the best code you will ever see in your life

package business_manager; 

public class BusinessManager  
{ 
    public boolean WashTheLizards()
    {
        boolean they_got_washed = true; 

        // Washing Bambo...

        // Washing Hypnotoad...

        // Washing Lizzie...

        return they_got_washed; 
    }

    public void ReadYelpReviews()
    {
        System.out.println("\n[XxMarkxX] Janet got my lizard wet :(\n"); 

        System.out.println("[Karen2020] I cannot understand why the city would allow this salon to exist\n");

        System.out.print("[anonymous] says Hello !! I I'm a HUGE fan of %business_name%. I'm a budding rapper and it would mean a lot to me if you checked out my channel.\n");
    }

    public int CountMoney()
    {
        int money_under_the_mattress; 

        if (WashTheLizards()) 
        {
            money_under_the_mattress = 35000; 
        }
        else 
        {
            money_under_the_mattress = -43000; 
        }

        return money_under_the_mattress; 
    }

    public static void main(String args[])
    { 
        BusinessManager business_manager = new BusinessManager(); 
        business_manager.ReadYelpReviews(); 
        business_manager.WashTheLizards(); 
        business_manager.CountMoney(); 
    } 
} 
