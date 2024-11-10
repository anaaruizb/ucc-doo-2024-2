import com.aslbank.calculadora.model.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class CalculadoraIT {

    private Calculator calculator;
    private DecimalFormat df = new DecimalFormat("#.00000");

    @Before
    public void setUpClass() {
        this.calculator = new Calculator();
    }

    /**
     * Test of add method, of class Calculator.
     */

    /* TEST SUMAS */
    @Test //3 + 5 = 8, #1
    public void threeAndFiveIsEight() {
        System.out.println("Function Add");
        this.calculator.setA(3);
        this.calculator.setB(5);
        double expResult = 8;
        double result = this.calculator.add();
        assertEquals(expResult,result,0.0);
    }
    @Test //52 + 53 = 105, #2
    public void fiftytwoAndFiftythreeIsOnehundredfive(){
        System.out.println("Fuction add");
        this.calculator.setA(52);
        this.calculator.setB(53);
        double expResult=105;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //10.2 + 0.3 = 10.5, #3
    public void tenthreeAndZerotwoIsTenfive ()
    {
        System.out.println("Funtion add");
        this.calculator.setA(10.3);
        this.calculator.setB(0.2);
        double expResult= 10.5;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //235 + 487 = 722, #4
    public void moreFiveHundred()
    {
        System.out.println("Funtion add");
        this.calculator.setA(235);
        this.calculator.setB(487);
        double expResult= 722;
        double result= this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //2+3 = 5, #5
    public void twoAndThreeIsFive()
    {
        System.out.println("Funtion add");
        this.calculator.setA(2);
        this.calculator.setB(3);
        double expResult = 5;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //2+0 = 2, #6
    public void twoAndZeroIsTwo ()
    {
        System.out.println("Funtion add");
        this.calculator.setA(2);
        this.calculator.setB(0);
        double expResult = 2;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //2 + -2 = 0, #7
    public void twoAndMinusTwoIsZero ()
    {
        System.out.println("Funtion add");
        this.calculator.setA(2);
        this.calculator.setB(-2);
        double expResult = 0;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }

    @Test //-10 + -7, #8
    public void  minusTenAndMinusSeven()
    {
        System.out.println("Funtion add");
        this.calculator.setA(-10);
        this.calculator.setB(-7);
        double expResult = -17;
        double result = this.calculator.add();
        assertEquals(expResult, result, 0.0);
    }


    //RESTAS

    @Test //5-3=2, #9
    public void fiveMinusThreeIsTwo(){
        System.out.println("Function Substract");
        this.calculator.setA(5);
        this.calculator.setB(3);
        double expResult = 2;
        double result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    @Test //3-2=1, #10
    public void threeMinusTwoIsOne(){
        System.out.println("Function Substract");
        this.calculator.setA(3);
        this.calculator.setB(2);
        double expResult = 1;
        double result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    @Test //3-3=0, #11
    public void threeMinusThreeIsZero(){
        System.out.println("Function Substract");
        this.calculator.setA(3);
        this.calculator.setB(3);
        double expResult = 0;
        double result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    @Test // 3 - -3 = 6, #12
    public void threeMinusMinusThreeIsSix(){
        System.out.println("Function Substract");
        this.calculator.setA(3);
        this.calculator.setB(-3);
        double expResult = 6;
        double result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    @Test //20.5 - 10.3= 10.2, #13
    public void twentypfiveMinusTenpThree(){ //p = point
        System.out.println("Function Substract");
        this.calculator.setA(20.5);
        this.calculator.setB(10.3);
        double expResult = 10.2;
        double result = this.calculator.substract();
        assertEquals(expResult,result,0.0);
    }

    //MULTIPLICACION
    @Test // 1 x 5=5, #14
    public void oneXFiveIsFive(){
        System.out.println("Function Multiply");
        this.calculator.setA(1);
        this.calculator.setB(5);
        double expResult = 5;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test //3 x 3 = 9, #15
    public void threeXThreeIsNine(){
        System.out.println("Function Multiply");
        this.calculator.setA(3);
        this.calculator.setB(3);
        double expResult = 9;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test //3 x 0 = 0, #16
    public void threeXZeroIsZero(){
        System.out.println("Function Multiply");
        this.calculator.setA(3);
        this.calculator.setB(0);
        double expResult = 0;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test //3 x -3= -9, #17
    public void threeXMinusThreeIsMinusNine(){
        System.out.println("Function Multiply");
        this.calculator.setA(3);
        this.calculator.setB(-3);
        double expResult = -9;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test // -5 x -5 = 25, #18
    public void minusFiveXMinusFiveIs25(){
        System.out.println("Function Multiply");
        this.calculator.setA(-5);
        this.calculator.setB(-5);
        double expResult = 25;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    @Test //5.2 x 2.9 = 15.08, #19
    public void fivepTwoXTwopNineIs15p08(){ //p=point (.)
        System.out.println("Function Multiply");
        this.calculator.setA(5.2);
        this.calculator.setB(2.9);
        double expResult = 15.08;
        double result = this.calculator.multiply();
        assertEquals(expResult,result,0.0);
    }

    //DIVISIONES
    @Test // 4 / 2= 2, #20
    public void fourBetweenTwoIsTwo(){
        System.out.println("Function Div");
        this.calculator.setA(4);
        this.calculator.setB(2);
        double expResult = 2;
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test // 8/4 = 2, #21
    public void eightBetweenFourIsTwo(){
        System.out.println("Function Div");
        this.calculator.setA(8);
        this.calculator.setB(4);
        double expResult = 2;
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test //-8 / 8 = -1, #22
    public void minusEighthBetweenEightIsMinusOne(){
        System.out.println("Function Div");
        this.calculator.setA(-8);
        this.calculator.setB(8);
        double expResult = -1;
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test // 10 / -5 = -2, #23
    public void tenBetweenMinusFiveIsMinusTwo(){
        System.out.println("Function Div");
        this.calculator.setA(10);
        this.calculator.setB(-5);
        double expResult = -2;
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test // 10 / 0 = Fallo, #24
    public void tenBetweenZeroIsFail(){
        System.out.println("Function Div");
        this.calculator.setA(10);
        this.calculator.setB(0);
        double expResult = 0; //FALLA
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    @Test // 5.5 / 0.5 = 11, #25
    public void fivepfiveBetweenZeropFiveIsEleven(){
        System.out.println("Function Div");
        this.calculator.setA(5.5);
        this.calculator.setB(0.5);
        double expResult = 11;
        double result = this.calculator.div();
        assertEquals(expResult,result,0.0);
    }

    //RAICES SQRT
    @Test //Raiz de 1= 1, #26
    public void oneRootIsOne(){
        System.out.println("Function Sqrt");
        this.calculator.setA(1);
        double expResult = 1;
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }

    @Test //Raiz de 5= 2.2361, #27
    public void fiveRootIs2p23606(){

        System.out.println("Function Sqrt fiveRootIs2p2361v");
        this.calculator.setA(5);
        double expResult = 2.23607;
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }
    @Test //Raiz de 25 = 5, #28
    public void TwentyFiveRootIsFive(){
        System.out.println("Function Sqrt");
        this.calculator.setA(25);
        double expResult = 5;
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }

    @Test //Raiz de -1= ERROR, #29
    public void minusOneRootIsFAIL(){
        System.out.println("Function Sqrt");
        this.calculator.setA(-1);
        double expResult = 0;//FAIL
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }

    @Test //Raiz de 9 = 3, #30
    public void nineRootIsThree(){
        System.out.println("Function Sqrt");
        this.calculator.setA(9);
        double expResult = 3;
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }

    @Test //Raiz de 6.6 = 2.5690, #31
    public void sixpSixRootIs2p5690(){
        System.out.println("Function Sqrt");
        this.calculator.setA(6.6);
        double expResult = 2.56905;
        double result = this.calculator.sqrt();
        assertEquals(expResult,result,0.0);
    }


    //FACTORIALES
    @Test //10 Factorial, #32
    public void tenFactIs3628800(){
        System.out.println("Function n!");
        this.calculator.setA(10);
        double expResult = 3628800;
        double result = this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    @Test //5 Factorial, #33
    public void fiveFactIs120()
    {
        System.out.println("Function n!");
        this.calculator.setA(5);
        double expResult = 120;
        double result = this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    @Test //2.2 Factorial, 2 #34
    public void twopTwoFactIsFAIL()
    {
        System.out.println("Function n!");
        this.calculator.setA(2.2);
        double expResult = 2;
        double result = this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    @Test //-5 Factorial= No se puede numeros negativos; #35
    public void minusFiveIs120()
    {
        System.out.println("Function n!");
        this.calculator.setA(-5);
        double expResult = 0;
        double result = this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    @Test //-3.5 Factorial = FAIL; #36
    public void minusThreeIsFAIL()
    {
        System.out.println("Function n!");
        this.calculator.setA(-3.5);
        double expResult = 0;
        double result = this.calculator.Nfactorial();
        assertEquals(expResult,result,0.0);
    }

    //LOGARITMOS
    @Test //Log (10) = 1; #37
    public void tenLogIsOne(){
        System.out.println("Function Log base 10");
        this.calculator.setA(10);
        double expResult = 1;
        double result = (float) this.calculator.log10();
        assertEquals(expResult,result,0.0);
    }
    @Test //Log (100) = 2; #38
    public void oneHundredLogIsTwo(){
        System.out.println("Function Log base 10");
        this.calculator.setA(100);
        double expResult = 2;
        double result = this.calculator.log10();
        assertEquals(expResult,result,0.0);
    }

    @Test //Log (50) = 1.6989; #39
    public void fiftyLogIs1p6989(){
        System.out.println("Function Log base 10");
        this.calculator.setA(50);
        double expResult = 1.69897;
        double result = this.calculator.log10();
        assertEquals(expResult,result,0.0);
    }

    @Test //Log (-10) = FAIL; #40
    public void minusTenLogIsFAIL(){
        System.out.println("Function Log base 10");
        this.calculator.setA(-10);
        float expResult = 0;
        double result = this.calculator.log10();
        assertEquals(expResult,result,0.0);
    }
    @Test // 6 MOD 9 = 6 ; #41
    public void sixModNine(){
        System.out.println("Function Mod");
        this.calculator.setA(6);
        this.calculator.setB(9);
        float expResult = 6;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    @Test // 10 % 5 = 0; #42
    public void tenModFiveIsZero(){
        System.out.println("Function Mod");
        this.calculator.setA(10);
        this.calculator.setB(5);
        float expResult = 0;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    @Test // 5%0 = FAIL; #43
    public void fiveModZeroIsFail(){
        System.out.println("Function Mod");
        this.calculator.setA(5);
        this.calculator.setB(0);
        float expResult = 0;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    @Test // 10 % -4 = 2; #46
    public void tenModMinusFourIsTwo(){
        System.out.println("Function Mod");
        this.calculator.setA(10);
        this.calculator.setB(-4);
        float expResult = 2;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    @Test // -10 % 3 = -1; # 45
    public void minusTenModThreeIsMinusOne(){
        System.out.println("Function Mod");
        this.calculator.setA(-10);
        this.calculator.setB(3);
        float expResult = -1;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    @Test // 0 % 0 = NaN; #46
    public void zeroModZeroIsNaN(){
        System.out.println("Function Mod 0%0");
        this.calculator.setA(0);
        this.calculator.setB(0);
        float expResult = 0;
        double result = this.calculator.mod();
        assertEquals(expResult,result,0.0);
    }

    //EXPONENCIAL POW x10
    @Test //10^3 = 1000; #47
    public void powThreeIs1000(){
        System.out.println("Function Pow10");
        this.calculator.setA(3);
        double expResult = 1000;
        double result = this.calculator.x10();
        assertEquals(expResult,result,0.0);
    }
    @Test //10^-3 = 0.001; #48
    public void powMinusThreeIs0p001(){
        System.out.println("Function Pow10");
        this.calculator.setA(-3);
        double expResult = 0.001;
        double result = this.calculator.x10();
        assertEquals(expResult,result,0.0);
    }

    @Test //10^0 = 1 ; #49
    public void powZeroIsOne(){
        System.out.println("Function Pow10");
        this.calculator.setA(0);
        double expResult = 1;
        double result = this.calculator.x10();
        assertEquals(expResult,result,0.0);
    }

    @Test //10^2.2 = 158.48932; #50
    public void powTwopTwoIs158p48931(){
        System.out.println("Function Pow10");
        this.calculator.setA(2.2);
        double expResult = 158.48932;
        double result = this.calculator.x10();
        assertEquals(expResult,result,0.0);
    }

    @Test // ATON = ATO #51
    public  void backATONisATO(){
        System.out.println("Function Back => back ATON is ATO");
        this.calculator.setBeforeStr("ATON");
        String expResult = "ATO";
        String result = this.calculator.back();
        assertEquals(expResult,result);

    }




    
}
