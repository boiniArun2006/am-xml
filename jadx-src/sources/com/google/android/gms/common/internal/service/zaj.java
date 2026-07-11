package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        int i5 = parcel.readInt();
        com.google.android.gms.internal.base.zac.zab(parcel);
        zab(i5);
        return true;
    }

    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }
}
