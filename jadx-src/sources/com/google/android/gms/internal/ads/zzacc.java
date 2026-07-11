package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzacc extends zzuu implements zzacr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;

    @Nullable
    private zzms zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;

    @Nullable
    private zzbv zzJ;
    private int zzK;
    private int zzL;

    @Nullable
    private zzacp zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final zzacs zzi;
    private final zzacq zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzacb zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;

    @Nullable
    private Surface zzt;

    @Nullable
    private zzace zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    protected static final boolean zzbm(zzun zzunVar) {
        return Build.VERSION.SDK_INT >= 35 && zzunVar.zzh;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadl zzadlVar = this.zzg;
            zzadlVar.zzi(((zzuu) this).zza);
            zzadlVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final float zzai(float f3, zzv zzvVar, zzv[] zzvVarArr) {
        zzun zzunVarZzaH;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f4 = zzvVar2.zzz;
            if (f4 != -1.0f) {
                fMax = Math.max(fMax, f4);
            }
        }
        float f5 = fMax == -1.0f ? -1.0f : fMax * f3;
        if (this.zzD == null || (zzunVarZzaH = zzaH()) == null) {
            return f5;
        }
        float fZzh = zzunVarZzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f5 != -1.0f ? Math.max(f5, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzaj(String str, zzuh zzuhVar, long j2, long j3) {
        this.zzg.zzb(str, j2, j3);
        this.zzn = zzbl(str);
        zzun zzunVarZzaH = zzaH();
        zzunVarZzaH.getClass();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzunVarZzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb = zzunVarZzaH.zzb();
            int length = codecProfileLevelArrZzb.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (codecProfileLevelArrZzb[i2].profile == 16384) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        this.zzo = z2;
    }

    protected final void zzax(long j2) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzk += j2;
        zzinVar.zzl++;
        this.zzF += j2;
        this.zzG++;
    }

    final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i2, @Nullable Object obj) throws zziw {
        if (i2 == 1) {
            zzbo(obj);
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            zzacp zzacpVar = (zzacp) obj;
            this.zzM = zzacpVar;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzl(zzacpVar);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zzuk zzukVarZzaE = zzaE();
            if (zzukVarZzaE != null) {
                zzukVarZzaE.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadr zzadrVar3 = this.zzp;
                if (zzadrVar3 == null || !zzadrVar3.zze()) {
                    return;
                }
                zzadrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadr zzadrVar4 = this.zzp;
            if (zzadrVar4 != null) {
                zzadrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i2 == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadr zzadrVar5 = this.zzp;
            if (zzadrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadrVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i2) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzuk zzukVarZzaE2 = zzaE();
                if (zzukVarZzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzukVarZzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzacc) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z2 = this.zzD != null;
                zzms zzmsVar = (zzms) obj;
                this.zzD = zzmsVar;
                if (z2 != (zzmsVar != null)) {
                    zzaZ();
                }
                break;
            default:
                super.zzx(i2, obj);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzat(zzun zzunVar, zzv zzvVar) {
        int i2;
        int i3 = zzvVar.zzv;
        int i5 = zzvVar.zzw;
        if (i3 != -1 && i5 != -1) {
            String str = zzvVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairZzd = zzdo.zzd(zzvVar);
                if (pairZzd == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairZzd.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    }
                }
            }
            i2 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i3 * i5) * 3) / i2;
                case "video/hevc":
                    return Math.max(2097152, ((i3 * i5) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzunVar.zzf)))) {
                        String str3 = zzfj.zza;
                        return ((((i3 + 15) / 16) * ((i5 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i2 = 8;
                    return ((i3 * i5) * 3) / i2;
            }
        }
        return -1;
    }

    protected static int zzbh(zzun zzunVar, zzv zzvVar) {
        int i2 = zzvVar.zzp;
        if (i2 == -1) {
            return zzat(zzunVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return i2 + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbl(String str) {
        byte b2;
        byte b4;
        boolean z2 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzacc.class) {
            if (!zzc) {
                int i2 = Build.VERSION.SDK_INT;
                byte b5 = 28;
                if (i2 <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            b4 = !str2.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b4 = !str2.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b4 = !str2.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b4 = !str2.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b4 = !str2.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b4 = !str2.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b4 = !str2.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b4 = !str2.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b4 = -1;
                            break;
                    }
                    switch (b4) {
                        default:
                            if (i2 > 27 || !"HWEML".equals(Build.DEVICE)) {
                                String str3 = Build.MODEL;
                                switch (str3.hashCode()) {
                                    case -349662828:
                                        b2 = !str3.equals("AFTJMST12") ? (byte) -1 : (byte) 6;
                                        break;
                                    case -321033677:
                                        b2 = !str3.equals("AFTKMST12") ? (byte) -1 : (byte) 7;
                                        break;
                                    case 2006354:
                                        b2 = !str3.equals("AFTA") ? (byte) -1 : (byte) 0;
                                        break;
                                    case 2006367:
                                        b2 = !str3.equals("AFTN") ? (byte) -1 : (byte) 1;
                                        break;
                                    case 2006371:
                                        b2 = !str3.equals("AFTR") ? (byte) -1 : (byte) 2;
                                        break;
                                    case 1785421873:
                                        b2 = !str3.equals("AFTEU011") ? (byte) -1 : (byte) 3;
                                        break;
                                    case 1785421876:
                                        b2 = !str3.equals("AFTEU014") ? (byte) -1 : (byte) 4;
                                        break;
                                    case 1798172390:
                                        b2 = !str3.equals("AFTSO001") ? (byte) -1 : (byte) 8;
                                        break;
                                    case 2119412532:
                                        b2 = !str3.equals("AFTEUFF014") ? (byte) -1 : (byte) 5;
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    default:
                                        if (i2 <= 26) {
                                            String str4 = Build.DEVICE;
                                            switch (str4.hashCode()) {
                                                case -2144781245:
                                                    b5 = !str4.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 54;
                                                    break;
                                                case -2144781185:
                                                    b5 = !str4.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 55;
                                                    break;
                                                case -2144781160:
                                                    b5 = !str4.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 56;
                                                    break;
                                                case -2097309513:
                                                    b5 = !str4.equals("K50a40") ? (byte) -1 : (byte) 74;
                                                    break;
                                                case -2022874474:
                                                    b5 = !str4.equals("CP8676_I02") ? (byte) -1 : (byte) 22;
                                                    break;
                                                case -1978993182:
                                                    b5 = !str4.equals("NX541J") ? (byte) -1 : (byte) 89;
                                                    break;
                                                case -1978990237:
                                                    b5 = !str4.equals("NX573J") ? (byte) -1 : (byte) 90;
                                                    break;
                                                case -1936688988:
                                                    b5 = !str4.equals("PGN528") ? (byte) -1 : (byte) 101;
                                                    break;
                                                case -1936688066:
                                                    b5 = !str4.equals("PGN610") ? (byte) -1 : (byte) 102;
                                                    break;
                                                case -1936688065:
                                                    b5 = !str4.equals("PGN611") ? (byte) -1 : (byte) 103;
                                                    break;
                                                case -1931988508:
                                                    b5 = !str4.equals("AquaPowerM") ? (byte) -1 : (byte) 13;
                                                    break;
                                                case -1885099851:
                                                    b5 = !str4.equals("RAIJIN") ? (byte) -1 : (byte) 116;
                                                    break;
                                                case -1696512866:
                                                    b5 = !str4.equals("XT1663") ? (byte) -1 : (byte) 137;
                                                    break;
                                                case -1680025915:
                                                    b5 = !str4.equals("ComioS1") ? (byte) -1 : (byte) 21;
                                                    break;
                                                case -1615810839:
                                                    b5 = !str4.equals("Phantom6") ? (byte) -1 : (byte) 104;
                                                    break;
                                                case -1600724499:
                                                    b5 = !str4.equals("pacificrim") ? (byte) -1 : (byte) 95;
                                                    break;
                                                case -1554255044:
                                                    b5 = !str4.equals("vernee_M5") ? (byte) -1 : (byte) 130;
                                                    break;
                                                case -1481772737:
                                                    b5 = !str4.equals("panell_dl") ? (byte) -1 : (byte) 97;
                                                    break;
                                                case -1481772730:
                                                    b5 = !str4.equals("panell_ds") ? (byte) -1 : (byte) 98;
                                                    break;
                                                case -1481772729:
                                                    b5 = !str4.equals("panell_dt") ? (byte) -1 : (byte) 99;
                                                    break;
                                                case -1320080169:
                                                    b5 = !str4.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 52;
                                                    break;
                                                case -1217592143:
                                                    b5 = !str4.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 18;
                                                    break;
                                                case -1180384755:
                                                    b5 = !str4.equals("iris60") ? (byte) -1 : (byte) 70;
                                                    break;
                                                case -1139198265:
                                                    b5 = !str4.equals("Slate_Pro") ? (byte) -1 : (byte) 118;
                                                    break;
                                                case -1052835013:
                                                    b5 = !str4.equals("namath") ? (byte) -1 : (byte) 87;
                                                    break;
                                                case -993250464:
                                                    b5 = !str4.equals("A10-70F") ? (byte) -1 : (byte) 5;
                                                    break;
                                                case -993250458:
                                                    b5 = !str4.equals("A10-70L") ? (byte) -1 : (byte) 6;
                                                    break;
                                                case -965403638:
                                                    b5 = !str4.equals("s905x018") ? (byte) -1 : (byte) 120;
                                                    break;
                                                case -958336948:
                                                    b5 = !str4.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 34;
                                                    break;
                                                case -879245230:
                                                    b5 = !str4.equals("tcl_eu") ? (byte) -1 : (byte) 126;
                                                    break;
                                                case -842500323:
                                                    b5 = !str4.equals("nicklaus_f") ? (byte) -1 : (byte) 88;
                                                    break;
                                                case -821392978:
                                                    b5 = !str4.equals("A7000-a") ? (byte) -1 : (byte) 9;
                                                    break;
                                                case -797483286:
                                                    b5 = !str4.equals("SVP-DTV15") ? (byte) -1 : (byte) 119;
                                                    break;
                                                case -794946968:
                                                    b5 = !str4.equals("watson") ? (byte) -1 : (byte) 131;
                                                    break;
                                                case -788334647:
                                                    b5 = !str4.equals("whyred") ? (byte) -1 : (byte) 132;
                                                    break;
                                                case -782144577:
                                                    b5 = !str4.equals("OnePlus5T") ? (byte) -1 : (byte) 91;
                                                    break;
                                                case -575125681:
                                                    b5 = !str4.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 51;
                                                    break;
                                                case -521118391:
                                                    b5 = !str4.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 53;
                                                    break;
                                                case -430914369:
                                                    b5 = !str4.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 105;
                                                    break;
                                                case -290434366:
                                                    b5 = !str4.equals("taido_row") ? (byte) -1 : (byte) 121;
                                                    break;
                                                case -282781963:
                                                    b5 = !str4.equals("BLACK-1X") ? (byte) -1 : (byte) 17;
                                                    break;
                                                case -277133239:
                                                    b5 = !str4.equals("Z12_PRO") ? (byte) -1 : (byte) 138;
                                                    break;
                                                case -173639913:
                                                    b5 = !str4.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 31;
                                                    break;
                                                case -56598463:
                                                    b5 = !str4.equals("woods_fn") ? (byte) -1 : (byte) 134;
                                                    break;
                                                case 2126:
                                                    b5 = !str4.equals("C1") ? (byte) -1 : (byte) 20;
                                                    break;
                                                case 2564:
                                                    b5 = !str4.equals("Q5") ? (byte) -1 : (byte) 113;
                                                    break;
                                                case 2715:
                                                    b5 = !str4.equals("V1") ? (byte) -1 : ByteCompanionObject.MAX_VALUE;
                                                    break;
                                                case 2719:
                                                    b5 = !str4.equals("V5") ? (byte) -1 : (byte) 129;
                                                    break;
                                                case 3091:
                                                    b5 = !str4.equals("b5") ? (byte) -1 : (byte) 16;
                                                    break;
                                                case 3483:
                                                    b5 = !str4.equals("mh") ? (byte) -1 : (byte) 84;
                                                    break;
                                                case 73405:
                                                    b5 = !str4.equals("JGZ") ? (byte) -1 : (byte) 73;
                                                    break;
                                                case 75537:
                                                    b5 = !str4.equals("M04") ? (byte) -1 : (byte) 79;
                                                    break;
                                                case 75739:
                                                    b5 = !str4.equals("M5c") ? (byte) -1 : (byte) 80;
                                                    break;
                                                case 76779:
                                                    b5 = !str4.equals("MX6") ? (byte) -1 : (byte) 86;
                                                    break;
                                                case 78669:
                                                    b5 = !str4.equals("P85") ? (byte) -1 : (byte) 94;
                                                    break;
                                                case 79305:
                                                    b5 = !str4.equals("PLE") ? (byte) -1 : (byte) 107;
                                                    break;
                                                case 80618:
                                                    b5 = !str4.equals("QX1") ? (byte) -1 : (byte) 115;
                                                    break;
                                                case 88274:
                                                    b5 = !str4.equals("Z80") ? (byte) -1 : (byte) 139;
                                                    break;
                                                case 98846:
                                                    b5 = !str4.equals("cv1") ? (byte) -1 : (byte) 26;
                                                    break;
                                                case 98848:
                                                    b5 = !str4.equals("cv3") ? (byte) -1 : (byte) 27;
                                                    break;
                                                case 99329:
                                                    if (!str4.equals("deb")) {
                                                        b5 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    b5 = !str4.equals("flo") ? (byte) -1 : (byte) 49;
                                                    break;
                                                case 1513190:
                                                    b5 = !str4.equals("1601") ? (byte) -1 : (byte) 0;
                                                    break;
                                                case 1514184:
                                                    b5 = !str4.equals("1713") ? (byte) -1 : (byte) 1;
                                                    break;
                                                case 1514185:
                                                    b5 = !str4.equals("1714") ? (byte) -1 : (byte) 2;
                                                    break;
                                                case 2133089:
                                                    b5 = !str4.equals("F01H") ? (byte) -1 : (byte) 36;
                                                    break;
                                                case 2133091:
                                                    b5 = !str4.equals("F01J") ? (byte) -1 : (byte) 37;
                                                    break;
                                                case 2133120:
                                                    b5 = !str4.equals("F02H") ? (byte) -1 : (byte) 38;
                                                    break;
                                                case 2133151:
                                                    b5 = !str4.equals("F03H") ? (byte) -1 : (byte) 39;
                                                    break;
                                                case 2133182:
                                                    b5 = !str4.equals("F04H") ? (byte) -1 : (byte) 40;
                                                    break;
                                                case 2133184:
                                                    b5 = !str4.equals("F04J") ? (byte) -1 : (byte) 41;
                                                    break;
                                                case 2436959:
                                                    b5 = !str4.equals("P681") ? (byte) -1 : (byte) 93;
                                                    break;
                                                case 2463773:
                                                    b5 = !str4.equals("Q350") ? (byte) -1 : (byte) 109;
                                                    break;
                                                case 2464648:
                                                    b5 = !str4.equals("Q427") ? (byte) -1 : (byte) 111;
                                                    break;
                                                case 2689555:
                                                    b5 = !str4.equals("XE2X") ? (byte) -1 : (byte) 136;
                                                    break;
                                                case 3154429:
                                                    b5 = !str4.equals("fugu") ? (byte) -1 : (byte) 50;
                                                    break;
                                                case 3284551:
                                                    b5 = !str4.equals("kate") ? (byte) -1 : (byte) 75;
                                                    break;
                                                case 3351335:
                                                    b5 = !str4.equals("mido") ? (byte) -1 : (byte) 85;
                                                    break;
                                                case 3386211:
                                                    b5 = !str4.equals("p212") ? (byte) -1 : (byte) 92;
                                                    break;
                                                case 41325051:
                                                    b5 = !str4.equals("MEIZU_M5") ? (byte) -1 : (byte) 83;
                                                    break;
                                                case 51349633:
                                                    b5 = !str4.equals("601LV") ? (byte) -1 : (byte) 3;
                                                    break;
                                                case 51350594:
                                                    b5 = !str4.equals("602LV") ? (byte) -1 : (byte) 4;
                                                    break;
                                                case 55178625:
                                                    b5 = !str4.equals("Aura_Note_2") ? (byte) -1 : (byte) 15;
                                                    break;
                                                case 61542055:
                                                    b5 = !str4.equals("A1601") ? (byte) -1 : (byte) 7;
                                                    break;
                                                case 65355429:
                                                    b5 = !str4.equals("E5643") ? (byte) -1 : (byte) 30;
                                                    break;
                                                case 66214468:
                                                    b5 = !str4.equals("F3111") ? (byte) -1 : (byte) 42;
                                                    break;
                                                case 66214470:
                                                    b5 = !str4.equals("F3113") ? (byte) -1 : (byte) 43;
                                                    break;
                                                case 66214473:
                                                    b5 = !str4.equals("F3116") ? (byte) -1 : (byte) 44;
                                                    break;
                                                case 66215429:
                                                    b5 = !str4.equals("F3211") ? (byte) -1 : (byte) 45;
                                                    break;
                                                case 66215431:
                                                    b5 = !str4.equals("F3213") ? (byte) -1 : (byte) 46;
                                                    break;
                                                case 66215433:
                                                    b5 = !str4.equals("F3215") ? (byte) -1 : (byte) 47;
                                                    break;
                                                case 66216390:
                                                    b5 = !str4.equals("F3311") ? (byte) -1 : (byte) 48;
                                                    break;
                                                case 76402249:
                                                    b5 = !str4.equals("PRO7S") ? (byte) -1 : (byte) 108;
                                                    break;
                                                case 76404105:
                                                    b5 = !str4.equals("Q4260") ? (byte) -1 : (byte) 110;
                                                    break;
                                                case 76404911:
                                                    b5 = !str4.equals(KfLR.ejypUnDb) ? (byte) -1 : (byte) 112;
                                                    break;
                                                case 80963634:
                                                    b5 = !str4.equals("V23GB") ? (byte) -1 : ByteCompanionObject.MIN_VALUE;
                                                    break;
                                                case 82882791:
                                                    b5 = !str4.equals("X3_HK") ? (byte) -1 : (byte) 135;
                                                    break;
                                                case 98715550:
                                                    b5 = !str4.equals("i9031") ? (byte) -1 : (byte) 67;
                                                    break;
                                                case 101370885:
                                                    b5 = !str4.equals("l5460") ? (byte) -1 : (byte) 76;
                                                    break;
                                                case 102844228:
                                                    b5 = !str4.equals("le_x6") ? (byte) -1 : (byte) 77;
                                                    break;
                                                case 165221241:
                                                    b5 = !str4.equals("A2016a40") ? (byte) -1 : (byte) 8;
                                                    break;
                                                case 182191441:
                                                    b5 = !str4.equals("CPY83_I00") ? (byte) -1 : (byte) 25;
                                                    break;
                                                case 245388979:
                                                    b5 = !str4.equals("marino_f") ? (byte) -1 : (byte) 82;
                                                    break;
                                                case 287431619:
                                                    b5 = !str4.equals("griffin") ? (byte) -1 : (byte) 60;
                                                    break;
                                                case 307593612:
                                                    b5 = !str4.equals("A7010a48") ? (byte) -1 : (byte) 11;
                                                    break;
                                                case 308517133:
                                                    b5 = !str4.equals("A7020a48") ? (byte) -1 : (byte) 12;
                                                    break;
                                                case 316215098:
                                                    b5 = !str4.equals(FijIa.EHRxZ) ? (byte) -1 : (byte) 122;
                                                    break;
                                                case 316215116:
                                                    b5 = !str4.equals("TB3-730X") ? (byte) -1 : (byte) 123;
                                                    break;
                                                case 316246811:
                                                    b5 = !str4.equals("TB3-850F") ? (byte) -1 : (byte) 124;
                                                    break;
                                                case 316246818:
                                                    b5 = !str4.equals("TB3-850M") ? (byte) -1 : (byte) 125;
                                                    break;
                                                case 407160593:
                                                    b5 = !str4.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 106;
                                                    break;
                                                case 507412548:
                                                    b5 = !str4.equals(gUxOLwRQBPPLC.ACQuPYNK) ? (byte) -1 : (byte) 114;
                                                    break;
                                                case 793982701:
                                                    b5 = !str4.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 57;
                                                    break;
                                                case 794038622:
                                                    b5 = !str4.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 58;
                                                    break;
                                                case 794040393:
                                                    b5 = !str4.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 59;
                                                    break;
                                                case 835649806:
                                                    b5 = !str4.equals("manning") ? (byte) -1 : (byte) 81;
                                                    break;
                                                case 917340916:
                                                    b5 = !str4.equals("A7000plus") ? (byte) -1 : (byte) 10;
                                                    break;
                                                case 958008161:
                                                    b5 = !str4.equals("j2xlteins") ? (byte) -1 : (byte) 72;
                                                    break;
                                                case 1060579533:
                                                    b5 = !str4.equals("panell_d") ? (byte) -1 : (byte) 96;
                                                    break;
                                                case 1150207623:
                                                    b5 = !str4.equals("LS-5017") ? (byte) -1 : (byte) 78;
                                                    break;
                                                case 1176899427:
                                                    b5 = !str4.equals("itel_S41") ? (byte) -1 : (byte) 71;
                                                    break;
                                                case 1280332038:
                                                    b5 = !str4.equals("hwALE-H") ? (byte) -1 : (byte) 62;
                                                    break;
                                                case 1306947716:
                                                    b5 = !str4.equals("EverStar_S") ? (byte) -1 : (byte) 35;
                                                    break;
                                                case 1349174697:
                                                    b5 = !str4.equals("htc_e56ml_dtul") ? (byte) -1 : Base64.padSymbol;
                                                    break;
                                                case 1522194893:
                                                    b5 = !str4.equals("woods_f") ? (byte) -1 : (byte) 133;
                                                    break;
                                                case 1691543273:
                                                    b5 = !str4.equals("CPH1609") ? (byte) -1 : (byte) 23;
                                                    break;
                                                case 1691544261:
                                                    b5 = !str4.equals("CPH1715") ? (byte) -1 : (byte) 24;
                                                    break;
                                                case 1709443163:
                                                    b5 = !str4.equals("iball8735_9806") ? (byte) -1 : (byte) 68;
                                                    break;
                                                case 1865889110:
                                                    b5 = !str4.equals("santoni") ? (byte) -1 : (byte) 117;
                                                    break;
                                                case 1906253259:
                                                    b5 = !str4.equals("PB2-670M") ? (byte) -1 : (byte) 100;
                                                    break;
                                                case 1977196784:
                                                    b5 = !str4.equals("Infinix-X572") ? (byte) -1 : (byte) 69;
                                                    break;
                                                case 2006372676:
                                                    b5 = !str4.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 19;
                                                    break;
                                                case 2019281702:
                                                    b5 = !str4.equals("DM-01K") ? (byte) -1 : (byte) 29;
                                                    break;
                                                case 2029784656:
                                                    b5 = !str4.equals("HWBLN-H") ? (byte) -1 : (byte) 63;
                                                    break;
                                                case 2030379515:
                                                    b5 = !str4.equals("HWCAM-H") ? (byte) -1 : (byte) 64;
                                                    break;
                                                case 2033393791:
                                                    b5 = !str4.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 14;
                                                    break;
                                                case 2047190025:
                                                    b5 = !str4.equals("ELUGA_Note") ? (byte) -1 : (byte) 32;
                                                    break;
                                                case 2047252157:
                                                    b5 = !str4.equals("ELUGA_Prim") ? (byte) -1 : (byte) 33;
                                                    break;
                                                case 2048319463:
                                                    b5 = !str4.equals("HWVNS-H") ? (byte) -1 : (byte) 65;
                                                    break;
                                                case 2048855701:
                                                    b5 = !str4.equals("HWWAS-H") ? (byte) -1 : (byte) 66;
                                                    break;
                                                default:
                                                    b5 = -1;
                                                    break;
                                            }
                                            switch (b5) {
                                                default:
                                                    if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                                                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                                case 75:
                                                case 76:
                                                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                                case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case l.f62283e /* 94 */:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case ASSET_FAILED_STATUS_CODE_VALUE:
                                                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                                case JSON_ENCODE_ERROR_VALUE:
                                                case b.f61769v /* 120 */:
                                                case TPAT_ERROR_VALUE:
                                                case INVALID_ADS_ENDPOINT_VALUE:
                                                case INVALID_RI_ENDPOINT_VALUE:
                                                case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                                                case INVALID_METRICS_ENDPOINT_VALUE:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case MRAID_JS_WRITE_FAILED_VALUE:
                                                case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                                case OMSDK_JS_WRITE_FAILED_VALUE:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case TPAT_RETRY_FAILED_VALUE:
                                                case 138:
                                                case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                                    z2 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                    }
                    zzd = z2;
                    zzc = true;
                }
            }
        }
        return zzd;
    }

    private static List zzbn(Context context, zzuw zzuwVar, zzv zzvVar, boolean z2, boolean z3) throws zzuy {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzguf.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            List listZzd = zzvg.zzd(zzuwVar, zzvVar, z2, z3);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzvg.zzc(zzuwVar, zzvVar, z2, z3);
    }

    private final void zzbo(@Nullable Object obj) throws zziw {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int iZze = zze();
        zzuk zzukVarZzaE = zzaE();
        if (zzukVarZzaE != null && this.zzp == null) {
            zzun zzunVarZzaH = zzaH();
            zzunVarZzaH.getClass();
            if (!zzbs(zzunVarZzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface surfaceZzbt = zzbt(zzunVarZzaH);
                if (surfaceZzbt != null) {
                    zzukVarZzaE.zzn(surfaceZzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzukVarZzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzq();
            }
        }
        if (iZze == 2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final void zzbr(long j2, long j3, zzv zzvVar) {
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            zzacpVar.zzcS(j2, j3, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzun zzunVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzunVar) || zzbg(zzunVar);
    }

    @Nullable
    private final Surface zzbt(zzun zzunVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzunVar)) {
            return null;
        }
        zzgrc.zzi(zzbg(zzunVar));
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            if (zzaceVar.zza != zzunVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzace.zzb(this.zze, zzunVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            zzaceVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzA(long j2, boolean z2, boolean z3) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !z2) {
            zzadrVar.zzg(true);
        }
        super.zzA(j2, z2, z3);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzC() {
        if (this.zzA > 0) {
            long jZzb = zzL().zzb();
            this.zzg.zzd(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i2 = this.zzG;
        if (i2 != 0) {
            this.zzg.zze(this.zzF, i2);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    protected final void zzF() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzf) {
            return;
        }
        zzadrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzW() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i2 = this.zzr;
        if (i2 == 0 || i2 == 1) {
            this.zzr = 0;
        } else {
            zzadrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    @CallSuper
    public final void zzX(long j2, long j3) throws Throwable {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            try {
                zzadrVar.zzv(j2, j3);
            } catch (zzadq e2) {
                throw zzN(e2, e2.zza, false, 7001);
            }
        }
        super.zzX(j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzum zzaP(Throwable th, @Nullable zzun zzunVar) {
        return new zzabw(th, zzunVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final boolean zzaQ(zzv zzvVar) throws zziw {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || zzadrVar.zze()) {
            return true;
        }
        try {
            zzadrVar.zzd(zzvVar);
            return true;
        } catch (zzadq e2) {
            throw zzN(e2, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        boolean z2;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i2 = 0;
        boolean z3 = zzvVar.zzs != null;
        List listZzbn = zzbn(context, zzuwVar, zzvVar, z3, false);
        if (z3 && listZzbn.isEmpty()) {
            listZzbn = zzbn(context, zzuwVar, zzvVar, false, false);
        }
        if (listZzbn.isEmpty()) {
            return 129;
        }
        if (!zzuu.zzbd(zzvVar)) {
            return 130;
        }
        zzun zzunVar = (zzun) listZzbn.get(0);
        boolean zZzc = zzunVar.zzc(zzvVar);
        if (zZzc) {
            z2 = true;
        } else {
            for (int i3 = 1; i3 < listZzbn.size(); i3++) {
                zzun zzunVar2 = (zzun) listZzbn.get(i3);
                if (zzunVar2.zzc(zzvVar)) {
                    zZzc = true;
                    z2 = false;
                    zzunVar = zzunVar2;
                    break;
                }
            }
            z2 = true;
        }
        int i5 = true != zZzc ? 3 : 4;
        int i7 = true != zzunVar.zze(zzvVar) ? 8 : 16;
        int i8 = true != zzunVar.zzg ? 0 : 64;
        int i9 = true != z2 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            i9 = 256;
        }
        if (zZzc) {
            List listZzbn2 = zzbn(context, zzuwVar, zzvVar, z3, true);
            if (!listZzbn2.isEmpty()) {
                zzun zzunVar3 = (zzun) zzvg.zze(listZzbn2, zzvVar).get(0);
                if (zzunVar3.zzc(zzvVar) && zzunVar3.zze(zzvVar)) {
                    i2 = 32;
                }
            }
        }
        return i5 | i7 | i2 | i8 | i9;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z2) throws zzuy {
        return zzvg.zze(zzbn(this.zze, zzuwVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f3) {
        int i2;
        zzacb zzacbVar;
        Point pointZzi;
        int i3;
        int i5;
        int i7;
        boolean z2;
        zzv[] zzvVarArr;
        byte b2;
        boolean z3;
        Pair pairZzd;
        int iZzat;
        zzv[] zzvVarArrZzI = zzI();
        int length = zzvVarArrZzI.length;
        int iZzbh = zzbh(zzunVar, zzvVar);
        int i8 = zzvVar.zzw;
        int i9 = zzvVar.zzv;
        if (length == 1) {
            if (iZzbh != -1 && (iZzat = zzat(zzunVar, zzvVar)) != -1) {
                iZzbh = Math.min((int) (iZzbh * 1.5f), iZzat);
            }
            zzacbVar = new zzacb(i9, i8, iZzbh);
            i2 = 35;
        } else {
            int iMax = i8;
            int iMax2 = i9;
            int i10 = 0;
            boolean z4 = false;
            i2 = 35;
            while (i10 < length) {
                zzv zzvVarZzM = zzvVarArrZzI[i10];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVarZzM.zzE == null) {
                    zzt zztVarZza = zzvVarZzM.zza();
                    zztVarZza.zzC(zziVar);
                    zzvVarZzM = zztVarZza.zzM();
                }
                if (zzunVar.zzf(zzvVar, zzvVarZzM).zzd != 0) {
                    int i11 = zzvVarZzM.zzv;
                    b2 = -1;
                    if (i11 != -1) {
                        zzvVarArr = zzvVarArrZzI;
                        if (zzvVarZzM.zzw != -1) {
                            z3 = false;
                        }
                        z4 |= z3;
                        iMax2 = Math.max(iMax2, i11);
                        iMax = Math.max(iMax, zzvVarZzM.zzw);
                        iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVarZzM));
                    } else {
                        zzvVarArr = zzvVarArrZzI;
                    }
                    z3 = true;
                    z4 |= z3;
                    iMax2 = Math.max(iMax2, i11);
                    iMax = Math.max(iMax, zzvVarZzM.zzw);
                    iZzbh = Math.max(iZzbh, zzbh(zzunVar, zzvVarZzM));
                } else {
                    zzvVarArr = zzvVarArrZzI;
                    b2 = -1;
                }
                i10++;
                zzvVarArrZzI = zzvVarArr;
            }
            if (z4) {
                StringBuilder sb = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax2);
                sb.append("x");
                sb.append(iMax);
                zzee.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z5 = i8 > i9;
                int i12 = z5 ? i8 : i9;
                int i13 = true != z5 ? i8 : i9;
                int[] iArr = zzb;
                int i14 = 0;
                while (i14 < 9) {
                    float f4 = i13;
                    float f5 = i12;
                    int i15 = iArr[i14];
                    int i16 = i14;
                    float f6 = i15;
                    if (i15 <= i12 || (i3 = (int) (f6 * (f4 / f5))) <= i13) {
                        break;
                    }
                    int i17 = i13;
                    if (true != z5) {
                        i5 = i12;
                        i7 = i15;
                    } else {
                        i5 = i12;
                        i7 = i3;
                    }
                    if (true != z5) {
                        i15 = i3;
                    }
                    pointZzi = zzunVar.zzi(i7, i15);
                    float f7 = zzvVar.zzz;
                    if (pointZzi != null) {
                        z2 = z5;
                        if (zzunVar.zzg(pointZzi.x, pointZzi.y, f7)) {
                            break;
                        }
                    } else {
                        z2 = z5;
                    }
                    i14 = i16 + 1;
                    i13 = i17;
                    i12 = i5;
                    z5 = z2;
                }
                pointZzi = null;
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzt(iMax2);
                    zztVarZza2.zzu(iMax);
                    iZzbh = Math.max(iZzbh, zzat(zzunVar, zztVarZza2.zzM()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax2);
                    sb2.append("x");
                    sb2.append(iMax);
                    zzee.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzacbVar = new zzacb(iMax2, iMax, iZzbh);
        }
        String str = zzunVar.zzc;
        this.zzm = zzacbVar;
        boolean z6 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i9);
        mediaFormat.setInteger("height", i8);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f8 = zzvVar.zzz;
        if (f8 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f8);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo) && (pairZzd = zzdo.zzd(zzvVar)) != null) {
            zzeh.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZzd.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacbVar.zza);
        mediaFormat.setInteger("max-height", zzacbVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzacbVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        if (z6) {
            mediaFormat.setInteger(obbPUqyhtS.UIkASRhLFg, 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i2) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbt = zzbt(zzunVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuh.zzb(zzunVar, mediaFormat, zzvVar, surfaceZzbt, null);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) {
        zzuk zzukVarZzaE = zzaE();
        if (zzukVarZzaE != null) {
            zzukVarZzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f3 = zzvVar.zzB;
        int i2 = zzvVar.zzA;
        if (i2 == 90 || i2 == 270) {
            f3 = 1.0f / f3;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzI = new zzbv(integer, integer2, f3);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(integer);
            zztVarZza.zzu(integer2);
            zztVarZza.zzz(f3);
            zzv zzvVarZzM = zztVarZza.zzM();
            int i5 = this.zzr;
            List listZzi = this.zzs;
            if (listZzi == null) {
                listZzi = zzguf.zzi();
            }
            zzadrVar.zzs(1, zzvVarZzM, zzbc(), i5, listZzi);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzao(long j2, long j3, long j4, boolean z2, boolean z3) throws zziw {
        int iZzP;
        if (this.zzp != null && this.zzf) {
            j3 -= -this.zzN;
        }
        if (j2 >= -500000 || z2 || (iZzP = zzP(j3)) == 0) {
            return false;
        }
        if (z3) {
            zzin zzinVar = ((zzuu) this).zza;
            int i2 = zzinVar.zzd + iZzP;
            zzinVar.zzd = i2;
            zzinVar.zzf += this.zzC;
            zzinVar.zzd = i2 + this.zzl.size();
        } else {
            ((zzuu) this).zza.zzj++;
            zzaw(iZzP + this.zzl.size(), this.zzC);
        }
        zzaJ();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzap() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
            long jZzbc = this.zzN;
            if (jZzbc == -9223372036854775807L) {
                jZzbc = zzbc();
                this.zzN = jZzbc;
            }
            this.zzp.zzo(-jZzbc);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaq(long j2, long j3, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i5, long j4, boolean z2, boolean z3, zzv zzvVar) throws zziw {
        zzacc zzaccVar;
        long j5;
        zzukVar.getClass();
        long jZzbb = j4 - zzbb();
        int i7 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j4) {
                break;
            }
            priorityQueue.poll();
            i7++;
        }
        zzaw(i7, 0);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            if (!z2 || z3) {
                return zzadrVar.zzu(j4, new zzaby(this, zzukVar, i2, jZzbb));
            }
            zzau(zzukVar, i2, jZzbb);
            return true;
        }
        zzacs zzacsVar = this.zzi;
        long jZzbc = zzbc();
        zzacq zzacqVar = this.zzj;
        int iZzk = zzacsVar.zzk(j4, j2, j3, jZzbc, z2, z3, zzacqVar);
        if (iZzk == 0) {
            long jZzc = zzL().zzc();
            zzbr(jZzbb, jZzc, zzvVar);
            zzay(zzukVar, i2, jZzbb, jZzc);
            zzax(zzacqVar.zza());
            return true;
        }
        if (iZzk != 1) {
            if (iZzk == 2) {
                zzav(zzukVar, i2, jZzbb);
                zzax(zzacqVar.zza());
                return true;
            }
            if (iZzk != 3) {
                return false;
            }
            zzau(zzukVar, i2, jZzbb);
            zzax(zzacqVar.zza());
            return true;
        }
        long jZzb = zzacqVar.zzb();
        long jZza = zzacqVar.zza();
        if (jZzb == this.zzH) {
            zzau(zzukVar, i2, jZzbb);
            j5 = jZzb;
            zzaccVar = this;
        } else {
            zzbr(jZzbb, jZzb, zzvVar);
            zzay(zzukVar, i2, jZzbb, jZzb);
            zzaccVar = this;
            j5 = jZzb;
        }
        zzaccVar.zzax(jZza);
        zzaccVar.zzH = j5;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzar() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final void zzas(zzih zzihVar) throws zziw {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b4 = byteBuffer.get();
                byte b5 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s2 == 60 && s3 == 1 && b4 == 4) {
                    if (b5 == 0 || b5 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzuk zzukVarZzaE = zzaE();
                        zzukVarZzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzukVarZzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzau(zzuk zzukVar, int i2, long j2) {
        Trace.beginSection("skipVideoBuffer");
        zzukVar.zzc(i2, false);
        Trace.endSection();
        ((zzuu) this).zza.zzf++;
    }

    protected final void zzav(zzuk zzukVar, int i2, long j2) {
        Trace.beginSection("dropVideoBuffer");
        zzukVar.zzc(i2, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    protected final void zzaw(int i2, int i3) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzh += i2;
        int i5 = i2 + i3;
        zzinVar.zzg += i5;
        this.zzA += i5;
        int i7 = this.zzB + i5;
        this.zzB = i7;
        zzinVar.zzi = Math.max(i7, zzinVar.zzi);
    }

    protected final void zzay(zzuk zzukVar, int i2, long j2, long j3) {
        Trace.beginSection("releaseOutputBuffer");
        zzukVar.zzd(i2, j3);
        Trace.endSection();
        ((zzuu) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    protected final boolean zzbg(zzun zzunVar) {
        if (zzbl(zzunVar.zza)) {
            return false;
        }
        return !zzunVar.zzf || zzace.zza(this.zze);
    }

    protected zzacc(zzaca zzacaVar) {
        boolean z2;
        super(2, zzacaVar.zzg(), zzacaVar.zzf(), false, 30.0f);
        Context applicationContext = zzacaVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadl(zzacaVar.zzh(), zzacaVar.zzi());
        if (this.zzp == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzf = z2;
        this.zzi = new zzacs(applicationContext, this, 0L);
        this.zzj = new zzacq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        if (this.zzO - (zzihVar.zze - zzbb()) <= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzU(long j2) {
        long jZzaU = zzaU();
        if (jZzaU == -9223372036854775807L || j2 > jZzaU - zzbb()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final void zzV(float f3, float f4) throws zziw {
        super.zzV(f3, f4);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzm(f3);
        } else {
            this.zzi.zzn(f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        boolean zZzaW = zzaW();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzh(zZzaW);
        }
        if (zZzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zZzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !zzadrVar.zzj()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaC(zzun zzunVar) {
        return zzbs(zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaK() {
        zzun zzunVarZzaH = zzaH();
        if (this.zzp != null && zzunVarZzaH != null) {
            String str = zzunVarZzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzuu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean zzaL() {
        boolean z2;
        zzv zzvVarZzaF = zzaF();
        long j2 = this.zzO;
        if (j2 != -9223372036854775807L) {
            if (zzaM() + j2 + 1 > Long.MAX_VALUE - (zzbb() + this.zzO)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (this.zzD != null && !this.zzE && ((zzvVarZzaF == null || zzvVarZzaF.zzq <= 0) && !z2 && zzba() == -9223372036854775807L)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaR(zzih zzihVar) throws zziw {
        int iZzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT >= 34 && (iZzaS & 32) != 0) {
            return;
        }
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final boolean zzaT(zzih zzihVar) {
        boolean z2 = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z2 = true;
            }
            if (z2) {
                ((zzuu) this).zza.zzd++;
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @CallSuper
    protected final void zzaV(long j2) {
        super.zzaV(j2);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    protected final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i2;
        int i3;
        zzio zzioVarZzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i5 = zzioVarZzf.zze;
        zzacb zzacbVar = this.zzm;
        zzacbVar.getClass();
        if (zzvVar2.zzv > zzacbVar.zza || zzvVar2.zzw > zzacbVar.zzb) {
            i5 |= 256;
        }
        if (zzbh(zzunVar, zzvVar2) > zzacbVar.zzc) {
            i5 |= 64;
        }
        String str = zzunVar.zza;
        if (i5 != 0) {
            i3 = 0;
            i2 = i5;
        } else {
            i2 = 0;
            i3 = zzioVarZzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    @Nullable
    protected final zzio zzam(zzlh zzlhVar) throws zziw {
        zzio zzioVarZzam = super.zzam(zzlhVar);
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzioVarZzam);
        return zzioVarZzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzy(boolean z2, boolean z3) throws zziw {
        super.zzy(z2, z3);
        zzJ();
        this.zzg.zza(((zzuu) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzacg zzacgVar = new zzacg(this.zze, this.zzi);
                zzacgVar.zza(true);
                long j2 = this.zzk;
                long j3 = -9223372036854775807L;
                if (j2 != -9223372036854775807L) {
                    j3 = -j2;
                }
                zzacgVar.zzc(j3);
                zzacgVar.zzb(zzL());
                zzaco zzacoVarZzd = zzacgVar.zzd();
                zzacoVarZzd.zza(1);
                this.zzp = zzacoVarZzd.zzb(0);
            }
            this.zzq = true;
        }
        int i2 = !z3 ? 1 : 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzc(new zzabx(this), zzhaf.zza());
            zzacp zzacpVar = this.zzM;
            if (zzacpVar != null) {
                this.zzp.zzl(zzacpVar);
            }
            if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
                this.zzp.zzp(this.zzt, this.zzv);
            }
            this.zzp.zzr(this.zzy);
            this.zzp.zzm(zzaX());
            List list = this.zzs;
            if (list != null) {
                this.zzp.zzn(list);
            }
            this.zzr = i2;
            zzaz();
            return;
        }
        zzacs zzacsVar = this.zzi;
        zzacsVar.zzg(zzL());
        zzacsVar.zza(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzz(zzv[] zzvVarArr, long j2, long j3, zzwk zzwkVar) throws zziw {
        super.zzz(zzvVarArr, j2, j3, zzwkVar);
        zzbf zzbfVarZzM = zzM();
        if (zzbfVarZzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzbfVarZzM.zzo(zzwkVar.zza, new zzbd()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }
}
