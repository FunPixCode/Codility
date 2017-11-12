package frogjump

import spock.lang.Specification

class SolutionTest extends Specification {

    def "X=10, Y=85, D=30 should return 3"() {
        given:
        def solution = new Solution()
        def x = 10
        def y = 85
        def d = 30

        when:
        def result = solution.solution(x, y, d)

        then:
        result == 3
    }
}
