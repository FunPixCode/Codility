package permcheck;

import static org.junit.Assert.assertEquals

import spock.lang.Specification

class SolutionTest extends Specification {
    def "for array [4,1,3,2] must return 1"(){
        given:
        def solution = new Solution()
        int[] array = [4, 1, 3, 2]

        when:
        def result = solution.solution(array)

        then:
        assertEquals(1, result)
    }

    def "for array [4,1,3] must return 0"() {
        given:
        def solution = new Solution()
        int [] array = [4, 1, 3]

        when:
        def result = solution.solution(array)

        then:
        assertEquals(0,result)
    }
    
    def "for array [9, 5, 7, 3, 2, 7, 3, 1, 10, 8] must return 0"(){
        given:
        def solution = new Solution()
        int[] array = [9, 5, 7, 3, 2, 7, 3, 1, 10, 8]
        
        when:
        def result = solution.solution(array)
        
        then:
        assertEquals(0, result)
    }
    
    def "for array [1, 1] must return 0"() {
        given:
        def solution = new Solution()
        int[] array = [1, 1]

        when:
        def result = solution.solution(array)

        then:
        assertEquals(0, result)
    }
}