package code.src;

import Init.Initiator;
import PostProcess.PostProcessor;
import PreProcess.PreProcessor;
import Process.Processor;
import code.src.interfaces.IProcessFlow;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ValidationEngine implements IProcessFlow
{
    private static final Logger logger = LogManager.getLogger( ValidationEngine.class );
    //private Initiator initiator = new Initiator("example_link.com");
    private PreProcessor preProcessor = new PreProcessor();
    private Processor processor = new Processor();
    private PostProcessor postProcessor = new PostProcessor();

    public ValidationEngine(String apiLink)
    {
        init(apiLink);
    }

    public void init(String apiLink) {
        Initiator initiator = new Initiator(apiLink);
    }


    public void preProcess() {

    }


    public void process() {

    }


    public void postProcess() {

    }
}