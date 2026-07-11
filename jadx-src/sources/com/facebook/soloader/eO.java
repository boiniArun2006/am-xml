package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.soloader.Xo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class eO {
    private static List J2 = null;
    private static volatile boolean KN = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static byte[] f53039O = null;
    private static Map Uo = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f53040n = 3;
    private static volatile boolean nr = false;
    private static final int rl = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f53041t = 3 + 3;
    private static final ReentrantReadWriteLock xMQ = new ReentrantReadWriteLock();

    private static int J2(String str) {
        int iCodePointAt = 5381;
        for (int i2 = f53040n; i2 < str.length() - rl; i2++) {
            iCodePointAt = str.codePointAt(i2) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean Uo(String str, int i2) {
        int i3;
        int i5 = f53040n;
        while (true) {
            int length = str.length();
            i3 = rl;
            if (i5 >= length - i3 || i2 >= f53039O.length || (str.codePointAt(i5) & 255) != f53039O[i2]) {
                break;
            }
            i5++;
            i2++;
        }
        return i5 == str.length() - i3;
    }

    private static String[] n(String str) {
        if (nr) {
            return xMQ(str);
        }
        if (!KN) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = xMQ;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] strArrXMQ = xMQ(str);
            reentrantReadWriteLock.readLock().unlock();
            return strArrXMQ;
        } catch (Throwable th) {
            xMQ.readLock().unlock();
            throw th;
        }
    }

    private static String nr(int i2) {
        if (i2 >= J2.size()) {
            return null;
        }
        int iIntValue = ((Integer) J2.get(i2)).intValue();
        int i3 = iIntValue;
        while (true) {
            byte[] bArr = f53039O;
            if (i3 >= bArr.length || bArr[i3] <= 32) {
                break;
            }
            i3++;
        }
        int i5 = (i3 - iIntValue) + f53041t;
        char[] cArr = new char[i5];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i7 = 0; i7 < i5 - f53041t; i7++) {
            cArr[f53040n + i7] = (char) f53039O[iIntValue + i7];
        }
        cArr[i5 - 3] = '.';
        cArr[i5 - 2] = 's';
        cArr[i5 - 1] = 'o';
        return new String(cArr);
    }

    public static String[] rl(String str, CN3 cn3) {
        boolean z2 = SoLoader.f53023n;
        if (z2) {
            Api18TraceUtils.n("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                String[] strArrN = n(str);
                if (strArrN != null) {
                    if (z2) {
                        Api18TraceUtils.rl();
                    }
                    return strArrN;
                }
                String[] strArrN2 = Xo.n(cn3);
                if (z2) {
                    Api18TraceUtils.rl();
                }
                return strArrN2;
            } catch (Xo.j e2) {
                throw SPz.rl(str, e2);
            }
        } catch (Throwable th) {
            if (SoLoader.f53023n) {
                Api18TraceUtils.rl();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = nr(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0.isEmpty() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return (java.lang.String[]) r0.toArray(new java.lang.String[r0.size()]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] t(int i2, int i3) {
        byte b2;
        ArrayList arrayList = new ArrayList();
        int i5 = (i2 + i3) - f53041t;
        int i7 = 0;
        boolean z2 = false;
        while (true) {
            byte[] bArr = f53039O;
            if (i5 >= bArr.length || (b2 = bArr[i5]) == 10) {
                break;
            }
            if (b2 == 32) {
                if (z2) {
                    String strNr = nr(i7);
                    if (strNr == null) {
                        return null;
                    }
                    arrayList.add(strNr);
                    i7 = 0;
                    z2 = false;
                } else {
                    continue;
                }
            } else {
                if (b2 < 48 || b2 > 57) {
                    break;
                }
                i7 = (i7 * 10) + (b2 - 48);
                z2 = true;
            }
            i5++;
        }
        return null;
    }

    static String[] xMQ(String str) {
        int iO;
        if (nr && str.length() > f53041t && (iO = O(str)) != -1) {
            return t(iO, str.length());
        }
        return null;
    }

    public static void KN(String str, CN3 cn3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrRl = rl(str, cn3);
        qz.n("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrRl));
        for (String str2 : strArrRl) {
            if (!str2.startsWith("/")) {
                SoLoader.r(str2, i2, threadPolicy);
            }
        }
    }

    private static int O(String str) {
        List list = (List) Uo.get(Integer.valueOf(J2(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (Uo(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }
}
