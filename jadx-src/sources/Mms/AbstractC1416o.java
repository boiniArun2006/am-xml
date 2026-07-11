package Mms;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Mms.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1416o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f6733n = new ArrayDeque();
    private int rl;

    protected final char[] rl(int i2) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f6733n.removeLastOrNull();
            if (cArr != null) {
                this.rl -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i2] : cArr;
    }

    protected final void n(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.rl + array.length < aC.f6719n) {
                    this.rl += array.length;
                    this.f6733n.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
