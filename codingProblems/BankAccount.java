import java.util.*;

public class BankAccount {
        private int accId;
        private double balance;
        public void setAccId(int id){
            accId = id;
        }
        public double getBalance(){
            return balance;
        }
        public void deposite(double amt){
            balance+=amt;
        }
        public void withdraw(double amt){
            balance-=amt;
        }
    
}