package ddf;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ml implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f63532n;
    private final j rl;

    @Override // ddf.CN3
    public Wre get() {
        return new w6(new aC(), new I28(this.f63532n, this.rl), new fuX(), new Dsr(), new aC(), new n(this.f63532n, this.rl));
    }

    public Ml(Context context) {
        this.f63532n = context;
        j jVar = new j(5);
        this.rl = jVar;
        jVar.n(context.getApplicationInfo().sourceDir);
    }
}
