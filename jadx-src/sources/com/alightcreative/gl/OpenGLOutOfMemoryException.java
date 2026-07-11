package com.alightcreative.gl;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/gl/OpenGLOutOfMemoryException;", "Lcom/alightcreative/gl/OpenGLException;", "message", "", "<init>", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenGLOutOfMemoryException extends OpenGLException {
    /* JADX WARN: Multi-variable type inference failed */
    public OpenGLOutOfMemoryException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OpenGLOutOfMemoryException(String str) {
        super(str);
    }

    public /* synthetic */ OpenGLOutOfMemoryException(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str);
    }
}
