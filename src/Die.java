public class Die {

    private final int MINVALUE= 1;
    private final int MAXVALUE = 6;
    public int faceValue = MINVALUE;

    public void roll() {
        int sideCount = (getMaxValue() - getMinValue()+1);
        faceValue = (int) (mathRandom() * sideCount) + getMinValue();
        System.out.println(faceValue);

    }

    protected double mathRandom(){
        return Math.random();
    }

    public int getFaceValue(){
        return faceValue;
    }

    public int getMinValue() {
        return MINVALUE;
    }

    public int getMaxValue() {
        return MAXVALUE;
    }
}
