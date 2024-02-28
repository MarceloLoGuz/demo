
package com.example.demo.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createUser", namespace = "http://webservice.demo.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", namespace = "http://webservice.demo.example.com/")
public class CreateUser {

    @XmlElement(name = "user", namespace = "")
    private com.example.demo.model.UserModel user;

    /**
     * 
     * @return
     *     returns UserModel
     */
    public com.example.demo.model.UserModel getUser() {
        return this.user;
    }

    /**
     * 
     * @param user
     *     the value for the user property
     */
    public void setUser(com.example.demo.model.UserModel user) {
        this.user = user;
    }

}
