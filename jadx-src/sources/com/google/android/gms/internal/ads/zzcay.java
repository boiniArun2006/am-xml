package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzcay extends zzbct implements zzcaz {
    public zzcay() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcaz zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzcaz ? (zzcaz) iInterfaceQueryLocalInterface : new zzcax(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcbg zzcbeVar = null;
        zzcbg zzcbeVar2 = null;
        zzcbh zzcbhVar = null;
        zzcbc zzcbaVar = null;
        switch (i2) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbeVar = iInterfaceQueryLocalInterface instanceof zzcbg ? (zzcbg) iInterfaceQueryLocalInterface : new zzcbe(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzc(zzmVar, zzcbeVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbaVar = iInterfaceQueryLocalInterface2 instanceof zzcbc ? (zzcbc) iInterfaceQueryLocalInterface2 : new zzcba(strongBinder2);
                }
                zzbcu.zzh(parcel);
                zze(zzcbaVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i5 = zzbcu.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcbhVar = iInterfaceQueryLocalInterface3 instanceof zzcbh ? (zzcbh) iInterfaceQueryLocalInterface3 : new zzcbh(strongBinder3);
                }
                zzbcu.zzh(parcel);
                zzs(zzcbhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcbn zzcbnVar = (zzcbn) zzbcu.zzb(parcel, zzcbn.CREATOR);
                zzbcu.zzh(parcel);
                zzh(zzcbnVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzf(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcaw zzcawVarZzl = zzl();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcawVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzm = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzeaVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcbeVar2 = iInterfaceQueryLocalInterface4 instanceof zzcbg ? (zzcbg) iInterfaceQueryLocalInterface4 : new zzcbe(strongBinder4);
                }
                zzbcu.zzh(parcel);
                zzd(zzmVar2, zzcbeVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j2 = parcel.readLong();
                zzbcu.zzh(parcel);
                zzr(j2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
