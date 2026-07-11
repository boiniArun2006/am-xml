package g4f;

import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r1j.j f67039n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a88.fuX f67040t;

    public String n() {
        return this.nr;
    }

    public String nr() {
        return this.rl;
    }

    public a88.fuX rl() {
        return this.f67040t;
    }

    public r1j.j t() {
        return this.f67039n;
    }

    public I28(View view, a88.fuX fux, String str) {
        this.f67039n = new r1j.j(view);
        this.rl = view.getClass().getCanonicalName();
        this.f67040t = fux;
        this.nr = str;
    }
}
