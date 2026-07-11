package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzes extends zzei {
    private final zzdn zza;
    private final Level zzb;
    private final Set zzc;
    private final zzea zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzes(String str, @NullableDecl String str2, boolean z2, zzdn zzdnVar, boolean z3, boolean z4) {
        super(str2);
        Level level = Level.ALL;
        Set set = zzeu.zza;
        zzea zzeaVar = zzeu.zzb;
        this.zza = zzdnVar;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzeaVar;
    }
}
