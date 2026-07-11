package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzcge extends zzcld, zzclg, zzbrd {
    Context getContext();

    void setBackgroundColor(int i2);

    void zzA(int i2);

    void zzB(int i2);

    @Nullable
    zzcft zzdm();

    void zzdn(boolean z2);

    @Nullable
    zzckr zzh();

    @Nullable
    zzbhq zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i2);

    int zzp();

    zzbhr zzq();

    @Nullable
    zzchr zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzchr zzchrVar);

    void zzu(boolean z2, long j2);

    void zzv(int i2);

    void zzw(zzckr zzckrVar);

    int zzx();

    int zzy();

    void zzz();
}
