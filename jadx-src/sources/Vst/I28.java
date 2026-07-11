package Vst;

import pUk.C;
import wqP.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 implements Comparable {
    public abstract C J2();

    public abstract int Uo();

    public abstract byte[] nr();

    public abstract byte[] t();

    public static I28 rl(int i2, C c2, byte[] bArr, byte[] bArr2) {
        return new j(i2, c2, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(I28 i28) {
        int iCompare = Integer.compare(Uo(), i28.Uo());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = J2().compareTo(i28.J2());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iKN = Z.KN(t(), i28.t());
        if (iKN != 0) {
            return iKN;
        }
        return Z.KN(nr(), i28.nr());
    }
}
