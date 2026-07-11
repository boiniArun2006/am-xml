package com.google.android.recaptcha.internal;

import GJW.Lu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public /* synthetic */ zzl(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList = CollectionsKt.emptyList();
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) listEmptyList.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzh(zze... zzeVarArr) {
        CollectionsKt.addAll(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j2, Continuation continuation) {
        return Lu.J2(new zzh(this, str, j2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j2, zzsc zzscVar, zzek zzekVar, Continuation continuation) {
        zzi zziVar;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i2 = zziVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, continuation);
            }
        }
        Object objJ2 = zziVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zziVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            zzk zzkVar = new zzk(this, zzekVar, j2, zzscVar, null);
            zziVar.zzc = 1;
            objJ2 = Lu.J2(zzkVar, zziVar);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ2);
        }
        return ((Result) objJ2).getValue();
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }
}
