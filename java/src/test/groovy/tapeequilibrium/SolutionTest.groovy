package tapeequilibrium

import spock.lang.Specification

class SolutionTest extends Specification {

    def "for: [3,1,2,4,3] should return: 1"() {
        given:
        def solution = new Solution()
        int[] array = [3, 1, 2, 4, 3]

        when:
        def result = solution.solution(array)

        then:
        result == 1
    }

    def "for: [5, 6, 2, 4, 1] should return: 4"() {
        given:
        def solution = new Solution()
        int[] array = [5, 6, 2, 4, 1]

        when:
        def result = solution.solution(array)

        then:
        result == 4
    }

    def "for: [-10, -5, -3, -4, -5] should return: 3"() {
        given:
        def solution = new Solution()
        int[] array = [-10, -5, -3, -4, -5]

        when:
        def result = solution.solution(array)

        then:
        result == 3
    }

    def "for: [-1000, 1000] should return: 2000"() {
        given:
        def solution = new Solution()
        int[] array = [-1000, 1000]

        when:
        def result = solution.solution(array)

        then:
        result == 2000
    }
}
