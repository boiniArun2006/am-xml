package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzbzg extends zzbct implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    protected final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbzl zzbzjVar = null;
        zzbzm zzbzmVar = null;
        zzbzl zzbzjVar2 = null;
        zzbzl zzbzjVar3 = null;
        zzbzl zzbzjVar4 = null;
        switch (i2) {
            case 1:
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbzi;
                }
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbzu zzbzuVar = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzjVar = iInterfaceQueryLocalInterface instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface : new zzbzj(strongBinder2);
                }
                zzbcu.zzh(parcel);
                zze(zzbzuVar, zzbzjVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbzu zzbzuVar2 = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzjVar4 = iInterfaceQueryLocalInterface2 instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface2 : new zzbzj(strongBinder3);
                }
                zzbcu.zzh(parcel);
                zzf(zzbzuVar2, zzbzjVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbzu zzbzuVar3 = (zzbzu) zzbcu.zzb(parcel, zzbzu.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzjVar3 = iInterfaceQueryLocalInterface3 instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface3 : new zzbzj(strongBinder4);
                }
                zzbcu.zzh(parcel);
                zzg(zzbzuVar3, zzbzjVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbzjVar2 = iInterfaceQueryLocalInterface4 instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface4 : new zzbzj(strongBinder5);
                }
                zzbcu.zzh(parcel);
                zzh(string, zzbzjVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbzd zzbzdVar = (zzbzd) zzbcu.zzb(parcel, zzbzd.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbzmVar = iInterfaceQueryLocalInterface5 instanceof zzbzm ? (zzbzm) iInterfaceQueryLocalInterface5 : new zzbzm(strongBinder6);
                }
                zzbcu.zzh(parcel);
                zzj(zzbzdVar, zzbzmVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzbcu.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
