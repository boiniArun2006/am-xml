package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsw implements zzrj {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;

    @Nullable
    private ByteBuffer zzH;
    private int zzI;

    @Nullable
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;

    @Nullable
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzsr zzZ;

    @Nullable
    private final Context zzb;
    private final zzsl zzc;
    private final zzte zzd;
    private final zzcv zze;
    private final zztd zzf;
    private final zzguf zzg;
    private final ArrayDeque zzh;

    @Nullable
    private zzsn zzi;
    private final zzsv zzj;
    private final zzsv zzk;

    @Nullable
    private zzpq zzl;

    @Nullable
    private zzrg zzm;

    @Nullable
    private zzsq zzn;
    private zzsq zzo;
    private zzck zzp;
    private final zzqm zzq;
    private zzqj zzr;

    @Nullable
    private zzqc zzs;
    private zzd zzt;

    @Nullable
    private zzsu zzu;
    private zzsu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    private final void zzY(zzav zzavVar) {
        zzsu zzsuVar = new zzsu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzu = zzsuVar;
        } else {
            this.zzv = zzsuVar;
        }
    }

    private final boolean zzab() {
        return this.zzs != null;
    }

    private static int zzaf(int i2) {
        if (i2 == 0 || i2 == -1) {
            return -1;
        }
        return i2;
    }

    final /* synthetic */ zzsn zzI() {
        return this.zzi;
    }

    final /* synthetic */ zzrg zzJ() {
        return this.zzm;
    }

    final /* synthetic */ zzsq zzK() {
        return this.zzo;
    }

    final /* synthetic */ zzqc zzL() {
        return this.zzs;
    }

    final /* synthetic */ void zzM(boolean z2) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzN() {
        return this.zzN;
    }

    final /* synthetic */ long zzO() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zza(zzrg zzrgVar) {
        this.zzm = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzb(@Nullable zzpq zzpqVar) {
        this.zzl = zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzi() {
        this.zzN = true;
        if (zzab()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzz() {
        this.zzN = false;
        if (zzab()) {
            this.zzs.zzb();
        }
    }

    static int zzD(int i2, ByteBuffer byteBuffer) {
        int i3;
        int i5;
        byte b2;
        int i7;
        int i8;
        if (i2 == 20) {
            return zzafu.zzb(byteBuffer);
        }
        if (i2 != 30) {
            switch (i2) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzafs.zzb(zzfj.zzJ(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i2) {
                        case 14:
                            int i9 = zzadv.zza;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i10 = iPosition;
                            while (true) {
                                if (i10 > iLimit) {
                                    i8 = -1;
                                } else if ((zzfj.zzJ(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                                    i8 = i10 - iPosition;
                                } else {
                                    i10++;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + ((byteBuffer.get((byteBuffer.position() + i8) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i11 = zzady.zza;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzady.zzb(new zzeq(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i2);
                            throw new IllegalStateException(sb.toString());
                    }
                    break;
            }
            return zzadv.zze(byteBuffer);
        }
        int i12 = zzaet.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition3);
        if (b4 != -2) {
            if (b4 == -1) {
                i5 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition3 + 7);
            } else if (b4 != 31) {
                i5 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                i7 = byteBuffer.get(iPosition3 + 5) & 252;
                i3 = (i7 >> 2) | i5;
            } else {
                i5 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition3 + 6);
            }
            i7 = b2 & 60;
            i3 = (i7 >> 2) | i5;
        } else {
            i3 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i3 + 1) * 32;
    }

    static /* synthetic */ boolean zzG() {
        return zza.get() > 0;
    }

    private final void zzP() {
        zzck zzckVarZzl = this.zzo.zzl();
        this.zzp = zzckVarZzl;
        zzckVarZzl.zzb(zzcm.zza);
    }

    private final zzqc zzQ(zzql zzqlVar) throws zzrf {
        try {
            return ((zzsi) this.zzq).zzf(zzqlVar);
        } catch (zzqi e2) {
            zzrf zzrfVar = new zzrf(0, zzqlVar.zzb, zzqlVar.zzc, zzqlVar.zza, zzqlVar.zze, this.zzo.zzg(), false, e2);
            zzrg zzrgVar = this.zzm;
            if (zzrgVar == null) {
                throw zzrfVar;
            }
            zzrgVar.zza(zzrfVar);
            throw zzrfVar;
        }
    }

    private final boolean zzS() throws Exception {
        if (!this.zzp.zzc()) {
            zzU(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzR(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzT(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzgrc.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zzf()) {
                int iZzs = (int) zzfj.zzs(zzfj.zzq(20L), this.zzo.zzk().zzb);
                long jZzac = zzac();
                long j2 = iZzs;
                if (jZzac < j2) {
                    int i14 = this.zzo.zzk().zza;
                    int iZzj = this.zzo.zzj();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i15 = (int) jZzac;
                    while (byteBuffer.hasRemaining() && i15 < iZzs) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i5 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                            } else if (i14 != 4) {
                                if (i14 != 21) {
                                    if (i14 == 22) {
                                        i10 = byteBuffer.get() & UByte.MAX_VALUE;
                                        i11 = (byteBuffer.get() & UByte.MAX_VALUE) << 8;
                                        i12 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                                        i13 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                                    } else if (i14 == 268435456) {
                                        i2 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                                        i3 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                                    } else if (i14 == 1342177280) {
                                        i7 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                                        i8 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                                        i9 = (byteBuffer.get() & UByte.MAX_VALUE) << 8;
                                    } else {
                                        if (i14 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i10 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                                        i11 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                                        i12 = (byteBuffer.get() & UByte.MAX_VALUE) << 8;
                                        i13 = byteBuffer.get() & UByte.MAX_VALUE;
                                    }
                                    i5 = i10 | i11 | i12 | i13;
                                } else {
                                    i7 = (byteBuffer.get() & UByte.MAX_VALUE) << 8;
                                    i8 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                                    i9 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                                }
                                i5 = i7 | i8 | i9;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i5 = (int) (fMax < 0.0f ? (-fMax) * (-2.14748365E9f) : fMax * 2.14748365E9f);
                            }
                            int i16 = (int) ((((long) i5) * ((long) i15)) / j2);
                            if (i14 != 2) {
                                byteBufferOrder.put((byte) (i16 >> 16));
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i14 == 3) {
                                byteBufferOrder.put((byte) (i16 >> 24));
                            } else if (i14 != 4) {
                                if (i14 == 21) {
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                } else if (i14 == 22) {
                                    byteBufferOrder.put((byte) i16);
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                } else if (i14 == 268435456) {
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                } else if (i14 == 1342177280) {
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i16 >> 24));
                                    byteBufferOrder.put((byte) (i16 >> 16));
                                    byteBufferOrder.put((byte) (i16 >> 8));
                                    byteBufferOrder.put((byte) i16);
                                }
                            } else if (i16 < 0) {
                                byteBufferOrder.putFloat((-i16) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i16 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() != iPosition + iZzj) {
                                i15++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i2 = (byteBuffer.get() & UByte.MAX_VALUE) << 16;
                            i3 = (byteBuffer.get() & UByte.MAX_VALUE) << 24;
                        }
                        i5 = i2 | i3;
                        int i162 = (int) ((((long) i5) * ((long) i15)) / j2);
                        if (i14 != 2) {
                        }
                        if (byteBuffer.position() != iPosition + iZzj) {
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            }
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzU(long j2) throws Exception {
        zzrg zzrgVar;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int iRemaining = this.zzJ.remaining();
        try {
            boolean zZzc = this.zzs.zzc(this.zzJ, this.zzI, j2);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrgVar = this.zzm) != null && !zZzc) {
                }
            }
            if (this.zzo.zzf()) {
                this.zzA += (long) (iRemaining - this.zzJ.remaining());
            }
            if (zZzc) {
                if (!this.zzo.zzf()) {
                    zzgrc.zzi(this.zzJ == this.zzH);
                    this.zzB += ((long) this.zzC) * ((long) this.zzI);
                }
                this.zzJ = null;
            }
        } catch (zzqb e2) {
            boolean z2 = e2.zzb;
            if (!z2) {
                z = false;
            } else if (zzac() <= 0) {
                if (this.zzs.zzg()) {
                    zzV();
                }
            }
            zzri zzriVar = new zzri(e2.zza, this.zzo.zzg(), z);
            zzrg zzrgVar2 = this.zzm;
            if (zzrgVar2 != null) {
                zzrgVar2.zza(zzriVar);
            }
            if (z2) {
                throw zzriVar;
            }
            this.zzk.zza(zzriVar);
        }
    }

    private final void zzV() {
        this.zzo.zzk();
    }

    private final void zzX() {
        if (this.zzo != null) {
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zzsq(this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzo.zzj(), this.zzq.zzb(zzad(this.zzo.zzh(), -1)), this.zzo.zzl(), null);
            } catch (zzqd e2) {
                throw new IllegalStateException(new zzre(e2, this.zzo.zzg()));
            }
        }
        zzA();
    }

    private final boolean zzaa() {
        if (!this.zzo.zzf()) {
            return false;
        }
        int i2 = this.zzo.zzg().zzI;
        return true;
    }

    private final long zzac() {
        if (!this.zzo.zzf()) {
            return this.zzB;
        }
        long j2 = this.zzA;
        long jZzj = this.zzo.zzj();
        String str = zzfj.zza;
        return ((j2 + jZzj) - 1) / jZzj;
    }

    private final zzqf zzad(zzv zzvVar, int i2) {
        zzqe zzqeVar = new zzqe(zzvVar);
        zzqeVar.zza(this.zzt);
        zzqeVar.zzb(this.zzR);
        zzqeVar.zzc(this.zzO);
        zzqeVar.zze(-1);
        zzqeVar.zzd(this.zzS);
        return new zzqf(zzqeVar, null);
    }

    private final void zzae() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzC() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzE() {
        if (this.zzX >= 300000) {
            ((zzsz) this.zzm).zza.zzay(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzF() {
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzc(zzdn zzdnVar) {
        this.zzq.zzd(zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final int zze(zzv zzvVar) {
        int i2 = this.zzq.zza(zzad(zzvVar, -1)).zzd;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzpz zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzpz.zza;
        }
        zzqh zzqhVarZza = this.zzq.zza(zzad(zzvVar, -1));
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(zzqhVarZza.zza);
        zzpyVar.zzb(zzqhVarZza.zzb);
        zzpyVar.zzc(zzqhVarZza.zzc);
        return zzpyVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzh(zzv zzvVar, int i2, @Nullable int[] iArr) throws zzre {
        zzck zzckVar;
        zzv zzvVarZzM;
        int iZzD;
        int iZzD2;
        if (this.zzr == null && this.zzb != null) {
            zzqj zzqjVar = new zzqj() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqj
                public final /* synthetic */ void zza() {
                    this.zza.zzF();
                }
            };
            this.zzr = zzqjVar;
            this.zzq.zzc(zzqjVar);
        }
        if ("audio/raw".equals(zzvVar.zzo)) {
            int i3 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i3));
            int i5 = zzvVar.zzG;
            iZzD = zzfj.zzD(i3) * i5;
            zzguc zzgucVar = new zzguc();
            zzgucVar.zzh(this.zzg);
            zzgucVar.zzf(this.zze);
            zzgucVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgucVar.zzi());
            if (zzckVar.equals(this.zzp)) {
                zzckVar = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zzc.zzq(iArr);
            try {
                zzcl zzclVarZza = zzckVar.zza(new zzcl(zzvVar.zzH, i5, i3));
                zzt zztVarZza = zzvVar.zza();
                int i7 = zzclVarZza.zzd;
                zztVarZza.zzG(i7);
                zztVarZza.zzF(zzclVarZza.zzb);
                int i8 = zzclVarZza.zzc;
                zztVarZza.zzE(i8);
                zzvVarZzM = zztVarZza.zzM();
                iZzD2 = zzfj.zzD(i7) * i8;
            } catch (zzcn e2) {
                throw new zzre(e2, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzguf.zzi());
            zzvVarZzM = zzvVar;
            iZzD = -1;
            iZzD2 = -1;
        }
        zzck zzckVar2 = zzckVar;
        zzqf zzqfVarZzad = zzad(zzvVarZzM, -1);
        try {
            zzql zzqlVarZzb = this.zzq.zzb(zzqfVarZzad);
            if (zzqlVarZzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=");
                sb.append(false);
                sb.append(")");
                throw new zzre(sb.toString(), zzqfVarZzad.zza);
            }
            if (zzqlVarZzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=");
                sb2.append(false);
                sb2.append(")");
                throw new zzre(sb2.toString(), zzqfVarZzad.zza);
            }
            this.zzU = false;
            zzsq zzsqVar = new zzsq(zzvVar, zzvVarZzM, iZzD, iZzD2, zzqlVarZzb, zzckVar2, null);
            if (zzab()) {
                this.zzn = zzsqVar;
            } else {
                this.zzo = zzsqVar;
            }
        } catch (zzqd e3) {
            throw new zzre(e3, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzk(ByteBuffer byteBuffer, long j2, int i2) throws Exception {
        zzqc zzqcVarZzQ;
        long j3;
        long jZzi;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgrc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzS()) {
                return false;
            }
            if (this.zzn.zzb(this.zzo)) {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqc zzqcVar = this.zzs;
                if (zzqcVar != null && zzqcVar.zzg()) {
                    this.zzo.zzk();
                }
            } else {
                zzae();
                if (zzn()) {
                    return false;
                }
                zzA();
            }
            zzZ(j2);
        }
        if (!zzab()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqcVarZzQ = zzQ(this.zzo.zzk());
                } catch (zzrf e2) {
                    if (this.zzo.zzk().zze > 1000000) {
                        zzqk zzqkVar = new zzqk(this.zzo.zzk(), null);
                        zzqkVar.zze(1000000);
                        zzql zzqlVar = new zzql(zzqkVar, null);
                        try {
                            zzqc zzqcVarZzQ2 = zzQ(zzqlVar);
                            this.zzo = this.zzo.zza(zzqlVar);
                            zzqcVarZzQ = zzqcVarZzQ2;
                        } catch (zzrf e3) {
                            e2.addSuppressed(e3);
                            zzV();
                            throw e2;
                        }
                    }
                    zzV();
                    throw e2;
                }
                this.zzs = zzqcVarZzQ;
                zzsn zzsnVar = new zzsn(this, this.zzo.zzk(), bArr);
                this.zzi = zzsnVar;
                this.zzs.zzm(zzsnVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzk();
                }
                zzpq zzpqVar = this.zzl;
                if (zzpqVar != null) {
                    this.zzs.zzn(zzpqVar);
                }
                zzW();
                int i3 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i5 = this.zzO;
                this.zzO = iZzh;
                zzrg zzrgVar = this.zzm;
                if (zzrgVar != null) {
                    ((zzsz) zzrgVar).zza.zzaw().zzk(this.zzo.zze());
                    if (iZzh != i5) {
                        this.zzP = true;
                        zzsq zzsqVar = this.zzo;
                        zzqk zzqkVar2 = new zzqk(zzsqVar.zzk(), null);
                        zzqkVar2.zzg(this.zzO);
                        this.zzo = zzsqVar.zza(new zzql(zzqkVar2, null));
                        zzsq zzsqVar2 = this.zzn;
                        if (zzsqVar2 != null) {
                            zzqk zzqkVar3 = new zzqk(zzsqVar2.zzk(), null);
                            zzqkVar3.zzg(this.zzO);
                            this.zzn = zzsqVar2.zza(new zzql(zzqkVar3, null));
                        }
                        zzrg zzrgVar2 = this.zzm;
                        int i7 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzta zztaVar = ((zzsz) zzrgVar2).zza;
                            if (zztaVar.zzax() != null) {
                                zztaVar.zzax().zza(i7);
                            }
                        }
                        ((zzsz) zzrgVar2).zza.zzaw().zzm(i7);
                    }
                }
            } catch (zzrf e4) {
                this.zzj.zza(e4);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j2);
            this.zzD = false;
            this.zzE = false;
            zzZ(j2);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgrc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zzf() && this.zzC == 0) {
                int iZzD = zzD(this.zzo.zzk().zza, byteBuffer);
                this.zzC = iZzD;
                if (iZzD == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzS()) {
                    return false;
                }
                zzZ(j2);
                this.zzu = null;
            }
            long j4 = this.zzF;
            zzsq zzsqVar3 = this.zzo;
            if (zzsqVar3.zzf()) {
                j3 = 0;
                jZzi = this.zzy / ((long) this.zzo.zzi());
            } else {
                j3 = 0;
                jZzi = this.zzz;
            }
            long jZzc = j4 + zzsqVar3.zzc(jZzi - this.zzd.zzs());
            if (!this.zzD && Math.abs(jZzc - j2) > 200000) {
                zzrg zzrgVar3 = this.zzm;
                if (zzrgVar3 != null) {
                    zzrgVar3.zza(new zzrh(j2, jZzc));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzS()) {
                    return false;
                }
                long j5 = j2 - jZzc;
                this.zzF += j5;
                this.zzD = false;
                zzZ(j2);
                zzrg zzrgVar4 = this.zzm;
                if (zzrgVar4 != null && j5 != j3) {
                    ((zzsz) zzrgVar4).zza.zzao();
                }
            }
            if (this.zzo.zzf()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz += ((long) this.zzC) * ((long) i2);
            }
            this.zzH = byteBuffer;
            this.zzI = i2;
        }
        zzR(j2);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzee.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzA();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzl() throws zzri {
        if (!this.zzK && zzab() && zzS()) {
            zzae();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzo(zzav zzavVar) {
        float f3 = zzavVar.zzb;
        String str = zzfj.zza;
        this.zzw = new zzav(Math.max(0.1f, Math.min(f3, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzY(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzq(boolean z2) {
        this.zzx = z2;
        zzY(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzs(int i2) {
        if (this.zzP) {
            if (this.zzO != i2) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i2) {
            this.zzO = i2;
            zzX();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzt(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i2 = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzv(int i2) {
        int i3 = this.zzS;
        int iZzaf = zzaf(i2);
        if (i3 == iZzaf) {
            return;
        }
        this.zzS = iZzaf;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    @RequiresApi
    public final void zzx(int i2, int i3) {
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzy(float f3) {
        if (this.zzG != f3) {
            this.zzG = f3;
            zzW();
        }
    }

    /* synthetic */ zzsw(zzsp zzspVar, byte[] bArr) {
        Context applicationContext;
        if (zzspVar.zzb() == null) {
            applicationContext = null;
        } else {
            applicationContext = zzspVar.zzb().getApplicationContext();
        }
        this.zzb = applicationContext;
        this.zzt = zzd.zza;
        this.zzZ = zzspVar.zzd();
        this.zzq = zzspVar.zzc();
        zzsl zzslVar = new zzsl();
        this.zzc = zzslVar;
        zzte zzteVar = new zzte();
        this.zzd = zzteVar;
        this.zze = new zzcv();
        this.zzf = new zztd();
        this.zzg = zzguf.zzk(zzteVar, zzslVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzsu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzsv();
        this.zzk = new zzsv();
        int iZzaf = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzspVar.zzb() != null) {
            iZzaf = zzaf(zzspVar.zzb().getDeviceId());
        }
        this.zzS = iZzaf;
    }

    private final void zzR(long j2) throws Exception {
        zzU(j2);
        if (this.zzJ == null) {
            if (this.zzp.zzc()) {
                while (!this.zzp.zzg()) {
                    do {
                        ByteBuffer byteBufferZze = this.zzp.zze();
                        if (byteBufferZze.hasRemaining()) {
                            zzT(byteBufferZze);
                            zzU(j2);
                        } else {
                            ByteBuffer byteBuffer = this.zzH;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.zzp.zzd(this.zzH);
                            } else {
                                return;
                            }
                        }
                    } while (this.zzJ == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.zzH;
            if (byteBuffer2 != null) {
                zzT(byteBuffer2);
                zzU(j2);
            }
        }
    }

    private final void zzW() {
        if (zzab()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzZ(long j2) {
        zzav zzavVar;
        boolean z2;
        if (zzaa()) {
            zzsr zzsrVar = this.zzZ;
            zzavVar = this.zzw;
            zzsrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzaa()) {
            zzsr zzsrVar2 = this.zzZ;
            z2 = this.zzx;
            zzsrVar2.zzc(z2);
        } else {
            z2 = false;
        }
        this.zzx = z2;
        this.zzh.add(new zzsu(zzavVar2, Math.max(0L, j2), this.zzo.zzd(zzac()), null));
        zzP();
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzaw().zzh(this.zzx);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzA() {
        if (zzab()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzsu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzP();
            this.zzi = null;
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzB() {
        zzA();
        zzguf zzgufVar = this.zzg;
        int size = zzgufVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzco) zzgufVar.get(i2)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzd(zzv zzvVar) {
        if (zze(zzvVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzg(boolean z2) {
        ArrayDeque arrayDeque;
        long j2;
        if (zzab() && !this.zzE) {
            long jMin = Math.min(this.zzs.zzk(), this.zzo.zzd(zzac()));
            while (true) {
                arrayDeque = this.zzh;
                if (arrayDeque.isEmpty() || jMin < ((zzsu) arrayDeque.getFirst()).zzc) {
                    break;
                }
                this.zzv = (zzsu) arrayDeque.remove();
            }
            zzsu zzsuVar = this.zzv;
            long j3 = jMin - zzsuVar.zzc;
            long jZzv = zzfj.zzv(j3, zzsuVar.zza.zzb);
            if (arrayDeque.isEmpty()) {
                long jZzd = this.zzZ.zzd(j3);
                zzsu zzsuVar2 = this.zzv;
                j2 = zzsuVar2.zzb + jZzd;
                zzsuVar2.zzd = jZzd - jZzv;
            } else {
                zzsu zzsuVar3 = this.zzv;
                j2 = zzsuVar3.zzb + jZzv + zzsuVar3.zzd;
            }
            long jZze = this.zzZ.zze();
            long jZzd2 = j2 + this.zzo.zzd(jZze);
            long j4 = this.zzW;
            if (jZze > j4) {
                long jZzd3 = this.zzo.zzd(jZze - j4);
                this.zzW = jZze;
                this.zzX += jZzd3;
                if (this.zzY == null) {
                    this.zzY = new Handler(Looper.myLooper());
                }
                this.zzY.removeCallbacksAndMessages(null);
                this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzst
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzE();
                    }
                }, 100L);
            }
            return jZzd2;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzm() {
        if (!zzab()) {
            return true;
        }
        if (this.zzK && !zzn()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzn() {
        if (zzab()) {
            if (Build.VERSION.SDK_INT < 29 || !this.zzs.zzg() || !this.zzM) {
                long jZzac = zzac();
                long jZzk = this.zzs.zzk();
                zzqc zzqcVar = this.zzs;
                zzqcVar.getClass();
                if (jZzac > zzfj.zzs(jZzk, zzqcVar.zzi())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzw() {
        boolean z2;
        if (!zzab()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zzf()) {
            return this.zzo.zzd(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzaey.zzf(this.zzo.zzk().zza);
        if (iZzf != -2147483647) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zzi(z2);
        return zzfj.zzt(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }
}
