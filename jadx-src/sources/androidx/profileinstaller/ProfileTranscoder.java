package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class ProfileTranscoder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte[] f40937n = {112, 114, 111, 0};
    static final byte[] rl = {112, 114, 109, 0};

    private static int HI(BitSet bitSet, int i2, int i3) {
        int i5 = bitSet.get(az(2, i2, i3)) ? 2 : 0;
        return bitSet.get(az(4, i2, i3)) ? i5 | 4 : i5;
    }

    private static int az(int i2, int i3, int i5) {
        if (i2 == 1) {
            throw Encoding.t("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i5;
        }
        throw Encoding.t("Unexpected flag: " + i2);
    }

    static byte[] ck(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, Encoding.nr(inputStream, bArr.length))) {
            return Encoding.nr(inputStream, ProfileVersion.rl.length);
        }
        throw Encoding.t("Invalid magic");
    }

    private static int nY(int i2) {
        return (i2 + 7) & (-8);
    }

    private static byte[] rl(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int iGh = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            iGh += Encoding.gh(mUb(dexProfileData.f40925n, dexProfileData.rl, bArr)) + 16 + (dexProfileData.f40924O * 2) + dexProfileData.J2 + gh(dexProfileData.Uo);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iGh);
        if (Arrays.equals(bArr, ProfileVersion.f40946t)) {
            int length = dexProfileDataArr.length;
            while (i2 < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i2];
                T(byteArrayOutputStream, dexProfileData2, mUb(dexProfileData2.f40925n, dexProfileData2.rl, bArr));
                X(byteArrayOutputStream, dexProfileData2);
                i2++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                T(byteArrayOutputStream, dexProfileData3, mUb(dexProfileData3.f40925n, dexProfileData3.rl, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i2 < length2) {
                X(byteArrayOutputStream, dexProfileDataArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == iGh) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.t("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iGh);
    }

    private static void v(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.r(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            int size = dexProfileData.xMQ.size() * 4;
            String strMUb = mUb(dexProfileData.f40925n, dexProfileData.rl, ProfileVersion.nr);
            Encoding.ck(outputStream, Encoding.gh(strMUb));
            Encoding.ck(outputStream, dexProfileData.KN.length);
            Encoding.Ik(outputStream, size);
            Encoding.Ik(outputStream, dexProfileData.f40926t);
            Encoding.ty(outputStream, strMUb);
            Iterator it = dexProfileData.xMQ.keySet().iterator();
            while (it.hasNext()) {
                Encoding.ck(outputStream, ((Integer) it.next()).intValue());
                Encoding.ck(outputStream, 0);
            }
            for (int i2 : dexProfileData.KN) {
                Encoding.ck(outputStream, i2);
            }
        }
    }

    private static void wTp(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        Encoding.ck(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String strMUb = mUb(dexProfileData.f40925n, dexProfileData.rl, ProfileVersion.f40944O);
            Encoding.ck(outputStream, Encoding.gh(strMUb));
            Encoding.ck(outputStream, dexProfileData.xMQ.size());
            Encoding.ck(outputStream, dexProfileData.KN.length);
            Encoding.Ik(outputStream, dexProfileData.f40926t);
            Encoding.ty(outputStream, strMUb);
            Iterator it = dexProfileData.xMQ.keySet().iterator();
            while (it.hasNext()) {
                Encoding.ck(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i2 : dexProfileData.KN) {
                Encoding.ck(outputStream, i2);
            }
        }
    }

    private static DexProfileData xMQ(DexProfileData[] dexProfileDataArr, String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        String strKN = KN(str);
        for (int i2 = 0; i2 < dexProfileDataArr.length; i2++) {
            if (dexProfileDataArr[i2].rl.equals(strKN)) {
                return dexProfileDataArr[i2];
            }
        }
        return null;
    }

    private static WritableFileSection E2(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Encoding.ck(byteArrayOutputStream, dexProfileDataArr.length);
            int i2 = 2;
            for (DexProfileData dexProfileData : dexProfileDataArr) {
                Encoding.Ik(byteArrayOutputStream, dexProfileData.f40926t);
                Encoding.Ik(byteArrayOutputStream, dexProfileData.nr);
                Encoding.Ik(byteArrayOutputStream, dexProfileData.Uo);
                String strMUb = mUb(dexProfileData.f40925n, dexProfileData.rl, ProfileVersion.f40945n);
                int iGh = Encoding.gh(strMUb);
                Encoding.ck(byteArrayOutputStream, iGh);
                i2 = i2 + 14 + iGh;
                Encoding.ty(byteArrayOutputStream, strMUb);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i2 == byteArray.length) {
                WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, i2, byteArray, false);
                byteArrayOutputStream.close();
                return writableFileSection;
            }
            throw Encoding.t("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] J2(DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            s7N(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String KN(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static void N(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[gh(dexProfileData.Uo)];
        for (Map.Entry entry : dexProfileData.xMQ.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                g(bArr, 2, iIntValue, dexProfileData);
            }
            if ((iIntValue2 & 4) != 0) {
                g(bArr, 4, iIntValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    private static byte[] O(int i2, DexProfileData dexProfileData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            nHg(byteArrayOutputStream, i2, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String Uo(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static DexProfileData[] ViF(InputStream inputStream, String str, int i2) {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iKN = Encoding.KN(inputStream);
            int iKN2 = Encoding.KN(inputStream);
            dexProfileDataArr[i3] = new DexProfileData(str, Encoding.J2(inputStream, iKN), Encoding.xMQ(inputStream), 0L, iKN2, (int) Encoding.xMQ(inputStream), (int) Encoding.xMQ(inputStream), new int[iKN2], new TreeMap());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            DexProfileData dexProfileData = dexProfileDataArr[i5];
            Ik(inputStream, dexProfileData);
            dexProfileData.KN = ty(inputStream, dexProfileData.f40924O);
            WPU(inputStream, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static void WPU(InputStream inputStream, DexProfileData dexProfileData) {
        BitSet bitSetValueOf = BitSet.valueOf(Encoding.nr(inputStream, Encoding.n(dexProfileData.Uo * 2)));
        int i2 = 0;
        while (true) {
            int i3 = dexProfileData.Uo;
            if (i2 >= i3) {
                return;
            }
            int iHI = HI(bitSetValueOf, i2, i3);
            if (iHI != 0) {
                Integer num = (Integer) dexProfileData.xMQ.get(Integer.valueOf(i2));
                if (num == null) {
                    num = 0;
                }
                dexProfileData.xMQ.put(Integer.valueOf(i2), Integer.valueOf(iHI | num.intValue()));
            }
            i2++;
        }
    }

    static DexProfileData[] aYN(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.rl)) {
            throw Encoding.t("Unsupported version");
        }
        int iMUb = Encoding.mUb(inputStream);
        byte[] bArrO = Encoding.O(inputStream, (int) Encoding.xMQ(inputStream), (int) Encoding.xMQ(inputStream));
        if (inputStream.read() > 0) {
            throw Encoding.t("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
        try {
            DexProfileData[] dexProfileDataArrViF = ViF(byteArrayInputStream, str, iMUb);
            byteArrayInputStream.close();
            return dexProfileDataArrViF;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void bzg(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArrRl = rl(dexProfileDataArr, ProfileVersion.rl);
        Encoding.r(outputStream, dexProfileDataArr.length);
        Encoding.az(outputStream, bArrRl);
    }

    static void e(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f40937n);
        outputStream.write(bArr);
    }

    private static void fD(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        int[] iArr = dexProfileData.KN;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            Encoding.ck(outputStream, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    private static void g(byte[] bArr, int i2, int i3, DexProfileData dexProfileData) {
        int iAz = az(i2, i3, dexProfileData.Uo);
        int i5 = iAz / 8;
        bArr[i5] = (byte) ((1 << (iAz % 8)) | bArr[i5]);
    }

    private static int gh(int i2) {
        return nY(i2 * 2) / 8;
    }

    static boolean iF(OutputStream outputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (Arrays.equals(bArr, ProfileVersion.f40945n)) {
            Xw(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.rl)) {
            bzg(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.nr)) {
            v(outputStream, dexProfileDataArr);
            return true;
        }
        if (Arrays.equals(bArr, ProfileVersion.f40946t)) {
            rV9(outputStream, dexProfileDataArr);
            return true;
        }
        if (!Arrays.equals(bArr, ProfileVersion.f40944O)) {
            return false;
        }
        wTp(outputStream, dexProfileDataArr);
        return true;
    }

    private static void jB(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E2(dexProfileDataArr));
        arrayList.add(t(dexProfileDataArr));
        arrayList.add(nr(dexProfileDataArr));
        long length2 = ((long) ProfileVersion.f40945n.length) + ((long) f40937n.length) + 4 + ((long) (arrayList.size() * 16));
        Encoding.Ik(outputStream, arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WritableFileSection writableFileSection = (WritableFileSection) arrayList.get(i2);
            Encoding.Ik(outputStream, writableFileSection.f40947n.rl());
            Encoding.Ik(outputStream, length2);
            if (writableFileSection.nr) {
                byte[] bArr = writableFileSection.f40948t;
                long length3 = bArr.length;
                byte[] bArrRl = Encoding.rl(bArr);
                arrayList2.add(bArrRl);
                Encoding.Ik(outputStream, bArrRl.length);
                Encoding.Ik(outputStream, length3);
                length = bArrRl.length;
            } else {
                arrayList2.add(writableFileSection.f40948t);
                Encoding.Ik(outputStream, writableFileSection.f40948t.length);
                Encoding.Ik(outputStream, 0L);
                length = writableFileSection.f40948t.length;
            }
            length2 += (long) length;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    private static int n(DexProfileData dexProfileData) {
        Iterator it = dexProfileData.xMQ.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    private static void nHg(OutputStream outputStream, int i2, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[qie(i2, dexProfileData.Uo)];
        for (Map.Entry entry : dexProfileData.xMQ.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i7 = (dexProfileData.Uo * i3) + iIntValue;
                        int i8 = i7 / 8;
                        bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
                    }
                    i3++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static WritableFileSection nr(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        for (int i3 = 0; i3 < dexProfileDataArr.length; i3++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i3];
                int iN = n(dexProfileData);
                byte[] bArrO = O(iN, dexProfileData);
                byte[] bArrJ2 = J2(dexProfileData);
                Encoding.ck(byteArrayOutputStream, i3);
                int length = bArrO.length + 2 + bArrJ2.length;
                Encoding.Ik(byteArrayOutputStream, length);
                Encoding.ck(byteArrayOutputStream, iN);
                byteArrayOutputStream.write(bArrO);
                byteArrayOutputStream.write(bArrJ2);
                i2 = i2 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.t("Expected size " + i2 + ", does not match actual size " + byteArray.length);
    }

    static DexProfileData[] o(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.J2)) {
            throw Encoding.t("Unsupported meta version");
        }
        int iMUb = Encoding.mUb(inputStream);
        byte[] bArrO = Encoding.O(inputStream, (int) Encoding.xMQ(inputStream), (int) Encoding.xMQ(inputStream));
        if (inputStream.read() > 0) {
            throw Encoding.t("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
        try {
            DexProfileData[] dexProfileDataArrZ = Z(byteArrayInputStream, iMUb, dexProfileDataArr);
            byteArrayInputStream.close();
            return dexProfileDataArrZ;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static int qie(int i2, int i3) {
        return nY(Integer.bitCount(i2 & (-2)) * i3) / 8;
    }

    static DexProfileData[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.J2)) {
            if (Arrays.equals(ProfileVersion.f40945n, bArr2)) {
                throw Encoding.t("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return o(inputStream, bArr, dexProfileDataArr);
        }
        if (Arrays.equals(bArr, ProfileVersion.Uo)) {
            return XQ(inputStream, bArr2, dexProfileDataArr);
        }
        throw Encoding.t("Unsupported meta version");
    }

    private static void rV9(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArrRl = rl(dexProfileDataArr, ProfileVersion.f40946t);
        Encoding.r(outputStream, dexProfileDataArr.length);
        Encoding.az(outputStream, bArrRl);
    }

    private static void s7N(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : dexProfileData.xMQ.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.ck(outputStream, iIntValue - i2);
                Encoding.ck(outputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    private static WritableFileSection t(DexProfileData[] dexProfileDataArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        for (int i3 = 0; i3 < dexProfileDataArr.length; i3++) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i3];
                Encoding.ck(byteArrayOutputStream, i3);
                Encoding.ck(byteArrayOutputStream, dexProfileData.f40924O);
                i2 = i2 + 4 + (dexProfileData.f40924O * 2);
                fD(byteArrayOutputStream, dexProfileData);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.t("Expected size " + i2 + ", does not match actual size " + byteArray.length);
    }

    private static int[] ty(InputStream inputStream, int i2) {
        int[] iArr = new int[i2];
        int iKN = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iKN += Encoding.KN(inputStream);
            iArr[i3] = iKN;
        }
        return iArr;
    }

    private static void Ik(InputStream inputStream, DexProfileData dexProfileData) {
        int iAvailable = inputStream.available() - dexProfileData.J2;
        int iKN = 0;
        while (inputStream.available() > iAvailable) {
            iKN += Encoding.KN(inputStream);
            dexProfileData.xMQ.put(Integer.valueOf(iKN), 1);
            for (int iKN2 = Encoding.KN(inputStream); iKN2 > 0; iKN2--) {
                te(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw Encoding.t("Read too much data during profile line parse");
        }
    }

    private static DexProfileData[] S(InputStream inputStream, byte[] bArr, int i2, DexProfileData[] dexProfileDataArr) {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 == dexProfileDataArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                Encoding.KN(inputStream);
                String strJ2 = Encoding.J2(inputStream, Encoding.KN(inputStream));
                long jXMQ = Encoding.xMQ(inputStream);
                int iKN = Encoding.KN(inputStream);
                DexProfileData dexProfileDataXMQ = xMQ(dexProfileDataArr, strJ2);
                if (dexProfileDataXMQ != null) {
                    dexProfileDataXMQ.nr = jXMQ;
                    int[] iArrTy = ty(inputStream, iKN);
                    if (Arrays.equals(bArr, ProfileVersion.f40944O)) {
                        dexProfileDataXMQ.f40924O = iKN;
                        dexProfileDataXMQ.KN = iArrTy;
                    }
                } else {
                    throw Encoding.t("Missing profile key: " + strJ2);
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.t("Mismatched number of dex files found in metadata");
    }

    private static void T(OutputStream outputStream, DexProfileData dexProfileData, String str) throws IOException {
        Encoding.ck(outputStream, Encoding.gh(str));
        Encoding.ck(outputStream, dexProfileData.f40924O);
        Encoding.Ik(outputStream, dexProfileData.J2);
        Encoding.Ik(outputStream, dexProfileData.f40926t);
        Encoding.Ik(outputStream, dexProfileData.Uo);
        Encoding.ty(outputStream, str);
    }

    private static void X(OutputStream outputStream, DexProfileData dexProfileData) throws IOException {
        s7N(outputStream, dexProfileData);
        fD(outputStream, dexProfileData);
        N(outputStream, dexProfileData);
    }

    static DexProfileData[] XQ(InputStream inputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        int iKN = Encoding.KN(inputStream);
        byte[] bArrO = Encoding.O(inputStream, (int) Encoding.xMQ(inputStream), (int) Encoding.xMQ(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrO);
            try {
                DexProfileData[] dexProfileDataArrS = S(byteArrayInputStream, bArr, iKN, dexProfileDataArr);
                byteArrayInputStream.close();
                return dexProfileDataArrS;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw Encoding.t("Content found after the end of file");
    }

    private static void Xw(OutputStream outputStream, DexProfileData[] dexProfileDataArr) throws IOException {
        jB(outputStream, dexProfileDataArr);
    }

    private static DexProfileData[] Z(InputStream inputStream, int i2, DexProfileData[] dexProfileDataArr) {
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 == dexProfileDataArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int iKN = Encoding.KN(inputStream);
                iArr[i3] = Encoding.KN(inputStream);
                strArr[i3] = Encoding.J2(inputStream, iKN);
            }
            for (int i5 = 0; i5 < i2; i5++) {
                DexProfileData dexProfileData = dexProfileDataArr[i5];
                if (dexProfileData.rl.equals(strArr[i5])) {
                    int i7 = iArr[i5];
                    dexProfileData.f40924O = i7;
                    dexProfileData.KN = ty(inputStream, i7);
                } else {
                    throw Encoding.t("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.t("Mismatched number of dex files found in metadata");
    }

    private static String mUb(String str, String str2, byte[] bArr) {
        String strN = ProfileVersion.n(bArr);
        if (str.length() <= 0) {
            return Uo(str2, strN);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + ProfileVersion.n(bArr) + str2;
        }
        return Uo(str2, strN);
    }

    private static void te(InputStream inputStream) {
        Encoding.KN(inputStream);
        int iMUb = Encoding.mUb(inputStream);
        if (iMUb != 6 && iMUb != 7) {
            while (iMUb > 0) {
                Encoding.mUb(inputStream);
                for (int iMUb2 = Encoding.mUb(inputStream); iMUb2 > 0; iMUb2--) {
                    Encoding.KN(inputStream);
                }
                iMUb--;
            }
        }
    }
}
