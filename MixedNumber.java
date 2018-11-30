import java.util.*;

public class MixedNumber implements Comparable<MixedNumber>{
    private long integer;
    private Rational fraction;
    
    public MixedNumber(){
        this(0, 0, 1);
    }

    public MixedNumber(long i, long n, long d){
        integer = i + n/d;
        fraction = new Rational(n%d, d);
    }

    public void setInteger (long i){
        integer = i;
    }

    public long getInteger(){
        return integer;
    }

    public MixedNumber add(MixedNumber num){

        Rational firstNum = convert(this);
        Rational secondNum = convert(num);

        Rational added = firstNum.add(secondNum);

        long i = (added.getNumerator() / added.getDenominator());
        long n = (added.getNumerator() % added.getDenominator());

        return new MixedNumber(i, n, added.getDenominator());
    }

    public MixedNumber subtract(MixedNumber num){
        Rational firstNum = convert(this);
        Rational secondNum = convert(num);

        Rational subtracted = firstNum.subtract(secondNum);

        long i = (int)(subtracted.getNumerator() / subtracted.getDenominator());
        long n = (int)(subtracted.getNumerator() % subtracted.getDenominator());

        return new MixedNumber(i, n, subtracted.getDenominator());
    }

    public MixedNumber multiply(MixedNumber num){
        Rational firstNum = convert(this);
        Rational secondNum = convert(num);

        Rational multiplied = firstNum.multiply(secondNum);

        long i = (int)(multiplied.getNumerator() / multiplied.getDenominator());
        long n = (int)(multiplied.getNumerator() % multiplied.getDenominator());

        return new MixedNumber(i, n, multiplied.getDenominator());
    }

    public MixedNumber divide(MixedNumber num){
        Rational firstNum = convert(this);
        Rational secondNum = convert(num);

        Rational divided = firstNum.divide(secondNum);

        long i = (int)(divided.getNumerator() / divided.getDenominator());
        long n = (int)(divided.getNumerator() % divided.getDenominator());

        return new MixedNumber(i, n, divided.getDenominator());
    }

    public boolean equals(MixedNumber num){
        if(this.integer == num.integer && this.fraction.getNumerator() == num.fraction.getNumerator() && this.fraction.getDenominator() == num.fraction.getDenominator()){
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(MixedNumber numCompare){
        Rational firstNum = convert(this);
        Rational secondNum = convert(numCompare);

        if(firstNum.getNumerator() / firstNum.getDenominator() > secondNum.getNumerator() / secondNum.getDenominator()){
            return 1;
        } else if(firstNum.getNumerator() / firstNum.getDenominator() < secondNum.getNumerator() / secondNum.getDenominator()){
            return -1;
        }else {
            return 0;
        }
    }

    public String toString(){
        
        if(fraction.getNumerator() == 0){
            return ""+integer;
        }
        return integer + " " + fraction.toString();
    }

    public Rational convert(MixedNumber numConvert){
        return new Rational(numConvert.fraction.getDenominator() * numConvert.getInteger() + numConvert.fraction.getNumerator(), numConvert.fraction.getDenominator());
    }
}