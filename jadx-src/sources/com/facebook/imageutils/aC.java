package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final aC f52658n = new aC();

    private final boolean n(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(bArr);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    public static final Pair J2(InputStream stream) {
        aC aCVar;
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            try {
                stream.read(bArr);
                aCVar = f52658n;
            } catch (IOException e3) {
                e3.printStackTrace();
                stream.close();
            }
            if (!aCVar.n(bArr, "RIFF")) {
                try {
                    return null;
                } catch (IOException e4) {
                    return null;
                }
            }
            aCVar.nr(stream);
            stream.read(bArr);
            if (!aCVar.n(bArr, "WEBP")) {
                try {
                    stream.close();
                    return null;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            stream.read(bArr);
            String strT = aCVar.t(bArr);
            int iHashCode = strT.hashCode();
            if (iHashCode != 2640674) {
                if (iHashCode != 2640718) {
                    if (iHashCode == 2640730 && strT.equals("VP8X")) {
                        Pair pairXMQ = aCVar.xMQ(stream);
                        try {
                            stream.close();
                            return pairXMQ;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return pairXMQ;
                        }
                    }
                } else if (strT.equals("VP8L")) {
                    Pair pairKN = aCVar.KN(stream);
                    try {
                        stream.close();
                        return pairKN;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return pairKN;
                    }
                }
            } else if (strT.equals("VP8 ")) {
                Pair pairUo = aCVar.Uo(stream);
                try {
                    stream.close();
                    return pairUo;
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return pairUo;
                }
            }
            stream.close();
            return null;
        } finally {
            try {
                stream.close();
            } catch (IOException e42) {
                e42.printStackTrace();
            }
        }
    }

    private final Pair Uo(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int iO = O(inputStream);
        int iO2 = O(inputStream);
        int iO3 = O(inputStream);
        if (iO == 157 && iO2 == 1 && iO3 == 42) {
            return new Pair(Integer.valueOf(rl(inputStream)), Integer.valueOf(rl(inputStream)));
        }
        return null;
    }

    public static final int rl(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        aC aCVar = f52658n;
        return (aCVar.O(stream) << 8) | aCVar.O(stream);
    }

    private final String t(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) (UShort.m594constructorimpl(b2) & UShort.MAX_VALUE));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final Pair xMQ(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair(Integer.valueOf(mUb(inputStream) + 1), Integer.valueOf(mUb(inputStream) + 1));
    }

    private aC() {
    }

    private final Pair KN(InputStream inputStream) throws IOException {
        nr(inputStream);
        if (O(inputStream) != 47) {
            return null;
        }
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read();
        return new Pair(Integer.valueOf((i2 | ((i3 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i3 & 192) >> 6)) + 1));
    }

    private final int O(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    private final int mUb(InputStream inputStream) {
        return (O(inputStream) << 16) | (O(inputStream) << 8) | O(inputStream);
    }

    private final int nr(InputStream inputStream) {
        int iO = O(inputStream);
        int iO2 = O(inputStream);
        return (O(inputStream) << 24) | (O(inputStream) << 16) | (iO2 << 8) | iO;
    }
}
