package com.mivors.model.bi.integration.type.collection;

import com.mivors.model.bi.integration.type.EducationNoOfChildren;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROWSET")
@XmlAccessorType(XmlAccessType.FIELD)

public class EducationNoOfChildrenCollection implements TatweerCollection {

    
    @XmlElement(name="ROW")
    private List<EducationNoOfChildren> eduNoOfChilds;
    
    public EducationNoOfChildrenCollection() {
        super();
        eduNoOfChilds=new ArrayList<EducationNoOfChildren>();
    }

    public void setEduNoOfChilds(List<EducationNoOfChildren> empChilds) {
        this.eduNoOfChilds = empChilds;
    }

    public List<EducationNoOfChildren> getEduNoOfChilds() {
        return eduNoOfChilds;
    }
}

