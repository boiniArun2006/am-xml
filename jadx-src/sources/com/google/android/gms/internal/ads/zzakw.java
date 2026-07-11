package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;

    @Nullable
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;

    @Nullable
    private long[][] zzz;

    static {
        int i2 = zzaks.zza;
    }

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private static int zzm(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzakw(zzamd zzamdVar, int i2) {
        this.zzb = zzamdVar;
        this.zzc = i2;
        this.zzk = zzguf.zzi();
        this.zzl = (i2 & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j2) throws zzat {
        int i2;
        int i3;
        zzap zzapVarZzc;
        long j3;
        zzfu zzfuVar;
        boolean z2;
        long j4;
        ArrayDeque arrayDeque;
        int i5;
        List list;
        int i7;
        int i8;
        zzakv zzakvVar;
        zzagh zzaghVar;
        long j5;
        int i9;
        long j6;
        zzap zzapVar;
        zzap zzapVar2;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfu) arrayDeque2.peek()).zza != j2) {
                break;
            }
            zzfu zzfuVar2 = (zzfu) arrayDeque2.pop();
            if (zzfuVar2.zzd == 1836019574) {
                zzfu zzfuVarZzd = zzfuVar2.zzd(Mp4Box.TYPE_meta);
                new ArrayList();
                zzap zzapVarZze = zzfuVarZzd != null ? zzakh.zze(zzfuVarZzd) : null;
                ArrayList arrayList = new ArrayList();
                boolean z3 = this.zzA == i11 ? i11 : i10;
                zzafn zzafnVar = new zzafn();
                zzfv zzfvVarZzc = zzfuVar2.zzc(Mp4Box.TYPE_udta);
                if (zzfvVarZzc != null) {
                    zzapVarZzc = zzakh.zzc(zzfvVarZzc);
                    zzafnVar.zza(zzapVarZzc);
                } else {
                    zzapVarZzc = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar2.zzc(Mp4Box.TYPE_mvhd);
                zzfvVarZzc2.getClass();
                zzao[] zzaoVarArr = new zzao[i11];
                zzaoVarArr[i10] = zzakh.zzd(zzfvVarZzc2.zza);
                zzap zzapVar3 = new zzap(-9223372036854775807L, zzaoVarArr);
                int i12 = this.zzc;
                if (i11 != (i12 & 1)) {
                    j3 = -9223372036854775807L;
                    zzfuVar = zzfuVar2;
                    z2 = i10;
                } else {
                    j3 = -9223372036854775807L;
                    zzfuVar = zzfuVar2;
                    z2 = i11;
                }
                zzap zzapVar4 = zzapVarZzc;
                int i13 = i10;
                int i14 = i11;
                zzap zzapVar5 = zzapVar3;
                ArrayList arrayList2 = arrayList;
                List listZzb = zzakh.zzb(zzfuVar, zzafnVar, -9223372036854775807L, null, z2, z3, zzakt.zza, false);
                String strZza = zzakr.zza(listZzb);
                long j7 = j3;
                long j9 = j7;
                int i15 = i13;
                int i16 = i15;
                int i17 = -1;
                while (true) {
                    j4 = 0;
                    if (i15 >= listZzb.size()) {
                        break;
                    }
                    zzalf zzalfVar = (zzalf) listZzb.get(i15);
                    int i18 = zzalfVar.zzb;
                    if (i18 == 0) {
                        arrayDeque = arrayDeque2;
                        list = listZzb;
                        i7 = i15;
                        i5 = i16;
                        j6 = j9;
                        zzapVar2 = zzapVar5;
                    } else {
                        zzalc zzalcVar = zzalfVar.zza;
                        arrayDeque = arrayDeque2;
                        zzaex zzaexVar = this.zzx;
                        i5 = i16 + 1;
                        list = listZzb;
                        int i19 = zzalcVar.zzb;
                        zzakv zzakvVar2 = new zzakv(zzalcVar, zzalfVar, zzaexVar.zzu(i16, i19));
                        int i20 = i15;
                        long j10 = zzalcVar.zze;
                        if (j10 == j9) {
                            j10 = zzalfVar.zzi;
                        }
                        i7 = i20;
                        zzagh zzaghVar2 = zzakvVar2.zzc;
                        zzaghVar2.zzN(j10);
                        long jMax = Math.max(j7, j10);
                        zzv zzvVar = zzalcVar.zzg;
                        String str = zzvVar.zzo;
                        int i21 = "audio/true-hd".equals(str) ? zzalfVar.zze * 16 : zzalfVar.zze + 30;
                        ArrayList arrayList3 = arrayList2;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(i21);
                        if (i19 == 2) {
                            int i22 = zzvVar.zzf;
                            if ((i12 & 8) != 0) {
                                i22 |= i17 == -1 ? i14 : 2;
                            }
                            zztVarZza.zzg(i22);
                            i19 = 2;
                        }
                        if (zzas.zzb(str)) {
                            boolean z4 = zzalfVar.zzj;
                            i8 = i17;
                            int iMin = Math.min(!z4 ? zzalfVar.zzh.length : i18, 20);
                            zzgrc.zzi(j10 != j9 ? i14 : i13);
                            zzakvVar = zzakvVar2;
                            zzaghVar = zzaghVar2;
                            long jMin = Math.min(j10, 10000000L);
                            int i23 = i13;
                            int i24 = -1;
                            for (int i25 = i23; i25 < iMin; i25++) {
                                int i26 = z4 ? i25 : zzalfVar.zzh[i25];
                                long j11 = zzalfVar.zzf[i26];
                                if (j11 > jMin) {
                                    break;
                                }
                                if (j11 >= 0 && (i9 = zzalfVar.zzd[i26]) > i23) {
                                    i23 = i9;
                                    i24 = i26;
                                }
                            }
                            if (i24 != -1) {
                                j5 = zzalfVar.zzf[i24];
                            }
                            if (j5 == j9) {
                                zzao[] zzaoVarArr2 = new zzao[i14];
                                zzaoVarArr2[i13] = new zzahx(j5);
                                j6 = j9;
                                zzapVar = new zzap(j6, zzaoVarArr2);
                            } else {
                                j6 = j9;
                                zzapVar = null;
                            }
                            zzakq.zzb(i19, zzafnVar, zztVarZza);
                            zzap zzapVar6 = zzvVar.zzl;
                            List list2 = this.zzj;
                            zzap zzapVar7 = !list2.isEmpty() ? null : new zzap(list2);
                            zzapVar2 = zzapVar5;
                            zzakq.zza(i19, zzapVarZze, zztVarZza, zzapVar6, zzapVar7, zzapVar4, zzapVar2, zzapVar);
                            zztVarZza.zzl(strZza);
                            if (Objects.equals(str, "audio/mpeg")) {
                                zzaghVar.zzz(zztVarZza.zzM());
                            } else {
                                zzakvVar.zzf = zztVarZza.zzM();
                            }
                            int i27 = i8;
                            int size = (i19 == 2 || i27 != -1) ? i27 : arrayList3.size();
                            arrayList2 = arrayList3;
                            arrayList2.add(zzakvVar);
                            i17 = size;
                            j7 = jMax;
                        } else {
                            zzaghVar = zzaghVar2;
                            i8 = i17;
                            zzakvVar = zzakvVar2;
                        }
                        j5 = j9;
                        if (j5 == j9) {
                        }
                        zzakq.zzb(i19, zzafnVar, zztVarZza);
                        zzap zzapVar62 = zzvVar.zzl;
                        List list22 = this.zzj;
                        if (!list22.isEmpty()) {
                        }
                        zzapVar2 = zzapVar5;
                        zzakq.zza(i19, zzapVarZze, zztVarZza, zzapVar62, zzapVar7, zzapVar4, zzapVar2, zzapVar);
                        zztVarZza.zzl(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                        }
                        int i272 = i8;
                        if (i19 == 2) {
                            arrayList2 = arrayList3;
                            arrayList2.add(zzakvVar);
                            i17 = size;
                            j7 = jMax;
                        }
                    }
                    zzapVar5 = zzapVar2;
                    j9 = j6;
                    arrayDeque2 = arrayDeque;
                    i16 = i5;
                    listZzb = list;
                    i14 = 1;
                    i15 = i7 + 1;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i28 = i17;
                int i29 = -1;
                zzakv[] zzakvVarArr = (zzakv[]) arrayList2.toArray(new zzakv[i13]);
                this.zzy = zzakvVarArr;
                int length = zzakvVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i30 = 0; i30 < zzakvVarArr.length; i30++) {
                    jArr[i30] = new long[zzakvVarArr[i30].zzb.zzb];
                    jArr2[i30] = zzakvVarArr[i30].zzb.zzf[0];
                }
                i2 = 0;
                int i31 = 0;
                while (i31 < zzakvVarArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i32 = i29;
                    for (int i33 = 0; i33 < zzakvVarArr.length; i33++) {
                        if (!zArr[i33]) {
                            long j13 = jArr2[i33];
                            if (j13 <= j12) {
                                i32 = i33;
                                j12 = j13;
                            }
                        }
                    }
                    int i34 = iArr[i32];
                    long[] jArr3 = jArr[i32];
                    jArr3[i34] = j4;
                    zzalf zzalfVar2 = zzakvVarArr[i32].zzb;
                    zzakv[] zzakvVarArr2 = zzakvVarArr;
                    j4 += (long) zzalfVar2.zzd[i34];
                    int i35 = i34 + 1;
                    iArr[i32] = i35;
                    if (i35 < jArr3.length) {
                        jArr2[i32] = zzalfVar2.zzf[i35];
                    } else {
                        zArr[i32] = true;
                        i31++;
                    }
                    zzakvVarArr = zzakvVarArr2;
                    i29 = -1;
                }
                i3 = 1;
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzaku(j7, this.zzy, i28));
                arrayDeque3.clear();
                this.zzl = 2;
            } else {
                i2 = i10;
                i3 = i11;
                if (!arrayDeque2.isEmpty()) {
                    ((zzfu) arrayDeque2.peek()).zzb(zzfuVar2);
                }
            }
            i10 = i2;
            i11 = i3;
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzagcVarZzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzagcVarZzb != null ? zzguf.zzj(zzagcVarZzb) : zzguf.zzi();
        return zzagcVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e4, code lost:
    
        if (java.util.Objects.equals(r5, "audio/mpeg") == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        r2 = r10.zzf;
        r4 = r37.zzf;
        r4.zza(4);
        r38.zzi(r4.zzi(), 0, 4);
        r38.zzl();
        r5 = new com.google.android.gms.internal.ads.zzafr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0206, code lost:
    
        if (r5.zza(r4.zzB()) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (java.util.Objects.equals(r2.zzo, r5.zzb) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        r2 = r2.zza();
        r4 = r5.zzb;
        r4.getClass();
        r2.zzm(r4);
        r2 = r2.zzM();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        r9.zzz(r2);
        r10.zzf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0229, code lost:
    
        if (r14 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022b, code lost:
    
        r14.zzb(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022e, code lost:
    
        r2 = r37.zzs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        if (r2 >= r3) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0232, code lost:
    
        r2 = r9.zza(r38, r3 - r2, false);
        r37.zzr += r2;
        r37.zzs += r2;
        r37.zzt -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        r16 = r15.zzf[r11];
        r1 = r15.zzg[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
    
        if (r37.zzu != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0255, code lost:
    
        r1 = r1 | androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0258, code lost:
    
        if (r14 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025a, code lost:
    
        r15 = r9;
        r14.zzc(r15, r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026f, code lost:
    
        if ((r11 + 1) != r15.zzb) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0271, code lost:
    
        r14.zzd(r15, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0276, code lost:
    
        r9.zze(r16, r1, r18, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0284, code lost:
    
        r10.zze++;
        r37.zzq = -1;
        r37.zzr = 0;
        r37.zzs = 0;
        r37.zzt = 0;
        r37.zzu = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0297, code lost:
    
        r39.zza = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0299, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029a, code lost:
    
        r3 = r37.zzn - ((long) r37.zzo);
        r5 = r38.zzn() + r3;
        r7 = r37.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ad, code lost:
    
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02af, code lost:
    
        r38.zzc(r7.zzi(), r37.zzo, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bb, code lost:
    
        if (r37.zzm != 1718909296) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bd, code lost:
    
        r37.zzv = true;
        r7.zzh(8);
        r3 = zzm(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02cb, code lost:
    
        if (r3 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r7 = r38.zzn();
        r14 = r37.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ce, code lost:
    
        r7.zzk(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d6, code lost:
    
        if (r7.zzd() <= 0) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
    
        r3 = zzm(r7.zzB());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        if (r3 == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e4, code lost:
    
        r37.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e6, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r14 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e8, code lost:
    
        r3 = r37.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ee, code lost:
    
        if (r3.isEmpty() != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        ((com.google.android.gms.internal.ads.zzfu) r3.peek()).zza(new com.google.android.gms.internal.ads.zzfv(r37.zzm, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0303, code lost:
    
        if (r37.zzv != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030a, code lost:
    
        if (r37.zzm != 1835295092) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030c, code lost:
    
        r37.zzA = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
    
        if (r3 >= 262144) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r21 = r6;
        r28 = r21 == true ? 1 : 0;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
        r29 = 262144;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0313, code lost:
    
        r38.zzf((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0318, code lost:
    
        r39.zza = r38.zzn() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0320, code lost:
    
        zzk(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0323, code lost:
    
        if (r3 == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0329, code lost:
    
        if (r37.zzl == 2) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x032b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r15 = r37.zzy;
        r31 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r14 >= r15.length) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r10 = r15[r14];
        r11 = r10.zze;
        r10 = r10.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r11 != r10.zzb) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r15 = r10.zzc[r11];
        r10 = r37.zzz;
        r10.getClass();
        r33 = r10[r14][r11];
        r15 = r15 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r15 < r31) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r15 < 262144) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r10 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r28 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r10 != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r15 >= r24) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r28 = r10;
        r27 = r14;
        r24 = r15;
        r22 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r28 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r33 >= r19) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r21 = r10;
        r26 = r14;
        r19 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r14 = r14 + r6;
        r10 = r31;
        r21 = r21;
        r28 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r21 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r22 < (r19 + 10485760)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        r37.zzq = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r14 != (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        r31 = 0;
        r29 = 262144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r10 = r37.zzy[r14];
        r14 = r10.zzc;
        r11 = r10.zze;
        r15 = r10.zzb;
        r19 = r14;
        r13 = r15.zzc[r11] + r37.zzw;
        r12 = r15.zzd;
        r17 = r12[r11];
        r23 = false;
        r14 = r10.zzd;
        r20 = 4;
        r7 = (r13 - r7) + ((long) r37.zzr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        if (r7 < r31) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r7 < r29) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        r2 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r2.zzh != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r7 = r7 + 8;
        r17 = r17 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r3 = r17;
        r38.zzf((int) r7);
        r4 = r2.zzg;
        r5 = r4.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (java.util.Objects.equals(r5, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
    
        java.util.Objects.equals(r5, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
    
        r37.zzu = true;
        r2 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0113, code lost:
    
        if (r2 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r5 = r37.zze;
        r7 = r5.zzi();
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r6 = 4 - r2;
        r3 = r3 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
    
        if (r37.zzs >= r3) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        r8 = r37.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        if (r8 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012e, code lost:
    
        if (r37.zzu != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7 == r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        if ((com.google.android.gms.internal.ads.zzgm.zzc(r4) + r2) > (r12[r11] - r37.zzr)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013c, code lost:
    
        r8 = com.google.android.gms.internal.ads.zzgm.zzc(r4);
        r9 = r2 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r9 = r2;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r38.zzc(r7, r6, r9);
        r37.zzr += r9;
        r9 = r23;
        r5.zzh(r9);
        r13 = r5.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        if (r13 < 0) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
    
        r37.zzt = r13 - r8;
        r13 = r37.zzd;
        r13.zzh(r9);
        r17 = r2;
        r9 = r19;
        r2 = r20;
        r9.zzc(r13, r2);
        r37.zzs += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        if (r8 <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        r9.zzc(r5, r8);
        r37.zzs += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r7, r2, r8, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        r37.zzu = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        r2 = r17;
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        r20 = r2;
        r19 = r9;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0199, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019a, code lost:
    
        r17 = r2;
        r8 = r19.zza(r38, r8, r23);
        r37.zzr += r8;
        r37.zzs += r8;
        r37.zzt -= r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b6, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r37.zzi.zzb(r38, r39, r37.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c2, code lost:
    
        if ("audio/ac4".equals(r5) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r37.zzs != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
    
        r2 = r37.zzf;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r2);
        r13 = 7;
        r9.zzc(r2, 7);
        r37.zzs += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d7, code lost:
    
        r13 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d8, code lost:
    
        r3 = r3 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dc, code lost:
    
        if (r10.zzf == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r39.zza != 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzj] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v31 */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        loop0: while (true) {
            ?? r6 = 1;
            while (true) {
                int i2 = this.zzl;
                long j2 = 0;
                if (i2 != 0) {
                    break;
                }
                if (this.zzo == 0) {
                    zzer zzerVar = this.zzg;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, r6)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzagh zzaghVarZzu = this.zzx.zzu(0, 4);
                        zzahv zzahvVar = this.zzB;
                        zzap zzapVar = zzahvVar == null ? null : new zzap(-9223372036854775807L, zzahvVar);
                        zzt zztVar = new zzt();
                        zztVar.zzk(zzapVar);
                        zzaghVarZzu.zzz(zztVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzafx(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzerVar.zzh(0);
                    this.zzn = zzerVar.zzz();
                    this.zzm = zzerVar.zzB();
                }
                long j3 = this.zzn;
                if (j3 == 1) {
                    zzer zzerVar2 = this.zzg;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzerVar2.zzJ();
                } else if (j3 == 0) {
                    long jZzo = zzaevVar.zzo();
                    if (jZzo == -1) {
                        zzfu zzfuVar = (zzfu) this.zzh.peek();
                        jZzo = zzfuVar != null ? zzfuVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzaevVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j4 = this.zzn;
                int i3 = this.zzo;
                long j5 = i3;
                if (j4 < j5) {
                    if (this.zzm != 1718773093 || i3 != 8) {
                        break loop0;
                    }
                    this.zzn = j5;
                    i3 = 8;
                }
                int i5 = this.zzm;
                if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1701082227 || i5 == 1835365473 || i5 == 1635284069) {
                    r6 = 1;
                    r6 = 1;
                    long jZzn = zzaevVar.zzn();
                    long j6 = this.zzn;
                    long j7 = jZzn + j6;
                    long j9 = this.zzo;
                    if (j6 != j9 && this.zzm == 1835365473) {
                        zzer zzerVar3 = this.zzf;
                        zzerVar3.zza(8);
                        zzaevVar.zzi(zzerVar3.zzi(), 0, 8);
                        zzakh.zzf(zzerVar3);
                        zzaevVar.zzf(zzerVar3.zzg());
                        zzaevVar.zzl();
                    }
                    long j10 = j7 - j9;
                    this.zzh.push(new zzfu(this.zzm, j10));
                    if (this.zzn == this.zzo) {
                        zzk(j10);
                    } else {
                        zzj();
                    }
                } else if (i5 == 1835296868 || i5 == 1836476516 || i5 == 1751411826 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1937011571 || i5 == 1668576371 || i5 == 1701606260 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1953196132 || i5 == 1718909296 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                    zzgrc.zzi(i3 == 8);
                    zzgrc.zzi(this.zzn <= 2147483647L);
                    zzer zzerVar4 = new zzer((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzerVar4.zzi(), 0, 8);
                    this.zzp = zzerVar4;
                    r6 = 1;
                    this.zzl = 1;
                } else {
                    long jZzn2 = zzaevVar.zzn();
                    long j11 = this.zzo;
                    long j12 = jZzn2 - j11;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzahv(0L, j12, -9223372036854775807L, j12 + j11, this.zzn - j11);
                    }
                    this.zzp = null;
                    r6 = 1;
                    this.zzl = 1;
                }
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j2 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int iZza = zzalfVar.zza(j3);
            if (iZza == -1) {
                iZza = zzalfVar.zzb(j3);
            }
            zzakvVar.zze = iZza;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    static /* synthetic */ long zzh(zzalf zzalfVar, long j2, long j3) {
        int iZzl = zzl(zzalfVar, j2);
        if (iZzl == -1) {
            return j3;
        }
        return Math.min(zzalfVar.zzc[iZzl], j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzalf zzalfVar, long j2) {
        int iZza = zzalfVar.zza(j2);
        if (iZza == -1) {
            return zzalfVar.zzb(j2);
        }
        return iZza;
    }
}
