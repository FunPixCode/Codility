package cyclicrotation

import spock.lang.Specification

class SolutionTest extends Specification {

    def "for: [1,2,3] shift: 1 should return: [3,1,2]"() {
        given:
        def solution = new Solution()
        int[] array = [1, 2, 3]

        when:
        def result = solution.solution(array, 1)

        then:
        result == [3, 1, 2]
    }

    def "for: [1,2,3,4] shift: 4 should return: [1,2,3,4]"() {
        given:
        def solution = new Solution()
        int[] array = [1, 2, 3, 4]

        when:
        def result = solution.solution(array, 4)

        then:
        result == [1, 2, 3, 4]
    }
}
