package z3E;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final int[][] f76348O;
    private static final int[][] nr;
    static final String[] rl = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[][] f76349t = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f76350n;

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Wre wre, Wre wre2) {
            return wre.nr() - wre2.nr();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        nr = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            nr[0][i2] = i2 - 63;
        }
        nr[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            nr[1][i3] = i3 - 95;
        }
        nr[2][32] = 1;
        for (int i5 = 48; i5 <= 57; i5++) {
            nr[2][i5] = i5 - 46;
        }
        int[] iArr2 = nr[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 127};
        for (int i7 = 0; i7 < 28; i7++) {
            nr[3][iArr3[i7]] = i7;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE};
        for (int i8 = 0; i8 < 31; i8++) {
            int i9 = iArr4[i8];
            if (i9 > 0) {
                nr[4][i9] = i8;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f76348O = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f76348O;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    private static Collection J2(Iterable iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nr((Wre) it.next(), i2, i3, linkedList);
        }
        return rl(linkedList);
    }

    private Collection O(Iterable iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t((Wre) it.next(), i2, linkedList);
        }
        return rl(linkedList);
    }

    private static Collection rl(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Wre wre = (Wre) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(wre);
                    break;
                }
                Wre wre2 = (Wre) it2.next();
                if (wre2.J2(wre)) {
                    break;
                }
                if (wre.J2(wre2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    private void t(Wre wre, int i2, Collection collection) {
        char c2 = (char) (this.f76350n[i2] & UByte.MAX_VALUE);
        boolean z2 = nr[wre.O()][c2] > 0;
        Wre wreRl = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i5 = nr[i3][c2];
            if (i5 > 0) {
                if (wreRl == null) {
                    wreRl = wre.rl(i2);
                }
                if (!z2 || i3 == wre.O() || i3 == 2) {
                    collection.add(wreRl.Uo(i3, i5));
                }
                if (!z2 && f76348O[wre.O()][i3] >= 0) {
                    collection.add(wreRl.KN(i3, i5));
                }
            }
        }
        if (wre.t() > 0 || nr[wre.O()][c2] == 0) {
            collection.add(wre.n(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x4x.j n() {
        int i2;
        Collection collectionSingletonList = Collections.singletonList(Wre.f76352O);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f76350n;
            if (i3 >= bArr.length) {
                return ((Wre) Collections.min(collectionSingletonList, new j())).xMQ(this.f76350n);
            }
            int i5 = i3 + 1;
            byte b2 = i5 < bArr.length ? bArr[i5] : (byte) 0;
            byte b4 = bArr[i3];
            if (b4 != 13) {
                if (b4 != 44) {
                    if (b4 != 46) {
                        i2 = (b4 == 58 && b2 == 32) ? 5 : 0;
                    } else if (b2 == 32) {
                        i2 = 3;
                    }
                } else if (b2 == 32) {
                    i2 = 4;
                }
            } else if (b2 == 10) {
                i2 = 2;
            }
            if (i2 > 0) {
                collectionSingletonList = J2(collectionSingletonList, i3, i2);
                i3 = i5;
            } else {
                collectionSingletonList = O(collectionSingletonList, i3);
            }
            i3++;
        }
    }

    public Ml(byte[] bArr) {
        this.f76350n = bArr;
    }

    private static void nr(Wre wre, int i2, int i3, Collection collection) {
        Wre wreRl = wre.rl(i2);
        collection.add(wreRl.Uo(4, i3));
        if (wre.O() != 4) {
            collection.add(wreRl.KN(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(wreRl.Uo(2, 16 - i3).Uo(2, 1));
        }
        if (wre.t() > 0) {
            collection.add(wre.n(i2).n(i2 + 1));
        }
    }
}
