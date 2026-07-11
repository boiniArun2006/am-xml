package com.google.android.gms.internal.ads;

import ScC.FuwU.XIvb;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzajg {
    public byte[] zzO;
    public zzagi zzU;
    public boolean zzW;
    public zzagh zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzagg zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    protected zzajg() {
    }

    final /* synthetic */ int zzc() {
        return this.zzab;
    }

    final /* synthetic */ void zzd(int i2) {
        this.zzab = i2;
    }

    final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }

    private static Pair zzf(zzer zzerVar) throws zzat {
        try {
            zzerVar.zzk(16);
            long jZzA = zzerVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzee.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzerVar.zzg() + 20;
            byte[] bArrZzi = zzerVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i2 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i2] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i5 = 0;
            int i7 = 1;
            while (true) {
                int i8 = bArr[i7];
                i7++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i5 += 255;
            }
            int i9 = i5 + i2;
            int i10 = 0;
            while (true) {
                int i11 = bArr[i7];
                i7++;
                i3 = i11 & 255;
                if (i3 != 255) {
                    break;
                }
                i10 += 255;
            }
            int i12 = i10 + i3;
            if (bArr[i7] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i7, bArr2, 0, i9);
            int i13 = i7 + i9;
            if (bArr[i13] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i14 = i13 + i12;
            if (bArr[i14] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i14;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i14, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i2) throws zzat {
        byte b2;
        List listZzj;
        List list;
        String str;
        String str2;
        int i3;
        int iZzz;
        String str3;
        zzt zztVar;
        int iIntValue;
        zzi zziVarZzg;
        byte[] bArr;
        int i5;
        String str4;
        zzfr zzfrVarZza;
        String str5 = this.zzc;
        int i7 = 4;
        int i8 = 0;
        switch (str5.hashCode()) {
            case -2095576542:
                b2 = !str5.equals("V_MPEG4/ISO/AP") ? (byte) -1 : (byte) 6;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    b2 = 4;
                    break;
                }
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    b2 = 23;
                    break;
                }
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    b2 = 18;
                    break;
                }
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    b2 = 11;
                    break;
                }
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    b2 = 14;
                    break;
                }
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    b2 = 15;
                    break;
                }
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    b2 = 9;
                    break;
                }
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    b2 = 33;
                    break;
                }
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    b2 = 5;
                    break;
                }
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    b2 = 7;
                    break;
                }
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    b2 = 31;
                    break;
                }
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    b2 = 21;
                    break;
                }
                break;
            case 62923557:
                if (str5.equals("A_AAC")) {
                    b2 = 13;
                    break;
                }
                break;
            case 62923603:
                if (str5.equals("A_AC3")) {
                    b2 = 16;
                    break;
                }
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    b2 = 19;
                    break;
                }
                break;
            case 82318131:
                if (str5.equals("V_AV1")) {
                    b2 = 2;
                    break;
                }
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    b2 = 0;
                    break;
                }
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    b2 = 1;
                    break;
                }
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    b2 = 32;
                    break;
                }
                break;
            case 444813526:
                if (str5.equals("V_THEORA")) {
                    b2 = 10;
                    break;
                }
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    b2 = 20;
                    break;
                }
                break;
            case 635596514:
                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                    b2 = 26;
                    break;
                }
                break;
            case 725948237:
                if (str5.equals("A_PCM/INT/BIG")) {
                    b2 = 25;
                    break;
                }
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    b2 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str5.equals("S_TEXT/ASS")) {
                    b2 = 28;
                    break;
                }
                break;
            case 738614379:
                if (str5.equals("S_TEXT/SSA")) {
                    b2 = 29;
                    break;
                }
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    b2 = 8;
                    break;
                }
                break;
            case 1045209816:
                if (str5.equals(XIvb.SffiMiwHsy)) {
                    b2 = 30;
                    break;
                }
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    b2 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    b2 = 3;
                    break;
                }
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    b2 = 17;
                    break;
                }
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    b2 = 22;
                    break;
                }
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    b2 = 12;
                    break;
                }
                break;
        }
        String str6 = "audio/raw";
        String str7 = KfLR.fBSRkAX;
        switch (b2) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null && (zzfrVarZza = zzfr.zza(new zzer(this.zzO))) != null) {
                    str2 = zzfrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                int i9 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i7);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        int i10 = this.zzp;
                        iIntValue = -1;
                        if (i10 == -1) {
                            i10 = this.zzm;
                        }
                        this.zzp = i10;
                        int i11 = this.zzq;
                        if (i11 == -1) {
                            i11 = this.zzn;
                        }
                        this.zzq = i11;
                    } else {
                        iIntValue = -1;
                    }
                    float f3 = (this.zzp == iIntValue || (i5 = this.zzq) == iIntValue) ? -1.0f : (this.zzn * r3) / (this.zzm * i5);
                    if (this.zzy) {
                        if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder.putShort((short) this.zzC);
                            byteBufferOrder.putShort((short) this.zzD);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.zza(this.zzz);
                        zzhVar.zzb(this.zzB);
                        zzhVar.zzc(this.zzA);
                        zzhVar.zzd(bArr);
                        zzhVar.zze(this.zzo);
                        zzhVar.zzf(this.zzo);
                        zziVarZzg = zzhVar.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    String str8 = this.zzb;
                    if (str8 != null && zzajh.zzg.containsKey(str8)) {
                        iIntValue = ((Integer) zzajh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                        if (Float.compare(this.zzv, 0.0f) != 0) {
                            if (Float.compare(this.zzv, 90.0f) == 0) {
                                i8 = 90;
                            } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                                i8 = 180;
                            } else if (Float.compare(this.zzv, -90.0f) == 0) {
                                i8 = 270;
                            }
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f3);
                        zztVar.zzy(i8);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    } else {
                        i8 = iIntValue;
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f3);
                        zztVar.zzy(i8);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    }
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str4 = this.zzb;
                if (str4 != null && !zzajh.zzg.containsKey(str4)) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                listZzj = bArr2 == null ? null : zzguf.zzj(bArr2);
                str6 = "video/x-vnd.on2.vp9";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str6 = "video/dolby-vision";
                }
                str3 = str6;
                int i92 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                listZzj = bArr3 == null ? null : zzguf.zzj(bArr3);
                str6 = "video/av01";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 3:
                str6 = "video/mpeg2";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str6 = "video/mp4v-es";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 7:
                zzadz zzadzVarZza = zzadz.zza(new zzer(zzi(this.zzc)));
                list = zzadzVarZza.zza;
                this.zzaa = zzadzVarZza.zzb;
                str = zzadzVarZza.zzl;
                str6 = "video/avc";
                str2 = str;
                listZzj = list;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 8:
                zzafo zzafoVarZza = zzafo.zza(new zzer(zzi(this.zzc)));
                list = zzafoVarZza.zza;
                this.zzaa = zzafoVarZza.zzb;
                str = zzafoVarZza.zzn;
                str6 = "video/hevc";
                str2 = str;
                listZzj = list;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 9:
                Pair pairZzf = zzf(new zzer(zzi(this.zzc)));
                str6 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 10:
                str6 = "video/x-unknown";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 11:
                listZzj = zzg(zzi(str5));
                i3 = 8192;
                str6 = "audio/vorbis";
                str2 = null;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzS).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                str6 = "audio/opus";
                i3 = 5760;
                listZzj = arrayList;
                str2 = null;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 13:
                listZzj = Collections.singletonList(zzi(str5));
                zzads zzadsVarZza = zzadt.zza(this.zzk);
                this.zzR = zzadsVarZza.zza;
                this.zzP = zzadsVarZza.zzb;
                str6 = "audio/mp4a-latm";
                str2 = zzadsVarZza.zzc;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 14:
                str6 = "audio/mpeg-L2";
                listZzj = null;
                str2 = null;
                i3 = 4096;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 15:
                str6 = "audio/mpeg";
                listZzj = null;
                str2 = null;
                i3 = 4096;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 16:
                str6 = "audio/ac3";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 17:
                str6 = "audio/eac3";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 18:
                this.zzU = new zzagi();
                str6 = "audio/true-hd";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 19:
            case 20:
                this.zzV = true;
                str6 = "audio/vnd.dts";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 21:
                str6 = "audio/vnd.dts.hd";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str5));
                str6 = "audio/flac";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 23:
                if (zzh(new zzer(zzi(this.zzc)))) {
                    iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (iZzz == 0) {
                        int i12 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i12);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc(str7, sb.toString());
                    }
                    i7 = iZzz;
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i922222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar.zzb(i2);
                    zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i922222222222222222222);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                zzee.zzc(str7, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzj = null;
                str2 = null;
                str6 = "audio/x-unknown";
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 24:
                iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzz == 0) {
                    int i13 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i13);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc(str7, sb2.toString());
                    listZzj = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i3 = -1;
                    i7 = -1;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i92222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar.zzb(i2);
                    zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i92222222222222222222222);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                i7 = iZzz;
                listZzj = null;
                str2 = null;
                i3 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 25:
                int i14 = this.zzQ;
                if (i14 == 8) {
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                    i7 = 3;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i9222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar.zzb(i2);
                    zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i9222222222222222222222222);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                if (i14 == 16) {
                    iZzz = 268435456;
                } else if (i14 == 24) {
                    iZzz = androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                } else {
                    if (i14 != 32) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 75);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i14);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc(str7, sb3.toString());
                        listZzj = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i3 = -1;
                        i7 = -1;
                        if (this.zzO != null) {
                        }
                        str3 = str6;
                        int i92222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                        zztVar = new zzt();
                        if (zzas.zza(str3)) {
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                        }
                        zztVar.zzb(i2);
                        zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                        zztVar.zzm(str3);
                        zztVar.zzn(i3);
                        zztVar.zze(this.zzac);
                        zztVar.zzf(i92222222222222222222222222);
                        zztVar.zzp(listZzj);
                        zztVar.zzj(str2);
                        zztVar.zzq(this.zzl);
                        this.zzZ = zztVar.zzM();
                        return;
                    }
                    iZzz = androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                }
                i7 = iZzz;
                listZzj = null;
                str2 = null;
                i3 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 26:
                int i15 = this.zzQ;
                if (i15 != 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i15).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i15);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc(str7, sb4.toString());
                    listZzj = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i3 = -1;
                    i7 = -1;
                    if (this.zzO != null) {
                    }
                    str3 = str6;
                    int i9222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                    }
                    zztVar.zzb(i2);
                    zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i9222222222222222222222222222);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                listZzj = null;
                str2 = null;
                i3 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 27:
                str6 = "application/x-subrip";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 28:
            case 29:
                int i16 = zzajh.zza;
                listZzj = zzguf.zzk(zzajh.zzc, zzi(this.zzc));
                str6 = "text/x-ssa";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 30:
                str6 = "text/vtt";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 31:
                listZzj = zzguf.zzj(zzi(str5));
                str6 = "application/vobsub";
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i922222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i922222222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 32:
                str6 = "application/pgs";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i9222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i9222222222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str5), 0, bArr5, 0, 4);
                listZzj = zzguf.zzj(bArr5);
                str2 = null;
                str6 = "application/dvbsubs";
                i3 = -1;
                i7 = -1;
                if (this.zzO != null) {
                }
                str3 = str6;
                int i92222222222222222222222222222222222 = (this.zzX ? 1 : 0) | (true != this.zzW ? 0 : 2);
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                }
                str4 = this.zzb;
                if (str4 != null) {
                }
                zztVar.zzb(i2);
                zztVar.zzl(true != this.zza ? "video/x-matroska" : "video/webm");
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i92222222222222222222222222222222222);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    private static boolean zzh(zzer zzerVar) throws zzat {
        try {
            int iZzu = zzerVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzerVar.zzh(24);
                if (zzerVar.zzD() == zzajh.zzf.getMostSignificantBits()) {
                    if (zzerVar.zzD() == zzajh.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }
}
