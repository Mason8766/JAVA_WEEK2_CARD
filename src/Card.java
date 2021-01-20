public class Card {
    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * This is a constructor. It does not have a return type.
     * The name must be the same of the class
     * You can have overloaded constructors
     * @param faceName - ACE EXAMPLE
     * @param suit - ACE EXAMPLE
     * @param faceValue - ACE EXAMPLE
     */
    //Constructor
    public Card(String faceName, String suit, int faceValue)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(faceValue);

    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }
}
