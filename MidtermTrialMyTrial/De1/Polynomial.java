package MidtermTrialMyTrial.De1;

public interface Polynomial {
    public double coefficientAt(int); 

    public double coefficients();

    public int degree();

    public Polynomial derivative();

    public double evaluate(double);

    public void insertAtEnd(double);

    public void insertAtPosition(double);

    public void insertAtStart(double);

    public void set(int, double);
 }
