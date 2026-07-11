package androidx.browser.trusted;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Token {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TokenContents f14612n;

    public boolean n(String str, PackageManager packageManager) {
        return PackageIdentityUtils.t(str, packageManager, this.f14612n);
    }
}
