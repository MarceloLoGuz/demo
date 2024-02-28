
package com.example.demo.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteUser", namespace = "http://webservice.demo.example.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteUser", namespace = "http://webservice.demo.example.com/")
public class DeleteUser {

    @XmlElement(name = "id", namespace = "")
    private Long id;

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

}
