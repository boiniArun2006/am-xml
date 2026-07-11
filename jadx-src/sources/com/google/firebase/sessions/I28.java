package com.google.firebase.sessions;

import android.content.Context;
import androidx.content.core.DataStore;
import com.google.firebase.sessions.n;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f60796n;

    public static I28 n(InterfaceC2342j interfaceC2342j) {
        return new I28(interfaceC2342j);
    }

    public static DataStore t(Context context) {
        return (DataStore) ep.Ml.nr(n.InterfaceC0812n.f60819n.t(context));
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public DataStore get() {
        return t((Context) this.f60796n.get());
    }

    public I28(InterfaceC2342j interfaceC2342j) {
        this.f60796n = interfaceC2342j;
    }
}
