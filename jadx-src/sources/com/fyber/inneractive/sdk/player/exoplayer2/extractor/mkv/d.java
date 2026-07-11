package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import ScC.FuwU.XIvb;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class d {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f55008L;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public r f55011O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f55012P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f55018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f55019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f55020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.d f55021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55022j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55023k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55024l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f55025m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f55026n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f55027o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f55028p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f55029q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f55030r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f55031s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f55032t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f55033u = 1000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f55034v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f55035w = -1.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f55036x = -1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f55037y = -1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f55038z = -1.0f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f54997A = -1.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f54998B = -1.0f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f54999C = -1.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f55000D = -1.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f55001E = -1.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f55002F = -1.0f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f55003G = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f55004H = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f55005I = 8000;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f55006J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f55007K = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f55009M = true;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f55010N = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, int i2) {
        byte b2;
        int i3;
        List listSingletonList;
        String str;
        int iA;
        List list;
        String str2;
        int i5;
        String str3;
        List list2;
        String str4;
        int i7;
        int i8;
        int i9;
        o oVarA;
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar;
        byte[] bArr;
        int i11;
        String str5 = this.f55013a;
        str5.getClass();
        String str6 = "video/x-unknown";
        String str7 = "audio/raw";
        switch (str5.hashCode()) {
            case -2095576542:
                b2 = str5.equals("V_MPEG4/ISO/AP") ? (byte) 0 : (byte) -1;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    b2 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    b2 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    b2 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    b2 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    b2 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    b2 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    b2 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    b2 = 8;
                    break;
                }
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    b2 = 9;
                    break;
                }
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    b2 = 10;
                    break;
                }
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    b2 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    b2 = 12;
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
                    b2 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    b2 = 15;
                    break;
                }
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    b2 = 16;
                    break;
                }
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    b2 = 17;
                    break;
                }
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    b2 = 18;
                    break;
                }
                break;
            case 444813526:
                if (str5.equals(XIvb.tHuQPBM)) {
                    b2 = 19;
                    break;
                }
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    b2 = 20;
                    break;
                }
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    b2 = 21;
                    break;
                }
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    b2 = 22;
                    break;
                }
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    b2 = 23;
                    break;
                }
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    b2 = 24;
                    break;
                }
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    b2 = 25;
                    break;
                }
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    b2 = 26;
                    break;
                }
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    b2 = 27;
                    break;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 9:
                i3 = 2;
                byte[] bArr2 = this.f55020h;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str = "video/mp4v-es";
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                    oVarA = o.a(Integer.toString(i2), str2, -1, i5, this.f55003G, this.f55005I, i8, -1, -1, list, this.f55021i, i12, this.f55010N, null);
                    i9 = 1;
                } else {
                    int i13 = i5;
                    if ("video".equals(i.b(str2))) {
                        if (this.f55026n == 0) {
                            int i14 = this.f55024l;
                            i10 = -1;
                            if (i14 == -1) {
                                i14 = this.f55022j;
                            }
                            this.f55024l = i14;
                            int i15 = this.f55025m;
                            if (i15 == -1) {
                                i15 = this.f55023k;
                            }
                            this.f55025m = i15;
                        } else {
                            i10 = -1;
                        }
                        float f3 = (this.f55024l == i10 || (i11 = this.f55025m) == i10) ? -1.0f : (this.f55023k * r1) / (this.f55022j * i11);
                        if (this.f55029q) {
                            if (this.f55035w == -1.0f || this.f55036x == -1.0f || this.f55037y == -1.0f || this.f55038z == -1.0f || this.f54997A == -1.0f || this.f54998B == -1.0f || this.f54999C == -1.0f || this.f55000D == -1.0f || this.f55001E == -1.0f || this.f55002F == -1.0f) {
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.put((byte) 0);
                                byteBufferWrap.putShort((short) ((this.f55035w * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f55036x * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f55037y * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f55038z * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f54997A * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f54998B * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f54999C * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) ((this.f55000D * 50000.0f) + 0.5f));
                                byteBufferWrap.putShort((short) (this.f55001E + 0.5f));
                                byteBufferWrap.putShort((short) (this.f55002F + 0.5f));
                                byteBufferWrap.putShort((short) this.f55033u);
                                byteBufferWrap.putShort((short) this.f55034v);
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f55030r, this.f55032t, this.f55031s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVarA = o.a(Integer.toString(i2), str2, i13, this.f55022j, this.f55023k, list, -1, f3, this.f55027o, this.f55028p, cVar, this.f55021i);
                        i9 = i3;
                    } else {
                        String str8 = str2;
                        if ("application/x-subrip".equals(str8)) {
                            oVarA = o.a(Integer.toString(i2), str8, i12, this.f55010N, -1, this.f55021i, Long.MAX_VALUE, Collections.EMPTY_LIST);
                            i9 = 3;
                        } else {
                            if (!"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unexpected MIME type.");
                            }
                            o oVar = new o(Integer.toString(i2), null, str8, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.f55010N, -1, Long.MAX_VALUE, list, this.f55021i, null);
                            i9 = 3;
                            oVarA = oVar;
                        }
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA;
                gVarA.a(oVarA);
                return;
            case 2:
                i3 = 2;
                n nVar = new n(this.f55020h);
                try {
                    int iF = nVar.f();
                    if (iF != 1) {
                        if (iF == 65534) {
                            nVar.e(24);
                            long jG = nVar.g();
                            UUID uuid = e.b0;
                            if (jG == uuid.getMostSignificantBits()) {
                                if (nVar.g() == uuid.getLeastSignificantBits()) {
                                }
                                str6 = "audio/x-unknown";
                                listSingletonList = null;
                                iA = -1;
                                str7 = str6;
                                i7 = iA;
                                str = str7;
                                list = listSingletonList;
                                str2 = str;
                                i8 = i7;
                                i5 = -1;
                                int i122 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                                if ("audio".equals(i.b(str2))) {
                                }
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2 = jVar.a(this.f55014b, i9);
                                this.f55011O = gVarA2;
                                gVarA2.a(oVarA);
                                return;
                            }
                        }
                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str6 = "audio/x-unknown";
                        listSingletonList = null;
                        iA = -1;
                        str7 = str6;
                        i7 = iA;
                        str = str7;
                        list = listSingletonList;
                        str2 = str;
                        i8 = i7;
                        i5 = -1;
                        int i1222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                        if ("audio".equals(i.b(str2))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22 = jVar.a(this.f55014b, i9);
                        this.f55011O = gVarA22;
                        gVarA22.a(oVarA);
                        return;
                    }
                    iA = z.a(this.f55004H);
                    if (iA != 0) {
                        str6 = "audio/raw";
                        listSingletonList = null;
                        str7 = str6;
                        i7 = iA;
                        str = str7;
                        list = listSingletonList;
                        str2 = str;
                        i8 = i7;
                        i5 = -1;
                        int i12222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                        if ("audio".equals(i.b(str2))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222 = jVar.a(this.f55014b, i9);
                        this.f55011O = gVarA222;
                        gVarA222.a(oVarA);
                        return;
                    }
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f55004H + ". Setting mimeType to audio/x-unknown");
                    str6 = "audio/x-unknown";
                    listSingletonList = null;
                    iA = -1;
                    str7 = str6;
                    i7 = iA;
                    str = str7;
                    list = listSingletonList;
                    str2 = str;
                    i8 = i7;
                    i5 = -1;
                    int i122222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                    if ("audio".equals(i.b(str2))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222 = jVar.a(this.f55014b, i9);
                    this.f55011O = gVarA2222;
                    gVarA2222.a(oVarA);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing MS/ACM codec private");
                }
            case 3:
                i3 = 2;
                str6 = "audio/true-hd";
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222;
                gVarA22222.a(oVarA);
                return;
            case 4:
                byte[] bArr3 = this.f55020h;
                try {
                    if (bArr3[0] != 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                    }
                    int i16 = 1;
                    int i17 = 0;
                    while (true) {
                        int i18 = bArr3[i16];
                        int i19 = -1;
                        if (i18 == -1) {
                            i17 += 255;
                            i16++;
                        } else {
                            int i20 = i16 + 1;
                            int i21 = i17 + i18;
                            int i22 = 0;
                            while (true) {
                                int i23 = bArr3[i20];
                                if (i23 != i19) {
                                    int i24 = i20 + 1;
                                    int i25 = i22 + i23;
                                    if (bArr3[i24] != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i21];
                                    System.arraycopy(bArr3, i24, bArr4, 0, i21);
                                    int i26 = i24 + i21;
                                    if (bArr3[i26] != 3) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    int i27 = i26 + i25;
                                    if (bArr3[i27] != 5) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i27];
                                    System.arraycopy(bArr3, i27, bArr5, 0, bArr3.length - i27);
                                    i3 = 2;
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    list = arrayList;
                                    str2 = "audio/vorbis";
                                    i5 = 8192;
                                    i8 = -1;
                                    int i12222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                                    if ("audio".equals(i.b(str2))) {
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222 = jVar.a(this.f55014b, i9);
                                    this.f55011O = gVarA222222;
                                    gVarA222222.a(oVarA);
                                    return;
                                }
                                i22 += 255;
                                i20++;
                                i19 = -1;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                str3 = "audio/mpeg-L2";
                str2 = str3;
                i3 = 2;
                list = null;
                i5 = 4096;
                i8 = -1;
                int i122222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222;
                gVarA2222222.a(oVarA);
                return;
            case 6:
                str3 = "audio/mpeg";
                str2 = str3;
                i3 = 2;
                list = null;
                i5 = 4096;
                i8 = -1;
                int i1222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222;
                gVarA22222222.a(oVarA);
                return;
            case 7:
                byte[] bArr6 = this.f55020h;
                try {
                    if (16 > bArr6.length) {
                        throw new IllegalArgumentException();
                    }
                    if (((((long) bArr6[16]) & 255) | ((((long) bArr6[17]) & 255) << 8) | ((((long) bArr6[18]) & 255) << 16) | ((((long) bArr6[19]) & 255) << 24)) == 826496599) {
                        for (int i28 = 40; i28 < bArr6.length - 4; i28++) {
                            if (bArr6[i28] == 0 && bArr6[i28 + 1] == 0 && bArr6[i28 + 2] == 1 && bArr6[i28 + 3] == 15) {
                                listSingletonList = Collections.singletonList(Arrays.copyOfRange(bArr6, i28, bArr6.length));
                            }
                        }
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to find FourCC VC1 initialization data");
                    }
                    listSingletonList = null;
                    if (listSingletonList != null) {
                        str6 = "video/wvc1";
                    } else {
                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    }
                    i3 = 2;
                    iA = -1;
                    str7 = str6;
                    i7 = iA;
                    str = str7;
                    list = listSingletonList;
                    str2 = str;
                    i8 = i7;
                    i5 = -1;
                    int i12222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                    if ("audio".equals(i.b(str2))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222 = jVar.a(this.f55014b, i9);
                    this.f55011O = gVarA222222222;
                    gVarA222222222.a(oVarA);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing FourCC VC1 codec private");
                }
            case 8:
                byte[] bArr7 = this.f55020h;
                listSingletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                str = "application/dvbsubs";
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222;
                gVarA2222222222.a(oVarA);
                return;
            case 10:
                com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(new n(this.f55020h));
                list2 = aVarA.f56261a;
                this.f55012P = aVarA.f56262b;
                str4 = "video/avc";
                List list3 = list2;
                str = str4;
                listSingletonList = list3;
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222;
                gVarA22222222222.a(oVarA);
                return;
            case 11:
                listSingletonList = Collections.singletonList(this.f55020h);
                str = "application/vobsub";
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA222222222222;
                gVarA222222222222.a(oVarA);
                return;
            case 12:
                str6 = "audio/vnd.dts.hd";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222;
                gVarA2222222222222.a(oVarA);
                return;
            case 13:
                listSingletonList = Collections.singletonList(this.f55020h);
                str = "audio/mp4a-latm";
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222222;
                gVarA22222222222222.a(oVarA);
                return;
            case 14:
                str6 = "audio/ac3";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA222222222222222;
                gVarA222222222222222.a(oVarA);
                return;
            case 15:
            case 20:
                str6 = "audio/vnd.dts";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222222;
                gVarA2222222222222222.a(oVarA);
                return;
            case 16:
                str6 = "video/x-vnd.on2.vp8";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222222222;
                gVarA22222222222222222.a(oVarA);
                return;
            case 17:
                str6 = "video/x-vnd.on2.vp9";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA222222222222222222;
                gVarA222222222222222222.a(oVarA);
                return;
            case 18:
                str6 = "application/pgs";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222222222;
                gVarA2222222222222222222.a(oVarA);
                return;
            case 19:
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222222222222;
                gVarA22222222222222222222.a(oVarA);
                return;
            case 21:
                iA = z.a(this.f55004H);
                if (iA != 0) {
                    i3 = 2;
                    listSingletonList = null;
                    i7 = iA;
                    str = str7;
                    list = listSingletonList;
                    str2 = str;
                    i8 = i7;
                    i5 = -1;
                    int i12222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                    if ("audio".equals(i.b(str2))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222222222222 = jVar.a(this.f55014b, i9);
                    this.f55011O = gVarA222222222222222222222;
                    gVarA222222222222222222222.a(oVarA);
                    return;
                }
                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f55004H + ". Setting mimeType to audio/x-unknown");
                str6 = "audio/x-unknown";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222222222222;
                gVarA2222222222222222222222.a(oVarA);
                return;
            case 22:
                com.fyber.inneractive.sdk.player.exoplayer2.video.d dVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(new n(this.f55020h));
                list2 = dVarA.f56271a;
                this.f55012P = dVarA.f56272b;
                str4 = "video/hevc";
                List list32 = list2;
                str = str4;
                listSingletonList = list32;
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222222222222222;
                gVarA22222222222222222222222.a(oVarA);
                return;
            case 23:
                str6 = "application/x-subrip";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA222222222222222222222222;
                gVarA222222222222222222222222.a(oVarA);
                return;
            case 24:
                str6 = "video/mpeg2";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i122222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222222222222222;
                gVarA2222222222222222222222222.a(oVarA);
                return;
            case 25:
                str6 = "audio/eac3";
                i3 = 2;
                listSingletonList = null;
                iA = -1;
                str7 = str6;
                i7 = iA;
                str = str7;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i1222222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA22222222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA22222222222222222222222222;
                gVarA22222222222222222222222222.a(oVarA);
                return;
            case 26:
                listSingletonList = Collections.singletonList(this.f55020h);
                str = "audio/flac";
                i3 = 2;
                i7 = -1;
                list = listSingletonList;
                str2 = str;
                i8 = i7;
                i5 = -1;
                int i12222222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA222222222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA222222222222222222222222222;
                gVarA222222222222222222222222222.a(oVarA);
                return;
            case 27:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.f55020h);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f55006J).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f55007K).array());
                list = arrayList2;
                str2 = "audio/opus";
                i5 = 5760;
                i3 = 2;
                i8 = -1;
                int i122222222222222222222222222222 = (this.f55009M ? 1 : 0) | (this.f55008L ? i3 : 0);
                if ("audio".equals(i.b(str2))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2222222222222222222222222222 = jVar.a(this.f55014b, i9);
                this.f55011O = gVarA2222222222222222222222222222;
                gVarA2222222222222222222222222222.a(oVarA);
                return;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unrecognized codec identifier.");
        }
    }
}
