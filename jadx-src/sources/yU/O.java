package yU;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class O {

    public static final class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f75618n;

        j(Function2 function2) {
            this.f75618n = function2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f75618n.invoke(this, this);
        }
    }

    public static final int n(int i2) {
        int i3 = i2 - 1;
        int i5 = i3 | (i3 >> 1);
        int i7 = i5 | (i5 >> 2);
        int i8 = i7 | (i7 >> 4);
        int i9 = i8 | (i8 >> 8);
        return (i9 | (i9 >> 16)) + 1;
    }

    public static final Runnable rl(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return new j(body);
    }
}
