package com.caoccao.javet.exceptions;

import com.caoccao.javet.utils.SimpleMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetTerminatedException extends JavetException {
    protected boolean continuable;

    public JavetTerminatedException(boolean z2) {
        super(JavetError.ExecutionTerminated, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_CONTINUABLE, Boolean.valueOf(z2)));
        this.continuable = z2;
    }

    public boolean isContinuable() {
        return this.continuable;
    }
}
