package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzd extends zzb implements zze {
    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            int i5 = zzc.zza;
            boolean z2 = parcel.readInt() != 0;
            zzc.zzc(parcel);
            zzb(z2);
        } else {
            if (i2 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }
}
