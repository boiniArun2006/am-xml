package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class SPz extends j implements g9s {
    SPz(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.g9s
    public final void J2(Bundle bundle, Z z2) {
        Parcel parcelFcU = fcU();
        eO.t(parcelFcU, bundle);
        parcelFcU.writeStrongBinder(z2);
        eWT(2, parcelFcU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.g9s
    public final void n(Bundle bundle, nKK nkk) {
        Parcel parcelFcU = fcU();
        eO.t(parcelFcU, bundle);
        parcelFcU.writeStrongBinder(nkk);
        eWT(3, parcelFcU);
    }
}
