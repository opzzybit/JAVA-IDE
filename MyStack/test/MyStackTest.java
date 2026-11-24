import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

        private MyStack stack;

        @BeforeEach
        void setUp() {
            stack = new MyStack(5);
        }

        @Test
        void testnewStackHasZeroElements() {

            assertTrue(stack.isEmpty());
        }

        @Test
        void testThatIfIadd_ItIncreasesNumberOfElements() {
            assertTrue(stack.isEmpty());
            stack.push("First");
            stack.push("Second");

            assertEquals(2, stack.numberOfElements());
        }

        @Test
        void testThatElement_CanBePopedOut(){
            assertTrue(stack.isEmpty());
            stack.push("Opzzy");
            stack.push("Dog");
            stack.push("Semicolon");
            stack.push("Sunday");
            assertEquals(4, stack.numberOfElements());
            stack.pop();
            stack.pop();
            stack.pop();
            assertEquals(1, stack.numberOfElements());
        }

        @Test
        void testThatTheTopElement_CanBeAccessed(){
            assertTrue(stack.isEmpty());
            stack.push("micheal");
            stack.push("Friut");
            stack.push("Semicolon");
            assertEquals(3, stack.numberOfElements());
            stack.peek();
            assertEquals("Semicolon", stack.getTopElements());
        }

        @Test
        void testThatElementCanBeAccessedByItIndex() {
            assertTrue(stack.isEmpty());
            stack.push("Opzzy");
            stack.push("Dog");
            stack.push("Semicolon");
            stack.push("Sunday");
            stack.push("Opeyemi");
            assertEquals(5, stack.numberOfElements());
            stack.search(4);
            assertEquals("Sunday", stack.getSearchedElement());
        }

        @Test
        void testThatWhenStackIsFilledUp_ItThrowsAnException() {
            assertTrue(stack.isEmpty());
            stack.push("Code");
            stack.push("Apple");
            stack.push("Semicolon");
            stack.push("Greatness");
            stack.push("Opeyemi");
            try {
                stack.push("Table");
            }
            catch (ArrayIndexOutOfBoundsException error) {
                System.err.println(error.getMessage());
            }
        }
        @Test
        void testThatWhenIPoppedAEmptyStack_ItReturnAnError(){
                assertTrue(stack.isEmpty());
                try {
                    stack.pop();
                }
                catch (IllegalStateException error) {
                    System.err.println(error.getMessage());
                }
        }

        @Test
        void testThatWhenYouPeekOnAEmptyStack_ItReturnAnError(){
            assertTrue(stack.isEmpty());
            try {
                stack.peek();
            }
            catch (IllegalStateException error) {
                System.err.println(error.getMessage());
            }

        }

        @Test
        void testThatIfMySearchInputLesserThanZero_ItReturnAnError(){
            assertTrue(stack.isEmpty());
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            stack.push("Fourth");
            try {
                stack.search(-1);
            }
            catch (IllegalArgumentException error) {
                System.err.println(error.getMessage());
            }
        }

        @Test
        void testThatIfMySearchInputGreaterStackLength_ItReturnAnError(){
            assertTrue(stack.isEmpty());
            stack.push("First");
            stack.push("Second");
            stack.push("Third");
            stack.push("Fourth");
            try {
                stack.search(6);
            }
            catch (IllegalArgumentException error) {
                System.err.println(error.getMessage());
            }
        }








}


