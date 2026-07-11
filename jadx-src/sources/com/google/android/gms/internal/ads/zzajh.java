package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        int i3 = length + i2;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i3) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i3 + i2);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i2);
        zzerVar.zzh(0);
        zzerVar.zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i2 = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long jZzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j2 = this.zzR;
                    if (j2 != -1) {
                        zzafvVar.zza = j2;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i2 >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i2);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i2++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    static {
        int i2 = zzajd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    zzajh(zzaja zzajaVar, int i2, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i2 & 1) ^ 1);
        this.zzk = (i2 & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    private static int[] zzA(@Nullable int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i2 >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i2)).zzV) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void zzq(int i2) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw zzat.zzb(sb.toString(), null);
    }

    private final void zzr(int i2) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a Cues");
        throw zzat.zzb(sb.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzajg zzajgVar, long j2, int i2, int i3, int i5) {
        byte b2;
        byte[] bArrZzx;
        int i7;
        int iZze;
        zzagi zzagiVar = zzajgVar.zzU;
        if (zzagiVar != null) {
            zzagiVar.zzc(zzajgVar.zzY, j2, i2, i3, i5, zzajgVar.zzj);
        } else {
            String str = zzajgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzee.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.zzW;
                    if (j3 == -9223372036854775807L) {
                        zzee.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzer zzerVar = this.zzs;
                        byte[] bArrZzi = zzerVar.zzi();
                        switch (str.hashCode()) {
                            case 738597099:
                                b2 = !str.equals("S_TEXT/ASS") ? (byte) -1 : (byte) 1;
                                break;
                            case 738614379:
                                if (str.equals("S_TEXT/SSA")) {
                                    b2 = 2;
                                    break;
                                }
                                break;
                            case 1045209816:
                                if (str.equals("S_TEXT/WEBVTT")) {
                                    b2 = 3;
                                    break;
                                }
                                break;
                            case 1422270023:
                                if (str.equals("S_TEXT/UTF8")) {
                                    b2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (b2 == 0) {
                            bArrZzx = zzx(j3, "%02d:%02d:%02d,%03d", 1000L);
                            i7 = 19;
                        } else if (b2 == 1 || b2 == 2) {
                            bArrZzx = zzx(j3, "%01d:%02d:%02d:%02d", 10000L);
                            i7 = 21;
                        } else {
                            if (b2 != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzx = zzx(j3, "%02d:%02d:%02d.%03d", 1000L);
                            i7 = 25;
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzi, i7, bArrZzx.length);
                        int iZzg = zzerVar.zzg();
                        while (true) {
                            if (iZzg < zzerVar.zze()) {
                                if (zzerVar.zzi()[iZzg] == 0) {
                                    zzerVar.zzf(iZzg);
                                } else {
                                    iZzg++;
                                }
                            }
                        }
                        zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                        iZze = i3 + zzerVar.zze();
                        if ((i2 & 268435456) != 0) {
                            if (this.zzY > 1) {
                                this.zzv.zza(0);
                            } else {
                                zzer zzerVar2 = this.zzv;
                                int iZze2 = zzerVar2.zze();
                                zzajgVar.zzY.zzd(zzerVar2, iZze2, 2);
                                iZze += iZze2;
                            }
                        }
                        zzajgVar.zzY.zze(j2, i2, iZze, i5, zzajgVar.zzj);
                    }
                }
                iZze = i3;
                if ((i2 & 268435456) != 0) {
                }
                zzajgVar.zzY.zze(j2, i2, iZze, i5, zzajgVar.zzj);
            } else {
                iZze = i3;
                if ((i2 & 268435456) != 0) {
                }
                zzajgVar.zzY.zze(j2, i2, iZze, i5, zzajgVar.zzj);
            }
        }
        this.zzT = true;
    }

    private final void zzt(zzaev zzaevVar, int i2) throws IOException {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i2) {
            return;
        }
        if (zzerVar.zzj() < i2) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(iZzj + iZzj, i2));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i2 - zzerVar.zze());
        zzerVar.zzf(i2);
    }

    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i2, boolean z2) throws IOException {
        int i3;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i2);
            int i5 = this.zzah;
            zzv();
            return i5;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i2);
            int i7 = this.zzah;
            zzv();
            return i7;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i2);
            int i8 = this.zzah;
            zzv();
            return i8;
        }
        if (zzajgVar.zzV) {
            zzajgVar.zzZ.getClass();
            int i9 = zzaet.zza;
            zzer zzerVar = new zzer(i2);
            if (zzaevVar.zzh(zzerVar.zzi(), 0, i2, true)) {
                zzaevVar.zzl();
                if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int iZzc = zzaet.zzc(bArr);
                    if (zzerVar.zzd() >= iZzc + 4) {
                        zzerVar.zzk(iZzc);
                        if (zzaet.zza(zzerVar.zzB()) == 2) {
                            zzt zztVarZza = zzajgVar.zzZ.zza();
                            zztVarZza.zzm("audio/vnd.dts.hd");
                            zzajgVar.zzZ = zztVarZza.zzM();
                        }
                    }
                }
            }
            zzajgVar.zzY.zzz(zzajgVar.zzZ);
            zzajgVar.zzV = false;
            zzB();
        }
        zzagh zzaghVar = zzajgVar.zzY;
        if (!this.zzaj) {
            if (zzajgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b2 = this.zzan;
                if ((b2 & 1) == 1) {
                    int i10 = b2 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i10 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzaghVar.zzd(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzaghVar.zzd(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i10 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i11 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i11);
                        zzaevVar.zzc(zzerVar6.zzi(), 0, i11);
                        this.zzag += i11;
                        int i12 = (this.zzam >> 1) + 1;
                        int i13 = (i12 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.zzw = ByteBuffer.allocate(i13);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i12);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i3 = this.zzam;
                            if (i14 >= i3) {
                                break;
                            }
                            int iZzH = zzerVar6.zzH();
                            int i16 = iZzH - i15;
                            if (i14 % 2 == 0) {
                                this.zzw.putShort((short) i16);
                            } else {
                                this.zzw.putInt(i16);
                            }
                            i14++;
                            i15 = iZzH;
                        }
                        int i17 = (i2 - this.zzag) - i15;
                        if ((i3 & 1) == 1) {
                            this.zzw.putInt(i17);
                        } else {
                            this.zzw.putShort((short) i17);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i13);
                        zzaghVar.zzd(zzerVar7, i13, 1);
                        this.zzah += i13;
                    }
                }
            } else {
                byte[] bArr2 = zzajgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z2) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i2) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (iZze & 255);
                zzaghVar.zzd(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int iZze2 = i2 + zzerVar9.zze();
        String str2 = zzajgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzajgVar.zzU != null) {
                zzgrc.zzi(zzerVar9.zze() == 0);
                zzajgVar.zzU.zzb(zzaevVar);
            }
            while (true) {
                int i18 = this.zzag;
                if (i18 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzaevVar, zzaghVar, iZze2 - i18);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] bArrZzi = zzerVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i19 = zzajgVar.zzaa;
            int i20 = 4 - i19;
            while (this.zzag < iZze2) {
                int i21 = this.zzai;
                if (i21 == 0) {
                    int iMin = Math.min(i19, zzerVar9.zzd());
                    zzaevVar.zzc(bArrZzi, i20 + iMin, i19 - iMin);
                    if (iMin > 0) {
                        zzerVar9.zzm(bArrZzi, i20, iMin);
                    }
                    this.zzag += i19;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzaghVar.zzc(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzaevVar, zzaghVar, i21);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzajgVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzaghVar.zzc(zzerVar12, 4);
            this.zzah += 4;
        }
        int i22 = this.zzah;
        zzv();
        return i22;
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i2) throws IOException {
        zzer zzerVar = this.zzr;
        int iZzd = zzerVar.zzd();
        if (iZzd <= 0) {
            return zzaghVar.zza(zzaevVar, i2, false);
        }
        int iMin = Math.min(i2, iZzd);
        zzaghVar.zzc(zzerVar, iMin);
        return iMin;
    }

    private final long zzz(long j2) throws zzat {
        long j3 = this.zzz;
        if (j3 != -9223372036854775807L) {
            return zzfj.zzt(j2, j3, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @CallSuper
    protected final void zzh(int i2, long j2, long j3) throws zzat {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i2 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i2 == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i2 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i2 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i2 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i2 == 20533) {
            zzq(i2);
            this.zzE.zzh = true;
            return;
        }
        if (i2 == 21968) {
            zzq(i2);
            this.zzE.zzy = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.zzy;
            if (j4 != -1 && j4 != j2) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j2;
            this.zzx = j3;
            return;
        }
        if (i2 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i2 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        r24 = -9223372036854775807L;
        r26 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        r40.zzap.zzw(new com.google.android.gms.internal.ads.zzafx(r40.zzB, 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    @CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i2) throws zzat {
        int i3;
        int i5;
        SparseArray sparseArray;
        int i7;
        long j2;
        List list;
        int i8;
        int i9;
        SparseArray sparseArray2;
        long jZza;
        long jZzb;
        long jZzb2;
        long jZza2;
        zzap zzapVarZzg;
        int i10 = 0;
        this.zzap.getClass();
        long j3 = 0;
        int i11 = 2;
        if (i2 == 160) {
            if (this.zzU == 2) {
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                zzajgVar.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzajgVar.zzc)) {
                    zzer zzerVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzerVar.zzb(bArrArray, bArrArray.length);
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.zzY; i13++) {
                    i12 += this.zzZ[i13];
                }
                int i14 = 0;
                while (i14 < this.zzY) {
                    long j4 = this.zzV + ((long) ((zzajgVar.zzf * i14) / 1000));
                    int i15 = this.zzac;
                    if (i14 == 0) {
                        if (!this.zzae) {
                            i15 |= 1;
                        }
                        i3 = 0;
                    } else {
                        i3 = i14;
                    }
                    int i16 = this.zzZ[i3];
                    int i17 = i12 - i16;
                    zzs(zzajgVar, j4, i15, i16, i17);
                    i14 = i3 + 1;
                    i12 = i17;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i18 = 20;
        if (i2 == 174) {
            zzajg zzajgVar2 = this.zzE;
            zzajgVar2.getClass();
            String str = zzajgVar2.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str) {
                case "V_VP8":
                case "V_VP9":
                case "V_AV1":
                case "V_MPEG2":
                case "V_MPEG4/ISO/SP":
                case "V_MPEG4/ISO/ASP":
                case "V_MPEG4/ISO/AP":
                case "V_MPEG4/ISO/AVC":
                case "V_MPEGH/ISO/HEVC":
                case "V_MS/VFW/FOURCC":
                case "V_THEORA":
                case "A_OPUS":
                case "A_VORBIS":
                case "A_AAC":
                case "A_MPEG/L2":
                case "A_MPEG/L3":
                case "A_AC3":
                case "A_EAC3":
                case "A_TRUEHD":
                case "A_DTS":
                case "A_DTS/EXPRESS":
                case "A_DTS/LOSSLESS":
                case "A_FLAC":
                case "A_MS/ACM":
                case "A_PCM/INT/LIT":
                case "A_PCM/INT/BIG":
                case "A_PCM/FLOAT/IEEE":
                case "S_TEXT/UTF8":
                case "S_TEXT/ASS":
                case "S_TEXT/SSA":
                case "S_TEXT/WEBVTT":
                case "S_VOBSUB":
                case "S_HDMV/PGS":
                case "S_DVBSUB":
                    zzajgVar2.zza(zzajgVar2.zzd);
                    zzajgVar2.zzY = this.zzap.zzu(zzajgVar2.zzd, zzajgVar2.zze);
                    this.zzi.put(zzajgVar2.zzd, zzajgVar2);
                    break;
            }
            this.zzE = null;
            return;
        }
        if (i2 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzK == -9223372036854775807L || (i5 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List arrayList = (List) sparseArray3.get(i5);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray3.put(this.zzL, arrayList);
            }
            arrayList.add(new zzaje(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i2 == 19899) {
            int i19 = this.zzG;
            if (i19 != -1) {
                long j5 = this.zzH;
                if (j5 != -1) {
                    if (i19 == 475249515) {
                        this.zzQ = j5;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i2 == 25152) {
            zzq(i2);
            zzajg zzajgVar3 = this.zzE;
            if (zzajgVar3.zzh) {
                if (zzajgVar3.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzajgVar3.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i2 == 28032) {
            zzq(i2);
            zzajg zzajgVar4 = this.zzE;
            if (zzajgVar4.zzh && zzajgVar4.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j6 = this.zzA;
            if (j6 != -9223372036854775807L) {
                this.zzB = zzz(j6);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z2 = !this.zzj || this.zzQ == -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            for (int i24 = 0; i24 < sparseArray4.size(); i24++) {
                zzajg zzajgVar5 = (zzajg) sparseArray4.valueAt(i24);
                int i25 = zzajgVar5.zze;
                if (i25 == 2) {
                    if (zzajgVar5.zzX) {
                        i20 = zzajgVar5.zzd;
                    }
                    if (i21 == -1) {
                        i21 = zzajgVar5.zzd;
                    }
                } else if (i25 == 1) {
                    if (zzajgVar5.zzX) {
                        i22 = zzajgVar5.zzd;
                    }
                    if (i23 == -1) {
                        i23 = zzajgVar5.zzd;
                    }
                }
                if (z2) {
                    zzajgVar5.zzb();
                    if (!zzajgVar5.zzV) {
                        zzagh zzaghVar = zzajgVar5.zzY;
                        zzv zzvVar = zzajgVar5.zzZ;
                        zzvVar.getClass();
                        zzaghVar.zzz(zzvVar);
                    }
                }
            }
            if (i20 != -1) {
                this.zzO = i20;
            } else if (i21 != -1) {
                this.zzO = i21;
            } else if (i22 != -1) {
                this.zzO = i22;
            } else if (i23 != -1) {
                this.zzO = i23;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzajg) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z2) {
                zzB();
                return;
            }
            return;
        }
        if (i2 != 475249515 || this.zzF) {
            return;
        }
        int i26 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i26 >= sparseArray.size()) {
                break;
            }
            if (((List) sparseArray.valueAt(i26)).isEmpty()) {
                i26++;
            } else {
                if (this.zzB == -9223372036854775807L) {
                    break;
                }
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    Collections.sort((List) sparseArray.valueAt(i27));
                }
                j2 = -9223372036854775807L;
                i7 = -1;
                this.zzap.zzw(new zzajf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
            }
        }
        this.zzF = true;
        this.zzJ = false;
        int i28 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzi;
            if (i28 >= sparseArray5.size()) {
                zzB();
                return;
            }
            zzajg zzajgVar6 = (zzajg) sparseArray5.valueAt(i28);
            long j7 = this.zzB;
            long j9 = this.zzy;
            long j10 = j3;
            long j11 = this.zzx;
            if (zzajgVar6.zze != i11 || (list = (List) sparseArray.get(zzajgVar6.zzd)) == null || list.isEmpty()) {
                i9 = i28;
                sparseArray2 = sparseArray;
                i8 = i10;
            } else {
                if (list.isEmpty()) {
                    i9 = i28;
                    sparseArray2 = sparseArray;
                    i8 = i10;
                } else {
                    int iMin = Math.min(list.size(), i18);
                    double d2 = 0.0d;
                    i8 = i10;
                    int i29 = i7;
                    while (i10 < iMin) {
                        zzaje zzajeVar = (zzaje) list.get(i10);
                        if (zzajeVar.zza() > 10000000) {
                            break;
                        }
                        int i30 = i10 + 1;
                        if (i10 < list.size() - 1) {
                            zzaje zzajeVar2 = (zzaje) list.get(i30);
                            jZzb = zzajeVar2.zzb() + zzajeVar2.zzc();
                            jZzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            jZza2 = zzajeVar2.zza() - zzajeVar.zza();
                        } else {
                            jZzb = j9 + j11;
                            jZzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            jZza2 = j7 - zzajeVar.zza();
                        }
                        long j12 = jZzb - jZzb2;
                        int i31 = i28;
                        SparseArray sparseArray6 = sparseArray;
                        long j13 = j11;
                        long j14 = jZza2;
                        if (j14 > j10) {
                            double d4 = j12 / j14;
                            if (d4 > d2) {
                                d2 = d4;
                                i29 = i10;
                            }
                        }
                        sparseArray = sparseArray6;
                        i10 = i30;
                        i28 = i31;
                        j11 = j13;
                    }
                    i9 = i28;
                    sparseArray2 = sparseArray;
                    if (i29 != i7) {
                        jZza = ((zzaje) list.get(i29)).zza();
                    }
                    if (jZza != j2) {
                        zzv zzvVar2 = zzajgVar6.zzZ;
                        zzvVar2.getClass();
                        zzap zzapVar = zzvVar2.zzl;
                        zzahx zzahxVar = new zzahx(jZza);
                        if (zzapVar == null) {
                            zzao[] zzaoVarArr = new zzao[1];
                            zzaoVarArr[i8] = zzahxVar;
                            zzapVarZzg = new zzap(j2, zzaoVarArr);
                        } else {
                            zzao[] zzaoVarArr2 = new zzao[1];
                            zzaoVarArr2[i8] = zzahxVar;
                            zzapVarZzg = zzapVar.zzg(zzaoVarArr2);
                        }
                        zzt zztVarZza = zzajgVar6.zzZ.zza();
                        zztVarZza.zzk(zzapVarZzg);
                        zzajgVar6.zzZ = zztVarZza.zzM();
                    }
                }
                jZza = j2;
                if (jZza != j2) {
                }
            }
            if (!zzajgVar6.zzV) {
                zzajgVar6.zzb();
                zzagh zzaghVar2 = zzajgVar6.zzY;
                zzv zzvVar3 = zzajgVar6.zzZ;
                zzvVar3.getClass();
                zzaghVar2.zzz(zzvVar3);
            }
            i28 = i9 + 1;
            sparseArray = sparseArray2;
            j3 = j10;
            i10 = i8;
            i11 = 2;
            i18 = 20;
            j2 = -9223372036854775807L;
            i7 = -1;
        }
    }

    @CallSuper
    protected final void zzj(int i2, long j2) throws zzat {
        boolean z2;
        if (i2 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzN == -1) {
                this.zzN = j2;
                return;
            }
            return;
        }
        if (i2 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i2);
            if (this.zzM == -1) {
                this.zzM = j2;
                return;
            }
            return;
        }
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw zzat.zzb(sb.toString(), null);
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 35);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        switch (i2) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i3 = (int) j2;
                if (i3 == 1) {
                    zzq(i2);
                    this.zzE.zze = 2;
                    return;
                }
                if (i3 == 2) {
                    zzq(i2);
                    this.zzE.zze = 1;
                    return;
                } else if (i3 == 17) {
                    zzq(i2);
                    this.zzE.zze = 3;
                    return;
                } else if (i3 != 33) {
                    zzq(i2);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i2);
                    this.zzE.zze = 5;
                    return;
                }
            case 136:
                z2 = j2 == 1;
                zzq(i2);
                this.zzE.zzX = z2;
                return;
            case 155:
                this.zzW = zzz(j2);
                return;
            case 159:
                zzq(i2);
                this.zzE.zzP = (int) j2;
                return;
            case 176:
                zzq(i2);
                this.zzE.zzm = (int) j2;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i2);
                this.zzK = zzz(j2);
                return;
            case 186:
                zzq(i2);
                this.zzE.zzn = (int) j2;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i2);
                this.zzE.zzd = (int) j2;
                return;
            case 231:
                this.zzS = zzz(j2);
                return;
            case 238:
                this.zzad = (int) j2;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i2);
                this.zzL = (int) j2;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i2);
                this.zzE.zzd((int) j2);
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw zzat.zzb(sb3.toString(), null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 33);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw zzat.zzb(sb4.toString(), null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j2).length() + 30);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw zzat.zzb(sb5.toString(), null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j2).length() + 29);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j2).length() + 36);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 21420:
                this.zzH = j2 + this.zzy;
                return;
            case 21432:
                int i5 = (int) j2;
                zzq(i2);
                if (i5 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i5 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i5 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i2);
                this.zzE.zzp = (int) j2;
                return;
            case 21682:
                zzq(i2);
                this.zzE.zzr = (int) j2;
                return;
            case 21690:
                zzq(i2);
                this.zzE.zzq = (int) j2;
                return;
            case 21930:
                z2 = j2 == 1;
                zzq(i2);
                this.zzE.zzW = z2;
                return;
            case 21938:
                zzq(i2);
                zzajg zzajgVar = this.zzE;
                zzajgVar.zzy = true;
                zzajgVar.zzo = (int) j2;
                return;
            case 21998:
                zzq(i2);
                this.zzE.zzg = (int) j2;
                return;
            case 22186:
                zzq(i2);
                this.zzE.zzS = j2;
                return;
            case 22203:
                zzq(i2);
                this.zzE.zzT = j2;
                return;
            case 25188:
                zzq(i2);
                this.zzE.zzQ = (int) j2;
                return;
            case 30114:
                this.zzaf = j2;
                return;
            case 30321:
                int i7 = (int) j2;
                zzq(i2);
                if (i7 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i7 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i7 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i2);
                this.zzE.zzf = (int) j2;
                return;
            case 2807729:
                this.zzz = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        int i8 = (int) j2;
                        zzq(i2);
                        if (i8 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i8 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i2);
                        int iZzc = zzi.zzc((int) j2);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i2);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j2);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i2);
                        this.zzE.zzC = (int) j2;
                        return;
                    case 21949:
                        zzq(i2);
                        this.zzE.zzD = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    protected final void zzk(int i2, double d2) throws zzat {
        if (i2 == 181) {
            zzq(i2);
            this.zzE.zzR = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.zzA = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                zzq(i2);
                this.zzE.zzE = (float) d2;
                break;
            case 21970:
                zzq(i2);
                this.zzE.zzF = (float) d2;
                break;
            case 21971:
                zzq(i2);
                this.zzE.zzG = (float) d2;
                break;
            case 21972:
                zzq(i2);
                this.zzE.zzH = (float) d2;
                break;
            case 21973:
                zzq(i2);
                this.zzE.zzI = (float) d2;
                break;
            case 21974:
                zzq(i2);
                this.zzE.zzJ = (float) d2;
                break;
            case 21975:
                zzq(i2);
                this.zzE.zzK = (float) d2;
                break;
            case 21976:
                zzq(i2);
                this.zzE.zzL = (float) d2;
                break;
            case 21977:
                zzq(i2);
                this.zzE.zzM = (float) d2;
                break;
            case 21978:
                zzq(i2);
                this.zzE.zzN = (float) d2;
                break;
            default:
                switch (i2) {
                    case 30323:
                        zzq(i2);
                        this.zzE.zzt = (float) d2;
                        break;
                    case 30324:
                        zzq(i2);
                        this.zzE.zzu = (float) d2;
                        break;
                    case 30325:
                        zzq(i2);
                        this.zzE.zzv = (float) d2;
                        break;
                }
                break;
        }
    }

    @CallSuper
    protected final void zzl(int i2, String str) throws zzat {
        if (i2 == 134) {
            zzq(i2);
            this.zzE.zzc = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 21358) {
                zzq(i2);
                this.zzE.zzb = str;
                return;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                zzq(i2);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw zzat.zzb(sb.toString(), null);
    }

    @CallSuper
    protected final void zzm(int i2, int i3, zzaev zzaevVar) throws IOException {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i2;
        int i18 = 2;
        int i19 = 1;
        int i20 = 0;
        if (i17 != 161 && i17 != 163) {
            if (i17 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar.zzc)) {
                    zzaevVar.zzf(i3);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i3);
                zzaevVar.zzc(zzerVar.zzi(), 0, i3);
                return;
            }
            if (i17 == 16877) {
                zzq(i2);
                zzajg zzajgVar2 = this.zzE;
                if (zzajgVar2.zzc() != 1685485123 && zzajgVar2.zzc() != 1685480259) {
                    zzaevVar.zzf(i3);
                    return;
                }
                byte[] bArr = new byte[i3];
                zzajgVar2.zzO = bArr;
                zzaevVar.zzc(bArr, 0, i3);
                return;
            }
            if (i17 == 16981) {
                zzq(i2);
                byte[] bArr2 = new byte[i3];
                this.zzE.zzi = bArr2;
                zzaevVar.zzc(bArr2, 0, i3);
                return;
            }
            if (i17 == 18402) {
                byte[] bArr3 = new byte[i3];
                zzaevVar.zzc(bArr3, 0, i3);
                zzq(i2);
                this.zzE.zzj = new zzagg(1, bArr3, 0, 0);
                return;
            }
            if (i17 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar.zzc(zzerVar2.zzi(), 4 - i3, i3);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i17 == 25506) {
                zzq(i2);
                byte[] bArr4 = new byte[i3];
                this.zzE.zzk = bArr4;
                zzaevVar.zzc(bArr4, 0, i3);
                return;
            }
            if (i17 != 30322) {
                StringBuilder sb = new StringBuilder(String.valueOf(i17).length() + 15);
                sb.append("Unexpected id: ");
                sb.append(i17);
                throw zzat.zzb(sb.toString(), null);
            }
            zzq(i2);
            byte[] bArr5 = new byte[i3];
            this.zzE.zzw = bArr5;
            zzaevVar.zzc(bArr5, 0, i3);
            return;
        }
        int i21 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar3 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar3 == null) {
            zzaevVar.zzf(i3 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar, 3);
            zzer zzerVar3 = this.zzo;
            int i22 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i22 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i3 - this.zzab) - 3;
            } else {
                zzt(zzaevVar, 4);
                int i23 = (zzerVar3.zzi()[3] & UByte.MAX_VALUE) + 1;
                this.zzY = i23;
                int[] iArrZzA2 = zzA(this.zzZ, i23);
                this.zzZ = iArrZzA2;
                if (i22 == 2) {
                    int i24 = (i3 - this.zzab) - 4;
                    int i25 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i25, i24 / i25);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 4;
                        while (true) {
                            int i29 = this.zzY - 1;
                            if (i26 >= i29) {
                                i7 = i18;
                                i8 = i19;
                                i9 = i20;
                                this.zzZ[i29] = ((i3 - this.zzab) - i28) - i27;
                                break;
                            }
                            this.zzZ[i26] = i20;
                            int i30 = i28 + 1;
                            zzt(zzaevVar, i30);
                            if (zzerVar3.zzi()[i28] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i31 = i20;
                            while (true) {
                                if (i20 >= i21) {
                                    i10 = i18;
                                    i11 = i19;
                                    i12 = i21;
                                    j2 = 0;
                                    break;
                                }
                                i12 = i21;
                                int i32 = i19 << (7 - i20);
                                if ((zzerVar3.zzi()[i28] & i32) != 0) {
                                    i30 += i20;
                                    zzt(zzaevVar, i30);
                                    int i33 = i28 + 1;
                                    int i34 = zzerVar3.zzi()[i28] & UByte.MAX_VALUE & (~i32);
                                    int i35 = i18;
                                    j2 = i34;
                                    i10 = i35;
                                    int i36 = i33;
                                    while (i36 < i30) {
                                        j2 = (j2 << i12) | ((long) (zzerVar3.zzi()[i36] & UByte.MAX_VALUE));
                                        i19 = i19;
                                        i36++;
                                        i20 = i20;
                                    }
                                    i11 = i19;
                                    int i37 = i20;
                                    if (i26 > 0) {
                                        j2 -= (1 << ((i37 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i20++;
                                    i21 = i12;
                                }
                            }
                            if (j2 < -2147483648L || j2 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzZ;
                            int i38 = (int) j2;
                            if (i26 != 0) {
                                i38 += iArr[i26 - 1];
                            }
                            iArr[i26] = i38;
                            i27 += i38;
                            i26++;
                            i28 = i30;
                            i20 = i31;
                            i18 = i10;
                            i21 = i12;
                            i19 = i11;
                        }
                        throw zzat.zzb("EBML lacing sample size out of range.", null);
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i13 = this.zzY - 1;
                        if (i39 >= i13) {
                            break;
                        }
                        this.zzZ[i39] = 0;
                        while (true) {
                            i14 = i41 + 1;
                            zzt(zzaevVar, i14);
                            int i42 = zzerVar3.zzi()[i41] & UByte.MAX_VALUE;
                            int[] iArr2 = this.zzZ;
                            i15 = iArr2[i39] + i42;
                            iArr2[i39] = i15;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i14;
                            }
                        }
                        i40 += i15;
                        i39++;
                        i41 = i14;
                    }
                    this.zzZ[i13] = ((i3 - this.zzab) - i41) - i40;
                }
            }
            i7 = 2;
            i8 = 1;
            i9 = 0;
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[i9] << 8) | (zzerVar3.zzi()[i8] & UByte.MAX_VALUE));
            if (zzajgVar3.zze == i8) {
                i16 = 1;
                this.zzac = i16;
                this.zzU = i7;
                this.zzX = i9;
                i5 = 163;
            } else {
                if (i17 != 163) {
                    i16 = i9;
                } else if ((zzerVar3.zzi()[i7] & ByteCompanionObject.MIN_VALUE) == 128) {
                    i17 = 163;
                    i16 = 1;
                } else {
                    i16 = i9;
                    i17 = 163;
                }
                this.zzac = i16;
                this.zzU = i7;
                this.zzX = i9;
                i5 = 163;
            }
        } else {
            i5 = 163;
        }
        if (i17 == i5) {
            while (true) {
                int i43 = this.zzX;
                if (i43 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int iZzu = zzu(zzaevVar, zzajgVar3, this.zzZ[i43], false);
                zzajg zzajgVar4 = zzajgVar3;
                zzs(zzajgVar4, this.zzV + ((long) ((this.zzX * zzajgVar3.zzf) / 1000)), this.zzac, iZzu, 0);
                this.zzX++;
                zzajgVar3 = zzajgVar4;
            }
        } else {
            while (true) {
                int i44 = this.zzX;
                if (i44 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i44] = zzu(zzaevVar, zzajgVar3, iArr3[i44], true);
                this.zzX++;
            }
        }
    }

    private static byte[] zzx(long j2, String str, long j3) {
        boolean z2;
        if (j2 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        Locale locale = Locale.US;
        int i2 = (int) (j2 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i2);
        long j4 = j2 - (((long) i2) * 3600000000L);
        int i3 = (int) (j4 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i3);
        long j5 = j4 - (((long) i3) * 60000000);
        int i5 = (int) (j5 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i5), Integer.valueOf((int) ((j5 - (((long) i5) * 1000000)) / j3)));
        String str3 = zzfj.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    @CallSuper
    public final void zze(long j2, long j3) {
        this.zzS = -9223372036854775807L;
        int i2 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i2 < sparseArray.size()) {
                zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i2)).zzU;
                if (zzagiVar != null) {
                    zzagiVar.zza();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public zzajh(zzamd zzamdVar, int i2) {
        this(new zzaja(), 0, zzamdVar);
    }
}
