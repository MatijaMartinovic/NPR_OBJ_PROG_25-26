package pckg_snd_vj4;

public interface PaymenTransactionCmd {

    void execute();
    void undo();
    void redo();
}
