package JP;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static List f4565n;
    private static boolean rl;

    static synchronized List n() {
        rl = true;
        return f4565n;
    }
}
