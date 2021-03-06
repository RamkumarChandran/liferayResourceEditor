package com.rcs.i18n.common.model.impl;

import com.rcs.i18n.common.model.BaseModel;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "MessageSource")
public class MessageSource extends BaseModel {

    @Column(name = "resourceKey", nullable = false)
    @Index(name = "resourcekey_index")
    private String key;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    @Column(name = "resourceValue", nullable = false)
    @Type(type = "org.hibernate.type.TextType")
    private String value;

    @Column(name = "resouerceLocale", nullable = false)
    private String locale;

    @Column(name = "resouerceBundle", nullable = true)
    private String bundle;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }
}
