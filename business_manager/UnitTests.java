// [Windows] set CLASSPATH=%CLASSPATH%;JUNIT_DIRECTORY\junit-4.12.jar;PROJECT_ROOT_DIRECTORY

// [bash] export CLASSPATH="/Users/Shared/Jenkins/Home/war/WEB-INF/lib/junit-4.12.jar:/Users/Shared/Jenkins/Home/workspace/build_and_run"
// echo ${CLASSPATH}

// javac business_manager/UnitTests.java
// java org.junit.runner.JUnitCore business_manager.UnitTests

package business_manager;  

import org.junit.Assert; 
import org.junit.Test; 

import business_manager.BusinessManager;  

public class UnitTests 
{
    BusinessManager business_manager = new BusinessManager(); 

    @Test
    public void EnsureProfitMargins() 
    {
        System.out.println("\n");

        Assert.assertEquals(35000, business_manager.CountMoney());
    } 

    @Test 
    public void SpyOnEmployees()
    {
        Assert.assertTrue(business_manager.WashTheLizards());
    }

    public static void main(String args[]) 
    {
        org.junit.runner.JUnitCore.main("business_manager.BusinessManager");
    }
}