package code.src.interfaces;

public interface IProcessFlow {
    public void init(String apiLink);
    public void preProcess();
    public void process();
    public void postProcess();
}
