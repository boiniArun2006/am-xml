package FQq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum nKK {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean rl(int i2, boolean z2, int i3) {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if ((!z2 || i2 >= 28) && i3 <= 4 && i2 > 25) {
            return false;
        }
        return true;
    }
}
