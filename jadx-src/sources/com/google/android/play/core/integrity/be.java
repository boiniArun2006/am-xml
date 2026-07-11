package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class be extends com.google.android.play.integrity.internal.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f59491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f59492b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f59492b = bnVar;
        this.f59491a = context;
    }

    @Override // com.google.android.play.integrity.internal.u
    protected final void b() {
        this.f59492b.f59518d.trySetResult(Integer.valueOf(Dsr.n(this.f59491a)));
    }
}
