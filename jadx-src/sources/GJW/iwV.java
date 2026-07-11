package GJW;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface iwV extends CoroutineContext.Element {
    public static final j rl = j.f3491n;

    void a(CoroutineContext coroutineContext, Throwable th);

    public static final class j implements CoroutineContext.Key {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f3491n = new j();

        private j() {
        }
    }
}
