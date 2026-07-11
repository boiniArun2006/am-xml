package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IBinder f59577n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f59578t;

    protected j(IBinder iBinder, String str) {
        this.f59577n = iBinder;
        this.f59578t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f59577n;
    }

    protected final void eWT(int i2, Parcel parcel) {
        try {
            this.f59577n.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel fcU() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f59578t);
        return parcelObtain;
    }
}
