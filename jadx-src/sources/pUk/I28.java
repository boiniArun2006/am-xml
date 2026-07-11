package pUk;

import java.util.ArrayList;
import java.util.List;
import wqP.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f71991n;

    abstract I28 Uo(List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I28) && compareTo((I28) obj) == 0;
    }

    public abstract String t();

    private static boolean qie(String str) {
        return str.startsWith("__id") && str.endsWith("__");
    }

    public I28 ck() {
        return Uo(this.f71991n.subList(0, ty() - 1));
    }

    public String mUb(int i2) {
        return (String) this.f71991n.get(i2);
    }

    public I28 n(String str) {
        ArrayList arrayList = new ArrayList(this.f71991n);
        arrayList.add(str);
        return Uo(arrayList);
    }

    public I28 rl(I28 i28) {
        ArrayList arrayList = new ArrayList(this.f71991n);
        arrayList.addAll(i28.f71991n);
        return Uo(arrayList);
    }

    public int ty() {
        return this.f71991n.size();
    }

    public String xMQ() {
        return (String) this.f71991n.get(ty() - 1);
    }

    I28(List list) {
        this.f71991n = list;
    }

    private static long KN(String str) {
        return Long.parseLong(str.substring(4, str.length() - 2));
    }

    private static int nr(String str, String str2) {
        boolean zQie = qie(str);
        boolean zQie2 = qie(str2);
        if (zQie && !zQie2) {
            return -1;
        }
        if (!zQie && zQie2) {
            return 1;
        }
        if (zQie && zQie2) {
            return Long.compare(KN(str), KN(str2));
        }
        return Z.ty(str, str2);
    }

    public I28 HI(int i2) {
        boolean z2;
        int iTy = ty();
        if (iTy >= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i2), Integer.valueOf(iTy));
        return Uo(this.f71991n.subList(i2, iTy));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public int compareTo(I28 i28) {
        int iTy = ty();
        int iTy2 = i28.ty();
        for (int i2 = 0; i2 < iTy && i2 < iTy2; i2++) {
            int iNr = nr(mUb(i2), i28.mUb(i2));
            if (iNr != 0) {
                return iNr;
            }
        }
        return Z.gh(iTy, iTy2);
    }

    public boolean az(I28 i28) {
        if (ty() > i28.ty()) {
            return false;
        }
        for (int i2 = 0; i2 < ty(); i2++) {
            if (!mUb(i2).equals(i28.mUb(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean gh() {
        if (ty() == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f71991n.hashCode();
    }

    public String toString() {
        return t();
    }
}
