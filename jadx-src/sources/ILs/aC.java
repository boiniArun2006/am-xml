package ILs;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {
    public static final CN3 n(int i2, j jVar, Function1 function1) {
        if (i2 == -2) {
            return jVar == j.f4185n ? new I28(CN3.Uo.n(), function1) : new z(1, jVar, function1);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? jVar == j.f4185n ? new I28(i2, function1) : new z(i2, jVar, function1) : new I28(Integer.MAX_VALUE, function1) : jVar == j.f4185n ? new I28(0, function1) : new z(1, jVar, function1);
        }
        if (jVar == j.f4185n) {
            return new z(1, j.f4187t, function1);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ CN3 rl(int i2, j jVar, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            jVar = j.f4185n;
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        return n(i2, jVar, function1);
    }
}
