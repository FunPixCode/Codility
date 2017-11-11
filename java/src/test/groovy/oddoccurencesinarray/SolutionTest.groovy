package oddoccurencesinarray

import spock.lang.Specification

class SolutionTest extends Specification {

    def "for: [9,3,9,3,9,7,9] should return: 7"() {
        given:
        def solution = new Solution()
        int[] array = [9, 3, 9, 3, 9, 7, 9]

        when:
        def result = solution.solution(array)

        then:
        result == 7
    }
}
