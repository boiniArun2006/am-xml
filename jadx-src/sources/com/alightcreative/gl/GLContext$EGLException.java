package com.alightcreative.gl;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/alightcreative/gl/GLContext$EGLException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GLContext$EGLException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public GLContext$EGLException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GLContext$EGLException(String str) {
        super(str);
    }

    public /* synthetic */ GLContext$EGLException(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str);
    }
}
