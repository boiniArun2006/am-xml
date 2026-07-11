package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import t1.Q;
import t1.UGc;
import t1.Xo;
import t1.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzkl {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze;
    private static volatile boolean zzf;
    private static final AtomicInteger zzh;
    final zzkf zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    abstract Object zza(Object obj);

    static {
        new AtomicReference();
        Xo.ck(zzkj.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzkg zzkgVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzkgVar == null || zzkgVar.zza() != context) {
                            if (zzkgVar != null) {
                                zzjq.zzd();
                                zzkn.zzb();
                                zzjx.zzc();
                            }
                            zze = new zzjn(context, Q.n(new UGc() { // from class: com.google.android.gms.internal.measurement.zzkk
                                @Override // t1.UGc
                                public final /* synthetic */ Object get() {
                                    int i2 = zzkl.zzc;
                                    return zzjy.zza(context);
                                }
                            }));
                            zzh.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 t1.o) = (r2v0 t1.o), (r2v0 t1.o), (r2v7 t1.o) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x0088, B:30:0x0090, B:42:0x00b7, B:45:0x00bf, B:46:0x00c2, B:47:0x00c6, B:34:0x0099, B:36:0x009d, B:38:0x00ad, B:40:0x00b3, B:26:0x0076, B:48:0x00ca), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd() {
        String strZza;
        Object objZza;
        String strZzb;
        Object objZze;
        int i2 = zzh.get();
        if (this.zzi < i2) {
            synchronized (this) {
                try {
                    if (this.zzi < i2) {
                        zzkg zzkgVar = zze;
                        o oVarN = o.n();
                        Object objZza2 = null;
                        if (zzkgVar == null || zzkgVar.zzb() == null) {
                            strZza = null;
                            Xo.S(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                            zzkf zzkfVar = this.zza;
                            Uri uri = zzkfVar.zza;
                            zzju zzjuVarZza = uri == null ? zzjz.zza(zzkgVar.zza(), uri) ? zzjq.zza(zzkgVar.zza().getContentResolver(), uri, zzki.zza) : null : zzkn.zza(zzkgVar.zza(), (String) Xo.HI(null), zzkh.zza);
                            objZza = (zzjuVarZza != null || (objZze = zzjuVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                            if (objZza == null) {
                                if (!zzkfVar.zzd && (strZzb = zzjx.zza(zzkgVar.zza()).zze(this.zzb)) != null) {
                                    objZza2 = zza(strZzb);
                                }
                                objZza = objZza2 == null ? this.zzg : objZza2;
                            }
                            if (oVarN.t()) {
                                objZza = strZza == null ? this.zzg : zza(strZza);
                            }
                            this.zzj = objZza;
                            this.zzi = i2;
                        } else {
                            oVarN = (o) ((UGc) Xo.HI(zzkgVar.zzb())).get();
                            if (oVarN.t()) {
                                zzjs zzjsVar = (zzjs) oVarN.rl();
                                zzkf zzkfVar2 = this.zza;
                                strZza = zzjsVar.zza(zzkfVar2.zza, null, zzkfVar2.zzc, this.zzb);
                            }
                            Xo.S(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                            zzkf zzkfVar3 = this.zza;
                            Uri uri2 = zzkfVar3.zza;
                            if (uri2 == null) {
                            }
                            if (zzjuVarZza != null) {
                                if (objZza == null) {
                                }
                                if (oVarN.t()) {
                                }
                                this.zzj = objZza;
                                this.zzi = i2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }

    /* synthetic */ zzkl(zzkf zzkfVar, String str, Object obj, boolean z2, byte[] bArr) {
        if (zzkfVar.zza != null) {
            this.zza = zzkfVar;
            this.zzb = str;
            this.zzg = obj;
            this.zzk = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
