package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Q extends Xo implements r {
    @Override // com.google.android.play.integrity.internal.Xo
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            Bundle bundle = (Bundle) eO.n(parcel, Bundle.CREATOR);
            eO.rl(parcel);
            e(bundle);
            return true;
        }
        if (i2 == 3) {
            Bundle bundle2 = (Bundle) eO.n(parcel, Bundle.CREATOR);
            eO.rl(parcel);
            c(bundle2);
            return true;
        }
        if (i2 == 4) {
            Bundle bundle3 = (Bundle) eO.n(parcel, Bundle.CREATOR);
            eO.rl(parcel);
            d(bundle3);
            return true;
        }
        if (i2 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) eO.n(parcel, Bundle.CREATOR);
        eO.rl(parcel);
        b(bundle4);
        return true;
    }

    public Q() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }
}
