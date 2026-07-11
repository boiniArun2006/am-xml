package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;

    @Nullable
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;

    @Nullable
    private Object zzN;

    @Nullable
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    final zzaak zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    final /* synthetic */ void zzT(int i2, int i3, Object obj) {
        zzaw(1, 19, obj);
    }

    final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    final /* synthetic */ void zzad(boolean z2) {
        this.zzT = z2;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzks(zzjf zzjfVar, @Nullable zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zzmlVarArrZza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzmlVarArrZza;
            int length = zzmlVarArrZza.length;
            this.zzi = new zzml[2];
            int i2 = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i2 >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i2];
                zzmlVarArr[i2] = null;
                i2++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar = zzjfVar.zzb;
            this.zzv = zzdnVar;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    this.zza.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper looperZzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i3 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                final Context context = this.zzf;
                final boolean z2 = zzjfVar.zzv;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zzpmVarZza = zzpm.zza(context);
                        if (zzpmVarZza == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            this.zzD(zzpmVarZza);
                        }
                        zzpqVar.zzb(zzpmVarZza.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjfVar.zza, looperZzn, zzjfVar.zzi, this.zzw, zzdnVar);
            boolean z3 = (zzjfVar.zzs == Integer.MAX_VALUE || zzjfVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar.zza, looperZzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z3);
            this.zzz = new zzfp(zzjfVar.zza, looperZzn, zzdnVar);
            int i7 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = i5 >= 34 ? new zzkr(this, zzjfVar.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar.zzr, zzjfVar.zzs, zzjfVar.zzt, zzjfVar.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(@Nullable zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzmdVarZzh = zzmdVar.zzh(zzmdVar.zzb);
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        zzmdVarZzh.zzr = 0L;
        zzmd zzmdVarZzao = zzao(zzmdVarZzh, 1);
        if (zziwVar != null) {
            zzmdVarZzao = zzmdVarZzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzmdVarZzao, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j2 = zzmdVar.zzc;
        if (j2 != -9223372036854775807L) {
            return zzfj.zzp(0L) + zzfj.zzp(j2);
        }
        long j3 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
        return zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        long j2 = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j2;
        }
        zzaq(zzbfVar, zzwkVar, j2);
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f  */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.google.android.gms.internal.ads.zzaw] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzal(final zzmd zzmdVar, final int i2, boolean z2, int i3, long j2, int i5, boolean z3) {
        int i7;
        int i8;
        int i9;
        boolean z4;
        Pair pair;
        boolean z5;
        boolean z6;
        int i10;
        Pair pair2;
        boolean zBooleanValue;
        final zzak zzakVar;
        List list;
        int i11;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        int i12;
        int i13;
        boolean z7;
        int i14;
        boolean z9;
        zziw zziwVar;
        zziw zziwVar2;
        zzaak zzaakVar;
        zzaak zzaakVar2;
        zzax zzaxVar;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        ?? r15;
        int i15;
        boolean z10;
        ?? Zzq;
        ?? r6;
        zzbf zzbfVarZzq3;
        boolean z11;
        long j3;
        ?? r12;
        zzax zzaxVarZze;
        int i16;
        int i17;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long jZzam;
        long jZzam2;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        final int i18 = i3;
        zzmd zzmdVar2 = this.zzaa;
        this.zzaa = zzmdVar;
        ?? r42 = zzmdVar2.zza;
        zzbf zzbfVar = zzmdVar.zza;
        boolean zEquals = r42.equals(zzbfVar);
        if (zzbfVar.zzg() && r42.zzg()) {
            i7 = 3;
            pair2 = new Pair(Boolean.FALSE, -1);
        } else {
            i7 = 3;
            if (zzbfVar.zzg() == r42.zzg()) {
                zzwk zzwkVar = zzmdVar2.zzb;
                Object obj5 = zzwkVar.zza;
                zzbd zzbdVar = this.zzp;
                int i19 = r42.zzo(obj5, zzbdVar).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = r42.zzb(i19, zzbeVar, 0L).zzb;
                i8 = 0;
                zzwk zzwkVar2 = zzmdVar.zzb;
                if (obj6.equals(zzbfVar.zzb(zzbfVar.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (z2) {
                        if (i18 != 0) {
                            i9 = i18;
                        } else if (zzwkVar.zzd < zzwkVar2.zzd) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i18 = 0;
                            z5 = true;
                        } else {
                            i9 = 0;
                        }
                        z4 = true;
                    } else {
                        i9 = i18;
                        z4 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                    int i20 = i9;
                    z5 = z4;
                    i18 = i20;
                } else {
                    if (!z2) {
                        z5 = false;
                        z6 = false;
                    } else if (i18 == 0) {
                        i18 = 0;
                        z5 = true;
                        i10 = 1;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i10));
                    } else {
                        z5 = true;
                        z6 = true;
                    }
                    if (z5 && i18 == 1) {
                        z5 = z6;
                        i10 = 2;
                    } else {
                        if (zEquals) {
                            throw new IllegalStateException();
                        }
                        i10 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i10));
                }
                zBooleanValue = ((Boolean) pair.first).booleanValue();
                final int iIntValue = ((Integer) pair.second).intValue();
                if (zBooleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar.zzg() ? zzbfVar.zzb(zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = zzan.zza;
                }
                if (!zBooleanValue || !zzmdVar2.zzj.equals(zzmdVar.zzj)) {
                    zzam zzamVarZza = this.zzZ.zza();
                    list = zzmdVar.zzj;
                    for (i11 = i8; i11 < list.size(); i11++) {
                        zzap zzapVar = (zzap) list.get(i11);
                        for (int i21 = i8; i21 < zzapVar.zza(); i21++) {
                            zzapVar.zzb(i21).zza(zzamVarZza);
                        }
                    }
                    this.zzZ = zzamVarZza.zzw();
                }
                zzbfVarZzq = zzq();
                if (zzbfVarZzq.zzg()) {
                    zzak zzakVar4 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
                    zzam zzamVarZza2 = this.zzZ.zza();
                    zzamVarZza2.zzv(zzakVar4.zzd);
                    zzanVarZzw = zzamVarZza2.zzw();
                } else {
                    zzanVarZzw = this.zzZ;
                }
                boolean zEquals2 = zzanVarZzw.equals(this.zzM);
                this.zzM = zzanVarZzw;
                int i22 = zzmdVar2.zzl == zzmdVar.zzl ? 1 : i8;
                i12 = zzmdVar2.zze == zzmdVar.zze ? 1 : i8;
                if (i12 == 0 || i22 != 0) {
                    zzau();
                }
                i13 = zzmdVar2.zzg == zzmdVar.zzg ? 1 : i8;
                if (!zEquals) {
                    this.zzn.zzd(i8, new zzdy() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj7) {
                            int i23 = zzks.zzd;
                            ((zzaz) obj7).zzb(zzmdVar.zza, i2);
                        }
                    });
                }
                if (z5) {
                    z7 = zBooleanValue;
                    i14 = i22;
                    z9 = zEquals2;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (r42.zzg()) {
                        z7 = zBooleanValue;
                        i14 = i22;
                        i16 = i5;
                        i17 = i16;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj7 = zzmdVar2.zzb.zza;
                        r42.zzo(obj7, zzbdVar2);
                        int i23 = zzbdVar2.zzc;
                        int iZze = r42.zze(obj7);
                        zzbe zzbeVar2 = this.zza;
                        z7 = zBooleanValue;
                        i14 = i22;
                        obj = r42.zzb(i23, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        obj2 = obj7;
                        i16 = i23;
                        i17 = iZze;
                    }
                    if (i18 == 0) {
                        zzwk zzwkVar3 = zzmdVar2.zzb;
                        if (zzwkVar3.zzb()) {
                            jZzam = zzbdVar2.zzh(zzwkVar3.zzb, zzwkVar3.zzc);
                            jZzam2 = zzam(zzmdVar2);
                            String str = zzfj.zza;
                            zzwk zzwkVar4 = zzmdVar2.zzb;
                            final zzba zzbaVar = new zzba(obj, i16, zzakVar2, obj2, i17, zzfj.zzp(jZzam), zzfj.zzp(jZzam2), zzwkVar4.zzb, zzwkVar4.zzc);
                            int iZzs = zzs();
                            int iZzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                zzmd zzmdVar3 = this.zzaa;
                                Object obj8 = zzmdVar3.zzb.zza;
                                zzmdVar3.zza.zzo(obj8, this.zzp);
                                iZzr = this.zzaa.zza.zze(obj8);
                                zzbf zzbfVar2 = this.zzaa.zza;
                                zzbe zzbeVar3 = this.zza;
                                z9 = zEquals2;
                                Object obj9 = zzbfVar2.zzb(iZzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                                obj3 = obj9;
                                obj4 = obj8;
                            } else {
                                z9 = zEquals2;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            int i24 = iZzr;
                            long jZzp = zzfj.zzp(j2);
                            long jZzp2 = !this.zzaa.zzb.zzb() ? zzfj.zzp(zzam(this.zzaa)) : jZzp;
                            zzwk zzwkVar5 = this.zzaa.zzb;
                            final zzba zzbaVar2 = new zzba(obj3, iZzs, zzakVar3, obj4, i24, jZzp, jZzp2, zzwkVar5.zzb, zzwkVar5.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i25 = zzks.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i18);
                                }
                            });
                        } else {
                            jZzam = zzwkVar3.zze != -1 ? zzam(this.zzaa) : zzbdVar2.zzd;
                            jZzam2 = jZzam;
                            String str2 = zzfj.zza;
                            zzwk zzwkVar42 = zzmdVar2.zzb;
                            final zzba zzbaVar3 = new zzba(obj, i16, zzakVar2, obj2, i17, zzfj.zzp(jZzam), zzfj.zzp(jZzam2), zzwkVar42.zzb, zzwkVar42.zzc);
                            int iZzs2 = zzs();
                            int iZzr2 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            int i242 = iZzr2;
                            long jZzp3 = zzfj.zzp(j2);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            zzwk zzwkVar52 = this.zzaa.zzb;
                            final zzba zzbaVar22 = new zzba(obj3, iZzs2, zzakVar3, obj4, i242, jZzp3, jZzp2, zzwkVar52.zzb, zzwkVar52.zzc);
                            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                                @Override // com.google.android.gms.internal.ads.zzdy
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i25 = zzks.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar3, zzbaVar22, i18);
                                }
                            });
                        }
                    } else if (zzmdVar2.zzb.zzb()) {
                        jZzam = zzmdVar2.zzs;
                        jZzam2 = zzam(zzmdVar2);
                        String str22 = zzfj.zza;
                        zzwk zzwkVar422 = zzmdVar2.zzb;
                        final zzba zzbaVar32 = new zzba(obj, i16, zzakVar2, obj2, i17, zzfj.zzp(jZzam), zzfj.zzp(jZzam2), zzwkVar422.zzb, zzwkVar422.zzc);
                        int iZzs22 = zzs();
                        int iZzr22 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        int i2422 = iZzr22;
                        long jZzp32 = zzfj.zzp(j2);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar522 = this.zzaa.zzb;
                        final zzba zzbaVar222 = new zzba(obj3, iZzs22, zzakVar3, obj4, i2422, jZzp32, jZzp2, zzwkVar522.zzb, zzwkVar522.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i25 = zzks.zzd;
                                ((zzaz) obj10).zzo(zzbaVar32, zzbaVar222, i18);
                            }
                        });
                    } else {
                        jZzam = zzmdVar2.zzs;
                        jZzam2 = jZzam;
                        String str222 = zzfj.zza;
                        zzwk zzwkVar4222 = zzmdVar2.zzb;
                        final zzba zzbaVar322 = new zzba(obj, i16, zzakVar2, obj2, i17, zzfj.zzp(jZzam), zzfj.zzp(jZzam2), zzwkVar4222.zzb, zzwkVar4222.zzc);
                        int iZzs222 = zzs();
                        int iZzr222 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        int i24222 = iZzr222;
                        long jZzp322 = zzfj.zzp(j2);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzwk zzwkVar5222 = this.zzaa.zzb;
                        final zzba zzbaVar2222 = new zzba(obj3, iZzs222, zzakVar3, obj4, i24222, jZzp322, jZzp2, zzwkVar5222.zzb, zzwkVar5222.zzc);
                        this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkj
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i25 = zzks.zzd;
                                ((zzaz) obj10).zzo(zzbaVar322, zzbaVar2222, i18);
                            }
                        });
                    }
                }
                if (z7) {
                    this.zzn.zzd(1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzc(zzakVar, iIntValue);
                        }
                    });
                }
                zziwVar = zzmdVar2.zzf;
                zziwVar2 = zzmdVar.zzf;
                if (zziwVar != zziwVar2) {
                    zzed zzedVar = this.zzn;
                    zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzn(zzmdVar.zzf);
                        }
                    });
                    if (zziwVar2 != null) {
                        zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjq
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                int i25 = zzks.zzd;
                                ((zzaz) obj10).zzm(zzmdVar.zzf);
                            }
                        });
                    }
                }
                zzaakVar = zzmdVar2.zzi;
                zzaakVar2 = zzmdVar.zzi;
                if (zzaakVar != zzaakVar2) {
                    this.zzj.zzp(zzaakVar2.zze);
                    this.zzn.zzd(2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzd(zzmdVar.zzi.zzd);
                        }
                    });
                }
                if (!z9) {
                    final zzan zzanVar = this.zzM;
                    this.zzn.zzd(14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjs
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zze(zzanVar);
                        }
                    });
                }
                if (i13 != 0) {
                    this.zzn.zzd(i7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzf(zzmdVar.zzg);
                        }
                    });
                }
                if (i12 == 0 || i14 != 0) {
                    this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            zzmd zzmdVar4 = zzmdVar;
                            ((zzaz) obj10).zzh(zzmdVar4.zzl, zzmdVar4.zze);
                        }
                    });
                }
                if (i12 != 0) {
                    this.zzn.zzd(4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjv
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzi(zzmdVar.zze);
                        }
                    });
                }
                if (i14 == 0 || zzmdVar2.zzm != zzmdVar.zzm) {
                    this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            zzmd zzmdVar4 = zzmdVar;
                            ((zzaz) obj10).zzj(zzmdVar4.zzl, zzmdVar4.zzm);
                        }
                    });
                }
                if (zzmdVar2.zzn != zzmdVar.zzn) {
                    this.zzn.zzd(6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzk(zzmdVar.zzn);
                        }
                    });
                }
                if (zzmdVar2.zzj() != zzmdVar.zzj()) {
                    this.zzn.zzd(7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzl(zzmdVar.zzj());
                        }
                    });
                }
                if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
                    this.zzn.zzd(12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjz
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i25 = zzks.zzd;
                            ((zzaz) obj10).zzp(zzmdVar.zzo);
                        }
                    });
                }
                zzaxVar = this.zzL;
                zzbb zzbbVar = this.zzg;
                zzax zzaxVar2 = this.zzc;
                String str3 = zzfj.zza;
                boolean zZzx = zzbbVar.zzx();
                zzfVar = (zzf) zzbbVar;
                zzbf zzbfVarZzq4 = zzfVar.zzq();
                boolean z12 = zzbfVarZzq4.zzg() && zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh;
                zzbfVarZzq2 = zzfVar.zzq();
                if (zzbfVarZzq2.zzg()) {
                    int iZzs3 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    r15 = 0;
                    r15 = 0;
                    int iZzi = zzbfVarZzq2.zzi(iZzs3, 0, false);
                    i15 = -1;
                    z10 = iZzi != -1;
                } else {
                    i15 = -1;
                    r15 = 0;
                    z10 = false;
                }
                Zzq = zzfVar.zzq();
                if (Zzq.zzg()) {
                    int iZzs4 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    if (Zzq.zzh(iZzs4, r15, r15) != i15) {
                        r6 = 1;
                    }
                } else {
                    r6 = r15;
                }
                zzbfVarZzq3 = zzfVar.zzq();
                if (zzbfVarZzq3.zzg()) {
                    z11 = zZzx;
                    j3 = 0;
                    if (zzbfVarZzq3.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                        r12 = 1;
                    }
                    zzbf zzbfVarZzq5 = zzfVar.zzq();
                    ?? r9 = (zzbfVarZzq5.zzg() || !zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j3).zzi) ? r15 : 1;
                    boolean zZzg = zzbbVar.zzq().zzg();
                    ?? zzawVar = new zzaw();
                    zzawVar.zzd(zzaxVar2);
                    boolean z13 = !z11;
                    zzawVar.zzb(4, z13);
                    zzawVar.zzb(5, (!z12 || z11) ? r15 : 1);
                    zzawVar.zzb(6, (!z10 || z11) ? r15 : 1);
                    zzawVar.zzb(7, (zZzg || !(z10 || r12 == 0 || z12) || z11) ? r15 : 1);
                    zzawVar.zzb(8, (r6 == 0 || z11) ? r15 : 1);
                    zzawVar.zzb(9, (zZzg || (r6 == 0 && (r12 == 0 || r9 == 0)) || z11) ? r15 : 1);
                    zzawVar.zzb(10, z13);
                    zzawVar.zzb(11, (!z12 || z11) ? r15 : 1);
                    zzawVar.zzb(12, (!z12 || z11) ? r15 : 1);
                    zzaxVarZze = zzawVar.zze();
                    this.zzL = zzaxVarZze;
                    if (!zzaxVarZze.equals(zzaxVar)) {
                        this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkb
                            @Override // com.google.android.gms.internal.ads.zzdy
                            public final /* synthetic */ void zza(Object obj10) {
                                this.zza.zzN((zzaz) obj10);
                            }
                        });
                    }
                    this.zzn.zze();
                }
                z11 = zZzx;
                j3 = 0;
                r12 = r15;
                zzbf zzbfVarZzq52 = zzfVar.zzq();
                if (zzbfVarZzq52.zzg()) {
                }
                boolean zZzg2 = zzbbVar.zzq().zzg();
                ?? zzawVar2 = new zzaw();
                zzawVar2.zzd(zzaxVar2);
                boolean z132 = !z11;
                zzawVar2.zzb(4, z132);
                zzawVar2.zzb(5, (!z12 || z11) ? r15 : 1);
                zzawVar2.zzb(6, (!z10 || z11) ? r15 : 1);
                zzawVar2.zzb(7, (zZzg2 || !(z10 || r12 == 0 || z12) || z11) ? r15 : 1);
                zzawVar2.zzb(8, (r6 == 0 || z11) ? r15 : 1);
                zzawVar2.zzb(9, (zZzg2 || (r6 == 0 && (r12 == 0 || r9 == 0)) || z11) ? r15 : 1);
                zzawVar2.zzb(10, z132);
                zzawVar2.zzb(11, (!z12 || z11) ? r15 : 1);
                zzawVar2.zzb(12, (!z12 || z11) ? r15 : 1);
                zzaxVarZze = zzawVar2.zze();
                this.zzL = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                }
                this.zzn.zze();
            }
            pair2 = new Pair(Boolean.TRUE, 3);
        }
        pair = pair2;
        i8 = 0;
        z5 = z2;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue2 = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
        }
        if (!zBooleanValue) {
            zzam zzamVarZza3 = this.zzZ.zza();
            list = zzmdVar.zzj;
            while (i11 < list.size()) {
            }
            this.zzZ = zzamVarZza3.zzw();
        }
        zzbfVarZzq = zzq();
        if (zzbfVarZzq.zzg()) {
        }
        boolean zEquals22 = zzanVarZzw.equals(this.zzM);
        this.zzM = zzanVarZzw;
        if (zzmdVar2.zzl == zzmdVar.zzl) {
        }
        if (zzmdVar2.zze == zzmdVar.zze) {
        }
        if (i12 == 0) {
            zzau();
        }
        if (zzmdVar2.zzg == zzmdVar.zzg) {
        }
        if (!zEquals) {
        }
        if (z5) {
        }
        if (z7) {
        }
        zziwVar = zzmdVar2.zzf;
        zziwVar2 = zzmdVar.zzf;
        if (zziwVar != zziwVar2) {
        }
        zzaakVar = zzmdVar2.zzi;
        zzaakVar2 = zzmdVar.zzi;
        if (zzaakVar != zzaakVar2) {
        }
        if (!z9) {
        }
        if (i13 != 0) {
        }
        if (i12 == 0) {
            this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj10) {
                    int i25 = zzks.zzd;
                    zzmd zzmdVar4 = zzmdVar;
                    ((zzaz) obj10).zzh(zzmdVar4.zzl, zzmdVar4.zze);
                }
            });
        }
        if (i12 != 0) {
        }
        if (i14 == 0) {
            this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj10) {
                    int i25 = zzks.zzd;
                    zzmd zzmdVar4 = zzmdVar;
                    ((zzaz) obj10).zzj(zzmdVar4.zzl, zzmdVar4.zzm);
                }
            });
        }
        if (zzmdVar2.zzn != zzmdVar.zzn) {
        }
        if (zzmdVar2.zzj() != zzmdVar.zzj()) {
        }
        if (!zzmdVar2.zzo.equals(zzmdVar.zzo)) {
        }
        zzaxVar = this.zzL;
        zzbb zzbbVar2 = this.zzg;
        zzax zzaxVar22 = this.zzc;
        String str32 = zzfj.zza;
        boolean zZzx2 = zzbbVar2.zzx();
        zzfVar = (zzf) zzbbVar2;
        zzbf zzbfVarZzq42 = zzfVar.zzq();
        if (zzbfVarZzq42.zzg()) {
        }
        zzbfVarZzq2 = zzfVar.zzq();
        if (zzbfVarZzq2.zzg()) {
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
        }
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
        }
        r12 = r15;
        zzbf zzbfVarZzq522 = zzfVar.zzq();
        if (zzbfVarZzq522.zzg()) {
        }
        boolean zZzg22 = zzbbVar2.zzq().zzg();
        ?? zzawVar22 = new zzaw();
        zzawVar22.zzd(zzaxVar22);
        boolean z1322 = !z11;
        zzawVar22.zzb(4, z1322);
        zzawVar22.zzb(5, (!z12 || z11) ? r15 : 1);
        zzawVar22.zzb(6, (!z10 || z11) ? r15 : 1);
        zzawVar22.zzb(7, (zZzg22 || !(z10 || r12 == 0 || z12) || z11) ? r15 : 1);
        zzawVar22.zzb(8, (r6 == 0 || z11) ? r15 : 1);
        zzawVar22.zzb(9, (zZzg22 || (r6 == 0 && (r12 == 0 || r9 == 0)) || z11) ? r15 : 1);
        zzawVar22.zzb(10, z1322);
        zzawVar22.zzb(11, (!z12 || z11) ? r15 : 1);
        zzawVar22.zzb(12, (!z12 || z11) ? r15 : 1);
        zzaxVarZze = zzawVar22.zze();
        this.zzL = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar)) {
        }
        this.zzn.zze();
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j2 = zzmdVar.zzc;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzan(zzmd zzmdVar, zzbf zzbfVar, @Nullable Pair pair) {
        boolean z2;
        zzgrc.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmdVar.zza;
        long jZzaj = zzaj(zzmdVar);
        zzmd zzmdVarZzd = zzmdVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzwk zzwkVarZzb = zzmd.zzb();
            long jZzq = zzfj.zzq(this.zzac);
            zzmd zzmdVarZzh = zzmdVarZzd.zzc(zzwkVarZzb, jZzq, jZzq, jZzq, 0L, zzyn.zza, this.zzb, zzguf.zzi()).zzh(zzwkVarZzb);
            zzmdVarZzh.zzq = zzmdVarZzh.zzs;
            return zzmdVarZzh;
        }
        zzwk zzwkVar = zzmdVarZzd.zzb;
        Object obj = zzwkVar.zza;
        String str = zzfj.zza;
        boolean zEquals = obj.equals(pair.first);
        zzwk zzwkVar2 = !zEquals ? new zzwk(pair.first, -1L) : zzwkVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzq2 = zzfj.zzq(jZzaj);
        if (!zzbfVar2.zzg()) {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (zEquals && jZzq2 - jLongValue == 1) {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                z2 = true;
                if (jZzq2 == zzbdVarZzo.zzd) {
                    jZzq2--;
                }
            } else {
                z2 = true;
            }
        }
        if (!zEquals || jLongValue < jZzq2) {
            zzgrc.zzi(zzwkVar2.zzb() ^ z2);
            zzwk zzwkVar3 = zzwkVar2;
            zzmd zzmdVarZzh2 = zzmdVarZzd.zzc(zzwkVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzyn.zza : zzmdVarZzd.zzh, !zEquals ? this.zzb : zzmdVarZzd.zzi, !zEquals ? zzguf.zzi() : zzmdVarZzd.zzj).zzh(zzwkVar3);
            zzmdVarZzh2.zzq = jLongValue;
            return zzmdVarZzh2;
        }
        if (jLongValue != jZzq2) {
            zzgrc.zzi(zzwkVar2.zzb() ^ z2);
            long jMax = Math.max(0L, zzmdVarZzd.zzr - (jLongValue - jZzq2));
            long j2 = zzmdVarZzd.zzq;
            if (zzmdVarZzd.zzk.equals(zzwkVar)) {
                j2 = jLongValue + jMax;
            }
            zzmd zzmdVarZzc = zzmdVarZzd.zzc(zzwkVar2, jLongValue, jLongValue, jLongValue, jMax, zzmdVarZzd.zzh, zzmdVarZzd.zzi, zzmdVarZzd.zzj);
            zzmdVarZzc.zzq = j2;
            return zzmdVarZzc;
        }
        int iZze = zzbfVar.zze(zzmdVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzwkVar2.zza, zzbdVar2).zzc) {
                return zzmdVarZzd;
            }
        }
        Object obj2 = zzwkVar2.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzwkVar2.zzb() ? zzbdVar3.zzh(zzwkVar2.zzb, zzwkVar2.zzc) : zzbdVar3.zzd;
        zzwk zzwkVar4 = zzwkVar2;
        zzmd zzmdVarZzh3 = zzmdVarZzd.zzc(zzwkVar4, zzmdVarZzd.zzs, zzmdVarZzd.zzs, zzmdVarZzd.zzd, jZzh - zzmdVarZzd.zzs, zzmdVarZzd.zzh, zzmdVarZzd.zzi, zzmdVarZzd.zzj).zzh(zzwkVar4);
        zzmdVarZzh3.zzq = jZzh;
        return zzmdVarZzh3;
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j2) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j2;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int iZzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzai == -1) {
            iZzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, iZzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(@Nullable Object obj) {
        Object obj2 = this.zzN;
        boolean z2 = false;
        if (obj2 != null && obj2 != obj) {
            z2 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z2 ? this.zzA : -9223372036854775807L);
        if (z2) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zZzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i2, final int i3) {
        if (i2 == this.zzQ.zza() && i3 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i2, i3);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i5 = zzks.zzd;
                ((zzaz) obj).zzu(i2, i3);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i2, i3));
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfj.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzU) {
                throw new IllegalStateException(str2);
            }
            zzee.zzd("ExoPlayerImpl", str2, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i2, int i3, @Nullable Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i5 = 0; i5 < 2; i5++) {
            zzml zzmlVar = zzmlVarArr[i5];
            if (i2 == -1 || zzmlVar.zza() == i2) {
                zzmh zzmhVarZzar = zzar(zzmlVar);
                zzmhVarZzar.zzb(i3);
                zzmhVarZzar.zzd(obj);
                zzmhVarZzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i7 = 0; i7 < 2; i7++) {
            zzml zzmlVar2 = zzmlVarArr2[i7];
            if (zzmlVar2 != null && (i2 == -1 || zzmlVar2.zza() == i2)) {
                zzmh zzmhVarZzar2 = zzar(zzmlVar2);
                zzmhVarZzar2.zzb(i3);
                zzmhVarZzar2.zzd(obj);
                zzmhVarZzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlcVar);
            }
        });
    }

    final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i2;
        long j2;
        boolean z2;
        int i3 = this.zzF - zzlcVar.zzb;
        this.zzF = i3;
        boolean z3 = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i3 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmj) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i5 = 0; i5 < listZzw.size(); i5++) {
                    ((zzko) list.get(i5)).zzc((zzbf) listZzw.get(i5));
                }
            }
            long j3 = -9223372036854775807L;
            if (this.zzH) {
                boolean z4 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j4 = zzlcVar.zza.zzd;
                long j5 = this.zzaa.zzs;
                if (z4 || (zEquals && j4 == j5)) {
                    z3 = false;
                }
                if (z3) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j3 = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        long j6 = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j6);
                        j3 = j6;
                    }
                }
                z2 = z3;
                long j7 = j3;
                i2 = iZzs;
                j2 = j7;
            } else {
                i2 = -1;
                j2 = -9223372036854775807L;
                z2 = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z2, this.zzG, j2, i2, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    private static zzmd zzao(zzmd zzmdVar, int i2) {
        zzmd zzmdVarZze = zzmdVar.zze(i2);
        if (i2 != 1 && i2 != 4) {
            return zzmdVarZze;
        }
        return zzmdVarZze.zzg(false);
    }

    @Nullable
    private final Pair zzap(zzbf zzbfVar, int i2, long j2) {
        if (zzbfVar.zzg()) {
            this.zzab = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.zzac = j2;
            return null;
        }
        if (i2 == -1 || i2 >= zzbfVar.zza()) {
            i2 = zzbfVar.zzk(false);
            long j3 = zzbfVar.zzb(i2, this.zza, 0L).zzl;
            j2 = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i2, zzfj.zzq(j2));
    }

    private final void zzau() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzav();
            boolean z2 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f3) {
        zzav();
        String str = zzfj.zza;
        final float fMax = Math.max(0.0f, Math.min(f3, 1.0f));
        if (this.zzS == fMax) {
            return;
        }
        this.zzS = fMax;
        this.zzm.zzj(fMax);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i2 = zzks.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(@Nullable Surface surface) {
        int i2;
        zzav();
        zzas(surface);
        if (surface == null) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        zzS(i2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzG(zzwm zzwmVar) {
        zzav();
        List listSingletonList = Collections.singletonList(zzwmVar);
        zzav();
        zzav();
        zzai(this.zzaa);
        zzu();
        boolean z2 = true;
        this.zzF++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            zzlz zzlzVar = new zzlz((zzwm) listSingletonList.get(i2), this.zzr);
            arrayList.add(zzlzVar);
            list.add(i2, new zzko(zzlzVar.zzb, zzlzVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzmj zzmjVar = new zzmj(list, this.zzad);
        if (!zzmjVar.zzg() && zzmjVar.zza() < 0) {
            throw new zzw(zzmjVar, -1, -9223372036854775807L);
        }
        int iZzk = zzmjVar.zzk(false);
        zzmd zzmdVarZzan = zzan(this.zzaa, zzmjVar, zzap(zzmjVar, iZzk, -9223372036854775807L));
        int i3 = zzmdVarZzan.zze;
        if (i3 == 1) {
            i3 = 1;
        } else if (!zzmjVar.zzg()) {
            if (iZzk != -1) {
                if (iZzk >= zzmjVar.zza()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
        }
        zzmd zzmdVarZzao = zzao(zzmdVarZzan, i3);
        this.zzm.zzy(arrayList, iZzk, zzfj.zzq(-9223372036854775807L), this.zzad);
        if (this.zzaa.zzb.zza.equals(zzmdVarZzao.zzb.zza) || this.zzaa.zza.zzg()) {
            z2 = false;
        }
        zzal(zzmdVarZzao, 0, z2, 4, zzak(zzmdVarZzao), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkg.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        zzmd zzmdVar = this.zzaa;
        boolean z2 = zzmdVar.zzp;
        zzmd zzmdVarZzao = zzao(zzmdVar, 1);
        this.zzaa = zzmdVarZzao;
        zzmd zzmdVarZzh = zzmdVarZzao.zzh(zzmdVarZzao.zzb);
        this.zzaa = zzmdVarZzh;
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i2 = zzcz.zza;
        this.zzX = true;
    }

    @Nullable
    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzL(int i2, final int i3) {
        zzav();
        Integer numValueOf = Integer.valueOf(i3);
        zzaw(1, 10, numValueOf);
        zzaw(2, 10, numValueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i5 = zzks.zzd;
                ((zzaz) obj).zzq(i3);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i2, long j2, int i3, boolean z2) {
        boolean z3;
        zzav();
        if (i2 != -1) {
            if (i2 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzgrc.zza(z3);
            zzbf zzbfVar = this.zzaa.zza;
            if (!zzbfVar.zzg() && i2 >= zzbfVar.zza()) {
                return;
            }
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVarZzao = this.zzaa;
            int i5 = zzmdVarZzao.zze;
            if (i5 == 3 || (i5 == 4 && !zzbfVar.zzg())) {
                zzmdVarZzao = zzao(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmd zzmdVarZzan = zzan(zzmdVarZzao, zzbfVar, zzap(zzbfVar, i2, j2));
            this.zzm.zzf(zzbfVar, i2, zzfj.zzq(j2));
            zzal(zzmdVarZzan, 0, true, 1, zzak(zzmdVarZzan), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        int i2;
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzmdVarZzf = zzmdVar.zzf(null);
        if (true != zzmdVarZzf.zza.zzg()) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        zzmd zzmdVarZzao = zzao(zzmdVarZzf, i2);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzmdVarZzao, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z2) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i2 = zzmdVar.zzn;
        int i3 = 0;
        if (i2 == 1) {
            if (!z2) {
                i2 = 1;
                i3 = 1;
            } else {
                i2 = 1;
            }
        }
        if (zzmdVar.zzl == z2 && i2 == i3 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        zzmd zzmdVarZzi = zzmdVar.zzi(z2, 1, i3);
        this.zzm.zze(z2, 1, i3);
        zzal(zzmdVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (this.zzaa.zza.zzg()) {
            int i2 = this.zzab;
            if (i2 == -1) {
                return 0;
            }
            return i2;
        }
        zzmd zzmdVar = this.zzaa;
        return zzmdVar.zza.zze(zzmdVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int iZzai = zzai(this.zzaa);
        if (iZzai == -1) {
            return 0;
        }
        return iZzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzav();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfj.zzp(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmd zzmdVar = this.zzaa;
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            if (zzmdVar.zzk.equals(zzmdVar.zzb)) {
                return zzfj.zzp(this.zzaa.zzq);
            }
            return zzt();
        }
        zzav();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmd zzmdVar2 = this.zzaa;
        long j2 = 0;
        if (zzmdVar2.zzk.zzd != zzmdVar2.zzb.zzd) {
            return zzfj.zzp(zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j3 = zzmdVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmd zzmdVar3 = this.zzaa;
            zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j2 = j3;
        }
        zzmd zzmdVar4 = this.zzaa;
        zzaq(zzmdVar4.zza, zzmdVar4.zzk, j2);
        return zzfj.zzp(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
