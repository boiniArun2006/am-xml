package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzml extends zzmg {
    String zzS();

    default boolean zzU(long j2) {
        return false;
    }

    default void zzV(float f3, float f4) throws zziw {
    }

    default void zzW() {
    }

    void zzX(long j2, long j3) throws zziw;

    boolean zzY();

    boolean zzZ();

    int zza();

    zzmn zzb();

    void zzc(int i2, zzpq zzpqVar, zzdn zzdnVar);

    void zzcT() throws zziw;

    void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j2, long j3, zzwk zzwkVar) throws zziw;

    @Nullable
    zzyc zzcV();

    boolean zzcW();

    @Nullable
    zzlm zzd();

    int zze();

    void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j2, boolean z2, boolean z3, long j3, long j4, zzwk zzwkVar) throws zziw;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j2, boolean z2) throws zziw;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }

    default long zzT(long j2, long j3) {
        if (zze() != 1) {
            return 10000L;
        }
        if (!zzY() && !zzZ()) {
            return 10000L;
        }
        return 1000000L;
    }
}
