package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzcz extends zzbm implements zzda {
    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
            long j2 = parcel.readLong();
            zzbn.zzf(parcel);
            zze(string, string2, bundle, j2);
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            int iZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(iZzf);
        }
        return true;
    }

    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
}
