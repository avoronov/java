import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
 
    private static Stream<Arguments> provideArgs() {
        return Stream.of(
            Arguments.of(List.of(5), List.of(9, 8), "4 -> 9"),
            Arguments.of(List.of(0), List.of(7,3), "7 -> 3"),
            Arguments.of(List.of(9,8), List.of(1), "0 -> 9"),
            Arguments.of(List.of(1), List.of(9,9), "0 -> 0 -> 1"),
            Arguments.of(List.of(2,4,3), List.of(5,6,4), "7 -> 0 -> 8")
        );
    }    

    @ParameterizedTest
    @MethodSource("provideArgs")
    public void test_addTwoNumbers(List<Integer> first, List<Integer> second, String expected) {
        Solution sol = new Solution();

        ListNode l1 = ListNode.buildFrom(first);
        ListNode l2 = ListNode.buildFrom(second);
        String actual = ListNode.toString(sol.addTwoNumbers(l1, l2));

        Assert.assertEquals(expected, actual);
    }

}
