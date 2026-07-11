package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Deprecated
public class BrowserActionItem {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Runnable f14497O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f14498n;
    private Uri nr;
    private final PendingIntent rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14499t;

    public String O() {
        return this.f14498n;
    }

    public PendingIntent n() {
        PendingIntent pendingIntent = this.rl;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    Runnable nr() {
        return this.f14497O;
    }

    public int rl() {
        return this.f14499t;
    }

    public Uri t() {
        return this.nr;
    }
}
