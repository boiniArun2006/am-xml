package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    private static final int zze(int i2, float f3) {
        if (f3 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i2 / f3);
    }

    private static final Insets zzf(Insets insets, float f3) {
        return f3 == 0.0f ? Insets.f36409O : Insets.t((int) Math.ceil(insets.f36410n / f3), (int) Math.ceil(insets.rl / f3), (int) Math.ceil(insets.f36411t / f3), (int) Math.ceil(insets.nr / f3));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zzk(this.zza.zza(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfbg) obj);
            }
        }, zzcei.zzg);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzetj, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x02d9: MOVE (r19v0 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:731)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01a5: MOVE (r19v4 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:423)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x01ce: MOVE (r19v5 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:464)
          (r3v1 com.google.android.gms.internal.ads.zzetj) from 0x0180: MOVE (r19v7 com.google.android.gms.internal.ads.zzetj) = (r3v1 com.google.android.gms.internal.ads.zzetj) (LINE:386)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzetj zzc(com.google.android.gms.internal.ads.zzfbg r22) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc(com.google.android.gms.internal.ads.zzfbg):com.google.android.gms.internal.ads.zzetj");
    }

    @RequiresApi
    private static final int zzd(WindowInsets windowInsets, int i2) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i2);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }
}
