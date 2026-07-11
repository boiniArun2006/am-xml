package mCM;

import com.google.android.gms.tasks.Task;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.functions.n f70658n;
    private final eO nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final URL f70659t;

    public QJ(com.google.firebase.functions.n functionsClient, String str, eO options) {
        Intrinsics.checkNotNullParameter(functionsClient, "functionsClient");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f70658n = functionsClient;
        this.rl = str;
        this.f70659t = null;
        this.nr = options;
    }

    public final Task n() {
        String str = this.rl;
        if (str != null) {
            return this.f70658n.mUb(str, null, this.nr);
        }
        com.google.firebase.functions.n nVar = this.f70658n;
        URL url = this.f70659t;
        Intrinsics.checkNotNull(url);
        return nVar.gh(url, null, this.nr);
    }

    public final Task rl(Object obj) {
        String str = this.rl;
        if (str != null) {
            return this.f70658n.mUb(str, obj, this.nr);
        }
        com.google.firebase.functions.n nVar = this.f70658n;
        URL url = this.f70659t;
        Intrinsics.checkNotNull(url);
        return nVar.gh(url, obj, this.nr);
    }
}
