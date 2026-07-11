package androidx.webkit.internal;

import androidx.webkit.ScriptHandler;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ScriptHandlerImpl implements ScriptHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f42518n;

    public static ScriptHandlerImpl n(InvocationHandler invocationHandler) {
        return new ScriptHandlerImpl((ScriptHandlerBoundaryInterface) SuF.j.n(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    private ScriptHandlerImpl(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f42518n = scriptHandlerBoundaryInterface;
    }
}
