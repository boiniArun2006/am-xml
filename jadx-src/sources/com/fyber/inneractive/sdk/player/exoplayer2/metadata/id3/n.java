package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55843b = z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l f55844a;

    public n() {
        this.f55844a = null;
    }

    public static int a(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public static h b(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, int i3, boolean z2, int i5, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i7 = nVar.f56207b;
        int iB = b(i7, nVar.f56206a);
        String str = new String(nVar.f56206a, i7, iB - i7, C.ISO88591_NAME);
        nVar.e(iB + 1);
        int iJ = nVar.j();
        boolean z3 = (iJ & 2) != 0;
        boolean z4 = (iJ & 1) != 0;
        int iJ2 = nVar.j();
        String[] strArr = new String[iJ2];
        for (int i8 = 0; i8 < iJ2; i8++) {
            int i9 = nVar.f56207b;
            int iB2 = b(i9, nVar.f56206a);
            strArr[i8] = new String(nVar.f56206a, i9, iB2 - i9, C.ISO88591_NAME);
            nVar.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = i7 + i2;
        while (nVar.f56207b < i10) {
            o oVarA = a(i3, nVar, z2, i5, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new h(str, z3, z4, strArr, oVarArr);
    }

    public static s d(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i2 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nVar.a(bArr, 0, i3);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new s("TXXX", str, iA2 < i3 ? new String(bArr, iA2, a(bArr, iA2, iJ) - iA2, strB) : "");
    }

    public static u e(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i2 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nVar.a(bArr, 0, i3);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new u("WXXX", str, iA2 < i3 ? new String(bArr, iA2, b(iA2, bArr) - iA2, C.ISO88591_NAME) : "");
    }

    public static q c(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, C.ISO88591_NAME);
        int i3 = iB + 1;
        return new q(str, i3 < i2 ? Arrays.copyOfRange(bArr, i3, i2) : new byte[0]);
    }

    public static int f(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = nVar.f56206a;
        int i3 = nVar.f56207b;
        while (true) {
            int i5 = i3 + 1;
            if (i5 >= i2) {
                return i2;
            }
            if ((bArr[i3] & UByte.MAX_VALUE) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i5, (i2 - i3) - 2);
                i2--;
            }
            i3 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a(int i2, byte[] bArr) throws Throwable {
        m mVar;
        ArrayList arrayList = new ArrayList();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i2, bArr);
        boolean z2 = false;
        if (i2 - nVar.f56207b < 10) {
            Log.w("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iL = nVar.l();
            if (iL == f55843b) {
                int iJ = nVar.j();
                nVar.e(nVar.f56207b + 1);
                int iJ2 = nVar.j();
                int i3 = nVar.i();
                if (iJ == 2) {
                    if ((iJ2 & 64) != 0) {
                        Log.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    mVar = new m(iJ >= 4 && (iJ2 & 128) != 0, iJ, i3);
                } else {
                    if (iJ == 3) {
                        if ((iJ2 & 64) != 0) {
                            int iB = nVar.b();
                            nVar.e(nVar.f56207b + iB);
                            i3 -= iB + 4;
                        }
                    } else if (iJ == 4) {
                        if ((iJ2 & 64) != 0) {
                            int i5 = nVar.i();
                            nVar.e(nVar.f56207b + (i5 - 4));
                            i3 -= i5;
                        }
                        if ((iJ2 & 16) != 0) {
                            i3 -= 10;
                        }
                    } else {
                        Log.w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iJ);
                    }
                    if (iJ >= 4) {
                        mVar = new m(iJ >= 4 && (iJ2 & 128) != 0, iJ, i3);
                    }
                }
                if (mVar != null) {
                    return null;
                }
                int i7 = nVar.f56207b;
                int i8 = mVar.f55840a == 2 ? 6 : 10;
                int iF = mVar.f55842c;
                if (mVar.f55841b) {
                    iF = f(iF, nVar);
                }
                nVar.d(i7 + iF);
                if (!a(nVar, mVar.f55840a, i8, false)) {
                    if (mVar.f55840a != 4 || !a(nVar, 4, i8, true)) {
                        Log.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + mVar.f55840a);
                        return null;
                    }
                    z2 = true;
                }
                while (nVar.f56208c - nVar.f56207b >= i8) {
                    o oVarA = a(mVar.f55840a, nVar, z2, i8, this.f55844a);
                    if (oVarA != null) {
                        arrayList.add(oVarA);
                    }
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList);
            }
            Log.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + iL);
        }
        mVar = null;
        if (mVar != null) {
        }
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        this.f55844a = lVar;
    }

    public static u b(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        byte[] bArr = new byte[i2];
        nVar.a(bArr, 0, i2);
        return new u(str, null, new String(bArr, 0, b(0, bArr), C.ISO88591_NAME));
    }

    public static l b(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        String strB = b(iJ);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nVar.a(bArr, 0, i3);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, C.ISO88591_NAME);
        int i5 = iB + 1;
        int iA = a(bArr, i5, iJ);
        String str2 = new String(bArr, i5, iA - i5, strB);
        int iA2 = a(iJ) + iA;
        int iA3 = a(bArr, iA2, iJ);
        return new l(str, str2, new String(bArr, iA2, iA3 - iA2, strB), Arrays.copyOfRange(bArr, a(iJ) + iA3, i3));
    }

    public static f a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, int i3, boolean z2, int i5, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i7 = nVar.f56207b;
        int iB = b(i7, nVar.f56206a);
        String str = new String(nVar.f56206a, i7, iB - i7, C.ISO88591_NAME);
        nVar.e(iB + 1);
        int iB2 = nVar.b();
        int iB3 = nVar.b();
        long jK = nVar.k();
        if (jK == 4294967295L) {
            jK = -1;
        }
        long jK2 = nVar.k();
        long j2 = jK2 == 4294967295L ? -1L : jK2;
        ArrayList arrayList = new ArrayList();
        int i8 = i7 + i2;
        while (nVar.f56207b < i8) {
            o oVarA = a(i3, nVar, z2, i5, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new f(str, iB2, iB3, jK, j2, oVarArr);
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return C.UTF16_NAME;
        }
        if (i2 == 2) {
            return "UTF-16BE";
        }
        if (i2 != 3) {
            return C.ISO88591_NAME;
        }
        return C.UTF8_NAME;
    }

    public static int b(int i2, byte[] bArr) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[PHI: r3
      0x0089: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:41:0x0086, B:33:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, int i3, boolean z2) {
        int iL;
        long jL;
        int iO;
        int i5;
        int i7 = nVar.f56207b;
        while (true) {
            try {
                boolean z3 = true;
                if (nVar.f56208c - nVar.f56207b < i3) {
                    nVar.e(i7);
                    return true;
                }
                if (i2 >= 3) {
                    iL = nVar.b();
                    jL = nVar.k();
                    iO = nVar.o();
                } else {
                    iL = nVar.l();
                    jL = nVar.l();
                    iO = 0;
                }
                if (iL == 0 && jL == 0 && iO == 0) {
                    nVar.e(i7);
                    return true;
                }
                if (i2 == 4 && !z2) {
                    if ((8421504 & jL) != 0) {
                        nVar.e(i7);
                        return false;
                    }
                    jL = (((jL >> 24) & 255) << 21) | (jL & 255) | (((jL >> 8) & 255) << 7) | (((jL >> 16) & 255) << 14);
                }
                if (i2 == 4) {
                    i5 = (iO & 64) != 0 ? 1 : 0;
                    if ((iO & 1) == 0) {
                        z3 = false;
                    }
                } else if (i2 == 3) {
                    i5 = (iO & 32) != 0 ? 1 : 0;
                    if ((iO & 128) == 0) {
                    }
                } else {
                    i5 = 0;
                    z3 = false;
                }
                if (z3) {
                    i5 += 4;
                }
                if (jL < i5) {
                    nVar.e(i7);
                    return false;
                }
                int i8 = nVar.f56208c;
                int i9 = nVar.f56207b;
                if (i8 - i9 < jL) {
                    nVar.e(i7);
                    return false;
                }
                nVar.e(i9 + ((int) jL));
            } catch (Throwable th) {
                nVar.e(i7);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6 A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z2, int i3, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int iL;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        o dVar;
        o oVarA;
        int i7 = i2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = nVar;
        int iJ = nVar2.j();
        int iJ2 = nVar2.j();
        int iJ3 = nVar2.j();
        int iJ4 = i7 >= 3 ? nVar2.j() : 0;
        if (i7 == 4) {
            iL = nVar2.m();
            if (!z2) {
                iL = (((iL >> 24) & 255) << 21) | (iL & 255) | (((iL >> 8) & 255) << 7) | (((iL >> 16) & 255) << 14);
            }
        } else if (i7 == 3) {
            iL = nVar2.m();
        } else {
            iL = nVar2.l();
        }
        int iO = i7 >= 3 ? nVar2.o() : 0;
        if (iJ == 0 && iJ2 == 0 && iJ3 == 0 && iJ4 == 0 && iL == 0 && iO == 0) {
            nVar2.e(nVar2.f56208c);
            return null;
        }
        int i8 = nVar2.f56207b;
        int i9 = i8 + iL;
        if (i9 > nVar2.f56208c) {
            Log.w("Id3Decoder", "Frame size exceeds remaining tag data");
            nVar2.e(nVar2.f56208c);
            return null;
        }
        if (lVar != null && (iJ != 67 || iJ2 != 79 || iJ3 != 77 || (iJ4 != 77 && i7 != 2))) {
            nVar2.e(i9);
            return null;
        }
        if (i7 == 3) {
            z4 = (iO & 128) != 0;
            boolean z9 = (iO & 64) != 0;
            z3 = (iO & 32) != 0;
            z6 = z9;
            z7 = false;
            z5 = z4;
        } else if (i7 == 4) {
            boolean z10 = (iO & 64) != 0;
            boolean z11 = (iO & 8) != 0;
            z6 = (iO & 4) != 0;
            z7 = (iO & 2) != 0;
            if ((iO & 1) != 0) {
                z3 = z10;
                z4 = z11;
                z5 = true;
            } else {
                z3 = z10;
                z4 = z11;
                z5 = false;
            }
        } else {
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        if (!z4 && !z6) {
            if (z3) {
                iL--;
                nVar2.e(i8 + 1);
            }
            if (z5) {
                iL -= 4;
                nVar2.e(nVar2.f56207b + 4);
            }
            if (z7) {
                iL = f(iL, nVar2);
            }
            try {
                try {
                    if (iJ == 84 && iJ2 == 88 && iJ3 == 88 && (i7 == 2 || iJ4 == 88)) {
                        oVarA = d(iL, nVar2);
                    } else if (iJ == 84) {
                        oVarA = a(iL, nVar2, a(i7, iJ, iJ2, iJ3, iJ4));
                    } else if (iJ == 87 && iJ2 == 88 && iJ3 == 88 && (i7 == 2 || iJ4 == 88)) {
                        oVarA = e(iL, nVar2);
                    } else if (iJ == 87) {
                        oVarA = b(iL, nVar2, a(i7, iJ, iJ2, iJ3, iJ4));
                    } else if (iJ == 80 && iJ2 == 82 && iJ3 == 73 && iJ4 == 86) {
                        oVarA = c(iL, nVar2);
                    } else if (iJ == 71 && iJ2 == 69 && iJ3 == 79 && (iJ4 == 66 || i7 == 2)) {
                        oVarA = b(iL, nVar2);
                    } else {
                        if (i7 == 2) {
                            if (iJ == 80 && iJ2 == 73 && iJ3 == 67) {
                                oVarA = a(nVar2, iL, i7);
                            }
                            if (iJ != 67 && iJ2 == 79 && iJ3 == 77 && (iJ4 == 77 || i7 == 2)) {
                                oVarA = a(iL, nVar2);
                            } else if (iJ != 67 && iJ2 == 72 && iJ3 == 65 && iJ4 == 80) {
                                i5 = iL;
                                try {
                                    dVar = a(nVar2, i5, i7, z2, i3, lVar);
                                    i7 = i2;
                                    nVar2 = nVar;
                                } catch (UnsupportedEncodingException unused) {
                                    nVar2 = nVar;
                                    Log.w("Id3Decoder", "Unsupported character encoding");
                                    nVar2.e(i9);
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    nVar2 = nVar;
                                    nVar2.e(i9);
                                    throw th;
                                }
                            } else {
                                i5 = iL;
                                if (iJ != 67 && iJ2 == 84 && iJ3 == 79 && iJ4 == 67) {
                                    i7 = i2;
                                    nVar2 = nVar;
                                    dVar = b(nVar2, i5, i7, z2, i3, lVar);
                                } else {
                                    i7 = i2;
                                    nVar2 = nVar;
                                    String strA = a(i7, iJ, iJ2, iJ3, iJ4);
                                    byte[] bArr = new byte[i5];
                                    nVar2.a(bArr, 0, i5);
                                    dVar = new d(strA, bArr);
                                }
                            }
                        } else if (iJ == 65 && iJ2 == 80 && iJ3 == 73 && iJ4 == 67) {
                            oVarA = a(nVar2, iL, i7);
                        } else {
                            if (iJ != 67) {
                            }
                            if (iJ != 67) {
                                i5 = iL;
                                if (iJ != 67) {
                                    i7 = i2;
                                    nVar2 = nVar;
                                    String strA2 = a(i7, iJ, iJ2, iJ3, iJ4);
                                    byte[] bArr2 = new byte[i5];
                                    nVar2.a(bArr2, 0, i5);
                                    dVar = new d(strA2, bArr2);
                                }
                            }
                        }
                        if (dVar == null) {
                            Log.w("Id3Decoder", "Failed to decode frame: id=" + a(i7, iJ, iJ2, iJ3, iJ4) + ", frameSize=" + i5);
                        }
                        nVar2.e(i9);
                        return dVar;
                    }
                    dVar = oVarA;
                    i5 = iL;
                    if (dVar == null) {
                    }
                    nVar2.e(i9);
                    return dVar;
                } catch (UnsupportedEncodingException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Log.w("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            nVar2.e(i9);
            return null;
        }
    }

    public static s a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        if (i2 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        nVar.a(bArr, 0, i3);
        return new s(str, null, new String(bArr, 0, a(bArr, 0, iJ), strB));
    }

    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, int i3) {
        int iB;
        String lowerCase;
        int iJ = nVar.j();
        String strB = b(iJ);
        int i5 = i2 - 1;
        byte[] bArr = new byte[i5];
        nVar.a(bArr, 0, i5);
        if (i3 == 2) {
            lowerCase = "image/" + new String(bArr, 0, 3, C.ISO88591_NAME).toLowerCase(Locale.US);
            if (lowerCase.equals("image/jpg")) {
                lowerCase = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(0, bArr);
            lowerCase = new String(bArr, 0, iB, C.ISO88591_NAME).toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i7 = bArr[iB + 1] & UByte.MAX_VALUE;
        int i8 = iB + 2;
        int iA = a(bArr, i8, iJ);
        return new b(lowerCase, new String(bArr, i8, iA - i8, strB), i7, Arrays.copyOfRange(bArr, a(iJ) + iA, i5));
    }

    public static j a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        if (i2 < 4) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        byte[] bArr = new byte[3];
        nVar.a(bArr, 0, 3);
        String str2 = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        nVar.a(bArr2, 0, i3);
        int iA = a(bArr2, 0, iJ);
        String str3 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        if (iA2 < i3) {
            str = new String(bArr2, iA2, a(bArr2, iA2, iJ) - iA2, strB);
        } else {
            str = "";
        }
        return new j(str2, str3, str);
    }

    public static String a(int i2, int i3, int i5, int i7, int i8) {
        if (i2 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static int a(byte[] bArr, int i2, int i3) {
        int iB = b(i2, bArr);
        if (i3 == 0 || i3 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }
}
