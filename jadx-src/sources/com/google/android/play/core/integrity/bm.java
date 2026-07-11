package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class bm extends com.google.android.play.integrity.internal.u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f59514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(@Nullable bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f59514f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.u
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (bn.k(this.f59514f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
