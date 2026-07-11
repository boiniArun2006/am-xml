package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaar implements zzafn<zzaic> {
    private final /* synthetic */ zzaid zza;
    private final /* synthetic */ zzahc zzb;
    private final /* synthetic */ zzaeg zzc;
    private final /* synthetic */ zzahn zzd;
    private final /* synthetic */ zzafk zze;
    private final /* synthetic */ zzaam zzf;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafk
    public final void zza(@Nullable String str) {
        this.zze.zza(str);
    }

    zzaar(zzaam zzaamVar, zzaid zzaidVar, zzahc zzahcVar, zzaeg zzaegVar, zzahn zzahnVar, zzafk zzafkVar) {
        this.zza = zzaidVar;
        this.zzb = zzahcVar;
        this.zzc = zzaegVar;
        this.zzd = zzahnVar;
        this.zze = zzafkVar;
        this.zzf = zzaamVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafn
    public final /* synthetic */ void zza(zzaic zzaicVar) {
        zzaic zzaicVar2 = zzaicVar;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            Preconditions.checkNotEmpty(Base64Utils.encode("redacted".getBytes()));
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzaj.zzh());
        }
        List<zzaht> listZze = zzaicVar2.zze();
        if (listZze == null) {
            listZze = new ArrayList<>();
        }
        this.zzb.zza(listZze);
        zzaeg zzaegVar = this.zzc;
        zzahn zzahnVar = this.zzd;
        Preconditions.checkNotNull(zzahnVar);
        Preconditions.checkNotNull(zzaicVar2);
        String strZzc = zzaicVar2.zzc();
        String strZzd = zzaicVar2.zzd();
        if (!TextUtils.isEmpty(strZzc) && !TextUtils.isEmpty(strZzd)) {
            zzahnVar = new zzahn(strZzd, strZzc, Long.valueOf(zzaicVar2.zza()), zzahnVar.zze());
        }
        zzaegVar.zza(zzahnVar, this.zzb);
    }
}
