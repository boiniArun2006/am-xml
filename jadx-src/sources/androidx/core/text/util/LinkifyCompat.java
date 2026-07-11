package androidx.core.text.util;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.text.util.LinkifyCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class LinkifyCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f36653n = new String[0];
    private static final Comparator rl = new Comparator() { // from class: androidx.core.text.util.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LinkifyCompat.n((LinkifyCompat.LinkSpec) obj, (LinkifyCompat.LinkSpec) obj2);
        }
    };

    @RequiresApi
    static class Api24Impl {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LinkSpec {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f36654n;
        int rl;
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LinkifyMask {
    }

    public static /* synthetic */ int n(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i2 = linkSpec.f36654n;
        int i3 = linkSpec2.f36654n;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return Integer.compare(linkSpec2.rl, linkSpec.rl);
    }
}
