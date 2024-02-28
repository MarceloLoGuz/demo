
package com.example.demo.webservice.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllUsersResponse", namespace = "http://webservice.demo.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllUsersResponse", namespace = "http://webservice.demo.example.com/")
public class GetAllUsersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.example.demo.model.UserModel> _return;

    /**
     * 
     * @return
     *     returns List<UserModel>
     */
    public List<com.example.demo.model.UserModel> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.example.demo.model.UserModel> _return) {
        this._return = _return;
    }

}
