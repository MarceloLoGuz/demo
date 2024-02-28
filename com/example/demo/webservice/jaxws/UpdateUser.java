
package com.example.demo.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateUser", namespace = "http://webservice.demo.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUser", namespace = "http://webservice.demo.example.com/", propOrder = {
    "id",
    "user"
})
public class UpdateUser {

    @XmlElement(name = "id", namespace = "")
    private Long id;
    @XmlElement(name = "user", namespace = "")
    private com.example.demo.model.UserModel user;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     *     the value for the id property
     */
    public void setId(Long id) {
        this.id = id;
    }

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
