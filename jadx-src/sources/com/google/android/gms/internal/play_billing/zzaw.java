package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzaw extends zzar implements zzax {
    @Override // com.google.android.gms.internal.play_billing.zzar
    protected final boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        int i5 = parcel.readInt();
        zzas.zzb(parcel);
        zza(i5);
        return true;
    }

    public zzaw() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }
}
