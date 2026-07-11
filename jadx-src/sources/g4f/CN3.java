package g4f;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CN3 {
    private static CN3 rl = new CN3();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f67035n;

    public static CN3 t() {
        return rl;
    }

    public Context n() {
        return this.f67035n;
    }

    public void rl(Context context) {
        this.f67035n = context != null ? context.getApplicationContext() : null;
    }

    private CN3() {
    }
}
