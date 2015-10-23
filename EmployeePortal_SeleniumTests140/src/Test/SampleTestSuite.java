package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChromeTest_LoginUser.class, ChromeTest_RegisterUser.class, ChromeTest_LoginNewUser.class,ChromeTest_ForgotPassword.class })
public class SampleTestSuite {

}