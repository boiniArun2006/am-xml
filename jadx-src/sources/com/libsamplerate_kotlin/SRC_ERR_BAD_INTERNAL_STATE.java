package com.libsamplerate_kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/libsamplerate_kotlin/SRC_ERR_BAD_INTERNAL_STATE;", "Ljava/lang/Exception;", "<init>", "()V", "utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SRC_ERR_BAD_INTERNAL_STATE extends Exception {
    public SRC_ERR_BAD_INTERNAL_STATE() {
        super("Error : Someone is trampling on my internal state.");
    }
}
