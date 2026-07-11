package com.google.android.recaptcha.internal;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.R6;
import GJW.vd;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbi {
    private final vd zza = Lu.rl();
    private final vd zzb;
    private final vd zzc;
    private final vd zzd;

    public final vd zza() {
        return this.zzc;
    }

    public final vd zzb() {
        return this.zza;
    }

    public final vd zzc() {
        return this.zzd;
    }

    public final vd zzd() {
        return this.zzb;
    }

    public zzbi() {
        vd vdVarN = Lu.n(R6.t(Executors.newSingleThreadExecutor()));
        C.nr(vdVarN, null, null, new zzbh(null), 3, null);
        this.zzb = vdVarN;
        this.zzc = Lu.n(OU.rl());
        vd vdVarN2 = Lu.n(R6.t(Executors.newSingleThreadExecutor()));
        C.nr(vdVarN2, null, null, new zzbg(null), 3, null);
        this.zzd = vdVarN2;
    }
}
