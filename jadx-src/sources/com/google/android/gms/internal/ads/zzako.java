package com.google.android.gms.internal.ads;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.container.Mp4Box;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;

    @Nullable
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01eb, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fe, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0201, code lost:
    
        if (r30.zzH == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
    
        r7 = r30.zzi;
        r7.zza(r4);
        r31.zzc(r7.zzi(), 0, r30.zzF);
        r6.zzc(r7, r30.zzF);
        r4 = r30.zzF;
        r32 = r5;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0232, code lost:
    
        if (r5 != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0234, code lost:
    
        r5 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023a, code lost:
    
        if (r5.zzb() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023c, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0240, code lost:
    
        r9 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0246, code lost:
    
        if (r9.zzb() == r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0248, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024b, code lost:
    
        r5 = r30.zzp;
        r5.zzc(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0258, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025c, code lost:
    
        r32 = r5;
        r4 = r6.zza(r31, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0263, code lost:
    
        r30.zzE += r4;
        r30.zzF -= r4;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0270, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0276, code lost:
    
        if (r30.zzG != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0278, code lost:
    
        r1 = r1 | androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027b, code lost:
    
        r22 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0281, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0283, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0288, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028a, code lost:
    
        r6.zze(r10, r22, r30.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0297, code lost:
    
        r1 = r30.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029d, code lost:
    
        if (r1.isEmpty() != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029f, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r30.zzy;
        r8 = r1.zzc;
        r30.zzy = r3 - r8;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b0, code lost:
    
        if (r1.zzb == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b2, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b4, code lost:
    
        r5 = r3;
        r1 = r30.zzJ;
        r3 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b9, code lost:
    
        if (r11 >= r3) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bb, code lost:
    
        r1[r11].zze(r5, 1, r8, r30.zzy, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        if (r2.zzh() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cd, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d0, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02d1, code lost:
    
        r30.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d5, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x057c, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r30.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r30.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        r31.zzf(r30.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        r30.zzD -= 8;
        r31.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        r30.zzE = r2.zzi(r30.zzD, 7);
        r3 = r30.zzD;
        r8 = r30.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r30.zzE + 7;
        r30.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r30.zzD, 0);
        r30.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r30.zzD += r3;
        r30.zzs = 4;
        r30.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (r8 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r3 = r30.zzE;
        r5 = r30.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
    
        if (r3 >= r5) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        r30.zzE += r6.zza(r31, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0166, code lost:
    
        r13 = r30.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[r17] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0179, code lost:
    
        if (r30.zzE >= r30.zzD) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        r4 = r30.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (r4 != 0) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        if (r30.zzK.length > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        if (r30.zzG != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0189, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        if ((r8 + r4) <= (r30.zzD - r30.zzE)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        r31.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        if (r9 < 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
    
        r30.zzF = r9 - r4;
        r9 = r30.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r30.zzE += r5;
        r30.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        if (r30.zzK.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r4 <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r3.zzg, r14[r5]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
    
        r30.zzH = r7;
        r6.zzc(r13, r4);
        r30.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        if (r4 <= 0) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
    
        if (r30.zzG != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e9, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r4, r3.zzg) == false) goto L453;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        char c2;
        String strZzM;
        String strZzM2;
        long jZzt;
        long jZzz;
        long j2;
        long j3;
        while (true) {
            int i2 = this.zzs;
            char c4 = 2;
            if (i2 == 0) {
                if (this.zzv == 0) {
                    zzer zzerVar = this.zzm;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzafvVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzerVar.zzh(0);
                    this.zzu = zzerVar.zzz();
                    this.zzt = zzerVar.zzB();
                }
                long j4 = this.zzu;
                if (j4 == 1) {
                    zzer zzerVar2 = this.zzm;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzerVar2.zzJ();
                } else if (j4 == 0) {
                    long jZzo = zzaevVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        jZzo = !arrayDeque.isEmpty() ? ((zzfu) arrayDeque.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzaevVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j5 = this.zzu;
                int i3 = this.zzv;
                long j6 = i3;
                if (j5 < j6) {
                    if (this.zzt != 1718773093 || i3 != 8) {
                        break;
                    }
                    this.zzu = j6;
                    j5 = j6;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzer zzerVar3 = this.zzk;
                        zzerVar3.zza((int) j5);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar3.zzi(), 0, 8);
                        zzaevVar.zzc(zzerVar3.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzaei) zzm(new zzfv(Mp4Box.TYPE_sidx, zzerVar3).zza, zzaevVar.zzm()).second);
                    } else {
                        zzaevVar.zze((int) (j5 - j6), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzaevVar.zzn() - j6;
                    int i5 = this.zzt;
                    if ((i5 == 1836019558 || i5 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzafx(this.zzA, jZzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            zzale zzaleVar = ((zzakn) sparseArray.valueAt(i7)).zzb;
                            zzaleVar.zzc = jZzn;
                            zzaleVar.zzb = jZzn;
                        }
                    }
                    int i8 = this.zzt;
                    if (i8 == 1835295092) {
                        this.zzC = null;
                        this.zzx = jZzn + this.zzu;
                        this.zzs = 2;
                    } else if (i8 == 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1836019558 || i8 == 1953653094 || i8 == 1836475768 || i8 == 1701082227 || i8 == 1835365473) {
                        long jZzn2 = zzaevVar.zzn();
                        long j7 = this.zzu;
                        long j9 = jZzn2 + j7;
                        if (j7 != this.zzv && i8 == 1835365473) {
                            zzer zzerVar4 = this.zzk;
                            zzerVar4.zza(8);
                            zzaevVar.zzi(zzerVar4.zzi(), 0, 8);
                            zzakh.zzf(zzerVar4);
                            zzaevVar.zzf(zzerVar4.zzg());
                            zzaevVar.zzl();
                        }
                        long j10 = j9 - 8;
                        this.zzn.push(new zzfu(this.zzt, j10));
                        if (this.zzu == this.zzv) {
                            zzj(j10);
                        } else {
                            zzi();
                        }
                    } else if (i8 == 1751411826 || i8 == 1835296868 || i8 == 1836476516 || i8 == 1936286840 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1668576371 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1937011571 || i8 == 1952867444 || i8 == 1952868452 || i8 == 1953196132 || i8 == 1953654136 || i8 == 1953658222 || i8 == 1886614376 || i8 == 1935763834 || i8 == 1935763823 || i8 == 1936027235 || i8 == 1970628964 || i8 == 1935828848 || i8 == 1936158820 || i8 == 1701606260 || i8 == 1835362404 || i8 == 1701671783 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzer zzerVar5 = new zzer((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar5.zzi(), 0, 8);
                        this.zzw = zzerVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i2 != 1) {
                long j11 = Long.MAX_VALUE;
                if (i2 != 2) {
                    zzakn zzaknVar = this.zzC;
                    if (zzaknVar != null) {
                        c2 = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j12 = Long.MAX_VALUE;
                    int i9 = 0;
                    zzakn zzaknVar2 = null;
                    while (i9 < size2) {
                        char c5 = c4;
                        zzakn zzaknVar3 = (zzakn) sparseArray2.valueAt(i9);
                        if ((zzaknVar3.zzk() || zzaknVar3.zzf != zzaknVar3.zzd.zzb) && (!zzaknVar3.zzk() || zzaknVar3.zzh != zzaknVar3.zzb.zzd)) {
                            long jZze = zzaknVar3.zze();
                            if (jZze < j12) {
                                zzaknVar2 = zzaknVar3;
                                j12 = jZze;
                            }
                        }
                        i9++;
                        c4 = c5;
                    }
                    c2 = c4;
                    if (zzaknVar2 == null) {
                        int iZzn = (int) (this.zzx - zzaevVar.zzn());
                        if (iZzn < 0) {
                            throw zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzaevVar.zzf(iZzn);
                        zzi();
                    } else {
                        int iZze = (int) (zzaknVar2.zze() - zzaevVar.zzn());
                        if (iZze < 0) {
                            zzee.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzaevVar.zzf(iZze);
                        this.zzC = zzaknVar2;
                        zzaknVar = zzaknVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzakn zzaknVar4 = null;
                    for (int i10 = 0; i10 < size3; i10++) {
                        zzale zzaleVar2 = ((zzakn) sparseArray3.valueAt(i10)).zzb;
                        if (zzaleVar2.zzo) {
                            long j13 = zzaleVar2.zzc;
                            if (j13 < j11) {
                                zzaknVar4 = (zzakn) sparseArray3.valueAt(i10);
                                j11 = j13;
                            }
                        }
                    }
                    if (zzaknVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn2 = (int) (j11 - zzaevVar.zzn());
                        if (iZzn2 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzaevVar.zzf(iZzn2);
                        zzale zzaleVar3 = zzaknVar4.zzb;
                        zzer zzerVar6 = zzaleVar3.zzn;
                        zzaevVar.zzc(zzerVar6.zzi(), 0, zzerVar6.zze());
                        zzerVar6.zzh(0);
                        zzaleVar3.zzo = false;
                    }
                }
            } else {
                long j14 = this.zzu - ((long) this.zzv);
                zzer zzerVar7 = this.zzw;
                int i11 = (int) j14;
                if (zzerVar7 != null) {
                    zzaevVar.zzc(zzerVar7.zzi(), 8, i11);
                    zzfv zzfvVar = new zzfv(this.zzt, zzerVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i12 = zzfvVar.zzd;
                        if (i12 == 1936286840) {
                            Pair pairZzm = zzm(zzfvVar.zza, zzaevVar.zzn());
                            this.zzq.zza((zzaei) pairZzm.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) pairZzm.first).longValue();
                                this.zzI.zzw((zzafy) pairZzm.second);
                                this.zzL = true;
                            }
                        } else if (i12 == 1701671783) {
                            zzer zzerVar8 = zzfvVar.zza;
                            if (this.zzJ.length != 0) {
                                zzerVar8.zzh(8);
                                int iZza = zzakh.zza(zzerVar8.zzB());
                                if (iZza == 0) {
                                    strZzM = zzerVar8.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzerVar8.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz2 = zzerVar8.zzz();
                                    long jZzz3 = zzerVar8.zzz();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long jZzt2 = zzfj.zzt(jZzz3, 1000000L, jZzz2, roundingMode);
                                    long j15 = this.zzB;
                                    long j16 = j15 != -9223372036854775807L ? j15 + jZzt2 : -9223372036854775807L;
                                    jZzt = zzfj.zzt(zzerVar8.zzz(), 1000L, jZzz2, roundingMode);
                                    jZzz = zzerVar8.zzz();
                                    j2 = jZzt2;
                                    j3 = j16;
                                } else if (iZza != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(iZza);
                                    zzee.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long jZzz4 = zzerVar8.zzz();
                                    long jZzJ = zzerVar8.zzJ();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long jZzt3 = zzfj.zzt(jZzJ, 1000000L, jZzz4, roundingMode2);
                                    long jZzt4 = zzfj.zzt(zzerVar8.zzz(), 1000L, jZzz4, roundingMode2);
                                    long jZzz5 = zzerVar8.zzz();
                                    strZzM = zzerVar8.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzerVar8.zzM((char) 0);
                                    strZzM2.getClass();
                                    jZzt = jZzt4;
                                    jZzz = jZzz5;
                                    j2 = -9223372036854775807L;
                                    j3 = jZzt3;
                                }
                                String str = strZzM;
                                String str2 = strZzM2;
                                byte[] bArr = new byte[zzerVar8.zzd()];
                                zzerVar8.zzm(bArr, 0, zzerVar8.zzd());
                                zzer zzerVar9 = new zzer(this.zzl.zza(new zzahy(str, str2, jZzt, jZzz, bArr)));
                                int iZzd = zzerVar9.zzd();
                                for (zzagh zzaghVar : this.zzJ) {
                                    zzerVar9.zzh(0);
                                    zzaghVar.zzc(zzerVar9, iZzd);
                                }
                                if (j3 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakm(j2, true, iZzd));
                                    this.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzagh zzaghVar2 : this.zzJ) {
                                            zzaghVar2.zze(j3, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzakm(j3, false, iZzd));
                                        this.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfu) arrayDeque2.peek()).zza(zzfvVar);
                    }
                } else {
                    zzaevVar.zzf(i11);
                }
                zzj(zzaevVar.zzn());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    static {
        int i2 = zzakk.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x07c0, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x07c3, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j2) throws zzat {
        zzap zzapVar;
        int i2;
        int i3;
        List list;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzakn zzaknVar;
        int i12;
        byte[] bArr;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        int iZzB;
        int i22;
        int iZzB2;
        int iZzB3;
        int i23;
        int iZzB4;
        boolean z4;
        long[] jArr;
        int i24 = 8;
        int i25 = 1;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j2) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque.pop();
            int i26 = zzfuVar.zzd;
            int i27 = 12;
            if (i26 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfuVar.zzb);
                zzfu zzfuVarZzd = zzfuVar.zzd(Mp4Box.TYPE_mvex);
                zzfuVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzfuVarZzd.zzb;
                int size = list2.size();
                int i28 = 0;
                long jZzz = -9223372036854775807L;
                while (i28 < size) {
                    zzfv zzfvVar = (zzfv) list2.get(i28);
                    int i29 = zzfvVar.zzd;
                    if (i29 == 1953654136) {
                        zzer zzerVar = zzfvVar.zza;
                        zzerVar.zzh(i27);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzerVar.zzB()), new zzaki(zzerVar.zzB() - 1, zzerVar.zzB(), zzerVar.zzB(), zzerVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzaki) pairCreate.second);
                    } else if (i29 == 1835362404) {
                        zzer zzerVar2 = zzfvVar.zza;
                        zzerVar2.zzh(i24);
                        jZzz = zzakh.zza(zzerVar2.zzB()) == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                    }
                    i28 += i25;
                    i27 = 12;
                }
                zzfu zzfuVarZzd2 = zzfuVar.zzd(Mp4Box.TYPE_meta);
                zzap zzapVarZze = zzfuVarZzd2 != null ? zzakh.zze(zzfuVarZzd2) : null;
                zzafn zzafnVar = new zzafn();
                zzfv zzfvVarZzc = zzfuVar.zzc(Mp4Box.TYPE_udta);
                if (zzfvVarZzc != null) {
                    zzap zzapVarZzc = zzakh.zzc(zzfvVarZzc);
                    zzafnVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar.zzc(Mp4Box.TYPE_mvhd);
                zzfvVarZzc2.getClass();
                zzao[] zzaoVarArr = new zzao[i25];
                zzaoVarArr[0] = zzakh.zzd(zzfvVarZzc2.zza);
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzaoVarArr);
                List listZzb = zzakh.zzb(zzfuVar, zzafnVar, jZzz, zzqVarZzn, (this.zzd & 16) != 0 ? i25 : 0, false, new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzakj
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzalc) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzakr.zza(listZzb);
                    int i30 = 0;
                    while (i30 < size2) {
                        zzalf zzalfVar = (zzalf) listZzb.get(i30);
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzI;
                        int i31 = i25;
                        int i32 = zzalcVar.zzb;
                        zzagh zzaghVarZzu = zzaexVar.zzu(i30, i32);
                        zzap zzapVar3 = zzapVar;
                        long j3 = zzalcVar.zze;
                        zzaghVarZzu.zzN(j3);
                        int i33 = i30;
                        zzv zzvVar = zzalcVar.zzg;
                        List list3 = listZzb;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzl(strZza);
                        zzakq.zzb(i32, zzafnVar, zztVarZza);
                        zzakq.zza(i32, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVar3, zzapVar2);
                        int i34 = zzalcVar.zza;
                        sparseArray2.put(i34, new zzakn(zzaghVarZzu, zzalfVar, zzo(sparseArray, i34), zztVarZza.zzM()));
                        this.zzA = Math.max(this.zzA, j3);
                        i30 = i33 + 1;
                        zzapVar = zzapVar3;
                        i25 = i31;
                        strZza = strZza;
                        listZzb = list3;
                        zzafnVar = zzafnVar;
                    }
                    this.zzI.zzv();
                } else {
                    int i35 = i25;
                    zzgrc.zzi(sparseArray2.size() == size2 ? i35 : 0);
                    for (int i36 = 0; i36 < size2; i36++) {
                        zzalf zzalfVar2 = (zzalf) listZzb.get(i36);
                        int i37 = zzalfVar2.zza.zza;
                        ((zzakn) sparseArray2.get(i37)).zza(zzalfVar2, zzo(sparseArray, i37));
                    }
                    i25 = i35;
                }
                i24 = 8;
            } else {
                int i38 = i25;
                int i39 = 16;
                int i40 = 4;
                int i41 = 2;
                int i42 = 0;
                if (i26 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i43 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list4 = zzfuVar.zzc;
                    int size3 = list4.size();
                    int i44 = 0;
                    while (i44 < size3) {
                        zzfu zzfuVar2 = (zzfu) list4.get(i44);
                        if (zzfuVar2.zzd == 1953653094) {
                            zzfv zzfvVarZzc3 = zzfuVar2.zzc(Mp4Box.TYPE_tfhd);
                            zzfvVarZzc3.getClass();
                            zzer zzerVar3 = zzfvVarZzc3.zza;
                            zzerVar3.zzh(8);
                            int iZzB5 = zzerVar3.zzB();
                            int i45 = zzakh.zza;
                            zzakn zzaknVar2 = (zzakn) sparseArray3.get(zzerVar3.zzB());
                            if (zzaknVar2 == null) {
                                zzaknVar = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzerVar3.zzJ();
                                    zzale zzaleVar = zzaknVar2.zzb;
                                    zzaleVar.zzb = jZzJ;
                                    zzaleVar.zzc = jZzJ;
                                }
                                zzaki zzakiVar = zzaknVar2.zze;
                                zzaknVar2.zzb.zza = new zzaki((iZzB5 & 2) != 0 ? zzerVar3.zzB() - 1 : zzakiVar.zza, (iZzB5 & 8) != 0 ? zzerVar3.zzB() : zzakiVar.zzb, (iZzB5 & 16) != 0 ? zzerVar3.zzB() : zzakiVar.zzc, (iZzB5 & 32) != 0 ? zzerVar3.zzB() : zzakiVar.zzd);
                                zzaknVar = zzaknVar2;
                            }
                            if (zzaknVar == null) {
                                i3 = i43;
                                list = list4;
                                i5 = size3;
                                i7 = i44;
                                i8 = i39;
                                i9 = i40;
                                i10 = i41;
                                i11 = i42;
                            } else {
                                zzale zzaleVar2 = zzaknVar.zzb;
                                long j4 = zzaleVar2.zzp;
                                boolean z5 = zzaleVar2.zzq;
                                zzaknVar.zzc();
                                boolean z6 = i38;
                                zzaknVar.zzl(z6);
                                zzfv zzfvVarZzc4 = zzfuVar2.zzc(Mp4Box.TYPE_tfdt);
                                if (zzfvVarZzc4 == null || (i43 & 2) != 0) {
                                    zzaleVar2.zzp = j4;
                                    zzaleVar2.zzq = z5;
                                } else {
                                    zzer zzerVar4 = zzfvVarZzc4.zza;
                                    zzerVar4.zzh(8);
                                    zzaleVar2.zzp = zzakh.zza(zzerVar4.zzB()) == z6 ? zzerVar4.zzJ() : zzerVar4.zzz();
                                    zzaleVar2.zzq = z6;
                                }
                                List list5 = zzfuVar2.zzb;
                                int size4 = list5.size();
                                i3 = i43;
                                int i46 = i42;
                                int i47 = i46;
                                int i48 = i47;
                                while (true) {
                                    i12 = Mp4Box.TYPE_trun;
                                    if (i46 >= size4) {
                                        break;
                                    }
                                    List list6 = list4;
                                    zzfv zzfvVar2 = (zzfv) list5.get(i46);
                                    int i49 = size3;
                                    if (zzfvVar2.zzd == 1953658222) {
                                        zzer zzerVar5 = zzfvVar2.zza;
                                        zzerVar5.zzh(12);
                                        int iZzH = zzerVar5.zzH();
                                        if (iZzH > 0) {
                                            i48 += iZzH;
                                            i47++;
                                        }
                                    }
                                    i46++;
                                    size3 = i49;
                                    list4 = list6;
                                }
                                list = list4;
                                i5 = size3;
                                int i50 = i42;
                                zzaknVar.zzh = i50;
                                zzaknVar.zzg = i50;
                                zzaknVar.zzf = i50;
                                zzaleVar2.zzd = i47;
                                zzaleVar2.zze = i48;
                                if (zzaleVar2.zzg.length < i47) {
                                    zzaleVar2.zzf = new long[i47];
                                    zzaleVar2.zzg = new int[i47];
                                }
                                if (zzaleVar2.zzh.length < i48) {
                                    int i51 = (i48 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    zzaleVar2.zzh = new int[i51];
                                    zzaleVar2.zzi = new long[i51];
                                    zzaleVar2.zzj = new boolean[i51];
                                    zzaleVar2.zzl = new boolean[i51];
                                }
                                int i52 = 0;
                                int i53 = 0;
                                int i54 = 0;
                                while (i52 < size4) {
                                    long j5 = 0;
                                    zzfv zzfvVar3 = (zzfv) list5.get(i52);
                                    if (zzfvVar3.zzd == i12) {
                                        int i55 = i53 + 1;
                                        zzer zzerVar6 = zzfvVar3.zza;
                                        zzerVar6.zzh(8);
                                        int iZzB6 = zzerVar6.zzB();
                                        i14 = i52;
                                        zzalc zzalcVar2 = zzaknVar.zzd.zza;
                                        int i56 = i53;
                                        zzaki zzakiVar2 = zzaleVar2.zza;
                                        String str = zzfj.zza;
                                        i15 = i44;
                                        zzaleVar2.zzg[i56] = zzerVar6.zzH();
                                        long[] jArr2 = zzaleVar2.zzf;
                                        i16 = size4;
                                        int i57 = i54;
                                        long j6 = zzaleVar2.zzb;
                                        jArr2[i56] = j6;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr2[i56] = j6 + ((long) zzerVar6.zzB());
                                        }
                                        boolean z7 = (iZzB6 & 4) != 0;
                                        int i58 = zzakiVar2.zzd;
                                        int iZzB7 = z7 ? zzerVar6.zzB() : i58;
                                        boolean z9 = z7;
                                        int i59 = iZzB6 & 256;
                                        int i60 = iZzB6 & 512;
                                        int i61 = iZzB6 & 1024;
                                        int i62 = iZzB6 & 2048;
                                        long[] jArr3 = zzalcVar2.zzi;
                                        if (jArr3 != null) {
                                            i17 = i61;
                                            if (jArr3.length == 1 && (jArr = zzalcVar2.zzj) != null) {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    i18 = i58;
                                                    i19 = iZzB7;
                                                } else {
                                                    i18 = i58;
                                                    i19 = iZzB7;
                                                    long j9 = zzalcVar2.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (zzfj.zzt(j7, 1000000L, j9, roundingMode) + zzfj.zzt(jArr[0], 1000000L, zzalcVar2.zzc, roundingMode) >= zzalcVar2.zze) {
                                                    }
                                                }
                                                j5 = jArr[0];
                                            }
                                            int[] iArr = zzaleVar2.zzh;
                                            long[] jArr4 = zzaleVar2.zzi;
                                            boolean[] zArr = zzaleVar2.zzj;
                                            int i63 = i18;
                                            boolean z10 = (zzalcVar2.zzb == i41 || (i3 & 1) == 0) ? false : true;
                                            i20 = i57 + zzaleVar2.zzg[i56];
                                            long j10 = zzalcVar2.zzc;
                                            long j11 = zzaleVar2.zzp;
                                            i21 = i57;
                                            while (i21 < i20) {
                                                if (i59 != 0) {
                                                    z3 = z10;
                                                    iZzB = zzerVar6.zzB();
                                                } else {
                                                    z3 = z10;
                                                    iZzB = zzakiVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i60 != 0) {
                                                    i22 = i21;
                                                    iZzB2 = zzerVar6.zzB();
                                                } else {
                                                    i22 = i21;
                                                    iZzB2 = zzakiVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i17 != 0) {
                                                    iZzB3 = zzerVar6.zzB();
                                                } else if (i22 != 0) {
                                                    iZzB3 = i63;
                                                } else if (z9) {
                                                    iZzB3 = i19;
                                                    i22 = 0;
                                                } else {
                                                    i22 = 0;
                                                    iZzB3 = i63;
                                                }
                                                if (i62 != 0) {
                                                    i23 = iZzB2;
                                                    iZzB4 = zzerVar6.zzB();
                                                } else {
                                                    i23 = iZzB2;
                                                    iZzB4 = 0;
                                                }
                                                zzaki zzakiVar3 = zzakiVar2;
                                                long jZzt = zzfj.zzt((((long) iZzB4) + j11) - j5, 1000000L, j10, RoundingMode.DOWN);
                                                jArr4[i22] = jZzt;
                                                if (!zzaleVar2.zzq) {
                                                    jArr4[i22] = jZzt + zzaknVar.zzd.zzi;
                                                }
                                                iArr[i22] = i23;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z4 = false;
                                                } else if (!z3) {
                                                    z4 = true;
                                                } else if (i22 == 0) {
                                                    z4 = true;
                                                    i22 = 0;
                                                }
                                                zArr[i22] = z4;
                                                j11 += (long) iZzB;
                                                i21 = i22 + 1;
                                                z10 = z3;
                                                zzakiVar2 = zzakiVar3;
                                            }
                                            zzaleVar2.zzp = j11;
                                            i54 = i20;
                                            i53 = i55;
                                        } else {
                                            i17 = i61;
                                        }
                                        i18 = i58;
                                        i19 = iZzB7;
                                        int[] iArr2 = zzaleVar2.zzh;
                                        long[] jArr42 = zzaleVar2.zzi;
                                        boolean[] zArr2 = zzaleVar2.zzj;
                                        int i632 = i18;
                                        if (zzalcVar2.zzb == i41) {
                                            i20 = i57 + zzaleVar2.zzg[i56];
                                            long j102 = zzalcVar2.zzc;
                                            long j112 = zzaleVar2.zzp;
                                            i21 = i57;
                                            while (i21 < i20) {
                                            }
                                            zzaleVar2.zzp = j112;
                                            i54 = i20;
                                            i53 = i55;
                                        }
                                    } else {
                                        i14 = i52;
                                        i15 = i44;
                                        i16 = size4;
                                    }
                                    i52 = i14 + 1;
                                    i44 = i15;
                                    size4 = i16;
                                    i12 = Mp4Box.TYPE_trun;
                                    i41 = 2;
                                }
                                i7 = i44;
                                zzalc zzalcVar3 = zzaknVar.zzd.zza;
                                zzaki zzakiVar4 = zzaleVar2.zza;
                                zzakiVar4.getClass();
                                zzald zzaldVarZza = zzalcVar3.zza(zzakiVar4.zza);
                                zzfv zzfvVarZzc5 = zzfuVar2.zzc(Mp4Box.TYPE_saiz);
                                if (zzfvVarZzc5 != null) {
                                    zzaldVarZza.getClass();
                                    int i64 = zzaldVarZza.zzd;
                                    zzer zzerVar7 = zzfvVarZzc5.zza;
                                    zzerVar7.zzh(8);
                                    if ((zzerVar7.zzB() & 1) == 1) {
                                        zzerVar7.zzk(8);
                                    }
                                    int iZzs = zzerVar7.zzs();
                                    int iZzH2 = zzerVar7.zzH();
                                    int i65 = zzaleVar2.zze;
                                    if (iZzH2 > i65) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i65).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(iZzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i65);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr3 = zzaleVar2.zzl;
                                        i13 = 0;
                                        for (int i66 = 0; i66 < iZzH2; i66++) {
                                            int iZzs2 = zzerVar7.zzs();
                                            i13 += iZzs2;
                                            zArr3[i66] = iZzs2 > i64;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z11 = iZzs > i64;
                                        i13 = iZzs * iZzH2;
                                        z2 = false;
                                        Arrays.fill(zzaleVar2.zzl, 0, iZzH2, z11);
                                    }
                                    Arrays.fill(zzaleVar2.zzl, iZzH2, zzaleVar2.zze, z2);
                                    if (i13 > 0) {
                                        zzaleVar2.zza(i13);
                                    }
                                }
                                zzfv zzfvVarZzc6 = zzfuVar2.zzc(Mp4Box.TYPE_saio);
                                if (zzfvVarZzc6 != null) {
                                    zzer zzerVar8 = zzfvVarZzc6.zza;
                                    zzerVar8.zzh(8);
                                    int iZzB8 = zzerVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzerVar8.zzk(8);
                                    }
                                    int iZzH3 = zzerVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(iZzH3);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    zzaleVar2.zzc += zzakh.zza(iZzB8) == 0 ? zzerVar8.zzz() : zzerVar8.zzJ();
                                }
                                zzfv zzfvVarZzc7 = zzfuVar2.zzc(Mp4Box.TYPE_senc);
                                if (zzfvVarZzc7 != null) {
                                    zzl(zzfvVarZzc7.zza, 0, zzaleVar2);
                                }
                                String str2 = zzaldVarZza != null ? zzaldVarZza.zzb : null;
                                zzer zzerVar9 = null;
                                zzer zzerVar10 = null;
                                for (int i67 = 0; i67 < list5.size(); i67++) {
                                    zzfv zzfvVar4 = (zzfv) list5.get(i67);
                                    zzer zzerVar11 = zzfvVar4.zza;
                                    int i68 = zzfvVar4.zzd;
                                    if (i68 == 1935828848) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar9 = zzerVar11;
                                        }
                                    } else if (i68 == 1936158820) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar10 = zzerVar11;
                                        }
                                    }
                                }
                                if (zzerVar9 == null || zzerVar10 == null) {
                                    i9 = i40;
                                    i10 = 2;
                                } else {
                                    zzerVar9.zzh(8);
                                    int iZza = zzakh.zza(zzerVar9.zzB());
                                    i9 = i40;
                                    zzerVar9.zzk(i9);
                                    if (iZza == 1) {
                                        zzerVar9.zzk(i9);
                                    }
                                    if (zzerVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzerVar10.zzh(8);
                                    int iZza2 = zzakh.zza(zzerVar10.zzB());
                                    zzerVar10.zzk(i9);
                                    if (iZza2 != 1) {
                                        i10 = 2;
                                        if (iZza2 >= 2) {
                                            zzerVar10.zzk(i9);
                                        }
                                    } else {
                                        if (zzerVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                        i10 = 2;
                                    }
                                    if (zzerVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzerVar10.zzk(1);
                                    int iZzs3 = zzerVar10.zzs();
                                    int i69 = (iZzs3 & 240) >> 4;
                                    int i70 = iZzs3 & 15;
                                    if (zzerVar10.zzs() == 1) {
                                        int iZzs4 = zzerVar10.zzs();
                                        int i71 = i39;
                                        byte[] bArr3 = new byte[i71];
                                        zzerVar10.zzm(bArr3, 0, i71);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzerVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzerVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzaleVar2.zzk = true;
                                        zzaleVar2.zzm = new zzald(true, str2, iZzs4, bArr3, i69, i70, bArr);
                                    }
                                }
                                int size5 = list5.size();
                                for (int i72 = 0; i72 < size5; i72++) {
                                    zzfv zzfvVar5 = (zzfv) list5.get(i72);
                                    if (zzfvVar5.zzd == 1970628964) {
                                        zzer zzerVar12 = zzfvVar5.zza;
                                        zzerVar12.zzh(8);
                                        zzerVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzerVar12, 16, zzaleVar2);
                                        }
                                    }
                                }
                                i11 = 0;
                                i8 = 16;
                                i38 = 1;
                            }
                        }
                        i41 = i10;
                        i40 = i9;
                        i42 = i11;
                        i39 = i8;
                        size3 = i5;
                        list4 = list;
                        i44 = i7 + 1;
                        i43 = i3;
                    }
                    int i73 = i42;
                    i2 = 8;
                    zzq zzqVarZzn2 = zzn(zzfuVar.zzb);
                    if (zzqVarZzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i74 = i73; i74 < size6; i74++) {
                            ((zzakn) sparseArray3.valueAt(i74)).zzb(zzqVarZzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i75 = i73; i75 < size7; i75++) {
                            zzakn zzaknVar3 = (zzakn) sparseArray3.valueAt(i75);
                            long j12 = this.zzz;
                            int i76 = zzaknVar3.zzf;
                            while (true) {
                                zzale zzaleVar3 = zzaknVar3.zzb;
                                if (i76 >= zzaleVar3.zze || zzaleVar3.zzi[i76] > j12) {
                                    break;
                                }
                                if (zzaleVar3.zzj[i76]) {
                                    zzaknVar3.zzi = i76;
                                }
                                i76++;
                            }
                        }
                        i38 = 1;
                        this.zzz = -9223372036854775807L;
                    } else {
                        i38 = 1;
                    }
                } else {
                    i2 = 8;
                    if (!arrayDeque.isEmpty()) {
                        ((zzfu) arrayDeque.peek()).zzb(zzfuVar);
                    }
                }
                i24 = i2;
                i25 = i38;
            }
        }
    }

    private static int zzk(int i2) throws zzat {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i2, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i2 + 8);
        int iZzB = zzerVar.zzB();
        int i3 = zzakh.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iZzB & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i5 = zzaleVar.zze;
        if (iZzH != i5) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i5).length());
            sb.append("Senc sample count ");
            sb.append(iZzH);
            sb.append(" is different from fragment sample count");
            sb.append(i5);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, iZzH, z2);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j2) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzh(8);
        int iZza = zzakh.zza(zzerVar2.zzB());
        zzerVar2.zzk(4);
        long jZzz = zzerVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar2.zzz();
            jZzJ2 = zzerVar2.zzz();
        } else {
            jZzJ = zzerVar2.zzJ();
            jZzJ2 = zzerVar2.zzJ();
        }
        long j3 = j2 + jZzJ2;
        long jZzt = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar2.zzk(2);
        int iZzt = zzerVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j4 = j3;
        long j5 = jZzt;
        int i2 = 0;
        while (i2 < iZzt) {
            int iZzB = zzerVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar2.zzz();
            iArr[i2] = iZzB & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = j5;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i2] = jZzt2 - jArr5[i2];
            zzerVar2.zzk(4);
            j4 += (long) iArr[i2];
            i2++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j5 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i2;
        int i3 = this.zzd;
        if ((i3 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i5 = 100;
        int i7 = 0;
        if ((i3 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i2 = 1;
            i5 = 101;
        } else {
            i2 = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i2);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i7 < this.zzK.length) {
            zzagh zzaghVarZzu = this.zzI.zzu(i5, 3);
            zzaghVarZzu.zzz((zzv) list.get(i7));
            this.zzK[i7] = zzaghVarZzu;
            i7++;
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzakn) sparseArray.valueAt(i2)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j3;
        this.zzn.clear();
        zzi();
    }

    final /* synthetic */ void zzh(long j2, zzer zzerVar) {
        zzaeh.zza(j2, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i2, @Nullable zzfg zzfgVar, @Nullable zzalc zzalcVar, List list, @Nullable zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i2;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j2, zzer zzerVar) {
                this.zza.zzh(j2, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzq zzn(List list) {
        int i2;
        UUID[] uuidArr;
        zzaky zzakyVar;
        UUID uuid;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            zzfv zzfvVar = (zzfv) list.get(i3);
            if (zzfvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzfvVar.zza.zzi();
                zzer zzerVar = new zzer(bArrZzi);
                if (zzerVar.zze() < 32) {
                    i2 = i3;
                    zzakyVar = null;
                    if (zzakyVar != null) {
                        uuid = null;
                    } else {
                        uuid = zzakyVar.zza;
                    }
                    if (uuid != null) {
                        zzee.zzc("FragmentedMp4Extractor", pTYaLzzmJSGAPQ.AbZauc);
                    } else {
                        arrayList.add(new zzp(uuid, null, "video/mp4", bArrZzi));
                    }
                } else {
                    zzerVar.zzh(0);
                    int iZzd = zzerVar.zzd();
                    int iZzB = zzerVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(iZzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(iZzd);
                        zzee.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int iZzB2 = zzerVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(iZzB2);
                            zzee.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int iZza = zzakh.zza(zzerVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(iZza);
                                zzee.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid2 = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzerVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i5 = 0;
                                    while (i5 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i7 = i5;
                                        uuidArr2[i7] = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                        i5 = i7 + 1;
                                        i3 = i3;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i2 = i3;
                                int iZzH2 = zzerVar.zzH();
                                int iZzd2 = zzerVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(iZzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(iZzd2);
                                    zzee.zzc("PsshAtomUtil", sb4.toString());
                                    zzakyVar = null;
                                    if (zzakyVar != null) {
                                    }
                                    if (uuid != null) {
                                    }
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzerVar.zzm(bArr, 0, iZzH2);
                                    zzakyVar = new zzaky(uuid2, iZza, bArr, uuidArr);
                                    if (zzakyVar != null) {
                                    }
                                    if (uuid != null) {
                                    }
                                }
                            }
                        }
                    }
                    i2 = i3;
                    zzakyVar = null;
                    if (zzakyVar != null) {
                    }
                    if (uuid != null) {
                    }
                }
                i3 = i2 + 1;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzaki zzo(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i2);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzguf zzgufVarZzi;
        zzagc zzagcVarZza = zzalb.zza(zzaevVar);
        if (zzagcVarZza != null) {
            zzgufVarZzi = zzguf.zzj(zzagcVarZza);
        } else {
            zzgufVarZzi = zzguf.zzi();
        }
        this.zzr = zzgufVarZzi;
        if (zzagcVarZza == null) {
            return true;
        }
        return false;
    }
}
