package Du;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class oXP {
    public abstract Object n();

    public abstract int nr();

    public abstract void rl(int i2);

    public static /* synthetic */ void t(oXP oxp, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i3 & 1) != 0) {
            i2 = oxp.nr() + 1;
        }
        oxp.rl(i2);
    }
}
