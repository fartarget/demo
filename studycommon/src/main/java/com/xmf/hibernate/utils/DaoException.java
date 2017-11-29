package com.xmf.hibernate.utils;

import org.springframework.core.NestedRuntimeException;

public class DaoException extends NestedRuntimeException {

    private static final long serialVersionUID = 1L;

    public DaoException(String msg) {
        super(msg);
    }

    public DaoException(String msg, Throwable obj) {
        super(msg, obj);
    }
}
