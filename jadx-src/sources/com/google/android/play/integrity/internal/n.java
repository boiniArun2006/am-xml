package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ IBinder f59582n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ I28 f59583t;

    n(I28 i28, IBinder iBinder) {
        this.f59583t = i28;
        this.f59582n = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.u
    public final void b() {
        this.f59583t.f59567n.ty = (IInterface) this.f59583t.f59567n.xMQ.a(this.f59582n);
        Wre.r(this.f59583t.f59567n);
        this.f59583t.f59567n.Uo = false;
        Iterator it = this.f59583t.f59567n.nr.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f59583t.f59567n.nr.clear();
    }
}
