package pckg_snd_vj4;

import java.util.Stack;

public class MobAccApp {

    private PaymenTransactionCmd paymenTransactionCmd;
    private Stack<PaymenTransactionCmd> undoStack;
    private Stack<PaymenTransactionCmd> redoStack;

    public MobAccApp(){
        System.out.println("Created mobile transaction app...");
        undoStack = new Stack<>();
        redoStack = new Stack<>();

    }

    public void setPaymenTransactionCmd(PaymenTransactionCmd paymenTransactionCmd){
        this.paymenTransactionCmd = paymenTransactionCmd;
    }

    public void performTransaction(){
        paymenTransactionCmd.execute();
        undoStack.add(paymenTransactionCmd);
    }

    public void undoTransaction(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo!");
        }else{
            paymenTransactionCmd = undoStack.pop();
            paymenTransactionCmd.undo();
            redoStack.add(paymenTransactionCmd);
        }
    }

    public void redoTransaction(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to redo!");
        }else{
            paymenTransactionCmd = redoStack.pop();
            paymenTransactionCmd.redo();
            undoStack.add(paymenTransactionCmd);
        }
    }
}
