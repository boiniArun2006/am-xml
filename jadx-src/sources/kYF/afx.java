package kYF;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final afx f69939n = new afx();
    private static Function0 rl = j.f69940n;

    /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f69940n = new j();

        j() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final long n() {
        return ((Number) rl.invoke()).longValue();
    }

    private afx() {
    }
}
