package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f59544a;

    private q() {
    }

    /* synthetic */ q(p pVar) {
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        qz.n(this.f59544a, Context.class);
        return new s(this.f59544a, null);
    }

    public final q a(Context context) {
        context.getClass();
        this.f59544a = context;
        return this;
    }
}
