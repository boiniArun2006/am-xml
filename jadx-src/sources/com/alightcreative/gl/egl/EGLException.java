package com.alightcreative.gl.egl;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import dQG.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/gl/egl/EGLException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", MRAIDPresenter.ERROR, "", "functionName", "<init>", "(ILjava/lang/String;)V", c.f62177j, "I", "()I", "t", "Ljava/lang/String;", "getFunctionName", "()Ljava/lang/String;", "getMessage", "message", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EGLException extends RuntimeException {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int error;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String functionName;

    public EGLException(int i2, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        this.error = i2;
        this.functionName = functionName;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return StringsKt.trimIndent("\n            EGL Error occurred.\n            Error: " + n.rl(this) + "\n            Hex: 0x" + n.n(this) + "\n            Function: " + this.functionName + "\n        ");
    }
}
