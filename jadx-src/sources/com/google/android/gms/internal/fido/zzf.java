package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzf extends zzb implements zzg {
    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ArrayList arrayListZzb = zzc.zzb(parcel);
            zzc.zzc(parcel);
            zzb(arrayListZzb);
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

    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }
}
