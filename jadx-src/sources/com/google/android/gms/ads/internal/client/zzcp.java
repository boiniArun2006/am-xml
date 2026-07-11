package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdd;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzcp extends zzbcs implements zzcr {
    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaj zzf(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) throws RemoteException {
        throw null;
    }

    zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbtt zzbttVar, int i2) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) iInterfaceQueryLocalInterface;
            } else {
                zzbvVar = new zzbv(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbtt zzbttVar, int i2) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) iInterfaceQueryLocalInterface;
            } else {
                zzbvVar = new zzbv(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(IObjectWrapper iObjectWrapper, String str, zzbtt zzbttVar, int i2) throws RemoteException {
        zzbt zzbrVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (iInterfaceQueryLocalInterface instanceof zzbt) {
                zzbrVar = (zzbt) iInterfaceQueryLocalInterface;
            } else {
                zzbrVar = new zzbr(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbkw zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, iObjectWrapper2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbkw zzbkwVarZzdF = zzbkv.zzdF(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbkwVarZzdF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxs zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        zzbxs zzbxsVarZzI = zzbxr.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbxsVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) throws RemoteException {
        zzck zzciVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzciVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            if (iInterfaceQueryLocalInterface instanceof zzck) {
                zzciVar = (zzck) iInterfaceQueryLocalInterface;
            } else {
                zzciVar = new zzci(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzciVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdb zzczVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzczVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (iInterfaceQueryLocalInterface instanceof zzdb) {
                zzczVar = (zzdb) iInterfaceQueryLocalInterface;
            } else {
                zzczVar = new zzcz(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzczVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i2) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) iInterfaceQueryLocalInterface;
            } else {
                zzbvVar = new zzbv(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzblc zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, iObjectWrapper2);
        zzbcu.zze(parcelZza, iObjectWrapper3);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        zzblc zzblcVarZze = zzblb.zze(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzblcVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaz zzl(IObjectWrapper iObjectWrapper, String str, zzbtt zzbttVar, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzcaz zzcazVarZzt = zzcay.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzcazVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbtt zzbttVar, int i2) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(dpcnwfoVOnrtRA.LAOoHGDLNnweQ);
            if (iInterfaceQueryLocalInterface instanceof zzbx) {
                zzbvVar = (zzbx) iInterfaceQueryLocalInterface;
            } else {
                zzbvVar = new zzbv(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcdd zzn(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzcdd zzcddVarZzb = zzcdc.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzcddVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxl zzo(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        zzbxl zzbxlVarZzb = zzbxk.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbxlVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbpk zzp(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2, zzbph zzbphVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbcu.zze(parcelZza, zzbphVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        zzbpk zzbpkVarZzb = zzbpj.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbpkVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) throws RemoteException {
        zzdw zzduVar;
        Parcel parcelZza = zza();
        zzbcu.zze(parcelZza, iObjectWrapper);
        zzbcu.zze(parcelZza, zzbttVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzduVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (iInterfaceQueryLocalInterface instanceof zzdw) {
                zzduVar = (zzdw) iInterfaceQueryLocalInterface;
            } else {
                zzduVar = new zzdu(strongBinder);
            }
        }
        parcelZzcZ.recycle();
        return zzduVar;
    }
}
