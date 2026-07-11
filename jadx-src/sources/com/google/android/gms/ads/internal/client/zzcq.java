package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzcq extends zzbct implements zzcr {
    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbtt zzbttVarZzf = zzbts.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzbttVarZzf, i5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzb);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbtt zzbttVarZzf2 = zzbts.zzf(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzc = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzbttVarZzf2, i7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbtt zzbttVarZzf3 = zzbts.zzf(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbt zzbtVarZzd = zzd(iObjectWrapperAsInterface3, string3, zzbttVarZzf3, i8);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbtVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbkw zzbkwVarZze = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbkwVarZze);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf4 = zzbts.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaj zzcajVarZzf = zzf(iObjectWrapperAsInterface6, zzbttVarZzf4, i9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcajVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbxs zzbxsVarZzg = zzg(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxsVarZzg);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdb zzdbVarZzi = zzi(iObjectWrapperAsInterface8, i10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzdbVarZzi);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i11 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzj = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i11);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzj);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzblc zzblcVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzblcVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbtt zzbttVarZzf5 = zzbts.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaz zzcazVarZzl = zzl(iObjectWrapperAsInterface13, string5, zzbttVarZzf5, i12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcazVarZzl);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbcu.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbtt zzbttVarZzf6 = zzbts.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbx zzbxVarZzm = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzbttVarZzf6, i13);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxVarZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf7 = zzbts.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcdd zzcddVarZzn = zzn(iObjectWrapperAsInterface15, zzbttVarZzf7, i14);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzcddVarZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf8 = zzbts.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbxl zzbxlVarZzo = zzo(iObjectWrapperAsInterface16, zzbttVarZzf8, i15);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbxlVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf9 = zzbts.zzf(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzbph zzbphVarZzc = zzbpg.zzc(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbpk zzbpkVarZzp = zzp(iObjectWrapperAsInterface17, zzbttVarZzf9, i16, zzbphVarZzc);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzbpkVarZzp);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf10 = zzbts.zzf(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzdw zzdwVarZzq = zzq(iObjectWrapperAsInterface18, zzbttVarZzf10, i17);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzdwVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzf11 = zzbts.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzck zzckVarZzh = zzh(iObjectWrapperAsInterface19, zzbttVarZzf11, i18);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzckVarZzh);
                return true;
            default:
                return false;
        }
    }

    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }
}
