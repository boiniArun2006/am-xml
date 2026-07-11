package aO;

import java.util.concurrent.LinkedTransferQueue;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f12867n = new n();
    private static final LinkedTransferQueue rl = new LinkedTransferQueue();

    static {
        ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: aO.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.rl();
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rl() {
        while (true) {
            ((Runnable) rl.take()).run();
        }
    }

    public final LinkedTransferQueue t() {
        return rl;
    }

    private n() {
    }
}
