
package src.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2.9
 * 
 */
@XmlRootElement(name = "ServletException", namespace = "http://localhost:8080/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServletException", namespace = "http://localhost:8080/", propOrder = {
    "message",
    "rootCause"
})
public class ServletExceptionBean {

    private String message;
    private Throwable rootCause;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     returns Throwable
     */
    public Throwable getRootCause() {
        return this.rootCause;
    }

    /**
     * 
     * @param rootCause
     *     the value for the rootCause property
     */
    public void setRootCause(Throwable rootCause) {
        this.rootCause = rootCause;
    }

}
