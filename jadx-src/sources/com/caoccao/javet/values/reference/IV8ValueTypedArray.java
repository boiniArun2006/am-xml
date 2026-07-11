package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface IV8ValueTypedArray extends IV8ValueObject {
    V8ValueArrayBuffer getBuffer() throws JavetException;

    int getByteLength() throws JavetException;

    int getByteOffset() throws JavetException;

    int getLength() throws JavetException;

    int getSizeInBytes();

    boolean isValid();
}
