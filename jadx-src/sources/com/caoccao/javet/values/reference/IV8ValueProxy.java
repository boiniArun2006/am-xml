package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface IV8ValueProxy extends IV8ValueObject {
    IV8ValueObject getHandler() throws JavetException;

    IV8ValueObject getTarget() throws JavetException;

    boolean isRevoked() throws JavetException;

    void revoke() throws JavetException;
}
