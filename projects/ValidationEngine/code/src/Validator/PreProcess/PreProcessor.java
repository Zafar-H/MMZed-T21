package PreProcess;

import FormValidator.Validator;
import Input.CommonValidation;
import Input.DynamicValidation;
import Input.FormInput;
import code.src.interfaces.IPreProcessor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PreProcessor implements IPreProcessor {
    public static final Logger logger = LogManager.getLogger( PreProcessor.class );
    private FormInput formInputData = new FormInput();
    private CommonValidation commonValidationData = new CommonValidation();
    private DynamicValidation dynamicValidationData = new DynamicValidation();
    private Validator formValidator = new Validator();

    public PreProcessor()
    {

    }

    public void override()
    {
        logger.trace("Method to override validations - under construction");
    }

}
