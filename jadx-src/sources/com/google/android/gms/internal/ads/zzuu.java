package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;

    @Nullable
    private ArrayDeque zzB;

    @Nullable
    private zzuq zzC;

    @Nullable
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;

    @Nullable
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;

    @Nullable
    private zzv zzn;
    private zzv zzo;

    @Nullable
    private zzth zzp;

    @Nullable
    private zzth zzq;
    private zzmk zzr;

    @Nullable
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;

    @Nullable
    private zzuk zzw;

    @Nullable
    private zzv zzx;

    @Nullable
    private MediaFormat zzy;
    private boolean zzz;

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    protected boolean zzaC(zzun zzunVar) {
        return true;
    }

    protected final boolean zzaD() {
        return this.zzS;
    }

    @Nullable
    protected final zzuk zzaE() {
        return this.zzw;
    }

    @Nullable
    protected final zzv zzaF() {
        return this.zzx;
    }

    @Nullable
    protected final MediaFormat zzaG() {
        return this.zzy;
    }

    @Nullable
    protected final zzun zzaH() {
        return this.zzD;
    }

    protected final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzak(zzunVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th;
        }
    }

    protected boolean zzaL() {
        return true;
    }

    protected final long zzaM() {
        return this.zzal;
    }

    protected boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    protected void zzaR(zzih zzihVar) throws zziw {
    }

    protected int zzaS(zzih zzihVar) {
        return 0;
    }

    protected boolean zzaT(zzih zzihVar) {
        return false;
    }

    protected final long zzaU() {
        return this.zzah;
    }

    protected final float zzaX() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final zzmk zzaY() {
        return this.zzr;
    }

    protected abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    protected abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z2) throws zzuy;

    protected boolean zzae(zzv zzvVar) {
        return false;
    }

    protected abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f3);

    protected zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected float zzai(float f3, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzaj(String str, zzuh zzuhVar, long j2, long j3) {
        throw null;
    }

    protected void zzak(String str) {
        throw null;
    }

    protected void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Nullable
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzio zzam(zzlh zzlhVar) throws zziw {
        int i2;
        boolean z2 = true;
        this.zzaf = true;
        zzv zzvVarZzM = zzlhVar.zzb;
        zzvVarZzM.getClass();
        String str = zzvVarZzM.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzM, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !zzvVarZzM.zzr.isEmpty()) {
            zzt zztVarZza = zzvVarZzM.zza();
            zztVarZza.zzp(null);
            zzvVarZzM = zztVarZza.zzM();
        }
        zzv zzvVar = zzvVarZzM;
        this.zzq = zzlhVar.zza;
        this.zzn = zzvVar;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzuk zzukVar = this.zzw;
        if (zzukVar == null) {
            this.zzB = null;
            zzaA();
            return null;
        }
        zzun zzunVar = this.zzD;
        zzunVar.getClass();
        zzv zzvVar2 = this.zzx;
        zzvVar2.getClass();
        zzth zzthVar = this.zzp;
        zzth zzthVar2 = this.zzq;
        if (zzthVar != zzthVar2) {
            zzbl();
            return new zzio(zzunVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzio zzioVarZzag = zzag(zzunVar, zzvVar2, zzvVar);
        int i3 = zzioVarZzag.zzd;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (zzbj(zzvVar)) {
                        this.zzx = zzvVar;
                        if (zzthVar2 == zzthVar || zzbk()) {
                        }
                    } else {
                        i2 = 16;
                    }
                } else if (zzbj(zzvVar)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i5 = this.zzE;
                    if (i5 != 2 && (i5 != 1 || zzvVar.zzv != zzvVar2.zzv || zzvVar.zzw != zzvVar2.zzw)) {
                        z2 = false;
                    }
                    this.zzH = z2;
                    this.zzx = zzvVar;
                    if (zzthVar2 == zzthVar || zzbk()) {
                    }
                }
            } else if (zzbj(zzvVar)) {
                this.zzx = zzvVar;
                if (zzthVar2 != zzthVar) {
                    if (zzbk()) {
                    }
                } else if (this.zzZ) {
                    this.zzX = 1;
                    if (this.zzG) {
                        this.zzY = 3;
                    } else {
                        this.zzY = 1;
                    }
                }
            }
            return (i3 != 0 || (this.zzw == zzukVar && this.zzY != 3)) ? zzioVarZzag : new zzio(zzunVar.zza, zzvVar2, zzvVar, 0, i2);
        }
        zzbl();
        i2 = 0;
        if (i3 != 0) {
        }
    }

    protected void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    protected void zzap() {
    }

    protected abstract boolean zzaq(long j2, long j3, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i5, long j4, boolean z2, boolean z3, zzv zzvVar) throws zziw;

    protected void zzar() throws zziw {
        throw null;
    }

    protected void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzy(boolean z2, boolean z3) throws zziw {
        this.zza = new zzin();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final boolean zzay(long j2) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j2 < this.zzt;
    }

    protected static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbj(@Nullable zzv zzvVar) throws zziw {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f3 = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f3, zzvVar, zzI());
            float f4 = this.zzA;
            if (f4 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f4 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw {
        int i2 = this.zzY;
        if (i2 == 1) {
            zzav();
            return;
        }
        if (i2 == 2) {
            zzav();
            zzbp();
        } else if (i2 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j2, long j3) {
        if (j3 >= j2) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, "audio/opus") && zzafu.zzf(j2, j3)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected void zzA(long j2, boolean z2, boolean z3) throws zziw {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z3) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzT(long j2, long j3) {
        return zzah(j2, j3, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public void zzV(float f3, float f4) throws zziw {
        this.zzu = f3;
        this.zzv = f4;
        zzbj(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:128|129|(12:390|131|(2:133|(2:135|(6:137|(1:146)(1:143)|144|145|227|(2:402|229)(1:230))(2:396|147))(6:395|148|(1:154)|155|(1:159)|160))(2:162|(4:164|145|227|(0)(0))(2:167|(7:172|(1:174)|175|(1:181)|(1:183)(2:184|(0))|188|(1:190)(2:398|191))(2:397|171)))|358|(2:361|(1:379))|365|(1:370)(1:369)|(1:372)|373|(1:375)(1:376)|377|378)(1:192)|193|(1:197)(1:198)|199|(1:204)(1:203)|205|206|388|207|(3:209|210|(5:212|(1:214)(1:215)|(1:221)|222|(2:401|224)(3:226|227|(0)(0)))(1:400))(3:399|349|350)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0372, code lost:
    
        r4 = r22.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0374, code lost:
    
        if (r4 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0379, code lost:
    
        if (r22.zzX == 2) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x037d, code lost:
    
        if (r22.zzad == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0385, code lost:
    
        if (r22.zzN >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0387, code lost:
    
        r0 = r4.zze();
        r22.zzN = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x038d, code lost:
    
        if (r0 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x038f, code lost:
    
        r5 = r22.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x039d, code lost:
    
        if (r22.zzX != 1) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03a1, code lost:
    
        if (r22.zzJ != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03a3, code lost:
    
        r22.zzaa = true;
        r4.zza(r22.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03b7, code lost:
    
        r22.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03be, code lost:
    
        if (r22.zzH == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03c1, code lost:
    
        r22.zzH = false;
        r0 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03c7, code lost:
    
        if (r0 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzuu.zzb);
        r4.zza(r22.zzN, 0, 38, 0, 0);
        zzbh();
        r22.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03e6, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ea, code lost:
    
        if (r22.zzW != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03ed, code lost:
    
        r5 = r22.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03ef, code lost:
    
        if (r5 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f9, code lost:
    
        r5 = (byte[]) r22.zzx.zzr.get(r0);
        r6 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0407, code lost:
    
        if (r6 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040f, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0410, code lost:
    
        r22.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0413, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0414, code lost:
    
        r0 = r22.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0418, code lost:
    
        if (r0 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x041a, code lost:
    
        r0 = r0.position();
        r5 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0422, code lost:
    
        r4.zzi(new com.google.android.gms.internal.ads.zzur(r22, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x042a, code lost:
    
        r6 = r22.zzm.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0431, code lost:
    
        if (r6 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0437, code lost:
    
        if (zzcW() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0439, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0444, code lost:
    
        if (r6 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0448, code lost:
    
        if (r22.zzW != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x044a, code lost:
    
        r22.zzg.zza();
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0451, code lost:
    
        zzam(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0456, code lost:
    
        r5 = r22.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045c, code lost:
    
        if (r5.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x045e, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0468, code lost:
    
        if (r22.zzW != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x046a, code lost:
    
        r5.zza();
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x046f, code lost:
    
        r22.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0473, code lost:
    
        if (r22.zzZ != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0475, code lost:
    
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x047c, code lost:
    
        if (r22.zzJ != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x047e, code lost:
    
        r22.zzaa = true;
        r4.zza(r22.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0492, code lost:
    
        if (r22.zzZ != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0498, code lost:
    
        if (r5.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x049a, code lost:
    
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x049f, code lost:
    
        if (r22.zzW != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x04a1, code lost:
    
        r22.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04a5, code lost:
    
        r6 = r5.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x04ab, code lost:
    
        if (zzaT(r5) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04ad, code lost:
    
        r8 = r5.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04b1, code lost:
    
        if (r8 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04b3, code lost:
    
        r5.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04ba, code lost:
    
        if (r22.zzaf == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04bc, code lost:
    
        r0 = zzbo().zze;
        r9 = r22.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04c4, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04c6, code lost:
    
        r0.zza(r6, r9);
        r22.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04cc, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04cd, code lost:
    
        r22.zzac = java.lang.Math.max(r22.zzac, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04d9, code lost:
    
        if (zzcW() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04df, code lost:
    
        if (r5.zzd() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04e1, code lost:
    
        zzbo().zzf = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04e9, code lost:
    
        r5.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04f0, code lost:
    
        if (r5.zze() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04f2, code lost:
    
        zzas(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x04f7, code lost:
    
        if (r22.zzak == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04f9, code lost:
    
        r9 = r22.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x04fd, code lost:
    
        if (r6 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04ff, code lost:
    
        r22.zzal += (r9 - r6) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0509, code lost:
    
        r22.zzac = r6;
        r22.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x050d, code lost:
    
        zzaR(r5);
        r10 = zzaS(r5);
        r6 = r6 + r22.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0517, code lost:
    
        if (r8 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0519, code lost:
    
        r4.zzb(r22.zzN, 0, r5.zzb, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0524, code lost:
    
        r0 = r22.zzN;
        r5 = r5.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0529, code lost:
    
        if (r5 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x052b, code lost:
    
        r4.zza(r0, 0, r5.limit(), r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0534, code lost:
    
        zzbh();
        r22.zzZ = true;
        r22.zzW = 0;
        r22.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0543, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0544, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0545, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0556, code lost:
    
        throw r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x055f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0560, code lost:
    
        r12 = r5;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369 A[LOOP:0: B:126:0x01fa->B:230:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzX(long j2, long j3) throws Throwable {
        boolean z2;
        ?? r12;
        ?? r122;
        boolean z3;
        ?? r2;
        boolean z4;
        ?? r22;
        boolean z5;
        Throwable th;
        long j4;
        boolean z6 = true;
        try {
            try {
            } catch (MediaCodec.CryptoException e2) {
                e = e2;
                r12 = 0;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z2 = true;
        }
        if (this.zzae) {
            zzar();
            return;
        }
        int i2 = 2;
        if (this.zzn != null || zzax(2)) {
            zzaA();
            byte b2 = -5;
            ?? r6 = 0;
            try {
                try {
                    try {
                        try {
                        } catch (IllegalStateException e4) {
                            e = e4;
                            z4 = false;
                        }
                    } catch (IllegalStateException e5) {
                        e = e5;
                    }
                } catch (MediaCodec.CryptoException e6) {
                    e = e6;
                }
            } catch (MediaCodec.CryptoException e7) {
                e = e7;
                throw zzN(e, this.zzn, r12, zzfj.zzE(e.getErrorCode()));
            } catch (IllegalStateException e8) {
                e = e8;
            }
            if (this.zzS) {
                try {
                    try {
                        Trace.beginSection("bypassRender");
                        while (true) {
                            zzgrc.zzi(this.zzae ^ z6);
                            zzub zzubVar = this.zzi;
                            if (zzubVar.zzp()) {
                                ByteBuffer byteBuffer = zzubVar.zzc;
                                int i3 = this.zzO;
                                int iZzo = zzubVar.zzo();
                                long j5 = zzubVar.zze;
                                boolean zZzbq = zzbq(zzG(), zzubVar.zzn());
                                boolean zZzb = zzubVar.zzb();
                                zzv zzvVar = this.zzo;
                                if (zzvVar == null) {
                                    throw r6;
                                }
                                if (!zzaq(j2, j3, null, byteBuffer, i3, 0, iZzo, j5, zZzbq, zZzb, zzvVar)) {
                                    z6 = true;
                                    break;
                                } else {
                                    zzaV(zzubVar.zzn());
                                    zzubVar.zza();
                                    r22 = 0;
                                }
                            } else {
                                r22 = r6;
                            }
                            try {
                                if (!this.zzad) {
                                    z6 = true;
                                    if (this.zzT) {
                                        zzgrc.zzi(zzubVar.zzq(this.zzh));
                                        z5 = false;
                                        this.zzT = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (this.zzU) {
                                        if (!zzubVar.zzp()) {
                                            zzao();
                                            this.zzU = z5;
                                            zzaA();
                                            if (!this.zzS) {
                                                break;
                                            }
                                        } else {
                                            r6 = r22;
                                        }
                                    }
                                    zzgrc.zzi(!this.zzad);
                                    zzlh zzlhVarZzH = zzH();
                                    zzih zzihVar = this.zzh;
                                    zzihVar.zza();
                                    do {
                                        zzihVar.zza();
                                        int iZzO = zzO(zzlhVarZzH, zzihVar, z5 ? 1 : 0);
                                        if (iZzO == -5) {
                                            zzam(zzlhVarZzH);
                                            break;
                                        }
                                        if (iZzO == -4) {
                                            if (!zzihVar.zzb()) {
                                                this.zzac = Math.max(this.zzac, zzihVar.zze);
                                                if (zzcW() || this.zzg.zzd()) {
                                                    zzbo().zzf = this.zzac;
                                                }
                                                if (this.zzaf) {
                                                    zzv zzvVar2 = this.zzn;
                                                    if (zzvVar2 == null) {
                                                        throw r22;
                                                    }
                                                    this.zzo = zzvVar2;
                                                    if (Objects.equals(zzvVar2.zzo, "audio/opus") && !this.zzo.zzr.isEmpty()) {
                                                        int iZze = zzafu.zze((byte[]) this.zzo.zzr.get(z5 ? 1 : 0));
                                                        zzt zztVarZza = this.zzo.zza();
                                                        zztVarZza.zzH(iZze);
                                                        this.zzo = zztVarZza.zzM();
                                                    }
                                                    zzan(this.zzo, r22);
                                                    this.zzaf = z5;
                                                }
                                                zzihVar.zzl();
                                                zzv zzvVar3 = this.zzo;
                                                if (zzvVar3 != null && Objects.equals(zzvVar3.zzo, "audio/opus")) {
                                                    if (zzihVar.zze()) {
                                                        zzihVar.zza = this.zzo;
                                                        zzas(zzihVar);
                                                    }
                                                    if (zzafu.zzf(zzG(), zzihVar.zze)) {
                                                        this.zzl.zza(zzihVar, this.zzo.zzr);
                                                    }
                                                }
                                                if (zzubVar.zzp()) {
                                                    long jZzG = zzG();
                                                    if (zzbq(jZzG, zzubVar.zzn()) != zzbq(jZzG, zzihVar.zze)) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                this.zzad = true;
                                                zzbo().zzf = this.zzac;
                                                break;
                                            }
                                        } else if (zzcW()) {
                                            zzbo().zzf = this.zzac;
                                        }
                                    } while (zzubVar.zzq(zzihVar));
                                    this.zzT = true;
                                    if (zzubVar.zzp()) {
                                        zzubVar.zzl();
                                    }
                                    if (!zzubVar.zzp() && !this.zzad && !this.zzU) {
                                        break;
                                    } else {
                                        r6 = r22;
                                    }
                                } else {
                                    z6 = true;
                                    this.zzae = true;
                                    break;
                                }
                            } catch (IllegalStateException e9) {
                                e = e9;
                                z6 = true;
                                b2 = 0;
                                z2 = z6;
                                r122 = b2;
                                z3 = e instanceof MediaCodec.CodecException;
                                if (!z3) {
                                }
                                zzal(e);
                                if (z3) {
                                }
                                if (r2 != 0) {
                                }
                                zzum zzumVarZzaP = zzaP(e, this.zzD);
                                throw zzN(zzumVarZzaP, this.zzn, r2, zzumVarZzaP.zza == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
                            }
                        }
                        Trace.endSection();
                    } catch (MediaCodec.CryptoException e10) {
                        e = e10;
                        b2 = 0;
                        r12 = b2;
                        throw zzN(e, this.zzn, r12, zzfj.zzE(e.getErrorCode()));
                    }
                } catch (IllegalStateException e11) {
                    e = e11;
                }
            } else {
                byte b4 = -5;
                Throwable th2 = null;
                boolean z7 = false;
                if (this.zzw != null) {
                    long jZzb = zzL().zzb();
                    Trace.beginSection("drainAndFeed");
                    long j6 = jZzb;
                    while (true) {
                        zzuk zzukVar = this.zzw;
                        if (zzukVar == null) {
                            throw th2;
                        }
                        if (!zzbg()) {
                            try {
                                MediaCodec.BufferInfo bufferInfo = this.zzj;
                                int iZzf = zzukVar.zzf(bufferInfo);
                                if (iZzf >= 0) {
                                    th = th2;
                                    bufferInfo.presentationTimeUs -= this.zzal;
                                    if (!this.zzI) {
                                        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                            zzbm();
                                            break;
                                        }
                                        this.zzO = iZzf;
                                        ByteBuffer byteBufferZzj = zzukVar.zzj(iZzf);
                                        this.zzP = byteBufferZzj;
                                        if (byteBufferZzj != null) {
                                            byteBufferZzj.position(bufferInfo.offset);
                                            this.zzP.limit(bufferInfo.offset + bufferInfo.size);
                                        }
                                        zzv zzvVar4 = (zzv) this.zzag.zze.zze(bufferInfo.presentationTimeUs);
                                        if (zzvVar4 == null && this.zzai && this.zzy != null) {
                                            zzvVar4 = (zzv) this.zzag.zze.zzd();
                                        }
                                        if (zzvVar4 != null) {
                                            this.zzo = zzvVar4;
                                        } else if (this.zzz && this.zzo != null) {
                                        }
                                        zzv zzvVar5 = this.zzo;
                                        if (zzvVar5 == null) {
                                            throw th;
                                        }
                                        zzan(zzvVar5, this.zzy);
                                        this.zzz = z7;
                                        this.zzai = z7;
                                    } else {
                                        this.zzI = z7;
                                        zzukVar.zzc(iZzf, z7);
                                        j4 = j6;
                                        if (!zzay(j4)) {
                                        }
                                    }
                                } else if (iZzf == -2) {
                                    this.zzab = z6;
                                    zzuk zzukVar2 = this.zzw;
                                    if (zzukVar2 == null) {
                                        throw th2;
                                    }
                                    MediaFormat mediaFormatZzg = zzukVar2.zzg();
                                    if (this.zzE != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                        this.zzI = z6;
                                    } else {
                                        this.zzy = mediaFormatZzg;
                                        this.zzz = z6;
                                    }
                                    th = th2;
                                    j4 = j6;
                                    if (!zzay(j4)) {
                                        break;
                                    }
                                    j6 = j4;
                                    th2 = th;
                                    z6 = true;
                                    i2 = 2;
                                    z7 = false;
                                    b4 = -5;
                                } else {
                                    if (this.zzJ && (this.zzad || this.zzX == i2)) {
                                        zzbm();
                                    }
                                    long j7 = this.zzK;
                                    if (j7 != -9223372036854775807L && j7 + 100 < zzL().zza()) {
                                        zzbm();
                                    }
                                    th = th2;
                                }
                            } catch (IllegalStateException e12) {
                                e = e12;
                                z4 = z7;
                                z2 = true;
                                r122 = z4;
                            }
                            z3 = e instanceof MediaCodec.CodecException;
                            if (!z3) {
                                StackTraceElement[] stackTrace = e.getStackTrace();
                                if (stackTrace.length <= 0 || !stackTrace[r122].getClassName().equals("android.media.MediaCodec")) {
                                    throw e;
                                }
                            }
                            zzal(e);
                            r2 = (z3 && ((MediaCodec.CodecException) e).isRecoverable()) ? z2 : r122;
                            if (r2 != 0) {
                                zzaI();
                            }
                            zzum zzumVarZzaP2 = zzaP(e, this.zzD);
                            throw zzN(zzumVarZzaP2, this.zzn, r2, zzumVarZzaP2.zza == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
                        }
                        th = th2;
                        boolean z9 = (this.zzak || this.zzj.presentationTimeUs < zzG()) ? true : z7;
                        this.zzQ = z9;
                        long j9 = this.zzag.zzf;
                        boolean z10 = (j9 == -9223372036854775807L || j9 > this.zzj.presentationTimeUs) ? z7 : true;
                        this.zzR = z10;
                        ByteBuffer byteBuffer2 = this.zzP;
                        int i5 = this.zzO;
                        MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                        long j10 = j6;
                        int i7 = bufferInfo2.flags;
                        long j11 = bufferInfo2.presentationTimeUs;
                        zzv zzvVar6 = this.zzo;
                        if (zzvVar6 == null) {
                            throw th;
                        }
                        if (!zzaq(j2, j3, zzukVar, byteBuffer2, i5, i7, 1, j11, z9, z10, zzvVar6)) {
                            break;
                        }
                        zzaV(bufferInfo2.presentationTimeUs);
                        boolean z11 = (bufferInfo2.flags & 4) != 0;
                        if (!z11 && this.zzaa && this.zzR) {
                            this.zzK = zzL().zza();
                        }
                        zzbi();
                        if (z11) {
                            zzbm();
                            break;
                        } else {
                            j4 = j10;
                            if (!zzay(j4)) {
                            }
                        }
                    }
                } else {
                    this.zza.zzd += zzP(j2);
                    zzax(1);
                }
            }
            this.zza.zza();
        }
        return;
        if (!zzay(j4)) {
            Trace.endSection();
            this.zza.zza();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0211 A[Catch: Exception -> 0x0105, TryCatch #5 {Exception -> 0x0105, blocks: (B:57:0x00db, B:59:0x00e5, B:61:0x00f9, B:67:0x0137, B:69:0x0148, B:71:0x0162, B:73:0x016b, B:75:0x0173, B:77:0x017d, B:79:0x0185, B:81:0x018d, B:85:0x0198, B:87:0x019e, B:91:0x01aa, B:93:0x01b3, B:118:0x020b, B:120:0x0211, B:122:0x0217, B:123:0x0225, B:98:0x01c1, B:100:0x01c9, B:102:0x01d1, B:104:0x01d9, B:106:0x01e1, B:108:0x01e9, B:110:0x01f1, B:112:0x01fb, B:114:0x0205), top: B:167:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d A[Catch: zzuq -> 0x0082, TryCatch #4 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:138:0x0254, B:140:0x026d, B:142:0x0276, B:145:0x027d, B:146:0x027f, B:141:0x0270, B:148:0x0281, B:149:0x0282, B:151:0x0287, B:152:0x0288, B:153:0x0292, B:38:0x008a, B:39:0x0092, B:155:0x0295), top: B:166:0x0055, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0270 A[Catch: zzuq -> 0x0082, TryCatch #4 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:138:0x0254, B:140:0x026d, B:142:0x0276, B:145:0x027d, B:146:0x027f, B:141:0x0270, B:148:0x0281, B:149:0x0282, B:151:0x0287, B:152:0x0288, B:153:0x0292, B:38:0x008a, B:39:0x0092, B:155:0x0295), top: B:166:0x0055, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzun] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    protected final void zzaA() throws zziw {
        zzv zzvVar;
        boolean z2;
        ?? r10;
        zzuq zzuqVar;
        zzv zzvVar2;
        long j2;
        long j3;
        int i2;
        String str;
        if (this.zzw != null || this.zzS || (zzvVar = this.zzn) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaB(zzvVar)) {
            zzao();
            String str2 = zzvVar.zzo;
            if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zzth zzthVar = this.zzq;
        this.zzp = zzthVar;
        if (zzthVar != null) {
            zzgrc.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar3 = this.zzn;
            MediaCrypto mediaCrypto = null;
            if (zzvVar3 == null) {
                throw null;
            }
            if (this.zzB == null) {
                try {
                    List listZzad = zzad(this.zzd, zzvVar3, false);
                    listZzad.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!listZzad.isEmpty()) {
                        this.zzB.add((zzun) listZzad.get(0));
                    }
                    this.zzC = null;
                } catch (zzuy e2) {
                    throw new zzuq(zzvVar3, (Throwable) e2, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzuq(zzvVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzB;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzw == null) {
                zzun zzunVar = (zzun) arrayDeque.peekFirst();
                if (zzunVar == null) {
                    throw mediaCrypto;
                }
                zzaQ(zzvVar3);
                if (!zzaC(zzunVar)) {
                    return;
                }
                try {
                    this.zzD = zzunVar;
                    zzvVar2 = this.zzn;
                } catch (Exception e3) {
                    e = e3;
                    z2 = z3;
                }
                if (zzvVar2 == null) {
                    throw mediaCrypto;
                }
                String str3 = zzunVar.zza;
                float fZzai = zzai(this.zzv, zzvVar2, zzI());
                if (fZzai <= this.zze) {
                    fZzai = -1.0f;
                }
                long jZzb = zzL().zzb();
                z2 = z3;
                try {
                    ?? Zzaf = zzaf(zzunVar, zzvVar2, mediaCrypto, fZzai);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        LogSessionId logSessionIdZza = zzK().zza();
                        j2 = jZzb;
                        if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            Zzaf.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                        }
                    } else {
                        j2 = jZzb;
                    }
                    try {
                        StringBuilder sb = new StringBuilder(str3.length() + 12);
                        sb.append("createCodec:");
                        sb.append(str3);
                        Trace.beginSection(sb.toString());
                        zzuk zzukVarZzb = this.zzc.zzb(Zzaf);
                        this.zzw = zzukVarZzb;
                        this.zzL = zzukVarZzb.zzm(new zzus(this, null));
                        Trace.endSection();
                        long jZzb2 = zzL().zzb();
                        if (zzunVar.zzc(zzvVar2)) {
                            j3 = jZzb2;
                        } else {
                            Object[] objArr = {zzv.zze(zzvVar2), str3};
                            String str4 = zzfj.zza;
                            j3 = jZzb2;
                            zzee.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                        }
                        this.zzA = fZzai;
                        this.zzx = zzvVar2;
                        if (i3 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str3)) {
                            i2 = 0;
                            this.zzE = i2;
                            this.zzF = (i3 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z2;
                            this.zzG = false;
                            str = zzunVar.zza;
                            if (i3 <= 25 || !"OMX.rk.video_decoder.avc".equals(str)) {
                                boolean z4 = ((i3 <= 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzunVar.zzf)) ? false : z2;
                                this.zzJ = z4;
                                if (this.zzw == null) {
                                    throw null;
                                }
                                if (zze() == 2) {
                                    this.zzM = zzL().zzb() + 1000;
                                }
                                this.zza.zza++;
                                Zzaf = zzunVar;
                                try {
                                    zzaj(str3, Zzaf, j3, j3 - j2);
                                } catch (Exception e4) {
                                    e = e4;
                                    r10 = Zzaf;
                                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                    arrayDeque.removeFirst();
                                    zzuq zzuqVar2 = new zzuq(zzvVar3, (Throwable) e, false, (zzun) r10);
                                    zzal(zzuqVar2);
                                    zzuqVar = this.zzC;
                                    if (zzuqVar != null) {
                                        this.zzC = zzuqVar2;
                                    } else {
                                        this.zzC = zzuqVar.zza(zzuqVar2);
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                        throw this.zzC;
                                    }
                                }
                            }
                        } else {
                            String str5 = Build.MODEL;
                            if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                                i2 = 2;
                            }
                            this.zzE = i2;
                            if (i3 == 29) {
                                this.zzF = (i3 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z2;
                                this.zzG = false;
                                str = zzunVar.zza;
                                if (i3 <= 25) {
                                    if (i3 <= 29) {
                                        this.zzJ = z4;
                                        if (this.zzw == null) {
                                        }
                                    } else {
                                        this.zzJ = z4;
                                        if (this.zzw == null) {
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    r10 = zzunVar;
                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                    arrayDeque.removeFirst();
                    zzuq zzuqVar22 = new zzuq(zzvVar3, (Throwable) e, false, (zzun) r10);
                    zzal(zzuqVar22);
                    zzuqVar = this.zzC;
                    if (zzuqVar != null) {
                    }
                    if (!arrayDeque.isEmpty()) {
                    }
                }
                z3 = z2;
                mediaCrypto = null;
            }
            this.zzB = mediaCrypto;
        } catch (zzuq e6) {
            throw zzN(e6, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    protected boolean zzaK() {
        int i2 = this.zzY;
        if (i2 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e2) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
            return true;
        }
    }

    protected zzum zzaP(Throwable th, @Nullable zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    @CallSuper
    protected void zzaV(long j2) {
        this.zzah = j2;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j2 < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    protected final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    protected final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e2) {
            throw zzN(e2, zzvVar, false, 4002);
        }
    }

    protected final long zzba() {
        return this.zzag.zzf;
    }

    protected final long zzbb() {
        return this.zzag.zzd;
    }

    protected final long zzbc() {
        return this.zzag.zzc;
    }

    final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i2, @Nullable Object obj) throws zziw {
        if (i2 == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzv[] zzvVarArr, long j2, long j3, zzwk zzwkVar) throws zziw {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzbn(new zzut(-9223372036854775807L, j2, j3));
            if (this.zzaj) {
                zzap();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j4 = this.zzac;
            if (j4 != -9223372036854775807L) {
                long j5 = this.zzah;
                if (j5 != -9223372036854775807L) {
                }
            }
            zzbn(new zzut(-9223372036854775807L, j2, j3));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        arrayDeque.add(new zzut(this.zzac, j2, j3));
    }

    public zzuu(int i2, zzui zzuiVar, zzuw zzuwVar, boolean z2, float f3) {
        super(i2);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f3;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzax(int i2) throws zziw {
        zzlh zzlhVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzlhVarZzH, zzihVar, i2 | 4);
        if (iZzO == -5) {
            zzam(zzlhVarZzH);
            return true;
        }
        if (iZzO == -4 && zzihVar.zzb()) {
            this.zzad = true;
            zzbm();
            return false;
        }
        return false;
    }

    protected final boolean zzaJ() throws zziw {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    @CallSuper
    protected void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    protected final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    protected long zzah(long j2, long j3, boolean z2) {
        return super.zzT(j2, j3);
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }
}
