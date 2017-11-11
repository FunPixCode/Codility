package permmissingelement

import spock.lang.Specification

class SolutionTest extends Specification {

    def "for: [2,3,1,5] function should return 4"() {
        given:
        def solution = new Solution()
        int[] array = [2, 3, 1, 5]

        when:
        def result = solution.solution(array)

        then:
        result == 4
    }
}
