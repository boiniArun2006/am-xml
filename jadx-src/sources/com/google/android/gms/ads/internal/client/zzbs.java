package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrb;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzbs extends zzbct implements zzbt {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbk zzbiVar = null;
        zzcs zzcsVar = null;
        switch (i2) {
            case 1:
                zzbq zzbqVarZze = zze();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbqVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzbcu.zzh(parcel);
                zzf(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzblq zzblqVarZzb = zzblp.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzg(zzblqVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzblt zzbltVarZzb = zzbls.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzh(zzbltVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzblz zzblzVarZzb = zzbly.zzb(parcel.readStrongBinder());
                zzblw zzblwVarZzb = zzblv.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzi(string, zzblzVarZzb, zzblwVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                zzbcu.zzh(parcel);
                zzj(zzbkhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcs(strongBinder2);
                }
                zzbcu.zzh(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbmd zzbmdVarZzb = zzbmc.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                zzbcu.zzh(parcel);
                zzk(zzbmdVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbcu.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzbcu.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbmg zzbmgVarZzb = zzbmf.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzm(zzbmgVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbqs zzbqsVar = (zzbqs) zzbcu.zzb(parcel, zzbqs.CREATOR);
                zzbcu.zzh(parcel);
                zzn(zzbqsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbrb zzbrbVarZzb = zzbra.zzb(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzo(zzbrbVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbcu.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzbcu.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }

    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }
}
