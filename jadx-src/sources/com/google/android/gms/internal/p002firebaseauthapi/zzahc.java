package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzal;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzahc {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahs zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private zzc zzk;
    private List<zzahq> zzl;
    private zzaj<zzal> zzm;

    public zzahc() {
        this.zzf = new zzahs();
        this.zzm = zzaj.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    @Nullable
    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    @NonNull
    public final zzahc zza(zzc zzcVar) {
        this.zzk = zzcVar;
        return this;
    }

    @NonNull
    public final zzahc zzb(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public final zzaj<zzal> zzd() {
        return this.zzm;
    }

    @Nullable
    public final zzc zze() {
        return this.zzk;
    }

    public final zzahs zzf() {
        return this.zzf;
    }

    @Nullable
    public final String zzg() {
        return this.zzd;
    }

    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @NonNull
    public final String zzi() {
        return this.zza;
    }

    @Nullable
    public final String zzj() {
        return this.zzg;
    }

    @NonNull
    public final List<zzahq> zzk() {
        return this.zzl;
    }

    @NonNull
    public final List<zzaht> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    @NonNull
    public final zzahc zza(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @NonNull
    public final zzahc zzc(@Nullable String str) {
        this.zze = str;
        return this;
    }

    public zzahc(String str, String str2, boolean z2, String str3, String str4, zzahs zzahsVar, String str5, String str6, long j2, long j3, boolean z3, zzc zzcVar, List<zzahq> list, zzaj<zzal> zzajVar) {
        zzahs zzahsVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z2;
        this.zzd = str3;
        this.zze = str4;
        if (zzahsVar == null) {
            zzahsVar2 = new zzahs();
        } else {
            List<zzaht> listZza = zzahsVar.zza();
            zzahs zzahsVar3 = new zzahs();
            if (listZza != null) {
                zzahsVar3.zza().addAll(listZza);
            }
            zzahsVar2 = zzahsVar3;
        }
        this.zzf = zzahsVar2;
        this.zzg = str6;
        this.zzh = j2;
        this.zzi = j3;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzajVar;
    }

    public final zzahc zza(boolean z2) {
        this.zzj = z2;
        return this;
    }

    @NonNull
    public final zzahc zza(zzaj<zzal> zzajVar) {
        Preconditions.checkNotNull(zzajVar);
        this.zzm = zzajVar;
        return this;
    }

    @NonNull
    public final zzahc zza(List<zzaht> list) {
        Preconditions.checkNotNull(list);
        zzahs zzahsVar = new zzahs();
        this.zzf = zzahsVar;
        zzahsVar.zza().addAll(list);
        return this;
    }
}
