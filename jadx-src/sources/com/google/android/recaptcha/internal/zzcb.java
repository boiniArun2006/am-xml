package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import yB.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcb {
    private Object zza;
    private final yB.j zzb = CN3.rl(false, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, Continuation continuation) {
        zzby zzbyVar;
        yB.j jVar;
        zzcb zzcbVar;
        if (continuation instanceof zzby) {
            zzbyVar = (zzby) continuation;
            int i2 = zzbyVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, continuation);
            }
        }
        Object obj2 = zzbyVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzbyVar.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            jVar = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = jVar;
            zzbyVar.zzd = 1;
            if (jVar.Z(null, zzbyVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcbVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yB.j jVar2 = (yB.j) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            ResultKt.throwOnFailure(obj2);
            jVar = jVar2;
            obj = zzjeVar;
        }
        try {
            return Boxing.boxBoolean(Intrinsics.areEqual(zzcbVar.zza, obj));
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, Continuation continuation) {
        zzbz zzbzVar;
        yB.j jVar;
        zzcb zzcbVar;
        if (continuation instanceof zzbz) {
            zzbzVar = (zzbz) continuation;
            int i2 = zzbzVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, continuation);
            }
        }
        Object obj = zzbzVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzbzVar.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jVar = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = jVar;
            zzbzVar.zzd = 1;
            if (jVar.Z(null, zzbzVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcbVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yB.j jVar2 = (yB.j) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            ResultKt.throwOnFailure(obj);
            jVar = jVar2;
            objArr = zzjeVarArr;
        }
        try {
            return Boxing.boxBoolean(ArraysKt.contains(objArr, zzcbVar.zza));
        } finally {
            jVar.T(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, Continuation continuation) {
        zzca zzcaVar;
        yB.j jVar;
        zzcb zzcbVar;
        if (continuation instanceof zzca) {
            zzcaVar = (zzca) continuation;
            int i2 = zzcaVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, continuation);
            }
        }
        Object obj2 = zzcaVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzcaVar.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            jVar = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = jVar;
            zzcaVar.zzd = 1;
            if (jVar.Z(null, zzcaVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzcbVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yB.j jVar2 = (yB.j) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            ResultKt.throwOnFailure(obj2);
            jVar = jVar2;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    public zzcb(Object obj) {
        this.zza = obj;
    }
}
