package XoT;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final boolean n(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static final int rl(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }
}
