package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f59480a;

    static synchronized aw a(Context context) {
        try {
            if (f59480a == null) {
                u uVar = new u(null);
                uVar.a(CN3.n(context));
                f59480a = uVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f59480a;
    }
}
