package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class afx extends Xo implements Z {
    @Override // com.google.android.play.integrity.internal.Xo
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) eO.n(parcel, Bundle.CREATOR);
        eO.rl(parcel);
        b(bundle);
        return true;
    }

    public afx() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }
}
