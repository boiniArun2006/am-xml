package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f59551a;

    private u() {
    }

    /* synthetic */ u(t tVar) {
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        qz.n(this.f59551a, Context.class);
        return new w(this.f59551a, null);
    }

    public final u a(Context context) {
        context.getClass();
        this.f59551a = context;
        return this;
    }
}
