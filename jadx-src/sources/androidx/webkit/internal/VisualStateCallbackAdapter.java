package androidx.webkit.internal;

import androidx.webkit.WebViewCompat;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class VisualStateCallbackAdapter implements VisualStateCallbackBoundaryInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WebViewCompat.VisualStateCallback f42526n;

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j2) {
        this.f42526n.onComplete(j2);
    }
}
