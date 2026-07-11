package com.google.android.recaptcha.internal;

import GJW.AbstractC1363t;
import GJW.Dsr;
import GJW.Qik;
import GJW.Wre;
import GJW.cA;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final Lazy zzd;
    private final Lazy zze;
    private final Lazy zzf;
    private final Lazy zzg;
    private final Lazy zzh;
    private final zzbi zzi;

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j2, Continuation continuation) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        zzdt zzdtVar;
        if (continuation instanceof zzdj) {
            zzdjVar = (zzdj) continuation;
            int i2 = zzdjVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, continuation);
            }
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdjVar2.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j2, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != coroutine_suspended) {
                zzdtVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) zzdjVar2.zza;
            ResultKt.throwOnFailure(obj);
            throw th;
        }
        zzdtVar = (zzdt) zzdjVar2.zza;
        ResultKt.throwOnFailure(obj);
        objZzc = ((Result) obj).getValue();
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objZzc);
        if (thM316exceptionOrNullimpl == null) {
            return Unit.INSTANCE;
        }
        cA.xMQ(zzdtVar.zzi.zzd().getCoroutineContext(), null, 1, null);
        List list = SequencesKt.toList(AbstractC1363t.az(zzdtVar.zzi.zzd().getCoroutineContext()).getChildren());
        zzdjVar2.zza = thM316exceptionOrNullimpl;
        zzdjVar2.zzd = 2;
        if (Wre.t(list, zzdjVar2) != coroutine_suspended) {
            throw thM316exceptionOrNullimpl;
        }
        return coroutine_suspended;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.toList(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i2 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j2, Continuation continuation) throws zzbd {
        zzdd zzddVar;
        Exception e2;
        zzen zzenVar;
        TimeoutCancellationException e3;
        zzbd e4;
        if (continuation instanceof zzdd) {
            zzddVar = (zzdd) continuation;
            int i2 = zzddVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, continuation);
            }
        }
        Object obj = zzddVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzddVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j2, zzddVar);
                if (objZzb == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e5) {
                e4 = e5;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e4);
                throw e4;
            } catch (TimeoutCancellationException e6) {
                e3 = e6;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e3.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e7) {
                e2 = e7;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzddVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbd e8) {
                e4 = e8;
                zzenVar.zzb(e4);
                throw e4;
            } catch (TimeoutCancellationException e9) {
                e3 = e9;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e3.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e10) {
                e2 = e10;
                zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e2.getMessage());
                zzenVar.zzb(zzbdVar22);
                throw zzbdVar22;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j2, Continuation continuation) {
        return Dsr.Uo(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j2, zzspVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j2, Continuation continuation) throws zzbd {
        zzdk zzdkVar;
        if (continuation instanceof zzdk) {
            zzdkVar = (zzdk) continuation;
            int i2 = zzdkVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, continuation);
            }
        }
        Object obj = zzdkVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdkVar.zzc;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j2, null);
                zzdkVar.zzc = 1;
                if (Qik.t(j2, zzdlVar, zzdkVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (zzbd e2) {
            throw e2;
        } catch (TimeoutCancellationException e3) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e3.getMessage());
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e4.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j2, Continuation continuation) throws zzbd {
        zzdr zzdrVar;
        Exception e2;
        zzen zzenVar;
        zzdt zzdtVar;
        TimeoutCancellationException e3;
        zzbd e4;
        if (continuation instanceof zzdr) {
            zzdrVar = (zzdr) continuation;
            int i2 = zzdrVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, continuation);
            }
        }
        Object obj = zzdrVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzdrVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objT = Qik.t(j2, zzdsVar, zzdrVar);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objT;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
            } catch (zzbd e5) {
                e4 = e5;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                if (Intrinsics.areEqual(e4.zzb(), zzbb.zzc)) {
                }
                zzenVar.zzb(e4);
                throw e4;
            } catch (TimeoutCancellationException e6) {
                e3 = e6;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs = zzdtVar.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e7) {
                e2 = e7;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzaw, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (zzbd e8) {
                e4 = e8;
                if (Intrinsics.areEqual(e4.zzb(), zzbb.zzc)) {
                    e4 = zzdtVar.zzs(e4, e4);
                }
                zzenVar.zzb(e4);
                throw e4;
            } catch (TimeoutCancellationException e9) {
                e3 = e9;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e10) {
                e2 = e10;
                zzbd zzbdVarZzs22 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzaw, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            }
        }
        return (zzsc) obj;
    }

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i2 = zzav.zza;
        this.zzd = LazyKt.lazy(zzdm.zza);
        this.zze = LazyKt.lazy(zzdn.zza);
        this.zzf = LazyKt.lazy(zzdo.zza);
        this.zzg = LazyKt.lazy(zzdp.zza);
        this.zzh = LazyKt.lazy(zzdq.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        if (!zzx()) {
            return new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage());
        }
        return zzbdVar;
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i2 = zzav.zza;
            ((zzfu) LazyKt.lazy(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e2.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listZzk, 10)), 16));
            for (zzst zzstVar : listZzk) {
                Pair pair = TuplesKt.to(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e2) {
            zzenVarZzf.zzb(e2);
        } catch (Exception e3) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e3.getMessage()));
        }
    }
}
