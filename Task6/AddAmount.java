package AS1T6;
public class AddAmount {
    static int amount = 50;
    static int trans=0;
    AddAmount()
    {
        trans++;
    }
    AddAmount(int a)
    {
        amount=amount+a;
        trans++;
    }
    void final_amount()
    {
        System.out.println("Final amount in Saving Box "+amount);
    }
    void transaction()
    {
        System.out.println("Total transactions "+trans);
    }
    public static void main(String[] args) {
        AddAmount a1=new AddAmount();
        a1.final_amount();
        a1.transaction();
        AddAmount a2=new AddAmount(30);
        a2.final_amount();
        a2.transaction();
        }
    }