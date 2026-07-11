package androidx.webkit.internal;

import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class WebMessageCallbackAdapter implements WebMessageCallbackBoundaryInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebMessagePortCompat.WebMessageCallbackCompat f42529n;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatRl = WebMessageAdapter.rl((WebMessageBoundaryInterface) SuF.j.n(WebMessageBoundaryInterface.class, invocationHandler2));
        if (webMessageCompatRl != null) {
            this.f42529n.n(new WebMessagePortImpl(invocationHandler), webMessageCompatRl);
        }
    }
}
