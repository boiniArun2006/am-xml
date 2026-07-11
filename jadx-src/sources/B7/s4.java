package B7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface s4 extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f273n = j.f274n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f274n = new j();
        private static final int rl = as.j.f43098n.rl();

        public final int n() {
            return rl;
        }

        private j() {
        }
    }

    void flush();

    void pause();

    void play();

    void release();

    void stop();

    Object t(as.n nVar, Continuation continuation);
}
