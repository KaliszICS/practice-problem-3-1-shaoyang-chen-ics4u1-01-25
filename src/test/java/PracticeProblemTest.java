import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void sumOfDigitsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(9, (int)method.invoke(null, 234));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void factorialTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("factorial", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void factorialTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("factorial", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void factorialTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("factorial", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, -5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void factorialTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("factorial", cArg);
  // Enter code here
    assertEquals(3628800, (int)method.invoke(null, 10));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void factorialTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("factorial", cArg);
  // Enter code here
    assertEquals(120, (int)method.invoke(null, 5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void sumOfDigitsTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(10, (int)method.invoke(null, 19));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void sumOfDigitsTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void sumOfDigitsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(9, (int)method.invoke(null, 9));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void sumOfDigitsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(3, (int)method.invoke(null, 12));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void sumOfDigitsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("sumOfDigits", cArg);
  // Enter code here
    assertEquals(3, (int)method.invoke(null, -12));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
