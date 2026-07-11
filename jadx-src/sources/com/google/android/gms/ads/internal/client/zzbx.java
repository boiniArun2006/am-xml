package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzcam;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface zzbx extends IInterface {
    boolean zzA() throws RemoteException;

    boolean zzB() throws RemoteException;

    void zzC(@Nullable zzcam zzcamVar) throws RemoteException;

    void zzD(String str) throws RemoteException;

    void zzE(String str) throws RemoteException;

    zzed zzF() throws RemoteException;

    void zzG(@Nullable zzga zzgaVar) throws RemoteException;

    void zzH(@Nullable zzeh zzehVar) throws RemoteException;

    void zzI(zzx zzxVar) throws RemoteException;

    void zzJ(zzbfa zzbfaVar) throws RemoteException;

    void zzK(boolean z2) throws RemoteException;

    void zzP(zzdt zzdtVar) throws RemoteException;

    void zzQ(zzm zzmVar, zzbn zzbnVar) throws RemoteException;

    void zzR(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzS(zzcv zzcvVar) throws RemoteException;

    void zzT(long j2) throws RemoteException;

    long zzU() throws RemoteException;

    void zzY(zzcs zzcsVar) throws RemoteException;

    IObjectWrapper zzb() throws RemoteException;

    void zzc() throws RemoteException;

    boolean zzd() throws RemoteException;

    void zzdR(@Nullable zzbk zzbkVar) throws RemoteException;

    boolean zze(zzm zzmVar) throws RemoteException;

    void zzf() throws RemoteException;

    void zzg() throws RemoteException;

    void zzi(@Nullable zzco zzcoVar) throws RemoteException;

    void zzj(@Nullable zzcb zzcbVar) throws RemoteException;

    Bundle zzk() throws RemoteException;

    void zzl() throws RemoteException;

    void zzm() throws RemoteException;

    zzr zzn() throws RemoteException;

    void zzo(zzr zzrVar) throws RemoteException;

    void zzp(zzbyb zzbybVar) throws RemoteException;

    void zzq(zzbye zzbyeVar, String str) throws RemoteException;

    String zzr() throws RemoteException;

    String zzs() throws RemoteException;

    zzea zzt() throws RemoteException;

    String zzu() throws RemoteException;

    zzco zzv() throws RemoteException;

    zzbk zzw() throws RemoteException;

    void zzx(@Nullable zzbhz zzbhzVar) throws RemoteException;

    void zzy(@Nullable zzbh zzbhVar) throws RemoteException;

    void zzz(boolean z2) throws RemoteException;
}
