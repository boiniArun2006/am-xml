package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;

    @Nullable
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;

    @Nullable
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i2, boolean z2, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j2, boolean z3, boolean z4, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, @Nullable zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        int i3 = 0;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j2;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zzmdVarZza = zzmd.zza(zzaakVar);
        this.zzG = zzmdVarZza;
        this.zzH = new zzlc(zzmdVarZza);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzmmVarZzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z5 = false;
        for (int i5 = 2; i3 < i5; i5 = 2) {
            zzmlVarArr[i3].zzc(i3, zzpqVar, zzdnVar);
            this.zzc[i3] = zzmlVarArr[i3].zzb();
            this.zzc[i3].zzv(zzmmVarZzg);
            zzml zzmlVar = zzmlVarArr2[i3];
            if (zzmlVar != null) {
                zzmlVar.zzc(i3, zzpqVar, zzdnVar);
                z5 = true;
            }
            this.zzb[i3] = new zzmp(zzmlVarArr[i3], zzmlVarArr2[i3], i3);
            i3++;
        }
        this.zzy = z5;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzlq(zzmxVar, zzdxVarZzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzdxVarZzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper looperZza = zzmeVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j3, long j4, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j3, j4, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzH(boolean z2, int i2, int i3, int i5) throws zziw {
        boolean z3;
        if (!z2) {
            z3 = false;
        } else if (i2 != -1) {
            z3 = true;
        } else {
            i2 = -1;
            z3 = false;
        }
        if (i2 == -1) {
            i5 = 2;
        } else if (i5 == 2) {
            i5 = 1;
        }
        boolean z4 = this.zzC;
        if (i2 == 0) {
            i3 = 1;
        } else if (i3 == 1) {
            i3 = z4 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z3 && zzmdVar.zzn == i3 && zzmdVar.zzm == i5) {
            return;
        }
        this.zzG = zzmdVar.zzi(z3, i5, i3);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z5 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i7 = this.zzG.zze;
        if (i7 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i7 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzV() throws zziw {
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmpVarArr[i2].zzz(this.zzC ? this.zzB : null);
            i2++;
        }
    }

    private final void zzW(boolean z2, boolean z3) {
        zzX(z2 || !this.zzQ, false, true, false);
        this.zzH.zza(z3 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    private static final boolean zzaF(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i2 = 0; i2 < 2; i2++) {
                        zzyc zzycVar = zzycVarArr[i2];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmpVarArr[i2].zzd();
            zzmpVarArr[i2].zzA(this.zzo);
            zzN(i2, false);
            this.zzR -= iZzd;
            i2++;
        }
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i2, boolean z2, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i3 = 0; i3 < zzbfVar2.zza(); i3++) {
            if (zzbfVar2.zzb(i3, zzbeVar, 0L).zzb.equals(obj2)) {
                return i3;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= iZzc || iZze2 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar2, i2, z2);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i5++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
            zzbeVar2 = zzbeVar;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060e A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TRY_LEAVE, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x071e A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, LOOP:18: B:356:0x071c->B:357:0x071e, LOOP_END, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0887 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, LOOP:8: B:446:0x0885->B:447:0x0887, LOOP_END, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0895 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08a5 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0988 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a39 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a46 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a4d A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a6a A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0aea A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a8, zziw -> 0x05ab, TryCatch #36 {zziw -> 0x05ab, RuntimeException -> 0x05a8, blocks: (B:277:0x05a4, B:285:0x05c2, B:286:0x05cb, B:288:0x05dc, B:290:0x05ea, B:294:0x0603, B:391:0x0786, B:393:0x078c, B:395:0x0792, B:398:0x0797, B:399:0x07a2, B:401:0x07a6, B:405:0x07cb, B:407:0x07d1, B:409:0x07d9, B:410:0x07e1, B:411:0x07e4, B:413:0x07ed, B:461:0x08b8, B:464:0x08c4, B:469:0x08d1, B:471:0x08d9, B:472:0x08df, B:474:0x08ed, B:475:0x0907, B:477:0x090b, B:479:0x0913, B:493:0x0940, B:480:0x0919, B:482:0x0924, B:486:0x092d, B:492:0x093d, B:496:0x0954, B:498:0x095a, B:502:0x0962, B:504:0x096a, B:506:0x096e, B:507:0x0979, B:509:0x097f, B:560:0x0a8c, B:563:0x0a94, B:565:0x0a98, B:567:0x0aa0, B:568:0x0aa3, B:569:0x0aa7, B:571:0x0aad, B:573:0x0ab6, B:575:0x0ac0, B:577:0x0ac6, B:579:0x0acc, B:586:0x0aee, B:588:0x0af4, B:592:0x0afe, B:603:0x0b17, B:600:0x0b10, B:602:0x0b14, B:580:0x0ad3, B:583:0x0ae1, B:584:0x0ae9, B:585:0x0aea, B:510:0x0988, B:512:0x098f, B:514:0x0993, B:539:0x0a2d, B:541:0x0a39, B:517:0x099d, B:519:0x09a1, B:521:0x09b3, B:523:0x09be, B:525:0x09c8, B:529:0x09d1, B:531:0x09db, B:537:0x09e6, B:542:0x0a46, B:544:0x0a4d, B:546:0x0a51, B:550:0x0a5a, B:552:0x0a6a, B:554:0x0a70, B:556:0x0a7a, B:557:0x0a7f, B:558:0x0a84, B:559:0x0a89, B:495:0x094b, B:416:0x07f7, B:418:0x07fb, B:420:0x0801, B:422:0x0807, B:424:0x0811, B:427:0x0817, B:428:0x081a, B:430:0x0823, B:432:0x0835, B:434:0x083e, B:436:0x0846, B:441:0x0852, B:443:0x087c, B:445:0x0882, B:447:0x0887, B:448:0x088f, B:450:0x0895, B:451:0x0898, B:452:0x08a1, B:454:0x08a5, B:456:0x08ab, B:457:0x08b0, B:460:0x08b7, B:297:0x060e, B:307:0x062a, B:312:0x063b, B:316:0x064d, B:321:0x0663, B:326:0x06a3, B:328:0x06aa, B:330:0x06ae, B:334:0x06be, B:336:0x06c2, B:340:0x06c9, B:342:0x06cf, B:344:0x06ec, B:347:0x06f5, B:349:0x06fa, B:351:0x0701, B:352:0x0709, B:354:0x070f, B:332:0x06b4, B:357:0x071e, B:372:0x074d, B:374:0x0753, B:376:0x0757, B:378:0x075c, B:390:0x0783, B:381:0x0765, B:383:0x076b, B:387:0x0779, B:389:0x0780, B:604:0x0b1c, B:608:0x0b27), top: B:694:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0c1a  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) throws Throwable {
        String str;
        String str2;
        zziw zziwVar;
        boolean z2;
        int i2;
        zzwk zzwkVar;
        zzln zzlnVarZzn;
        zzd zzdVar;
        zzwi zzwiVar;
        zzlq zzlqVar;
        boolean z3;
        long jUptimeMillis;
        zzdx zzdxVar;
        long j2;
        zziw zziwVar2;
        long j3;
        long j4;
        boolean z4;
        boolean z5;
        boolean zZzi;
        long j5;
        long j6;
        zzln zzlnVarZzn2;
        int i3;
        int i5;
        zzlq zzlqVar2;
        boolean z6;
        zzln zzlnVarZzm;
        zzln zzlnVarZzp;
        byte b2;
        boolean z7;
        int i7;
        int i8;
        zzln zzlnVarZzo;
        long j7;
        long j9;
        String str3;
        String str4 = "Playback error";
        String str5 = "ExoPlayerImplInternal";
        int i9 = 2;
        try {
            try {
                try {
                    zzdVar = null;
                    try {
                    } catch (zziw e2) {
                        e = e2;
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                }
            } catch (zziw e5) {
                e = e5;
            }
        } catch (zzat e6) {
            e = e6;
        } catch (zzhc e7) {
            e = e7;
        } catch (zztg e8) {
            e = e8;
        } catch (zzvk e9) {
            e = e9;
        } catch (IOException e10) {
            e = e10;
        }
        switch (message.what) {
            case 1:
                boolean z9 = message.arg1 != 0;
                int i10 = message.arg2;
                zzE(z9, i10 >> 4, true, i10 & 15);
                z2 = true;
                zzC();
                return z2;
            case 2:
                try {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    zzdxVar = this.zzi;
                    zzdxVar.zzk(2);
                } catch (zziw e11) {
                    e = e11;
                }
                if (!this.zzG.zza.zzg() && this.zzt.zzb()) {
                    zzlq zzlqVar3 = this.zzs;
                    zzlqVar3.zzf(this.zzT);
                    try {
                        try {
                            if (zzlqVar3.zzg()) {
                                try {
                                    zzlo zzloVarZzh = zzlqVar3.zzh(this.zzT, this.zzG);
                                    if (zzloVarZzh != null) {
                                        zzln zzlnVarZzi = zzlqVar3.zzi(zzloVarZzh);
                                        if (zzlnVarZzi.zzd) {
                                            str = "Playback error";
                                            if (zzlnVarZzi.zze) {
                                                zzdxVar.zzd(8, zzlnVarZzi.zza).zza();
                                            }
                                        } else {
                                            str = "Playback error";
                                            zzlnVarZzi.zzt(this, zzloVarZzh.zzb);
                                        }
                                        if (zzlqVar3.zzm() == zzlnVarZzi) {
                                            zzU(zzloVarZzh.zzb, true);
                                        }
                                        zzas(false);
                                    } else {
                                        str = "Playback error";
                                    }
                                    try {
                                        if (this.zzN) {
                                            this.zzN = zzaF(zzlqVar3.zzk());
                                            zzan();
                                        } else {
                                            zzam();
                                        }
                                        long j10 = 10000000;
                                        if (this.zzK || !this.zzy || this.zzab || zzaz() || (zzlnVarZzo = zzlqVar3.zzo()) == null || zzlnVarZzo != zzlqVar3.zzn() || zzlnVarZzo.zzp() == null || !zzlnVarZzo.zzp().zze || zzav(zzlnVarZzo.zzp()) > 10000000) {
                                            j2 = jUptimeMillis;
                                        } else {
                                            zzlqVar3.zzq();
                                            zzln zzlnVarZzo2 = zzlqVar3.zzo();
                                            if (zzlnVarZzo2 != null) {
                                                zzaak zzaakVarZzr = zzlnVarZzo2.zzr();
                                                long j11 = jUptimeMillis;
                                                int i11 = 0;
                                                while (true) {
                                                    zzmp[] zzmpVarArr = this.zzb;
                                                    if (i11 < 2) {
                                                        if (zzaakVarZzr.zza(i11) && zzmpVarArr[i11].zza() && !zzmpVarArr[i11].zzc()) {
                                                            zzmpVarArr[i11].zzb();
                                                            j9 = j10;
                                                            str3 = str5;
                                                            j7 = j11;
                                                            zzar(zzlnVarZzo2, i11, false, zzlnVarZzo2.zzc());
                                                        } else {
                                                            j7 = j11;
                                                            j9 = j10;
                                                            str3 = str5;
                                                        }
                                                        i11++;
                                                        str5 = str3;
                                                        j10 = j9;
                                                        j11 = j7;
                                                    } else {
                                                        j2 = j11;
                                                        j6 = j10;
                                                        str2 = str5;
                                                        j3 = -9223372036854775807L;
                                                        if (zzaz()) {
                                                            this.zzaa = zzlnVarZzo2.zza.zzh();
                                                            if (!zzlnVarZzo2.zzd()) {
                                                                zzlqVar3.zzs(zzlnVarZzo2);
                                                                zzas(false);
                                                                zzam();
                                                            }
                                                        }
                                                        zzlnVarZzn2 = zzlqVar3.zzn();
                                                        if (zzlnVarZzn2 != null) {
                                                            if (zzlnVarZzn2.zzp() != null) {
                                                                try {
                                                                    if (this.zzK) {
                                                                        i3 = 1;
                                                                        zzlqVar2 = zzlqVar3;
                                                                        if (zzlnVarZzn2.zzg.zzj || this.zzK) {
                                                                            zzmp[] zzmpVarArr2 = this.zzb;
                                                                            for (int i12 = 0; i12 < 2; i12++) {
                                                                                zzmp zzmpVar = zzmpVarArr2[i12];
                                                                                if (zzmpVar.zzp(zzlnVarZzn2) && zzmpVar.zzg(zzlnVarZzn2)) {
                                                                                    long j12 = zzlnVarZzn2.zzg.zze;
                                                                                    zzmpVar.zzh(zzlnVarZzn2, (j12 == j3 || j12 == Long.MIN_VALUE) ? j3 : j12 + zzlnVarZzn2.zza());
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        zzln zzlnVarZzn3 = zzlqVar3.zzn();
                                                                        if (zzlnVarZzn3.zze) {
                                                                            int i13 = 0;
                                                                            while (true) {
                                                                                zzmp[] zzmpVarArr3 = this.zzb;
                                                                                if (i13 < 2) {
                                                                                    if (zzmpVarArr3[i13].zzr(zzlnVarZzn3)) {
                                                                                        i13++;
                                                                                    }
                                                                                } else if ((!zzaz() || zzlqVar3.zzo() != zzlqVar3.zzn()) && ((zzlnVarZzn2.zzp().zze || this.zzT >= zzlnVarZzn2.zzp().zzc()) && (!zzlnVarZzn2.zzp().zze || zzav(zzlnVarZzn2.zzp()) <= j6))) {
                                                                                    zzaak zzaakVarZzr2 = zzlnVarZzn2.zzr();
                                                                                    zzln zzlnVarZzp2 = zzlqVar3.zzp();
                                                                                    zzaak zzaakVarZzr3 = zzlnVarZzp2.zzr();
                                                                                    zzbf zzbfVar = this.zzG.zza;
                                                                                    i3 = 1;
                                                                                    zzag(zzbfVar, zzlnVarZzp2.zzg.zza, zzbfVar, zzlnVarZzn2.zzg.zza, -9223372036854775807L, false);
                                                                                    if (!zzlnVarZzp2.zze || ((!(z6 = this.zzy) || this.zzaa == j3) && zzlnVarZzp2.zza.zzh() == j3)) {
                                                                                        for (i5 = 0; i5 < 2; i5++) {
                                                                                            zzmpVarArr3[i5].zzi(zzaakVarZzr2, zzaakVarZzr3, zzlnVarZzp2.zzc());
                                                                                        }
                                                                                        zzlqVar2 = zzlqVar3;
                                                                                    } else {
                                                                                        this.zzaa = j3;
                                                                                        if (z6 && !this.zzab) {
                                                                                            for (int i14 = 0; i14 < 2; i14++) {
                                                                                                if (zzaakVarZzr3.zza(i14)) {
                                                                                                    zzmpVarArr3[i14].zze();
                                                                                                    zzaac[] zzaacVarArr = zzaakVarZzr3.zzc;
                                                                                                    if (zzas.zzd(zzaacVarArr[i14].zzc().zzo, zzaacVarArr[i14].zzc().zzk) || zzmpVarArr3[i14].zzc()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            while (i5 < 2) {
                                                                                            }
                                                                                            zzlqVar2 = zzlqVar3;
                                                                                        }
                                                                                        long jZzc = zzlnVarZzp2.zzc();
                                                                                        for (int i15 = 0; i15 < 2; i15++) {
                                                                                            zzmpVarArr3[i15].zzj(jZzc);
                                                                                        }
                                                                                        if (!zzlnVarZzp2.zzd()) {
                                                                                            zzlqVar3.zzs(zzlnVarZzp2);
                                                                                            zzas(false);
                                                                                            zzam();
                                                                                        }
                                                                                        zzlqVar2 = zzlqVar3;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i3 = 1;
                                                                            zzlqVar2 = zzlqVar3;
                                                                        } else {
                                                                            i3 = 1;
                                                                            zzlqVar2 = zzlqVar3;
                                                                        }
                                                                    }
                                                                    zzln zzlnVarZzn4 = zzlqVar2.zzn();
                                                                    if (zzlnVarZzn4 != null && zzlqVar2.zzm() != zzlnVarZzn4 && !zzlnVarZzn4.zzh) {
                                                                        zzln zzlnVarZzn5 = zzlqVar2.zzn();
                                                                        zzaak zzaakVarZzr4 = zzlnVarZzn5.zzr();
                                                                        int i16 = i3;
                                                                        int i17 = 0;
                                                                        while (true) {
                                                                            zzmp[] zzmpVarArr4 = this.zzb;
                                                                            if (i17 < 2) {
                                                                                int iZzd = zzmpVarArr4[i17].zzd();
                                                                                int iZzH = zzmpVarArr4[i17].zzH(zzlnVarZzn5, zzaakVarZzr4, this.zzo);
                                                                                this.zzR -= iZzd - zzmpVarArr4[i17].zzd();
                                                                                i16 &= iZzH & 1;
                                                                                i17++;
                                                                            } else if (i16 != 0) {
                                                                                for (int i18 = 0; i18 < 2; i18++) {
                                                                                    if (zzaakVarZzr4.zza(i18) && !zzmpVarArr4[i18].zzp(zzlnVarZzn5)) {
                                                                                        zzar(zzlnVarZzn5, i18, false, zzlnVarZzn5.zzc());
                                                                                    }
                                                                                }
                                                                                zzlqVar2.zzn().zzh = i3;
                                                                            }
                                                                        }
                                                                    }
                                                                    boolean z10 = false;
                                                                    while (zzax() && !this.zzK && (zzlnVarZzm = zzlqVar2.zzm()) != null && (zzlnVarZzp = zzlnVarZzm.zzp()) != null && this.zzT >= zzlnVarZzp.zzc() && zzlnVarZzp.zzh) {
                                                                        if (z10) {
                                                                            zzC();
                                                                        }
                                                                        this.zzab = false;
                                                                        zzln zzlnVarZzr = zzlqVar2.zzr();
                                                                        if (zzlnVarZzr == null) {
                                                                            throw null;
                                                                        }
                                                                        if (this.zzG.zzb.zza.equals(zzlnVarZzr.zzg.zza.zza)) {
                                                                            zzwk zzwkVar2 = this.zzG.zzb;
                                                                            b2 = -1;
                                                                            if (zzwkVar2.zzb == -1) {
                                                                                zzwk zzwkVar3 = zzlnVarZzr.zzg.zza;
                                                                                if (zzwkVar3.zzb == -1 && zzwkVar2.zze != zzwkVar3.zze) {
                                                                                    z7 = true;
                                                                                }
                                                                            }
                                                                            zzlo zzloVar = zzlnVarZzr.zzg;
                                                                            boolean z11 = z7;
                                                                            zzwk zzwkVar4 = zzloVar.zza;
                                                                            long j13 = zzloVar.zzb;
                                                                            this.zzG = zzao(zzwkVar4, j13, zzloVar.zzc, j13, !z11, 0);
                                                                            zzaj();
                                                                            zzL();
                                                                            if (zzaz() && zzlnVarZzr == zzlqVar2.zzo()) {
                                                                                zzmp[] zzmpVarArr5 = this.zzb;
                                                                                for (i8 = 0; i8 < 2; i8++) {
                                                                                    zzmpVarArr5[i8].zzB();
                                                                                }
                                                                            }
                                                                            if (this.zzG.zze == 3) {
                                                                                zzJ();
                                                                            }
                                                                            zzaak zzaakVarZzr5 = zzlqVar2.zzm().zzr();
                                                                            i7 = 0;
                                                                            while (true) {
                                                                                zzmp[] zzmpVarArr6 = this.zzb;
                                                                                if (i7 >= 2) {
                                                                                    if (zzaakVarZzr5.zza(i7)) {
                                                                                        zzmpVarArr6[i7].zzl();
                                                                                    }
                                                                                    i7++;
                                                                                }
                                                                            }
                                                                            z10 = true;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        z7 = false;
                                                                        zzlo zzloVar2 = zzlnVarZzr.zzg;
                                                                        boolean z112 = z7;
                                                                        zzwk zzwkVar42 = zzloVar2.zza;
                                                                        long j132 = zzloVar2.zzb;
                                                                        this.zzG = zzao(zzwkVar42, j132, zzloVar2.zzc, j132, !z112, 0);
                                                                        zzaj();
                                                                        zzL();
                                                                        if (zzaz()) {
                                                                            zzmp[] zzmpVarArr52 = this.zzb;
                                                                            while (i8 < 2) {
                                                                            }
                                                                        }
                                                                        if (this.zzG.zze == 3) {
                                                                        }
                                                                        zzaak zzaakVarZzr52 = zzlqVar2.zzm().zzr();
                                                                        i7 = 0;
                                                                        while (true) {
                                                                            zzmp[] zzmpVarArr62 = this.zzb;
                                                                            if (i7 >= 2) {
                                                                            }
                                                                            break;
                                                                            i7++;
                                                                        }
                                                                        z10 = true;
                                                                    }
                                                                    zziwVar2 = null;
                                                                    long j14 = this.zzZ.zzb;
                                                                } catch (zzat e12) {
                                                                    e = e12;
                                                                    zzA(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                                                                } catch (zzhc e13) {
                                                                    e = e13;
                                                                    zzA(e, e.zza);
                                                                } catch (zziw e14) {
                                                                    e = e14;
                                                                    str4 = str;
                                                                    str5 = str2;
                                                                    if (e.zzc == 1) {
                                                                    }
                                                                    if (e.zzc == 1) {
                                                                    }
                                                                } catch (zztg e15) {
                                                                    e = e15;
                                                                    zzA(e, e.zza);
                                                                } catch (zzvk e16) {
                                                                    e = e16;
                                                                    zzA(e, 1002);
                                                                } catch (IOException e17) {
                                                                    e = e17;
                                                                    zzA(e, 2000);
                                                                } catch (RuntimeException e18) {
                                                                    e = e18;
                                                                    if (e instanceof IllegalStateException) {
                                                                        zziw zziwVarZzc = zziw.zzc(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                                                        zzee.zzf(str2, str, zziwVarZzc);
                                                                        zzW(true, false);
                                                                        this.zzG = this.zzG.zzf(zziwVarZzc);
                                                                    }
                                                                    zzC();
                                                                    return z2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                j2 = jUptimeMillis;
                                            }
                                        }
                                        j6 = 10000000;
                                        str2 = "ExoPlayerImplInternal";
                                        j3 = -9223372036854775807L;
                                        zzlnVarZzn2 = zzlqVar3.zzn();
                                        if (zzlnVarZzn2 != null) {
                                        }
                                        break;
                                    } catch (zziw e19) {
                                        e = e19;
                                        str4 = str;
                                        if (e.zzc == 1 && (zzlnVarZzn = this.zzs.zzn()) != null && e.zzh == null) {
                                            e = e.zzd(zzlnVarZzn.zzg.zza);
                                        }
                                        if (e.zzc == 1 || (zzwkVar = e.zzh) == null) {
                                            zziwVar = this.zzX;
                                            if (zziwVar != null) {
                                                zziwVar.addSuppressed(e);
                                                e = this.zzX;
                                            }
                                            if (e.zzc == 1) {
                                                zzlq zzlqVar4 = this.zzs;
                                                if (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                                    while (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                                        zzlqVar4.zzr();
                                                    }
                                                    zzln zzlnVarZzm2 = zzlqVar4.zzm();
                                                    zzlnVarZzm2.getClass();
                                                    zzC();
                                                    zzlo zzloVar3 = zzlnVarZzm2.zzg;
                                                    zzwk zzwkVar5 = zzloVar3.zza;
                                                    long j15 = zzloVar3.zzb;
                                                    this.zzG = zzao(zzwkVar5, j15, zzloVar3.zzc, j15, true, 0);
                                                }
                                            }
                                            if (e.zzi || !(this.zzX == null || (i2 = e.zza) == 5004 || i2 == 5003)) {
                                                zzee.zzf(str5, str4, e);
                                                z2 = true;
                                                zzW(true, false);
                                                this.zzG = this.zzG.zzf(e);
                                            } else {
                                                zzee.zzd(str5, "Recoverable renderer error", e);
                                                if (this.zzX == null) {
                                                    this.zzX = e;
                                                }
                                                zzdx zzdxVar2 = this.zzi;
                                                zzdxVar2.zzg(zzdxVar2.zzd(25, e));
                                                z2 = true;
                                            }
                                        } else {
                                            int i19 = e.zze;
                                            zzlq zzlqVar5 = this.zzs;
                                            if (zzlqVar5.zzo() != null && zzlqVar5.zzo().zzg.zza.equals(zzwkVar) && this.zzb[i19].zzq(zzlqVar5.zzo())) {
                                                this.zzab = true;
                                                zzab();
                                                zzln zzlnVarZzo3 = zzlqVar5.zzo();
                                                zzln zzlnVarZzm3 = zzlqVar5.zzm();
                                                if (zzlqVar5.zzm() != zzlnVarZzo3) {
                                                    while (zzlnVarZzm3 != null && zzlnVarZzm3.zzp() != zzlnVarZzo3) {
                                                        zzlnVarZzm3 = zzlnVarZzm3.zzp();
                                                    }
                                                }
                                                zzlqVar5.zzs(zzlnVarZzm3);
                                                if (this.zzG.zze != 4) {
                                                    zzam();
                                                    this.zzi.zzh(2);
                                                }
                                            }
                                            z2 = true;
                                        }
                                    }
                                } catch (zziw e20) {
                                    e = e20;
                                    if (e.zzc == 1) {
                                        e = e.zzd(zzlnVarZzn.zzg.zza);
                                    }
                                    if (e.zzc == 1) {
                                        zziwVar = this.zzX;
                                        if (zziwVar != null) {
                                        }
                                        if (e.zzc == 1) {
                                        }
                                        if (e.zzi) {
                                        }
                                        zzee.zzf(str5, str4, e);
                                        z2 = true;
                                        zzW(true, false);
                                        this.zzG = this.zzG.zzf(e);
                                    }
                                }
                            }
                        } catch (zziw e21) {
                            e = e21;
                        }
                    } catch (RuntimeException e22) {
                        e = e22;
                        str2 = str5;
                        zziw zziwVarZzc2 = zziw.zzc(e, ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                        zzee.zzf(str2, str, zziwVarZzc2);
                        zzW(true, false);
                        this.zzG = this.zzG.zzf(zziwVarZzc2);
                        z2 = true;
                        zzC();
                        return z2;
                    }
                    zzC();
                    return z2;
                }
                j2 = jUptimeMillis;
                zziwVar2 = null;
                j3 = -9223372036854775807L;
                int i20 = this.zzG.zze;
                z2 = true;
                if (i20 != 1) {
                    if (i20 != 4) {
                        zzlq zzlqVar6 = this.zzs;
                        zzln zzlnVarZzm4 = zzlqVar6.zzm();
                        if (zzlnVarZzm4 == null) {
                            zzQ(j2);
                        } else {
                            long j16 = j2;
                            Trace.beginSection("doSomeWork");
                            zzL();
                            if (zzlnVarZzm4.zze) {
                                this.zzU = zzfj.zzq(SystemClock.elapsedRealtime());
                                boolean z12 = false;
                                zzlnVarZzm4.zza.zzf(this.zzG.zzs - this.zzn, false);
                                int i21 = 0;
                                z4 = true;
                                z5 = true;
                                while (true) {
                                    zzmp[] zzmpVarArr7 = this.zzb;
                                    if (i21 < i9) {
                                        zzmp zzmpVar2 = zzmpVarArr7[i21];
                                        if (zzmpVar2.zzd() == 0) {
                                            zzN(i21, z12);
                                            j5 = j3;
                                        } else {
                                            j5 = j3;
                                            zzmpVar2.zzs(this.zzT, this.zzU);
                                            z4 = z4 && zzmpVar2.zzo();
                                            boolean zZzt = zzmpVar2.zzt(zzlnVarZzm4);
                                            zzN(i21, zZzt);
                                            z5 = z5 && zZzt;
                                            if (!zZzt) {
                                                zzay(i21);
                                            }
                                        }
                                        i21++;
                                        j3 = j5;
                                        z12 = false;
                                        i9 = 2;
                                    } else {
                                        j4 = j3;
                                    }
                                }
                            } else {
                                j4 = j3;
                                zzlnVarZzm4.zza.zzc();
                                z4 = true;
                                z5 = true;
                            }
                            long j17 = zzlnVarZzm4.zzg.zze;
                            if (z4 && zzlnVarZzm4.zze && (j17 == j4 || j17 <= this.zzG.zzs)) {
                                if (this.zzK) {
                                    this.zzK = false;
                                    zzE(false, this.zzG.zzn, false, 5);
                                }
                                if (zzlnVarZzm4.zzg.zzj) {
                                    zzB(4);
                                    zzK();
                                }
                                int i22 = 2;
                                if (this.zzG.zze == 2) {
                                }
                            } else {
                                zzmd zzmdVar = this.zzG;
                                if (zzmdVar.zze != 2) {
                                    if (this.zzG.zze == 3) {
                                        if (this.zzR == 0) {
                                            if (!zzae()) {
                                                zzaC(zzax(), false);
                                                zzB(2);
                                                if (this.zzL) {
                                                    for (zzln zzlnVarZzm5 = zzlqVar6.zzm(); zzlnVarZzm5 != null; zzlnVarZzm5 = zzlnVarZzm5.zzp()) {
                                                        for (zzaac zzaacVar : zzlnVarZzm5.zzr().zzc) {
                                                        }
                                                    }
                                                    this.zzad.zzc();
                                                }
                                                zzK();
                                            }
                                        } else if (!z5) {
                                            zzaC(zzax(), false);
                                            zzB(2);
                                            if (this.zzL) {
                                            }
                                            zzK();
                                        }
                                    }
                                    int i222 = 2;
                                    if (this.zzG.zze == 2) {
                                        int i23 = 0;
                                        while (true) {
                                            zzmp[] zzmpVarArr8 = this.zzb;
                                            if (i23 < i222) {
                                                if (zzmpVarArr8[i23].zzp(zzlnVarZzm4)) {
                                                    zzay(i23);
                                                }
                                                i23++;
                                                i222 = 2;
                                            } else {
                                                zzmd zzmdVar2 = this.zzG;
                                                if (zzmdVar2.zzg || zzmdVar2.zzr >= 500000 || !zzaF(zzlqVar6.zzk()) || !zzax()) {
                                                    this.zzY = j4;
                                                } else if (this.zzY == j4) {
                                                    this.zzY = SystemClock.elapsedRealtime();
                                                } else if (SystemClock.elapsedRealtime() - this.zzY >= 4000) {
                                                    throw new zzfb(0, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
                                                }
                                                boolean z13 = zzax() && this.zzG.zze == 3;
                                                zzmd zzmdVar3 = this.zzG;
                                                boolean z14 = zzmdVar3.zzp;
                                                int i24 = zzmdVar3.zze;
                                                if (i24 != 4 && (z13 || i24 == 2 || (i24 == 3 && this.zzR != 0))) {
                                                    zzQ(j16);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                } else {
                                    if (this.zzR == 0) {
                                        zZzi = zzae();
                                    } else if (z5) {
                                        if (zzmdVar.zzg) {
                                            zzln zzlnVarZzm6 = zzlqVar6.zzm();
                                            long jZze = zzP(this.zzG.zza, zzlnVarZzm6.zzg.zza) ? this.zzad.zze() : j4;
                                            zzln zzlnVarZzk = zzlqVar6.zzk();
                                            boolean z15 = zzlnVarZzk.zzd() && zzlnVarZzk.zzg.zzj;
                                            boolean z16 = zzlnVarZzk.zzg.zza.zzb() && !zzlnVarZzk.zze;
                                            if (!z15 && !z16) {
                                                zZzi = this.zzg.zzi(new zzli(this.zzv, this.zzG.zza, zzlnVarZzm6.zzg.zza, this.zzT - zzlnVarZzm6.zza(), zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, jZze, this.zzM));
                                            }
                                        }
                                        zzB(3);
                                        this.zzX = zziwVar2;
                                        if (zzax()) {
                                            zzaC(false, false);
                                            this.zzo.zza();
                                            zzJ();
                                        }
                                        int i2222 = 2;
                                        if (this.zzG.zze == 2) {
                                        }
                                    } else {
                                        if (this.zzG.zze == 3) {
                                        }
                                        int i22222 = 2;
                                        if (this.zzG.zze == 2) {
                                        }
                                    }
                                    if (zZzi) {
                                        zzB(3);
                                        this.zzX = zziwVar2;
                                        if (zzax()) {
                                        }
                                    }
                                    int i222222 = 2;
                                    if (this.zzG.zze == 2) {
                                    }
                                }
                            }
                        }
                    }
                    z2 = true;
                }
                zzC();
                return z2;
            case 3:
                z3 = true;
                zzR((zzle) message.obj);
                z2 = z3;
                zzC();
                return z2;
            case 4:
                z3 = true;
                zzM((zzav) message.obj);
                zzak(this.zzo.zzj(), true);
                z2 = z3;
                zzC();
                return z2;
            case 5:
                z3 = true;
                this.zzA = (zzmt) message.obj;
                z2 = z3;
                zzC();
                return z2;
            case 6:
                z3 = true;
                zzW(false, true);
                z2 = z3;
                zzC();
                return z2;
            case 7:
                zzdq zzdqVar = (zzdq) message.obj;
                try {
                    zzX(true, false, true, false);
                    int i25 = 0;
                    while (true) {
                        zzmp[] zzmpVarArr9 = this.zzb;
                        if (i25 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            this.zzi.zzm(null);
                            this.zzj.zzb();
                            zzdqVar.zza();
                            return true;
                        }
                        this.zzc[i25].zzw();
                        zzmpVarArr9[i25].zzI();
                        i25++;
                    }
                } finally {
                    this.zzi.zzm(null);
                    this.zzj.zzb();
                    zzdqVar.zza();
                }
                break;
            case 8:
                try {
                    zzwiVar = (zzwi) message.obj;
                    zzlqVar = this.zzs;
                } catch (zzat e23) {
                    e = e23;
                } catch (zzhc e24) {
                    e = e24;
                } catch (zziw e25) {
                    e = e25;
                } catch (zztg e26) {
                    e = e26;
                } catch (zzvk e27) {
                    e = e27;
                } catch (IOException e28) {
                    e = e28;
                } catch (RuntimeException e29) {
                    e = e29;
                }
                if (zzlqVar.zzd(zzwiVar)) {
                    zzln zzlnVarZzk2 = zzlqVar.zzk();
                    if (zzlnVarZzk2 == null) {
                        throw null;
                    }
                    if (!zzlnVarZzk2.zze) {
                        float f3 = this.zzo.zzj().zzb;
                        zzmd zzmdVar4 = this.zzG;
                        zzlnVarZzk2.zzh(f3, zzmdVar4.zza, zzmdVar4.zzl);
                    }
                    zzaw(zzlnVarZzk2.zzg.zza, zzlnVarZzk2.zzq(), zzlnVarZzk2.zzr());
                    if (zzlnVarZzk2 == zzlqVar.zzm()) {
                        zzU(zzlnVarZzk2.zzg.zzb, true);
                        zzap();
                        zzlnVarZzk2.zzh = true;
                        zzmd zzmdVar5 = this.zzG;
                        try {
                            zzwk zzwkVar6 = zzmdVar5.zzb;
                            long j18 = zzlnVarZzk2.zzg.zzb;
                            z3 = true;
                            this.zzG = zzao(zzwkVar6, j18, zzmdVar5.zzc, j18, false, 5);
                        } catch (zzat e30) {
                            e = e30;
                            zzA(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                            z2 = true;
                        } catch (zzhc e31) {
                            e = e31;
                            zzA(e, e.zza);
                            z2 = true;
                        } catch (zziw e32) {
                            e = e32;
                            if (e.zzc == 1) {
                            }
                            if (e.zzc == 1) {
                            }
                        } catch (zztg e33) {
                            e = e33;
                            zzA(e, e.zza);
                            z2 = true;
                        } catch (zzvk e34) {
                            e = e34;
                            zzA(e, 1002);
                            z2 = true;
                        } catch (IOException e35) {
                            e = e35;
                            zzA(e, 2000);
                            z2 = true;
                        } catch (RuntimeException e36) {
                            e = e36;
                            str = "Playback error";
                            str2 = str5;
                        }
                    } else {
                        z3 = true;
                    }
                    zzam();
                    zzA(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
                    z2 = true;
                    zzC();
                    return z2;
                }
                z3 = true;
                zzln zzlnVarZzu = zzlqVar.zzu(zzwiVar);
                if (zzlnVarZzu != null) {
                    zzgrc.zzi(!zzlnVarZzu.zze);
                    float f4 = this.zzo.zzj().zzb;
                    zzmd zzmdVar6 = this.zzG;
                    zzlnVarZzu.zzh(f4, zzmdVar6.zza, zzmdVar6.zzl);
                    if (zzlqVar.zze(zzwiVar)) {
                        zzai();
                    }
                }
                z2 = z3;
                zzC();
                return z2;
            case 9:
                zzwi zzwiVar2 = (zzwi) message.obj;
                zzlq zzlqVar7 = this.zzs;
                if (zzlqVar7.zzd(zzwiVar2)) {
                    zzlqVar7.zzf(this.zzT);
                    zzam();
                } else if (zzlqVar7.zze(zzwiVar2)) {
                    zzai();
                }
                z2 = true;
                zzC();
                return z2;
            case 10:
                zzad();
                z2 = true;
                zzC();
                return z2;
            case 11:
                int i26 = message.arg1;
                this.zzO = i26;
                int iZza = this.zzs.zza(this.zzG.zza, i26);
                if ((iZza & 1) != 0) {
                    zzI(true);
                } else if ((iZza & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z2 = true;
                zzC();
                return z2;
            case 12:
                boolean z17 = message.arg1 != 0;
                this.zzP = z17;
                int iZzb = this.zzs.zzb(this.zzG.zza, z17);
                if ((iZzb & 1) != 0) {
                    zzI(true);
                } else if ((iZzb & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z2 = true;
                zzC();
                return z2;
            case 13:
                boolean z18 = message.arg1 != 0;
                zzdq zzdqVar2 = (zzdq) message.obj;
                if (this.zzQ != z18) {
                    this.zzQ = z18;
                    if (!z18) {
                        zzmp[] zzmpVarArr10 = this.zzb;
                        for (int i27 = 0; i27 < 2; i27++) {
                            zzmpVarArr10[i27].zzG();
                        }
                    }
                }
                if (zzdqVar2 != null) {
                    zzdqVar2.zza();
                }
                z2 = true;
                zzC();
                return z2;
            case 14:
                zzmh zzmhVar = (zzmh) message.obj;
                if (zzmhVar.zzf() == this.zzk) {
                    zzaE(zzmhVar);
                    int i28 = this.zzG.zze;
                    if (i28 == 3 || i28 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzmhVar).zza();
                }
                z2 = true;
                zzC();
                return z2;
            case 15:
                final zzmh zzmhVar2 = (zzmh) message.obj;
                Looper looperZzf = zzmhVar2.zzf();
                if (looperZzf.getThread().isAlive()) {
                    this.zzq.zzd(looperZzf, null).zzn(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzkx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzlf.zzz(zzmhVar2);
                        }
                    });
                } else {
                    zzee.zzc("TAG", "Trying to send message on a dead thread.");
                    zzmhVar2.zzi(false);
                }
                z2 = true;
                zzC();
                return z2;
            case 16:
                zzak((zzav) message.obj, false);
                z2 = true;
                zzC();
                return z2;
            case 17:
                zzkz zzkzVar = (zzkz) message.obj;
                this.zzH.zza(1);
                if (zzkzVar.zzb() != -1) {
                    this.zzS = new zzle(new zzmj(zzkzVar.zza(), zzkzVar.zzd()), zzkzVar.zzb(), zzkzVar.zzc());
                }
                zzaf(this.zzt.zzl(zzkzVar.zza(), zzkzVar.zzd()), false);
                z2 = true;
                zzC();
                return z2;
            case 18:
                zzkz zzkzVar2 = (zzkz) message.obj;
                int iZzc = message.arg1;
                this.zzH.zza(1);
                zzmc zzmcVar = this.zzt;
                if (iZzc == -1) {
                    iZzc = zzmcVar.zzc();
                }
                zzaf(zzmcVar.zzm(iZzc, zzkzVar2.zza(), zzkzVar2.zzd()), false);
                z2 = true;
                zzC();
                return z2;
            case 19:
                zzla zzlaVar = (zzla) message.obj;
                this.zzH.zza(1);
                zzmc zzmcVar2 = this.zzt;
                int i29 = zzlaVar.zza;
                zzaf(zzmcVar2.zzo(0, 0, 0, null), false);
                z2 = true;
                zzC();
                return z2;
            case 20:
                int i30 = message.arg1;
                int i31 = message.arg2;
                zzyf zzyfVar = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzn(i30, i31, zzyfVar), false);
                z2 = true;
                zzC();
                return z2;
            case 21:
                zzyf zzyfVar2 = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzp(zzyfVar2), false);
                z2 = true;
                zzC();
                return z2;
            case 22:
                zzaf(this.zzt.zzh(), true);
                z2 = true;
                zzC();
                return z2;
            case 23:
                this.zzJ = message.arg1 != 0;
                zzaj();
                if (this.zzK) {
                    zzlq zzlqVar8 = this.zzs;
                    if (zzlqVar8.zzn() != zzlqVar8.zzm()) {
                        zzI(true);
                        zzas(false);
                    }
                }
                z2 = true;
                zzC();
                return z2;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z2 = true;
                zzC();
                return z2;
            case 26:
                zzac();
                z2 = true;
                zzC();
                return z2;
            case 27:
                int i32 = message.arg1;
                int i33 = message.arg2;
                List list = (List) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zza(i32, i33, list), false);
                z2 = true;
                zzC();
                return z2;
            case 28:
                zzjg zzjgVar = (zzjg) message.obj;
                this.zzZ = zzjgVar;
                this.zzs.zzc(this.zzG.zza, zzjgVar);
                z2 = true;
                zzC();
                return z2;
            case 29:
                this.zzH.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzG.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z2 = true;
                zzC();
                return z2;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdq zzdqVar3 = (zzdq) pair.second;
                zzmp[] zzmpVarArr11 = this.zzb;
                for (int i34 = 0; i34 < 2; i34++) {
                    zzmpVarArr11[i34].zzJ(obj);
                }
                int i35 = this.zzG.zze;
                if (i35 == 3 || i35 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdqVar3 != null) {
                    zzdqVar3.zza();
                }
                z2 = true;
                zzC();
                return z2;
            case 31:
                zzd zzdVar2 = (zzd) message.obj;
                int i36 = message.arg1;
                this.zze.zze(zzdVar2);
                zzcd zzcdVar = this.zzz;
                if (i36 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z2 = true;
                zzC();
                return z2;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z2 = true;
                zzC();
                return z2;
            case 33:
                int i37 = message.arg1;
                zzmd zzmdVar7 = this.zzG;
                zzH(zzmdVar7.zzl, i37, zzmdVar7.zzn, zzmdVar7.zzm);
                z2 = true;
                zzC();
                return z2;
            case 34:
                zzD(this.zzac);
                z2 = true;
                zzC();
                return z2;
            case 35:
                zzacp zzacpVar = (zzacp) message.obj;
                zzmp[] zzmpVarArr12 = this.zzb;
                for (int i38 = 0; i38 < 2; i38++) {
                    zzmpVarArr12[i38].zzK(zzacpVar);
                }
                z2 = true;
                zzC();
                return z2;
            case 36:
                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                if (!zBooleanValue) {
                    if (this.zzE != null && this.zzD && !this.zzi.zzb(37)) {
                        this.zzF++;
                    }
                    final int i39 = this.zzF;
                    if (i39 > 0) {
                        this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzv(i39);
                            }
                        });
                    }
                    this.zzF = 0;
                    this.zzD = false;
                    this.zzi.zzk(37);
                    zzle zzleVar = this.zzE;
                    if (zzleVar != null) {
                        zzR(zzleVar);
                        this.zzE = null;
                        this.zzD = false;
                    }
                }
                this.zzC = zBooleanValue;
                zzV();
                z2 = true;
                zzC();
                return z2;
            case 37:
                this.zzD = false;
                zzle zzleVar2 = this.zzE;
                if (zzleVar2 != null) {
                    zzR(zzleVar2);
                    this.zzE = null;
                }
                z2 = true;
                zzC();
                return z2;
            case 38:
                this.zzB = (zzms) message.obj;
                zzV();
                z2 = true;
                zzC();
                return z2;
        }
    }

    public final Looper zzn() {
        return this.zzk;
    }

    final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    private final void zzA(IOException iOException, int i2) {
        zzlq zzlqVar = this.zzs;
        zziw zziwVarZza = zziw.zza(iOException, i2);
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm != null) {
            zziwVarZza = zziwVarZza.zzd(zzlnVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zziwVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zziwVarZza);
    }

    private final void zzB(int i2) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i2) {
            if (i2 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i2);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f3) throws zziw {
        this.zzac = f3;
        float fZza = f3 * this.zzz.zza();
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmpVarArr[i2].zzL(fZza);
            i2++;
        }
    }

    private final void zzE(boolean z2, int i2, boolean z3, int i3) throws zziw {
        this.zzH.zza(z3 ? 1 : 0);
        zzG(z2, i2, i3);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z2, int i2, int i3) throws zziw {
        zzH(z2, this.zzz.zzc(z2, this.zzG.zze), i2, i3);
    }

    private final void zzI(boolean z2) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, jZzT, zzmdVar.zzc, zzmdVar.zzd, z2, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        zzaak zzaakVarZzr = zzlnVarZzm.zzr();
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            if (zzaakVarZzr.zza(i2)) {
                zzmpVarArr[i2].zzv();
            }
            i2++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i2 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                return;
            }
            zzmpVarArr[i2].zzw();
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws zziw {
        zzlb zzlbVar;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        long jZzh = zzlnVarZzm.zze ? zzlnVarZzm.zza.zzh() : -9223372036854775807L;
        if (jZzh != -9223372036854775807L) {
            if (!zzlnVarZzm.zzd()) {
                zzlqVar.zzs(zzlnVarZzm);
                zzas(false);
                zzam();
            }
            zzU(jZzh, true);
            if (jZzh != this.zzG.zzs) {
                zzmd zzmdVar = this.zzG;
                long j2 = jZzh;
                this.zzG = zzao(zzmdVar.zzb, j2, zzmdVar.zzc, j2, true, 5);
            }
        } else {
            zziu zziuVar = this.zzo;
            long jZzf = zziuVar.zzf(zzlnVarZzm != zzlqVar.zzn());
            this.zzT = jZzf;
            long jZza = jZzf - zzlnVarZzm.zza();
            long j3 = this.zzG.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzG.zzb.zzb()) {
                if (this.zzW) {
                    j3--;
                    this.zzW = false;
                }
                zzmd zzmdVar2 = this.zzG;
                int iZze = zzmdVar2.zza.zze(zzmdVar2.zzb.zza);
                int iMin = Math.min(this.zzV, arrayList.size());
                if (iMin > 0) {
                    zzlbVar = (zzlb) arrayList.get(iMin - 1);
                    while (zzlbVar != null && (iZze < 0 || (iZze == 0 && j3 < 0))) {
                        int i2 = iMin - 1;
                        if (i2 > 0) {
                            zzlbVar = (zzlb) arrayList.get(iMin - 2);
                            iMin = i2;
                        } else {
                            iMin = i2;
                        }
                    }
                    if (iMin < arrayList.size()) {
                    }
                    this.zzV = iMin;
                }
                zzlbVar = null;
            }
            if (zziuVar.zzh()) {
                boolean z2 = !this.zzH.zzc;
                zzmd zzmdVar3 = this.zzG;
                this.zzG = zzao(zzmdVar3.zzb, jZza, zzmdVar3.zzc, jZza, z2, 6);
            } else {
                zzmd zzmdVar4 = this.zzG;
                zzmdVar4.zzs = jZza;
                zzmdVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzG.zzq = zzlqVar.zzk().zzf();
        this.zzG.zzr = zzat();
        zzmd zzmdVar5 = this.zzG;
        if (zzmdVar5.zzl && zzmdVar5.zze == 3 && zzP(zzmdVar5.zza, zzmdVar5.zzb)) {
            zzmd zzmdVar6 = this.zzG;
            if (zzmdVar6.zzo.zzb == 1.0f) {
                float fZzd = this.zzad.zzd(zzO(zzmdVar6.zza, zzmdVar6.zzb.zza, zzmdVar6.zzs), this.zzG.zzr);
                zziu zziuVar2 = this.zzo;
                if (zziuVar2.zzj().zzb != fZzd) {
                    zzM(new zzav(fZzd, this.zzG.zzo.zzc));
                    zzal(this.zzG.zzo, zziuVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i2, final boolean z2) {
        boolean[] zArr = this.zzd;
        if (zArr[i2] != z2) {
            zArr[i2] = z2;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i2, z2);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j2) {
        int i2 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j3 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j2;
    }

    private final void zzR(zzle zzleVar) throws Throwable {
        long jLongValue;
        long j2;
        zzwk zzwkVarZzy;
        boolean z2;
        boolean z3;
        long j3;
        long j4;
        long j5;
        long j6;
        long jZzk;
        zzmd zzmdVar;
        int i2;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzleVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar = this.zzG.zza;
        int i3 = this.zzO;
        boolean z4 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaD = zzaD(zzbfVar, zzleVar, true, i3, z4, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzwk zzwkVar = (zzwk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z2 = !this.zzG.zza.zzg();
            zzwkVarZzy = zzwkVar;
            j2 = -9223372036854775807L;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j7 = zzleVar.zzc;
            if (j7 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 = -9223372036854775807L;
                jMax = jLongValue;
            }
            zzwkVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzwkVarZzy.zzb()) {
                this.zzG.zza.zzo(zzwkVarZzy.zza, zzbdVar);
                int i5 = zzwkVarZzy.zzb;
                if (zzbdVar.zzd(i5) == zzwkVarZzy.zzc) {
                    zzbdVar.zzj();
                }
                long j9 = zzbdVar.zzg.zza(i5).zza;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j7 != -9223372036854775807L) {
                z2 = false;
            }
            z2 = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzleVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzwkVarZzy.equals(this.zzG.zzb)) {
                    zzln zzlnVarZzm = this.zzs.zzm();
                    if (zzlnVarZzm == null || !zzlnVarZzm.zze || jLongValue == 0) {
                        jZzk = jLongValue;
                    } else {
                        zzwi zzwiVar = zzlnVarZzm.zza;
                        long j10 = zzbeVar.zzm;
                        if (this.zzC && j10 != j2) {
                            Double d2 = this.zzB.zzc;
                        }
                        jZzk = zzwiVar.zzk(jLongValue, this.zzA);
                    }
                    long j11 = jZzk;
                    if (zzfj.zzp(jZzk) == zzfj.zzp(this.zzG.zzs) && ((i2 = (zzmdVar = this.zzG).zze) == 2 || i2 == 3)) {
                        jLongValue = zzmdVar.zzs;
                    } else {
                        j4 = j11;
                    }
                } else {
                    j4 = jLongValue;
                }
                if (this.zzC) {
                    zzmp[] zzmpVarArr = this.zzb;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= 2) {
                            break;
                        }
                        zzmp zzmpVar = zzmpVarArr[i7];
                        if (zzmpVar.zzM() && zzmpVar.zze() == 2) {
                            this.zzD = true;
                            break;
                        }
                        i7++;
                    }
                }
                long jZzS = zzS(zzwkVarZzy, j4, this.zzG.zze == 4);
                z3 = (jLongValue != jZzS) | z2;
                try {
                    zzmd zzmdVar2 = this.zzG;
                    zzwk zzwkVar2 = zzwkVarZzy;
                    try {
                        zzbf zzbfVar2 = zzmdVar2.zza;
                        long j12 = jMax;
                        try {
                            zzag(zzbfVar2, zzwkVar2, zzbfVar2, zzmdVar2.zzb, j12, true);
                            zzwkVarZzy = zzwkVar2;
                            j5 = j12;
                            j6 = jZzS;
                            this.zzG = zzao(zzwkVarZzy, j6, j5, j6, z3, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzwkVarZzy = zzwkVar2;
                            jMax = j12;
                            j3 = jZzS;
                            this.zzG = zzao(zzwkVarZzy, j3, jMax, j3, z3, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzwkVarZzy = zzwkVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z3 = z2;
            j5 = jMax;
            j6 = jLongValue;
            this.zzG = zzao(zzwkVarZzy, j6, j5, j6, z3, 2);
        } catch (Throwable th4) {
            th = th4;
            z3 = z2;
            j3 = jLongValue;
        }
    }

    private final long zzS(zzwk zzwkVar, long j2, boolean z2) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j2, zzlqVar.zzm() != zzlqVar.zzn(), z2);
    }

    private final void zzU(long j2, boolean z2) throws zziw {
        zzln zzlnVarZzm = this.zzs.zzm();
        long jZza = j2 + (zzlnVarZzm == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : zzlnVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i2 = 0; i2 < 2; i2++) {
            zzmpVarArr[i2].zzE(zzlnVarZzm, this.zzT, z2);
        }
        for (zzln zzlnVarZzm2 = r0.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[PHI: r2 r7 r9
      0x009d: PHI (r2v2 com.google.android.gms.internal.ads.zzwk) = (r2v1 com.google.android.gms.internal.ads.zzwk), (r2v11 com.google.android.gms.internal.ads.zzwk) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
      (r3v12 com.google.android.gms.internal.ads.zzbf)
     binds: [B:34:0x00aa, B:36:0x00ae, B:38:0x00bf, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        zzwk zzwkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzD = false;
        if (this.zzE != null) {
            this.zzH.zza(1);
            this.zzE = null;
        }
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        try {
            zzaa();
        } catch (zziw | RuntimeException e2) {
            zzee.zzf("ExoPlayerImplInternal", "Disable failed.", e2);
        }
        if (z2) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    zzmpVarArr[i2].zzG();
                } catch (RuntimeException e3) {
                    zzee.zzf("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.zzR = 0;
        zzmd zzmdVar = this.zzG;
        zzwk zzwkVar2 = zzmdVar.zzb;
        long jLongValue = zzmdVar.zzs;
        long j2 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z3) {
            this.zzS = null;
            Pair pairZzY = zzY(this.zzG.zza);
            zzwkVar2 = (zzwk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j2 = -9223372036854775807L;
            z6 = zzwkVar2.equals(this.zzG.zzb) ? false : true;
        }
        long j3 = jLongValue;
        long j4 = j2;
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzv();
        this.zzN = false;
        zzbf zzbfVarZzx = this.zzG.zza;
        if (z4 && (zzbfVarZzx instanceof zzmj)) {
            zzbfVarZzx = ((zzmj) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzwkVar2.zzb != -1) {
                Object obj = zzwkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzwkVar = new zzwk(obj, zzwkVar2.zzd);
                }
            }
        } else {
            zzwkVar = zzwkVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzmd zzmdVar2 = this.zzG;
        int i3 = zzmdVar2.zze;
        zziw zziwVar = z5 ? null : zzmdVar2.zzf;
        zzyn zzynVar = z6 ? zzyn.zza : zzmdVar2.zzh;
        zzaak zzaakVar = z6 ? this.zzf : zzmdVar2.zzi;
        List listZzi = z6 ? zzguf.zzi() : zzmdVar2.zzj;
        zzmd zzmdVar3 = this.zzG;
        this.zzG = new zzmd(zzbfVar, zzwkVar, j4, j3, i3, zziwVar, false, zzynVar, zzaakVar, listZzi, zzwkVar, zzmdVar3.zzl, zzmdVar3.zzm, zzmdVar3.zzn, zzmdVar3.zzo, j3, 0L, j3, 0L, false);
        if (z4) {
            zzlqVar.zzj();
            this.zzt.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z2 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z2, boolean z3) {
        this.zzL = z2;
        long jElapsedRealtime = -9223372036854775807L;
        if (z2 && !z3) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    @Nullable
    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z2, int i2, boolean z3, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        boolean zZzg = zzbfVar3.zzg();
        zzbf zzbfVar4 = zzbfVar3;
        if (true == zZzg) {
            zzbfVar4 = zzbfVar;
        }
        try {
            pairZzm = zzbfVar4.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
            zzbfVar2 = zzbfVar4;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar2)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) != -1) {
            return (zzbfVar2.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzleVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbeVar, zzbdVar, i2, z3, pairZzm.first, zzbfVar2, zzbfVar);
        if (iZzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
        }
        return null;
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                zzmp zzmpVar = zzmpVarArr[i2];
                int iZzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.zzlf] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final void zzad() throws zziw {
        int i2;
        int i3;
        ?? r6;
        boolean z2;
        zziu zziuVar = this.zzo;
        float f3 = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z3 = true;
        while (zzlnVarZzm != null && zzlnVarZzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzaakVarZzk = zzlnVarZzm.zzk(f3, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzlnVarZzm == zzlqVar.zzm() ? zzaakVarZzk : zzaakVar;
            zzaak zzaakVarZzr = zzlnVarZzm.zzr();
            boolean z4 = false;
            if (zzaakVarZzr != null) {
                zzaac[] zzaacVarArr = zzaakVarZzk.zzc;
                if (zzaakVarZzr.zzc.length == zzaacVarArr.length) {
                    for (int i5 = 0; i5 < zzaacVarArr.length; i5++) {
                        if (zzaakVarZzk.zzb(zzaakVarZzr, i5)) {
                        }
                    }
                    if (zzlnVarZzm != zzlnVarZzn) {
                        z4 = true;
                    }
                    z3 &= z4;
                    zzlnVarZzm = zzlnVarZzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            if (z3) {
                zzln zzlnVarZzm2 = zzlqVar.zzm();
                int iZzs = zzlqVar.zzs(zzlnVarZzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long jZzm = zzlnVarZzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                if (zzmdVar2.zze == 4 || jZzm == zzmdVar2.zzs) {
                    z2 = false;
                } else {
                    z2 = false;
                    z4 = true;
                }
                zzmd zzmdVar3 = this.zzG;
                boolean z5 = z2;
                i2 = 4;
                i3 = 2;
                ?? r62 = this;
                r62.zzG = zzao(zzmdVar3.zzb, jZzm, zzmdVar3.zzc, zzmdVar3.zzd, z4, 5);
                if (z4) {
                    r62.zzU(jZzm, true);
                }
                r62.zzab();
                boolean[] zArr2 = new boolean[2];
                for (?? r8 = z5; r8 < 2; r8++) {
                    int iZzd = zzmpVarArr[r8].zzd();
                    zArr2[r8] = zzmpVarArr[r8].zzM();
                    zziu zziuVar2 = zziuVar;
                    zzmpVarArr[r8].zzD(zzlnVarZzm2.zzc[r8], zziuVar2, r62.zzT, zArr[r8]);
                    if (iZzd - zzmpVarArr[r8].zzd() > 0) {
                        r62.zzN(r8, z5);
                    }
                    r62.zzR -= iZzd - zzmpVarArr[r8].zzd();
                    zziuVar = zziuVar2;
                }
                r62.zzaq(zArr2, r62.zzT);
                zzlnVarZzm2.zzh = true;
                r6 = r62;
            } else {
                zzlf zzlfVar = this;
                i2 = 4;
                i3 = 2;
                zzlqVar.zzs(zzlnVarZzm);
                r6 = zzlfVar;
                if (zzlnVarZzm.zze) {
                    long jMax = Math.max(zzlnVarZzm.zzg.zzb, zzlfVar.zzT - zzlnVarZzm.zza());
                    if (zzlfVar.zzy && zzlfVar.zzaz() && zzlqVar.zzo() == zzlnVarZzm) {
                        zzlfVar.zzab();
                    }
                    zzlnVarZzm.zzl(zzaakVarZzk, jMax, false);
                    r6 = zzlfVar;
                }
            }
            r6.zzas(true);
            if (r6.zzG.zze != i2) {
                r6.zzam();
                r6.zzL();
                r6.zzi.zzh(i3);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzlnVarZzm = this.zzs.zzm();
        long j2 = zzlnVarZzm.zzg.zze;
        if (zzlnVarZzm.zze) {
            return j2 == -9223372036854775807L || this.zzG.zzs < j2 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041c  */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbf zzbfVar, boolean z2) throws Throwable {
        long j2;
        boolean zZzaB;
        zzwk zzwkVar;
        zzbe zzbeVar;
        zzbf zzbfVar2;
        long j3;
        int i2;
        long j4;
        Object obj;
        long jMax;
        boolean z3;
        boolean z4;
        int iZzk;
        boolean z5;
        boolean z6;
        long j5;
        long jMin;
        long j6;
        zzwk zzwkVarZzb;
        long jZzS;
        boolean z7;
        boolean z9;
        boolean z10;
        int i3;
        Object obj2;
        long jLongValue;
        int iZzk2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i5;
        boolean z14;
        int i7;
        zzwk zzwkVar2;
        zzwk zzwkVar3;
        boolean z15;
        long jZzah;
        zzmd zzmdVar = this.zzG;
        zzle zzleVar = this.zzS;
        int i8 = this.zzO;
        boolean z16 = this.zzP;
        if (zzbfVar.zzg()) {
            zzbfVar2 = zzbfVar;
            zzwkVarZzb = zzmd.zzb();
            z7 = true;
            z10 = false;
            z9 = false;
            jZzS = 0;
            j2 = -9223372036854775807L;
            j6 = 0;
            j5 = -9223372036854775807L;
        } else {
            zzbd zzbdVar = this.zzm;
            zzwk zzwkVar4 = zzmdVar.zzb;
            j2 = -9223372036854775807L;
            Object obj3 = zzwkVar4.zza;
            zZzaB = zzaB(zzmdVar, zzbdVar);
            long j7 = (zzwkVar4.zzb() || zZzaB) ? zzmdVar.zzc : zzmdVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzleVar != null) {
                zzwkVar = zzwkVar4;
                zzbfVar2 = zzbfVar;
                Pair pairZzaD = zzaD(zzbfVar2, zzleVar, true, i8, z16, zzbeVar2, zzbdVar);
                if (pairZzaD == null) {
                    iZzk2 = zzbfVar2.zzk(z16);
                    obj2 = obj3;
                    jLongValue = j7;
                    z13 = true;
                    z12 = false;
                    z11 = false;
                } else {
                    if (zzleVar.zzc == -9223372036854775807L) {
                        iZzk2 = zzbfVar2.zzo(pairZzaD.first, zzbdVar).zzc;
                        obj2 = obj3;
                        jLongValue = j7;
                        z11 = false;
                    } else {
                        obj2 = pairZzaD.first;
                        jLongValue = ((Long) pairZzaD.second).longValue();
                        iZzk2 = -1;
                        z11 = true;
                    }
                    z12 = zzmdVar.zze == 4;
                    z13 = false;
                }
                int i9 = iZzk2;
                obj = obj2;
                zzbeVar = zzbeVar2;
                j4 = jLongValue;
                i2 = i9;
                boolean z17 = z11;
                z3 = z13;
                z6 = z12;
                z4 = z17;
                j3 = j7;
            } else {
                zzwkVar = zzwkVar4;
                zzbeVar = zzbeVar2;
                zzbfVar2 = zzbfVar;
                zzbf zzbfVar3 = zzmdVar.zza;
                if (zzbfVar3.zzg()) {
                    iZzk = zzbfVar2.zzk(z16);
                } else if (zzbfVar2.zze(obj3) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i8, z16, obj3, zzbfVar3, zzbfVar2);
                    zzbeVar = zzbeVar;
                    zzbfVar2 = zzbfVar2;
                    zzbdVar = zzbdVar;
                    obj3 = obj3;
                    if (iZzr == -1) {
                        iZzr = zzbfVar2.zzk(z16);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i2 = iZzr;
                    z3 = z5;
                    obj = obj3;
                    j4 = j7;
                    j3 = j4;
                    z4 = false;
                    z6 = false;
                } else if (j7 == -9223372036854775807L) {
                    iZzk = zzbfVar2.zzo(obj3, zzbdVar).zzc;
                } else if (zZzaB) {
                    zzbfVar3.zzo(obj3, zzbdVar);
                    if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj3)) {
                        Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj3, zzbdVar).zzc, j7);
                        j3 = j7;
                        obj = pairZzm.first;
                        jMax = ((Long) pairZzm.second).longValue();
                    } else {
                        j3 = j7;
                        if (zzbfVar2.zzo(obj3, zzbdVar).zzd != -9223372036854775807L) {
                            long j9 = zzbdVar.zzd - 1;
                            String str = zzfj.zza;
                            jMax = Math.max(0L, Math.min(j3, j9));
                        } else {
                            jMax = j3;
                        }
                        obj = obj3;
                    }
                    i2 = -1;
                    j4 = jMax;
                    z3 = false;
                    z4 = true;
                    z6 = false;
                } else {
                    j3 = j7;
                    i2 = -1;
                    j4 = j3;
                    obj = obj3;
                    z3 = false;
                    z4 = false;
                    z6 = false;
                }
                i2 = iZzk;
                obj = obj3;
                j4 = j7;
                j3 = j4;
                z3 = false;
                z4 = false;
                z6 = false;
            }
            if (i2 != -1) {
                Pair pairZzm2 = zzbfVar2.zzm(zzbeVar, zzbdVar, i2, -9223372036854775807L);
                obj = pairZzm2.first;
                jMin = ((Long) pairZzm2.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                j5 = j4;
                jMin = j5;
            }
            zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar2, obj, jMin);
            int i10 = zzwkVarZzy.zze;
            boolean z18 = i10 == -1 || ((i3 = zzwkVar.zze) != -1 && i10 >= i3);
            boolean zEquals = obj3.equals(obj);
            boolean z19 = zEquals && !zzwkVar.zzb() && !zzwkVarZzy.zzb() && z18;
            zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
            if (!zZzaB && j3 == j5 && obj3.equals(zzwkVarZzy.zza)) {
                if (zzwkVar.zzb()) {
                    zzbdVarZzo.zzk(zzwkVar.zzb);
                }
                if (zzwkVarZzy.zzb()) {
                    zzbdVarZzo.zzk(zzwkVarZzy.zzb);
                }
            }
            if (true == z19) {
                zzwkVarZzy = zzwkVar;
            }
            if (!zzwkVarZzy.zzb()) {
                if (zEquals && zzwkVar.zzb()) {
                    zza zzaVarZza = zzbfVar2.zzo(obj, zzbdVar).zzg.zza(zzwkVar.zzb);
                    long j10 = zzaVarZza.zzi;
                    long j11 = zzmdVar.zzc;
                    j6 = 0;
                    if (j11 == -9223372036854775807L || j11 < 0) {
                        int i11 = zzaVarZza.zzb;
                        int i12 = zzwkVar.zzc;
                        if (i11 > i12 && zzaVarZza.zze[i12] == 2) {
                            long j12 = zzbfVar2.zzo(obj, zzbdVar).zzd;
                            if (j12 != -9223372036854775807L) {
                                jMin = Math.min(j12 - 1, jMin);
                            }
                            j5 = jMin;
                        }
                    }
                }
                zzwkVarZzb = zzwkVarZzy;
                jZzS = jMin;
                z7 = z3;
                z9 = z4;
                z10 = z6;
            } else if (zzwkVarZzy.equals(zzwkVar)) {
                jMin = zzmdVar.zzs;
            } else {
                zzbfVar2.zzo(zzwkVarZzy.zza, zzbdVar);
                if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                    zzbdVar.zzj();
                }
                jMin = 0;
            }
            j6 = 0;
            zzwkVarZzb = zzwkVarZzy;
            jZzS = jMin;
            z7 = z3;
            z9 = z4;
            z10 = z6;
        }
        boolean z20 = (this.zzG.zzb.equals(zzwkVarZzb) && jZzS == this.zzG.zzs) ? false : true;
        if (z7) {
            try {
                if (this.zzG.zze != 1) {
                    i5 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        i7 = 4;
                        zzwkVar2 = zzwkVarZzb;
                        zZzaB = false;
                        zzmd zzmdVar2 = this.zzG;
                        zzbf zzbfVar4 = zzmdVar2.zza;
                        zzwk zzwkVar5 = zzmdVar2.zzb;
                        zzwkVar3 = zzwkVar2;
                        zzag(zzbfVar, zzwkVar3, zzbfVar4, zzwkVar5, true != z9 ? j2 : jZzS, false);
                        if (z20) {
                        }
                        zzaj();
                        zzZ(zzbfVar, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                        }
                        zzas(zZzaB);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i5 = 4;
                }
                z14 = false;
                try {
                    zzX(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i7 = i5;
                    zZzaB = z14;
                    zzwkVar2 = zzwkVarZzb;
                    zzmd zzmdVar22 = this.zzG;
                    zzbf zzbfVar42 = zzmdVar22.zza;
                    zzwk zzwkVar52 = zzmdVar22.zzb;
                    zzwkVar3 = zzwkVar2;
                    zzag(zzbfVar, zzwkVar3, zzbfVar42, zzwkVar52, true != z9 ? j2 : jZzS, false);
                    if (z20) {
                        zzmd zzmdVar3 = this.zzG;
                        Object obj4 = zzmdVar3.zzb.zza;
                        zzbf zzbfVar5 = zzmdVar3.zza;
                        if (z20) {
                            this.zzG = zzao(zzwkVar3, jZzS, j5, !z ? jZzS : this.zzG.zzd, z, zzbfVar.zze(obj4) != -1 ? i7 : 3);
                        }
                    }
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(zZzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i5 = 4;
                z14 = false;
                i7 = i5;
                zZzaB = z14;
                zzwkVar2 = zzwkVarZzb;
                zzmd zzmdVar222 = this.zzG;
                zzbf zzbfVar422 = zzmdVar222.zza;
                zzwk zzwkVar522 = zzmdVar222.zzb;
                zzwkVar3 = zzwkVar2;
                zzag(zzbfVar, zzwkVar3, zzbfVar422, zzwkVar522, true != z9 ? j2 : jZzS, false);
                if (z20) {
                }
                zzaj();
                zzZ(zzbfVar, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzas(zZzaB);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i5 = 4;
            z14 = false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (?? r52 = z14; r52 < 2; r52++) {
            zzmpVarArr[r52].zzn(zzbfVar2);
        }
        try {
            if (z20) {
                i7 = i5;
                zZzaB = z14;
                if (!zzbfVar2.zzg()) {
                    zzlq zzlqVar = this.zzs;
                    for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
                        if (zzlnVarZzm.zzg.zza.equals(zzwkVarZzb)) {
                            zzlnVarZzm.zzg = zzlqVar.zzx(zzbfVar2, zzlnVarZzm.zzg);
                            zzlnVarZzm.zzs();
                        }
                    }
                    jZzS = zzS(zzwkVarZzb, jZzS, z10);
                }
            } else {
                try {
                    zzlq zzlqVar2 = this.zzs;
                    long jZzah2 = zzlqVar2.zzn() == null ? j6 : zzah(zzlqVar2.zzn());
                    if (!zzaz() || zzlqVar2.zzo() == null) {
                        z15 = z14;
                        jZzah = j6;
                    } else {
                        jZzah = zzah(zzlqVar2.zzo());
                        z15 = z14;
                    }
                    try {
                        i7 = i5;
                        zZzaB = z15;
                        try {
                            int iZzw = zzlqVar2.zzw(zzbfVar, this.zzT, jZzah2, jZzah);
                            zzbfVar2 = zzbfVar;
                            if ((iZzw & 1) != 0) {
                                zzI(zZzaB);
                            } else if ((iZzw & 2) != 0) {
                                zzab();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzwkVar2 = zzwkVarZzb;
                            zzmd zzmdVar2222 = this.zzG;
                            zzbf zzbfVar4222 = zzmdVar2222.zza;
                            zzwk zzwkVar5222 = zzmdVar2222.zzb;
                            zzwkVar3 = zzwkVar2;
                            zzag(zzbfVar, zzwkVar3, zzbfVar4222, zzwkVar5222, true != z9 ? j2 : jZzS, false);
                            if (z20) {
                            }
                            zzaj();
                            zzZ(zzbfVar, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbfVar);
                            if (!zzbfVar.zzg()) {
                            }
                            zzas(zZzaB);
                            this.zzi.zzh(2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i7 = i5;
                        zZzaB = z15;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i7 = i5;
                    zZzaB = z14;
                    zzwkVar2 = zzwkVarZzb;
                    zzmd zzmdVar22222 = this.zzG;
                    zzbf zzbfVar42222 = zzmdVar22222.zza;
                    zzwk zzwkVar52222 = zzmdVar22222.zzb;
                    zzwkVar3 = zzwkVar2;
                    zzag(zzbfVar, zzwkVar3, zzbfVar42222, zzwkVar52222, true != z9 ? j2 : jZzS, false);
                    if (z20 || j5 != this.zzG.zzc) {
                        zzmd zzmdVar32 = this.zzG;
                        Object obj42 = zzmdVar32.zzb.zza;
                        zzbf zzbfVar52 = zzmdVar32.zza;
                        boolean z21 = (z20 || !z2 || zzbfVar52.zzg() || zzbfVar52.zzo(obj42, this.zzm).zzf) ? zZzaB : true;
                        this.zzG = zzao(zzwkVar3, jZzS, j5, !z21 ? jZzS : this.zzG.zzd, z21, zzbfVar.zze(obj42) != -1 ? i7 : 3);
                    }
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzS = null;
                    }
                    zzas(zZzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            zzmd zzmdVar4 = this.zzG;
            zzwk zzwkVar6 = zzwkVarZzb;
            zzag(zzbfVar2, zzwkVar6, zzmdVar4.zza, zzmdVar4.zzb, true != z9 ? j2 : jZzS, false);
            zzbf zzbfVar6 = zzbfVar2;
            if (z20 || j5 != this.zzG.zzc) {
                zzmd zzmdVar5 = this.zzG;
                Object obj5 = zzmdVar5.zzb.zza;
                zzbf zzbfVar7 = zzmdVar5.zza;
                boolean z22 = (!z20 || !z2 || zzbfVar7.zzg() || zzbfVar7.zzo(obj5, this.zzm).zzf) ? zZzaB : true;
                this.zzG = zzao(zzwkVar6, jZzS, j5, z22 ? jZzS : this.zzG.zzd, z22, zzbfVar6.zze(obj5) == -1 ? i7 : 3);
            }
            zzaj();
            zzZ(zzbfVar6, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar6);
            if (!zzbfVar6.zzg()) {
                this.zzS = null;
            }
            zzas(zZzaB);
            this.zzi.zzh(2);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long jZza = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i2 = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i2 >= 2) {
                    break;
                }
                if (zzmpVarArr[i2].zzp(zzlnVar)) {
                    long jZzf = zzmpVarArr[i2].zzf(zzlnVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i2++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzlnVarZzl = zzlqVar.zzl();
        if (zzlnVarZzl != null) {
            if (!zzlnVarZzl.zzd || zzlnVarZzl.zze) {
                zzwi zzwiVar = zzlnVarZzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlnVarZzl.zzg.zza, zzlnVarZzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzlnVarZzl.zzd) {
                        zzlnVarZzl.zzt(this, zzlnVarZzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzlnVarZzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzlnVarZzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzlnVarZzm = this.zzs.zzm();
        boolean z2 = false;
        if (zzlnVarZzm != null && zzlnVarZzm.zzg.zzi && this.zzJ) {
            z2 = true;
        }
        this.zzK = z2;
    }

    private final void zzak(zzav zzavVar, boolean z2) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z2);
    }

    private final void zzal(zzav zzavVar, float f3, boolean z2, boolean z3) throws zziw {
        int i2;
        if (z2) {
            if (z3) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f4 = zzavVar.zzb;
        zzln zzlnVarZzm = this.zzs.zzm();
        while (true) {
            i2 = 0;
            if (zzlnVarZzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzlnVarZzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i2 < length) {
                zzaac zzaacVar = zzaacVarArr[i2];
                i2++;
            }
            zzlnVarZzm = zzlnVarZzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i2 < 2) {
            zzmpVarArr[i2].zzm(f3, f4);
            i2++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        boolean zZzh = false;
        if (zzaF(zzlqVar.zzk())) {
            zzln zzlnVarZzk = zzlqVar.zzk();
            long jZzau = zzau(zzlnVarZzk.zzg());
            if (zzlnVarZzk == zzlqVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlnVarZzk.zza();
            } else {
                jZza = this.zzT - zzlnVarZzk.zza();
                jZza2 = zzlnVarZzk.zzg.zzb;
            }
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzlnVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            boolean zZzh2 = zzljVar.zzh(zzliVar);
            zzln zzlnVarZzm = zzlqVar.zzm();
            if (zZzh2 || !zzlnVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzlnVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzljVar.zzh(zzliVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzln zzlnVarZzk2 = zzlqVar.zzk();
            zzlnVarZzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzlnVarZzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzlnVarZzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzlnVarZzk = this.zzs.zzk();
        boolean z2 = true;
        if (!this.zzN && (zzlnVarZzk == null || !zzlnVarZzk.zza.zzn())) {
            z2 = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z2 != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @CheckResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzao(zzwk zzwkVar, long j2, long j3, long j4, boolean z2, int i2) {
        List list;
        zzaak zzaakVar;
        zzln zzlnVarZzm;
        int i3 = 0;
        this.zzW = (!this.zzW && j2 == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List listZzi = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzlnVarZzm2 = zzlqVar.zzm();
            zzyn zzynVarZzq = zzlnVarZzm2 == null ? zzyn.zza : zzlnVarZzm2.zzq();
            zzaak zzaakVarZzr = zzlnVarZzm2 == null ? this.zzf : zzlnVarZzm2.zzr();
            zzaac[] zzaacVarArr = zzaakVarZzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z3 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z3 = true;
                    }
                }
            }
            zzguf zzgufVarZzi = z3 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzlnVarZzm2 != null) {
                zzlo zzloVar = zzlnVarZzm2.zzg;
                if (zzloVar.zzc != j3) {
                    zzlnVarZzm2.zzg = zzloVar.zzb(j3);
                }
                if (zzlqVar.zzm() == zzlqVar.zzn() && (zzlnVarZzm = zzlqVar.zzm()) != null) {
                    zzaak zzaakVarZzr2 = zzlnVarZzm.zzr();
                    while (true) {
                        zzmp[] zzmpVarArr = this.zzb;
                        if (i3 >= 2) {
                            break;
                        }
                        if (zzaakVarZzr2.zza(i3)) {
                            if (zzmpVarArr[i3].zze() != 1) {
                                break;
                            }
                            int i5 = zzaakVarZzr2.zzb[i3].zzb;
                        }
                        i3++;
                    }
                }
                list = zzgufVarZzi;
                zzynVar = zzynVarZzq;
                zzaakVar = zzaakVarZzr;
            }
        } else {
            if (!zzwkVar.equals(this.zzG.zzb)) {
                zzaakVar2 = this.zzf;
                zzynVar = zzyn.zza;
                listZzi = zzguf.zzi();
            }
            list = listZzi;
            zzaakVar = zzaakVar2;
        }
        if (z2) {
            this.zzH.zzc(i2);
        }
        return this.zzG.zzc(zzwkVar, j2, j3, j4, zzat(), zzynVar, zzaakVar, list);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j2) throws zziw {
        zzmp[] zzmpVarArr;
        long j3;
        zzln zzlnVarZzn = this.zzs.zzn();
        zzaak zzaakVarZzr = zzlnVarZzn.zzr();
        int i2 = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i2 >= 2) {
                break;
            }
            if (!zzaakVarZzr.zza(i2)) {
                zzmpVarArr[i2].zzG();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < 2) {
            if (!zzaakVarZzr.zza(i3) || zzmpVarArr[i3].zzp(zzlnVarZzn)) {
                j3 = j2;
            } else {
                j3 = j2;
                zzar(zzlnVarZzn, i3, zArr[i3], j3);
            }
            i3++;
            j2 = j3;
        }
    }

    private final void zzar(zzln zzlnVar, int i2, boolean z2, long j2) throws zziw {
        zzmp zzmpVar = this.zzb[i2];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z3 = zzlnVar == this.zzs.zzm();
        zzaak zzaakVarZzr = zzlnVar.zzr();
        zzmo zzmoVar = zzaakVarZzr.zzb[i2];
        zzaac zzaacVar = zzaakVarZzr.zzc[i2];
        boolean z4 = zzax() && this.zzG.zze == 3;
        boolean z5 = !z2 && z4;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i2], this.zzT, z5, z3, j2, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z4 && z3) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z2) {
        zzln zzlnVarZzk = this.zzs.zzk();
        zzwk zzwkVar = zzlnVarZzk == null ? this.zzG.zzb : zzlnVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzwkVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzlnVarZzk == null ? zzmdVar.zzs : zzlnVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z2) && zzlnVarZzk != null && zzlnVarZzk.zze) {
            zzaw(zzlnVarZzk.zzg.zza, zzlnVarZzk.zzq(), zzlnVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j2) {
        zzln zzlnVarZzk = this.zzs.zzk();
        if (zzlnVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.zzT - zzlnVarZzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long jZza;
        long jZza2;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzk = zzlqVar.zzk();
        zzlnVarZzk.getClass();
        if (zzlnVarZzk == zzlqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzlnVarZzk.zza();
        } else {
            jZza = this.zzT - zzlnVarZzk.zza();
            jZza2 = zzlnVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, jZza - jZza2, zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i2) throws Throwable {
        zzmp zzmpVar = this.zzb[i2];
        try {
            zzln zzlnVarZzm = this.zzs.zzm();
            if (zzlnVarZzm == null) {
                throw null;
            }
            zzmpVar.zzu(zzlnVarZzm);
        } catch (IOException e2) {
            e = e2;
            zzmpVar.zze();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzmpVarArr[i2].zzc()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f3) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i2) {
        this.zzi.zze(33, i2, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j2, long j3, zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z2, int i2, int i3) {
        this.zzi.zze(1, z2 ? 1 : 0, (i3 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i2, long j2) {
        this.zzi.zzd(3, new zzle(zzbfVar, i2, j2)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z2) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(@Nullable Object obj, long j2) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j2 != -9223372036854775807L) {
            return zzdqVar.zze(j2);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    final /* synthetic */ zzln zzt(zzlo zzloVar, long j2) {
        zzaan zzaanVarZze = this.zzg.zze(this.zzv);
        long j3 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j2, this.zze, zzaanVarZze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i2, boolean z2) {
        this.zzw.zzB(i2, this.zzb[i2].zze(), z2);
    }

    final /* synthetic */ void zzv(int i2) {
        this.zzw.zzW(i2);
    }

    public final void zzy(List list, int i2, long j2, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i2, j2, null)).zza();
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i2 = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i2, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j2) {
        zzln zzlnVarZzp;
        long jMin = 1000;
        if (zzw()) {
            if (this.zzG.zze != 3) {
                jMin = zza;
            }
            zzmp[] zzmpVarArr = this.zzb;
            for (int i2 = 0; i2 < 2; i2++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmpVarArr[i2].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if (zzlqVar.zzm() != null) {
                    zzlnVarZzp = zzlqVar.zzm().zzp();
                } else {
                    zzlnVarZzp = null;
                }
                if (zzlnVarZzp != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= zzlnVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j2 + jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzT(zzwk zzwkVar, long j2, boolean z2, boolean z3) throws zziw {
        zzK();
        boolean z4 = true;
        zzaC(false, true);
        if (z3 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzp = zzlnVarZzm;
        while (zzlnVarZzp != null && !zzwkVar.equals(zzlnVarZzp.zzg.zza)) {
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
        if (z2 || zzlnVarZzm != zzlnVarZzp || (zzlnVarZzp != null && zzlnVarZzp.zza() + j2 < 0)) {
            zzaa();
            if (zzlnVarZzp != null) {
                while (zzlqVar.zzm() != zzlnVarZzp) {
                    zzlqVar.zzr();
                }
                zzlqVar.zzs(zzlnVarZzp);
                zzlnVarZzp.zzb(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                zzap();
                zzlnVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzlnVarZzp != null) {
            zzlqVar.zzs(zzlnVarZzp);
            if (!zzlnVarZzp.zze) {
                zzlnVarZzp.zzg = zzlnVarZzp.zzg.zza(j2);
            } else if (zzlnVarZzp.zzf) {
                if (this.zzC) {
                    boolean z5 = this.zzB.zzi;
                    if (!this.zzG.zza.zzg() && zzlnVarZzp.zzg.zza.equals(this.zzG.zzb)) {
                        zzmp[] zzmpVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i2 = 0; i2 < 2; i2++) {
                            zzmp zzmpVar = zzmpVarArr[i2];
                            if (zzmpVar.zzM()) {
                                zZzF &= zzmpVar.zzF(zzlnVarZzp, j2);
                            }
                        }
                        if (zZzF) {
                            zzwi zzwiVar = zzlnVarZzp.zza;
                            long j3 = this.zzG.zzs;
                            zzmt zzmtVar = zzmt.zzb;
                            if (zzwiVar.zzk(j3, zzmtVar) == zzwiVar.zzk(j2, zzmtVar)) {
                                z4 = false;
                            }
                        }
                    } else {
                        zzwi zzwiVar2 = zzlnVarZzp.zza;
                        j2 = zzwiVar2.zzj(j2);
                        zzwiVar2.zzf(j2 - this.zzn, false);
                    }
                }
            }
            zzU(j2, z4);
            zzam();
        } else {
            zzlqVar.zzv();
            zzU(j2, true);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j2;
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j2 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwkVarZzy.zzb()) {
            zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
            if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j2 = jLongValue;
        }
        return Pair.create(zzwkVarZzy, Long.valueOf(j2));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j2, boolean z2) throws zziw {
        Object obj;
        zzav zzavVar;
        if (!zzP(zzbfVar, zzwkVar)) {
            if (zzwkVar.zzb()) {
                zzavVar = zzav.zza;
            } else {
                zzavVar = this.zzG.zzo;
            }
            if (!this.zzo.zzj().equals(zzavVar)) {
                zzM(zzavVar);
                zzal(this.zzG.zzo, zzavVar.zzb, false, false);
                return;
            }
            return;
        }
        Object obj2 = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i2 = zzbfVar.zzo(obj2, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j2 != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj2, j2));
            return;
        }
        Object obj3 = zzbeVar.zzb;
        if (!zzbfVar2.zzg()) {
            obj = zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z2) {
            return;
        }
        zzipVar.zzb(-9223372036854775807L);
    }

    static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e2) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void zzj(float f3) {
        this.zzi.zzd(32, Float.valueOf(f3)).zza();
    }
}
