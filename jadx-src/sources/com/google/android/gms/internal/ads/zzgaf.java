package com.google.android.gms.internal.ads;

import GJW.vd;
import androidx.content.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgaf implements zzfyv {
    private final vd zza;
    private final yB.j zzb;
    private final yB.j zzc;
    private final yB.j zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzdvj zzi;

    public zzgaf(DataStore adQualityDataStore, zzfzh coroutineScopeProvider, zzdvj dataPinger, zzfze clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = yB.CN3.rl(false, 1, null);
        this.zzc = yB.CN3.rl(false, 1, null);
        this.zzd = yB.CN3.rl(false, 1, null);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(String str, Continuation continuation) throws Throwable {
        zzfzk zzfzkVar;
        yB.j jVar;
        Throwable th;
        yB.j jVar2;
        if (continuation instanceof zzfzk) {
            zzfzkVar = (zzfzk) continuation;
            int i2 = zzfzkVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzkVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzkVar = new zzfzk(this, continuation);
            }
        }
        Object obj = zzfzkVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzkVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzd;
                zzfzkVar.zza = str;
                zzfzkVar.zzb = jVar;
                zzfzkVar.zze = 1;
                if (jVar.Z(null, zzfzkVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) zzfzkVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    jVar2.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar3 = (yB.j) zzfzkVar.zzb;
            String str2 = (String) zzfzkVar.zza;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            str = str2;
            DataStore dataStore = this.zzh;
            zzfzl zzfzlVar = new zzfzl(str, null);
            zzfzkVar.zza = jVar;
            zzfzkVar.zzb = null;
            zzfzkVar.zze = 2;
            Object objN = dataStore.n(zzfzlVar, zzfzkVar);
            if (objN != coroutine_suspended) {
                yB.j jVar4 = jVar;
                obj = objN;
                jVar2 = jVar4;
                jVar2.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            yB.j jVar5 = jVar;
            th = th3;
            jVar2 = jVar5;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(Continuation continuation) throws Throwable {
        zzfzn zzfznVar;
        yB.j jVar;
        yB.j jVar2;
        Throwable th;
        if (continuation instanceof zzfzn) {
            zzfznVar = (zzfzn) continuation;
            int i2 = zzfznVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfznVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzfznVar = new zzfzn(this, continuation);
            }
        }
        Object obj = zzfznVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfznVar.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzd;
                zzfznVar.zza = jVar;
                zzfznVar.zzd = 1;
                if (jVar.Z(null, zzfznVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) zzfznVar.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                    jVar2.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar3 = (yB.j) zzfznVar.zza;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            DataStore dataStore = this.zzh;
            zzfzo zzfzoVar = new zzfzo(null);
            zzfznVar.zza = jVar;
            zzfznVar.zzd = 2;
            Object objN = dataStore.n(zzfzoVar, zzfznVar);
            if (objN != coroutine_suspended) {
                jVar2 = jVar;
                obj = objN;
                jVar2.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar2 = jVar;
            th = th3;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(long j2, Continuation continuation) {
        zzfzm zzfzmVar;
        yB.j jVar;
        if (continuation instanceof zzfzm) {
            zzfzmVar = (zzfzm) continuation;
            int i2 = zzfzmVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzmVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzmVar = new zzfzm(this, continuation);
            }
        }
        Object obj = zzfzmVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzmVar.zze;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            yB.j jVar2 = this.zzb;
            zzfzmVar.zzb = jVar2;
            zzfzmVar.zza = j2;
            zzfzmVar.zze = 1;
            if (jVar2.Z(null, zzfzmVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = jVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzfzmVar.zza;
            jVar = (yB.j) zzfzmVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfyt zzfytVar2 = this.zzf;
            if (zzfytVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar2 = null;
            }
            long jZzi = j2 - zzfytVar2.zzi();
            zzfyt zzfytVar3 = this.zzf;
            if (zzfytVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar3 = null;
            }
            zzfytVar.zzb(jZzi - zzfytVar3.zzg());
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(Continuation continuation) throws Throwable {
        zzfzr zzfzrVar;
        yB.j jVar;
        yB.j jVar2;
        zzfyu zzfyuVar;
        yB.j jVar3;
        if (continuation instanceof zzfzr) {
            zzfzrVar = (zzfzr) continuation;
            int i2 = zzfzrVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzrVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzrVar = new zzfzr(this, continuation);
            }
        }
        Object objN = zzfzrVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzrVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN);
                jVar = this.zzb;
                zzfzrVar.zza = jVar;
                zzfzrVar.zze = 1;
                if (jVar.Z(null, zzfzrVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar3 = (yB.j) zzfzrVar.zza;
                    try {
                        ResultKt.throwOnFailure(objN);
                        jVar3.T(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        jVar3.T(null);
                        throw th;
                    }
                }
                jVar2 = (yB.j) zzfzrVar.zzb;
                zzfyuVar = (zzfyu) zzfzrVar.zza;
                ResultKt.throwOnFailure(objN);
                try {
                    DataStore dataStore = this.zzh;
                    zzfzs zzfzsVar = new zzfzs(zzfyuVar, null);
                    zzfzrVar.zza = jVar2;
                    zzfzrVar.zzb = null;
                    zzfzrVar.zze = 3;
                    objN = dataStore.n(zzfzsVar, zzfzrVar);
                    if (objN != coroutine_suspended) {
                        jVar3 = jVar2;
                        jVar3.T(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    jVar3 = jVar2;
                    jVar3.T(null);
                    throw th;
                }
            }
            jVar = (yB.j) zzfzrVar.zza;
            ResultKt.throwOnFailure(objN);
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfyu zzfyuVar2 = (zzfyu) zzfytVar.zzbu();
            jVar.T(null);
            Intrinsics.checkNotNull(zzfyuVar2);
            jVar2 = this.zzd;
            zzfzrVar.zza = zzfyuVar2;
            zzfzrVar.zzb = jVar2;
            zzfzrVar.zze = 2;
            if (jVar2.Z(null, zzfzrVar) != coroutine_suspended) {
                zzfyuVar = zzfyuVar2;
                DataStore dataStore2 = this.zzh;
                zzfzs zzfzsVar2 = new zzfzs(zzfyuVar, null);
                zzfzrVar.zza = jVar2;
                zzfzrVar.zzb = null;
                zzfzrVar.zze = 3;
                objN = dataStore2.n(zzfzsVar2, zzfzrVar);
                if (objN != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar.T(null);
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        GJW.C.nr(this.zza, null, null, new zzgaa(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        GJW.C.nr(this.zza, null, null, new zzfzu(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        GJW.C.nr(this.zza, null, null, new zzfzq(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        GJW.C.nr(this.zza, null, null, new zzgae(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        GJW.C.nr(this.zza, null, null, new zzfzy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        GJW.C.nr(this.zza, null, null, new zzgac(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        GJW.C.nr(this.zza, null, null, new zzfzw(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(Continuation continuation) {
        zzfzz zzfzzVar;
        yB.j jVar;
        zzfyy zzfyyVar;
        if (continuation instanceof zzfzz) {
            zzfzzVar = (zzfzz) continuation;
            int i2 = zzfzzVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzzVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzfzzVar = new zzfzz(this, continuation);
            }
        }
        Object objG = zzfzzVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = zzfzzVar.zzd;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(objG);
                yB.j jVar2 = this.zzd;
                zzfzzVar.zza = jVar2;
                zzfzzVar.zzd = 1;
                if (jVar2.Z(null, zzfzzVar) != coroutine_suspended) {
                    jVar = jVar2;
                }
                return coroutine_suspended;
            }
            if (r2 == 1) {
                yB.j jVar3 = (yB.j) zzfzzVar.zza;
                ResultKt.throwOnFailure(objG);
                jVar = jVar3;
            } else {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objG);
                    return Unit.INSTANCE;
                }
                yB.j jVar4 = (yB.j) zzfzzVar.zza;
                ResultKt.throwOnFailure(objG);
                r2 = jVar4;
                zzfyyVar = (zzfyy) objG;
                if (zzfyyVar != null || zzfyyVar.zza() == 0) {
                    return Unit.INSTANCE;
                }
                for (Map.Entry entry : zzfyyVar.zzb().entrySet()) {
                    zzibl zziblVarZzcc = ((zzfyu) entry.getValue()).zzcc();
                    Intrinsics.checkNotNullExpressionValue(zziblVarZzcc, "toBuilder(...)");
                    zzfyt zzfytVar = (zzfyt) zziblVarZzcc;
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                    if (zzw((zzfyu) value)) {
                        zzfytVar.zzf(true);
                    }
                    zzdvj zzdvjVar = this.zzi;
                    zzibr zzibrVarZzbu = zzfytVar.zzbu();
                    Intrinsics.checkNotNullExpressionValue(zzibrVarZzbu, "build(...)");
                    zzdvjVar.zza((zzfyu) zzibrVarZzbu);
                }
                zzfzzVar.zza = null;
                zzfzzVar.zzd = 3;
            }
            TFv.Wre data = this.zzh.getData();
            zzfzzVar.zza = jVar;
            zzfzzVar.zzd = 2;
            objG = TFv.fuX.g(data, zzfzzVar);
            r2 = jVar;
            if (objG != coroutine_suspended) {
                zzfyyVar = (zzfyy) objG;
                if (zzfyyVar != null) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } finally {
            r2.T(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, Continuation continuation) {
        zzfzt zzfztVar;
        String str2;
        yB.j jVar;
        long j2;
        if (continuation instanceof zzfzt) {
            zzfztVar = (zzfzt) continuation;
            int i2 = zzfztVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfztVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfztVar = new zzfzt(this, continuation);
            }
        }
        Object obj = zzfztVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfztVar.zze;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            yB.j jVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfztVar.zzf = str;
            zzfztVar.zza = jVar2;
            zzfztVar.zzb = jCurrentTimeMillis;
            zzfztVar.zze = 1;
            if (jVar2.Z(null, zzfztVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            jVar = jVar2;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzfztVar.zzb;
            jVar = (yB.j) zzfztVar.zza;
            str2 = zzfztVar.zzf;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (this.zze) {
                return Unit.INSTANCE;
            }
            this.zze = true;
            zzibl zziblVarZzcc = zzfyu.zzp().zzcc();
            Intrinsics.checkNotNullExpressionValue(zziblVarZzcc, "toBuilder(...)");
            zzfyt zzfytVar = (zzfyt) zziblVarZzcc;
            this.zzf = zzfytVar;
            if (zzfytVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfytVar.zza(str2);
            zzfytVar.zzj(j2);
            jVar.T(null);
            return Unit.INSTANCE;
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (zzv(r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x0087, B:35:0x008b, B:38:0x0094), top: B:51:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(Continuation continuation) {
        zzfzp zzfzpVar;
        yB.j jVar;
        yB.j jVar2;
        long j2;
        zzfyt zzfytVar;
        if (continuation instanceof zzfzp) {
            zzfzpVar = (zzfzp) continuation;
            int i2 = zzfzpVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzpVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzpVar = new zzfzp(this, continuation);
            }
        }
        Object obj = zzfzpVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzpVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzc;
                zzfzpVar.zza = jVar;
                zzfzpVar.zze = 1;
                if (jVar.Z(null, zzfzpVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 == 1) {
                jVar = (yB.j) zzfzpVar.zza;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 == 2) {
                    j2 = zzfzpVar.zzb;
                    jVar2 = (yB.j) zzfzpVar.zza;
                    ResultKt.throwOnFailure(obj);
                    try {
                        zzfytVar = this.zzf;
                        if (zzfytVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzfytVar = null;
                        }
                        zzfytVar.zzo(j2);
                        jVar.T(null);
                        zzfzpVar.zza = null;
                        zzfzpVar.zze = 3;
                        if (zzu(j2, zzfzpVar) != coroutine_suspended) {
                            zzfzpVar.zze = 4;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                zzfzpVar.zze = 4;
            }
            if (this.zzg) {
                return Unit.INSTANCE;
            }
            this.zzg = true;
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            jVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfzpVar.zza = jVar2;
            zzfzpVar.zzb = jCurrentTimeMillis;
            zzfzpVar.zze = 2;
            if (jVar2.Z(null, zzfzpVar) != coroutine_suspended) {
                j2 = jCurrentTimeMillis;
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                }
                zzfytVar.zzo(j2);
                jVar.T(null);
                zzfzpVar.zza = null;
                zzfzpVar.zze = 3;
                if (zzu(j2, zzfzpVar) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzk(Continuation continuation) {
        zzgad zzgadVar;
        yB.j jVar;
        yB.j jVar2;
        long j2;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        if (continuation instanceof zzgad) {
            zzgadVar = (zzgad) continuation;
            int i2 = zzgadVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgadVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzgadVar = new zzgad(this, continuation);
            }
        }
        Object obj = zzgadVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzgadVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzc;
                zzgadVar.zza = jVar;
                zzgadVar.zze = 1;
                if (jVar.Z(null, zzgadVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = zzgadVar.zzb;
                jVar2 = (yB.j) zzgadVar.zza;
                ResultKt.throwOnFailure(obj);
                try {
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    if (zzfytVar.zzr() > 0) {
                        zzfyt zzfytVar4 = this.zzf;
                        if (zzfytVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzfytVar4 = null;
                        }
                        List listZzq = zzfytVar4.zzq();
                        Intrinsics.checkNotNullExpressionValue(listZzq, "getAdClickTimestampsMsList(...)");
                        Object objLast = CollectionsKt.last((List<? extends Object>) listZzq);
                        Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
                        long jLongValue = j2 - ((Number) objLast).longValue();
                        zzfyt zzfytVar5 = this.zzf;
                        if (zzfytVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzfytVar5 = null;
                        }
                        zzfytVar5.zzt();
                        if (jLongValue < 5000) {
                            zzfyt zzfytVar6 = this.zzf;
                            if (zzfytVar6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzfytVar6 = null;
                            }
                            zzfytVar6.zzd(zzfytVar6.zzc() + 1);
                        }
                    }
                    zzfytVar2 = this.zzf;
                    if (zzfytVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar2 = null;
                    }
                    if (zzfytVar2.zzn() > 0) {
                        zzfyt zzfytVar7 = this.zzf;
                        if (zzfytVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzfytVar7 = null;
                        }
                        List listZzm = zzfytVar7.zzm();
                        Intrinsics.checkNotNullExpressionValue(listZzm, "getAppBackgroundTimestampsMsList(...)");
                        Object objLast2 = CollectionsKt.last((List<? extends Object>) listZzm);
                        Intrinsics.checkNotNullExpressionValue(objLast2, "last(...)");
                        long jLongValue2 = j2 - ((Number) objLast2).longValue();
                        zzfyt zzfytVar8 = this.zzf;
                        if (zzfytVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                            zzfytVar8 = null;
                        }
                        zzfytVar8.zzh(zzfytVar8.zzg() + jLongValue2);
                    }
                    zzfytVar3 = this.zzf;
                    if (zzfytVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar3 = null;
                    }
                    zzfytVar3.zzp(j2);
                    jVar.T(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jVar = (yB.j) zzgadVar.zza;
            ResultKt.throwOnFailure(obj);
            if (!this.zzg) {
                return Unit.INSTANCE;
            }
            this.zzg = false;
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            yB.j jVar3 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgadVar.zza = jVar3;
            zzgadVar.zzb = jCurrentTimeMillis;
            zzgadVar.zze = 2;
            if (jVar3.Z(null, zzgadVar) != coroutine_suspended) {
                jVar2 = jVar3;
                j2 = jCurrentTimeMillis;
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                }
                if (zzfytVar.zzr() > 0) {
                }
                zzfytVar2 = this.zzf;
                if (zzfytVar2 == null) {
                }
                if (zzfytVar2.zzn() > 0) {
                }
                zzfytVar3 = this.zzf;
                if (zzfytVar3 == null) {
                }
                zzfytVar3.zzp(j2);
                jVar.T(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        if (zzs(r14, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Continuation continuation) {
        zzfzx zzfzxVar;
        yB.j jVar;
        yB.j jVar2;
        long j2;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        zzfyt zzfytVar4;
        zzfyt zzfytVar5;
        zzfyu zzfyuVar;
        if (continuation instanceof zzfzx) {
            zzfzxVar = (zzfzx) continuation;
            int i2 = zzfzxVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzxVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzxVar = new zzfzx(this, continuation);
            }
        }
        Object obj = zzfzxVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzxVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzb;
                zzfzxVar.zza = jVar;
                zzfzxVar.zze = 1;
                if (jVar.Z(null, zzfzxVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    zzfyuVar = (zzfyu) zzfzxVar.zza;
                    ResultKt.throwOnFailure(obj);
                    if (this.zzi.zza(zzfyuVar)) {
                        String strZza = zzfyuVar.zza();
                        Intrinsics.checkNotNullExpressionValue(strZza, "getGwsQueryId(...)");
                        zzfzxVar.zza = null;
                        zzfzxVar.zze = 4;
                    }
                    return Unit.INSTANCE;
                }
                j2 = zzfzxVar.zzb;
                jVar2 = (yB.j) zzfzxVar.zza;
                ResultKt.throwOnFailure(obj);
                try {
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfytVar2 = this.zzf;
                    if (zzfytVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar2 = null;
                    }
                    long jZzi = j2 - zzfytVar2.zzi();
                    zzfytVar3 = this.zzf;
                    if (zzfytVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar3 = null;
                    }
                    zzfytVar.zzb(jZzi - zzfytVar3.zzg());
                    zzfytVar4 = this.zzf;
                    if (zzfytVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar4 = null;
                    }
                    zzfytVar4.zzl(j2);
                    zzfytVar5 = this.zzf;
                    if (zzfytVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar5 = null;
                    }
                    zzfyu zzfyuVar2 = (zzfyu) zzfytVar5.zzbu();
                    jVar.T(null);
                    Intrinsics.checkNotNull(zzfyuVar2);
                    zzfzxVar.zza = zzfyuVar2;
                    zzfzxVar.zze = 3;
                    if (zzv(zzfzxVar) != coroutine_suspended) {
                        zzfyuVar = zzfyuVar2;
                        if (this.zzi.zza(zzfyuVar)) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jVar = (yB.j) zzfzxVar.zza;
            ResultKt.throwOnFailure(obj);
            if (!this.zze) {
                return Unit.INSTANCE;
            }
            this.zze = false;
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            jVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfzxVar.zza = jVar2;
            zzfzxVar.zzb = jCurrentTimeMillis;
            zzfzxVar.zze = 2;
            if (jVar2.Z(null, zzfzxVar) != coroutine_suspended) {
                j2 = jCurrentTimeMillis;
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                }
                zzfytVar2 = this.zzf;
                if (zzfytVar2 == null) {
                }
                long jZzi2 = j2 - zzfytVar2.zzi();
                zzfytVar3 = this.zzf;
                if (zzfytVar3 == null) {
                }
                zzfytVar.zzb(jZzi2 - zzfytVar3.zzg());
                zzfytVar4 = this.zzf;
                if (zzfytVar4 == null) {
                }
                zzfytVar4.zzl(j2);
                zzfytVar5 = this.zzf;
                if (zzfytVar5 == null) {
                }
                zzfyu zzfyuVar22 = (zzfyu) zzfytVar5.zzbu();
                jVar.T(null);
                Intrinsics.checkNotNull(zzfyuVar22);
                zzfzxVar.zza = zzfyuVar22;
                zzfzxVar.zze = 3;
                if (zzv(zzfzxVar) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (zzs(r15, r0) == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(Continuation continuation) {
        zzgab zzgabVar;
        yB.j jVar;
        yB.j jVar2;
        long jCurrentTimeMillis;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        zzfyt zzfytVar4;
        zzfyt zzfytVar5;
        zzfyt zzfytVar6;
        zzfyu zzfyuVar;
        if (continuation instanceof zzgab) {
            zzgabVar = (zzgab) continuation;
            int i2 = zzgabVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzgabVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzgabVar = new zzgab(this, continuation);
            }
        }
        Object obj = zzgabVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzgabVar.zze;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzb;
                zzgabVar.zza = jVar;
                zzgabVar.zze = 1;
                if (jVar.Z(null, zzgabVar) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    zzfyuVar = (zzfyu) zzgabVar.zza;
                    ResultKt.throwOnFailure(obj);
                    if (this.zzi.zza(zzfyuVar)) {
                        String strZza = zzfyuVar.zza();
                        Intrinsics.checkNotNullExpressionValue(strZza, "getGwsQueryId(...)");
                        zzgabVar.zza = null;
                        zzgabVar.zze = 4;
                    }
                    return Unit.INSTANCE;
                }
                jCurrentTimeMillis = zzgabVar.zzb;
                jVar2 = (yB.j) zzgabVar.zza;
                ResultKt.throwOnFailure(obj);
                try {
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfytVar2 = this.zzf;
                    if (zzfytVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar2 = null;
                    }
                    long jZzi = jCurrentTimeMillis - zzfytVar2.zzi();
                    zzfytVar3 = this.zzf;
                    if (zzfytVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar3 = null;
                    }
                    zzfytVar.zzb(jZzi - zzfytVar3.zzg());
                    zzfytVar4 = this.zzf;
                    if (zzfytVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar4 = null;
                    }
                    zzfytVar4.zzk(jCurrentTimeMillis);
                    zzfytVar5 = this.zzf;
                    if (zzfytVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar5 = null;
                    }
                    zzfytVar5.zze(true);
                    zzfytVar6 = this.zzf;
                    if (zzfytVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar6 = null;
                    }
                    zzfyu zzfyuVar2 = (zzfyu) zzfytVar6.zzbu();
                    jVar.T(null);
                    Intrinsics.checkNotNull(zzfyuVar2);
                    zzgabVar.zza = zzfyuVar2;
                    zzgabVar.zze = 3;
                    if (zzv(zzgabVar) != coroutine_suspended) {
                        zzfyuVar = zzfyuVar2;
                        if (this.zzi.zza(zzfyuVar)) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    throw th;
                }
            }
            jVar = (yB.j) zzgabVar.zza;
            ResultKt.throwOnFailure(obj);
            if (!this.zze) {
                return Unit.INSTANCE;
            }
            this.zze = false;
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            jVar2 = this.zzb;
            jCurrentTimeMillis = System.currentTimeMillis();
            zzgabVar.zza = jVar2;
            zzgabVar.zzb = jCurrentTimeMillis;
            zzgabVar.zze = 2;
            if (jVar2.Z(null, zzgabVar) != coroutine_suspended) {
                zzfytVar = this.zzf;
                if (zzfytVar == null) {
                }
                zzfytVar2 = this.zzf;
                if (zzfytVar2 == null) {
                }
                long jZzi2 = jCurrentTimeMillis - zzfytVar2.zzi();
                zzfytVar3 = this.zzf;
                if (zzfytVar3 == null) {
                }
                zzfytVar.zzb(jZzi2 - zzfytVar3.zzg());
                zzfytVar4 = this.zzf;
                if (zzfytVar4 == null) {
                }
                zzfytVar4.zzk(jCurrentTimeMillis);
                zzfytVar5 = this.zzf;
                if (zzfytVar5 == null) {
                }
                zzfytVar5.zze(true);
                zzfytVar6 = this.zzf;
                if (zzfytVar6 == null) {
                }
                zzfyu zzfyuVar22 = (zzfyu) zzfytVar6.zzbu();
                jVar.T(null);
                Intrinsics.checkNotNull(zzfyuVar22);
                zzgabVar.zza = zzfyuVar22;
                zzgabVar.zze = 3;
                if (zzv(zzgabVar) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(Continuation continuation) {
        zzfzv zzfzvVar;
        yB.j jVar;
        long j2;
        if (continuation instanceof zzfzv) {
            zzfzvVar = (zzfzv) continuation;
            int i2 = zzfzvVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzfzvVar.zze = i2 - Integer.MIN_VALUE;
            } else {
                zzfzvVar = new zzfzv(this, continuation);
            }
        }
        Object obj = zzfzvVar.zzc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzfzvVar.zze;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            yB.j jVar2 = this.zzb;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzfzvVar.zzb = jVar2;
            zzfzvVar.zza = jCurrentTimeMillis;
            zzfzvVar.zze = 1;
            if (jVar2.Z(null, zzfzvVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = jVar2;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = zzfzvVar.zza;
            jVar = (yB.j) zzfzvVar.zzb;
            ResultKt.throwOnFailure(obj);
        }
        try {
            zzfyt zzfytVar = this.zzf;
            if (zzfytVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                zzfytVar = null;
            }
            zzfytVar.zzs(j2);
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean zzw(zzfyu zzfyuVar) {
        Long l2;
        boolean z2;
        boolean z3;
        List listZzk = zzfyuVar.zzk();
        if (listZzk != null) {
            l2 = (Long) CollectionsKt.lastOrNull(listZzk);
        } else {
            l2 = null;
        }
        if (zzfyuVar.zzl() > zzfyuVar.zzm() && !zzfyuVar.zzd()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l2 != null) {
            if (zzfyuVar.zzi() - l2.longValue() > 5000) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }
}
