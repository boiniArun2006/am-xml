package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface zzga extends IInterface {
    void zzA(zzr zzrVar) throws RemoteException;

    void zzB(zzr zzrVar, zzon zzonVar, zzgg zzggVar) throws RemoteException;

    void zzC(zzr zzrVar, zzaf zzafVar) throws RemoteException;

    void zzD(zzr zzrVar, Bundle bundle, zzgd zzgdVar) throws RemoteException;

    void zze(zzbg zzbgVar, zzr zzrVar) throws RemoteException;

    void zzf(zzpk zzpkVar, zzr zzrVar) throws RemoteException;

    void zzg(zzr zzrVar) throws RemoteException;

    void zzh(zzbg zzbgVar, String str, @Nullable String str2) throws RemoteException;

    void zzi(zzr zzrVar) throws RemoteException;

    @Nullable
    List zzj(zzr zzrVar, boolean z2) throws RemoteException;

    @Nullable
    byte[] zzk(zzbg zzbgVar, String str) throws RemoteException;

    void zzl(long j2, @Nullable String str, @Nullable String str2, String str3) throws RemoteException;

    @Nullable
    String zzm(zzr zzrVar) throws RemoteException;

    void zzn(zzah zzahVar, zzr zzrVar) throws RemoteException;

    void zzo(zzah zzahVar) throws RemoteException;

    List zzp(@Nullable String str, @Nullable String str2, boolean z2, zzr zzrVar) throws RemoteException;

    List zzq(String str, @Nullable String str2, @Nullable String str3, boolean z2) throws RemoteException;

    List zzr(@Nullable String str, @Nullable String str2, zzr zzrVar) throws RemoteException;

    List zzs(String str, @Nullable String str2, @Nullable String str3) throws RemoteException;

    void zzt(zzr zzrVar) throws RemoteException;

    void zzu(Bundle bundle, zzr zzrVar) throws RemoteException;

    void zzv(zzr zzrVar) throws RemoteException;

    zzao zzw(zzr zzrVar) throws RemoteException;

    List zzx(zzr zzrVar, Bundle bundle) throws RemoteException;

    void zzy(zzr zzrVar) throws RemoteException;

    void zzz(zzr zzrVar) throws RemoteException;
}
