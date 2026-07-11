package vn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {
    public static int rl(Object obj, Object obj2) {
        return n(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    public static int n(int i2, int i3) {
        return ((i2 + 31) * 31) + i3;
    }
}
