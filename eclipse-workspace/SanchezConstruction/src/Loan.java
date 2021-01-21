
import java.util.InputMismatchException;
public abstract class Loan  implements LoanConstants{

	private String loanNum;
    private String lastName;
    private double loanAmt;
    protected double interestRate;
    private int term;
    
    Loan(String loanNum, String lastName, double loanAmt, int term) {
        this.loanNum = loanNum;
        this.lastName = lastName.toUpperCase();
        
       
        try {
            if (loanAmt > maxLoanAmount) {
                throw (new InputMismatchException("Loan amount value is over $100,000.00"));
            } else {
                this.loanAmt = loanAmt;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
       
        switch (term) {
            case mediumTerm:
            case longTerm:
                this.term = term;
                break;
                
            case shortTerm:
            default:
                this.term = 1;
                break;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s\t\t%s\t\t$%,.2f\t%.2f%%\t\t%d\t\t$%,.2f",
               this.loanNum, this.lastName, this.loanAmt, this.interestRate * 100,
               this.term, this.loanAmt + (this.loanAmt * this.interestRate));
    }
}


