package com.google.firebase.sessions;

import android.content.Context;
import androidx.content.core.DataStore;
import com.google.firebase.sessions.n;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f60797n;

    public static Ml n(InterfaceC2342j interfaceC2342j) {
        return new Ml(interfaceC2342j);
    }

    public static DataStore t(Context context) {
        return (DataStore) ep.Ml.nr(n.InterfaceC0812n.f60819n.rl(context));
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public DataStore get() {
        return t((Context) this.f60797n.get());
    }

    public Ml(InterfaceC2342j interfaceC2342j) {
        this.f60797n = interfaceC2342j;
    }
}
