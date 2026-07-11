package com.caoccao.javet.interfaces;

import com.caoccao.javet.exceptions.JavetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IJavetClosable extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close() throws JavetException;

    boolean isClosed();
}
