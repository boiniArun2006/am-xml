package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class zzaj extends zzb implements zzak {
    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i2 == 2) {
            zzc(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i2 != 3) {
                return false;
            }
            zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
        }
        return true;
    }

    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }
}
