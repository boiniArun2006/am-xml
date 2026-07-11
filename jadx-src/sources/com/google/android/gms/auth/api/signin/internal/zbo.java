package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zbc();
        } else {
            if (i2 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }

    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}
