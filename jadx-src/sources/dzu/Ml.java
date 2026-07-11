package dzu;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {
    public static final Object n(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final void rl(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
    }
}
