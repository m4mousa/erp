package com.newage.erp.core.utli;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 *
 * @author mohammed
 */
public class Helper {

    public static void addFacesMessage(Severity severity, String summary) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, msg(summary), null));
    }

    public static String msg(String key) {
        try {
            return FacesContext
                    .getCurrentInstance()
                    .getApplication()
                    .getResourceBundle(FacesContext.getCurrentInstance(), "msg").getString(key);
        } catch (Exception e) {
            return key;
        }
    }
}
