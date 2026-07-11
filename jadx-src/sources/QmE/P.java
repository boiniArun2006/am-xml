package QmE;

import QmE.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class P implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8353n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.areEqual(this.f8353n, ((P) obj).f8353n);
    }

    public P(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8353n = url;
    }

    public int hashCode() {
        return this.f8353n.hashCode();
    }

    public final String n() {
        return this.f8353n;
    }

    public String toString() {
        return "UseTemplateTapped(url=" + this.f8353n + ")";
    }
}
