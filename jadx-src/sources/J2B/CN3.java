package J2B;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CN3 {
    private static CN3 rl = new CN3();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f4416n;

    public static CN3 t() {
        return rl;
    }

    public Context n() {
        return this.f4416n;
    }

    public void rl(Context context) {
        this.f4416n = context != null ? context.getApplicationContext() : null;
    }

    private CN3() {
    }
}
