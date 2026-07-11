package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1894c extends j implements UGc {
    C1894c(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.UGc
    public final void B(Bundle bundle, r rVar) {
        Parcel parcelFcU = fcU();
        eO.t(parcelFcU, bundle);
        parcelFcU.writeStrongBinder(rVar);
        eWT(2, parcelFcU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.UGc
    public final void Y(Bundle bundle, r rVar) {
        Parcel parcelFcU = fcU();
        eO.t(parcelFcU, bundle);
        parcelFcU.writeStrongBinder(rVar);
        eWT(3, parcelFcU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.UGc
    public final void n(Bundle bundle, nKK nkk) {
        Parcel parcelFcU = fcU();
        eO.t(parcelFcU, bundle);
        parcelFcU.writeStrongBinder(nkk);
        eWT(6, parcelFcU);
    }
}
