package smallestinteger

import missinginteger.Solution;
import spock.lang.Specification;

class SolutionTest extends Specification {

    def "for [1, 3, 6, 4, 1, 2] result must be 5"() {
        given:
        int[] numbers = [1, 3, 6, 4, 1, 2]
        def solution = new Solution()

        when:
        def result = solution.solution(numbers)

        then:
        result == 5
    }

    def "for [1, 2, 3] result must be 4"() {
        given:
        int[] numbers = [1, 2, 3]
        def solution = new Solution()

        when:
        def result = solution.solution(numbers)

        then:
        result == 4
    }

    def "for [−1, −3] result must be 1"() {
        given:
        int[] numbers = [-1, -3]
        def solution = new Solution()

        when:
        def result = solution.solution(numbers)

        then:
        result == 1
    }

}
