package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f59564a;

    static synchronized s a(Context context) {
        try {
            if (f59564a == null) {
                q qVar = new q(null);
                qVar.a(CN3.n(context));
                f59564a = qVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f59564a;
    }
}
