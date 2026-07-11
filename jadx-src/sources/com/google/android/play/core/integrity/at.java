package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.Pl;
import com.google.android.play.integrity.internal.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pl f59476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pl f59477b;

    at(Pl pl, Pl pl3) {
        this.f59476a = pl;
        this.f59477b = pl3;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, Wre wre) {
        Object objA = this.f59476a.a();
        objA.getClass();
        k kVar = (k) this.f59477b.a();
        kVar.getClass();
        activity.getClass();
        wre.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, wre);
    }
}
