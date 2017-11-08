package binarygap

import spock.lang.Specification

class SolutionTest extends Specification {
    def "gap size for 9 must be 2"() {
        setup:
        def solution = new Solution()
        def value = 9

        when:
        def result = solution.solution(value)

        then:
        result == 2
    }

    def "gap size for 529 must be 4"() {
        setup:
        def solution = new Solution()
        def value = 529

        when:
        def result = solution.solution(529)

        then:
        result == 4
    }

    def "gap size for 20 must be 1"() {
        setup:
        def solution = new Solution()
        def value = 20

        when:
        def result = solution.solution(20)

        then:
        result == 1
    }

    def "gap size for 1041 must be 5"() {
        setup:
        def solution = new Solution()
        def value = 1041

        when:
        def result = solution.solution(1041)

        then:
        result == 5
    }
}
