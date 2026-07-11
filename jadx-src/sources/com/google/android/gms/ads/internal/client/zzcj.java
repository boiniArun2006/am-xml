package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzcj extends zzbct implements zzck {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzce zzccVar = null;
        zzch zzcfVar = null;
        switch (i2) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(strongBinder);
                }
                zzbcu.zzh(parcel);
                zze(arrayListCreateTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzcaz zzcazVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcazVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbex zzbexVarZzi = zzi(string4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbexVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzk = zzk(string6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzk);
                return true;
            case 8:
                zzbts.zzf(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzft zzftVar = (zzft) zzbcu.zzb(parcel, zzft.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzbcu.zzh(parcel);
                boolean zZzm = zzm(string7, zzftVar, zzcfVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i5 = parcel.readInt();
                String string8 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zZzn = zzn(i5, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzo = zzo(string9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzbcu.zzh(parcel);
                zzbex zzbexVarZzp = zzp(string10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbexVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzbcu.zzh(parcel);
                zzcaz zzcazVarZzq = zzq(string11);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcazVarZzq);
                return true;
            case 14:
                int i7 = parcel.readInt();
                String string12 = parcel.readString();
                zzbcu.zzh(parcel);
                zzft zzftVarZzr = zzr(i7, string12);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzftVarZzr);
                return true;
            case 15:
                int i8 = parcel.readInt();
                zzbcu.zzh(parcel);
                Bundle bundleZzs = zzs(i8);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, bundleZzs);
                return true;
            case 16:
                int i9 = parcel.readInt();
                String string13 = parcel.readString();
                zzbcu.zzh(parcel);
                int iZzt = zzt(i9, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i10 = parcel.readInt();
                String string14 = parcel.readString();
                zzbcu.zzh(parcel);
                boolean zZzu = zzu(i10, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i11 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzv(i11);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }
}
