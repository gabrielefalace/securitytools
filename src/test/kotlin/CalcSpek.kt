import com.rsk.Calculator
import com.rsk.NullResult
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it


class CalcSpek : Spek({

    val calculator = Calculator(NullResult())

    describe("the calculator") {
        it("should add two numbers") {
            val result = calculator.add(12, 13)
            
        }
    }

})