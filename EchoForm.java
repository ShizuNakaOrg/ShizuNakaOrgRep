package aaa.bbb.form;

import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Msg;

public class EchoForm {
    @Required(msg=@Msg(key="errors.nameRequired"))
    public String name;

}
