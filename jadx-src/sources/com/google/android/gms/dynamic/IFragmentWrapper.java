package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @NonNull
        public static IFragmentWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i2, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i3) throws RemoteException {
            switch (i2) {
                case 2:
                    IObjectWrapper iObjectWrapperZzb = zzb();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzb);
                    return true;
                case 3:
                    Bundle bundleZzc = zzc();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, bundleZzc);
                    return true;
                case 4:
                    int iZzd = zzd();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzd);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperZze = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iFragmentWrapperZze);
                    return true;
                case 6:
                    IObjectWrapper iObjectWrapperZzf = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzf);
                    return true;
                case 7:
                    boolean zZzg = zzg();
                    parcel2.writeNoException();
                    int i5 = zzc.zza;
                    parcel2.writeInt(zZzg ? 1 : 0);
                    return true;
                case 8:
                    String strZzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzh);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperZzi = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iFragmentWrapperZzi);
                    return true;
                case 10:
                    int iZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzj);
                    return true;
                case 11:
                    boolean zZzk = zzk();
                    parcel2.writeNoException();
                    int i7 = zzc.zza;
                    parcel2.writeInt(zZzk ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperZzl = zzl();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzl);
                    return true;
                case 13:
                    boolean zZzm = zzm();
                    parcel2.writeNoException();
                    int i8 = zzc.zza;
                    parcel2.writeInt(zZzm ? 1 : 0);
                    return true;
                case 14:
                    boolean zZzn = zzn();
                    parcel2.writeNoException();
                    int i9 = zzc.zza;
                    parcel2.writeInt(zZzn ? 1 : 0);
                    return true;
                case 15:
                    boolean zZzo = zzo();
                    parcel2.writeNoException();
                    int i10 = zzc.zza;
                    parcel2.writeInt(zZzo ? 1 : 0);
                    return true;
                case 16:
                    boolean zZzp = zzp();
                    parcel2.writeNoException();
                    int i11 = zzc.zza;
                    parcel2.writeInt(zZzp ? 1 : 0);
                    return true;
                case 17:
                    boolean zZzq = zzq();
                    parcel2.writeNoException();
                    int i12 = zzc.zza;
                    parcel2.writeInt(zZzq ? 1 : 0);
                    return true;
                case 18:
                    boolean zZzr = zzr();
                    parcel2.writeNoException();
                    int i13 = zzc.zza;
                    parcel2.writeInt(zZzr ? 1 : 0);
                    return true;
                case 19:
                    boolean zZzs = zzs();
                    parcel2.writeNoException();
                    int i14 = zzc.zza;
                    parcel2.writeInt(zZzs ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzf(parcel);
                    zzt(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZza = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzu(zZza);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZza2 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzv(zZza2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zZza3 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzw(zZza3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zZza4 = zzc.zza(parcel);
                    zzc.zzf(parcel);
                    zzx(zZza4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zzb(parcel, Intent.CREATOR);
                    zzc.zzf(parcel);
                    zzy(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zzb(parcel, Intent.CREATOR);
                    int i15 = parcel.readInt();
                    zzc.zzf(parcel);
                    zzz(intent2, i15);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzf(parcel);
                    zzA(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void zzA(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    @NonNull
    IObjectWrapper zzb() throws RemoteException;

    @Nullable
    Bundle zzc() throws RemoteException;

    int zzd() throws RemoteException;

    @Nullable
    IFragmentWrapper zze() throws RemoteException;

    @NonNull
    IObjectWrapper zzf() throws RemoteException;

    boolean zzg() throws RemoteException;

    @Nullable
    String zzh() throws RemoteException;

    @Nullable
    IFragmentWrapper zzi() throws RemoteException;

    int zzj() throws RemoteException;

    boolean zzk() throws RemoteException;

    @NonNull
    IObjectWrapper zzl() throws RemoteException;

    boolean zzm() throws RemoteException;

    boolean zzn() throws RemoteException;

    boolean zzo() throws RemoteException;

    boolean zzp() throws RemoteException;

    boolean zzq() throws RemoteException;

    boolean zzr() throws RemoteException;

    boolean zzs() throws RemoteException;

    void zzt(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzu(boolean z2) throws RemoteException;

    void zzv(boolean z2) throws RemoteException;

    void zzw(boolean z2) throws RemoteException;

    void zzx(boolean z2) throws RemoteException;

    void zzy(@NonNull Intent intent) throws RemoteException;

    void zzz(@NonNull Intent intent, int i2) throws RemoteException;
}
