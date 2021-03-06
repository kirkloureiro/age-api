
package wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 * wsimport -d . -p wsclient -keep http://localhost:1212/exame?wsdl
 * 
 */
@WebService(name = "ExameWS", targetNamespace = "http://ws/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExameWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://ws/ExameWS/updateExamRequest", output = "http://ws/ExameWS/updateExamResponse")
    public void updateExam(
        @WebParam(name = "arg0", partName = "arg0")
        Exame arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://ws/ExameWS/createExamRequest", output = "http://ws/ExameWS/createExamResponse")
    public void createExam(
        @WebParam(name = "arg0", partName = "arg0")
        Exame arg0);

    /**
     * 
     * @return
     *     returns wsclient.ArrayList
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws/ExameWS/readAllExamsRequest", output = "http://ws/ExameWS/readAllExamsResponse")
    public ArrayList readAllExams();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://ws/ExameWS/deleteExamRequest", output = "http://ws/ExameWS/deleteExamResponse")
    public void deleteExam(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

}
