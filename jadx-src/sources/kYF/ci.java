package kYF;

import android.content.Context;
import kotlin.io.FilesKt;
import r1.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ci f69944n = new ci();
    private static r1.j rl;

    public final synchronized r1.j n(Context context) {
        r1.j jVarN;
        jVarN = rl;
        if (jVarN == null) {
            jVarN = new j.C1145j().rl(FilesKt.resolve(C.qie(context), "image_cache")).n();
            rl = jVarN;
        }
        return jVarN;
    }

    private ci() {
    }
}
