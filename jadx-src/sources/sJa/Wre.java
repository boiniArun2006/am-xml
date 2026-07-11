package sJa;

import kotlin.jvm.internal.Intrinsics;
import sJa.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73205n = j.f73206n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f73206n = new j();

        /* JADX INFO: renamed from: sJa.Wre$j$j, reason: collision with other inner class name */
        public static final class C1166j implements Wre {
            final /* synthetic */ Ml rl;

            C1166j(Ml ml) {
                this.rl = ml;
            }

            @Override // sJa.Wre
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public p5A.n n(q3M.n delayProvider, I28.j codeBlock) {
                Intrinsics.checkNotNullParameter(delayProvider, "delayProvider");
                Intrinsics.checkNotNullParameter(codeBlock, "codeBlock");
                return new p5A.n(delayProvider, this.rl, codeBlock);
            }
        }

        public final Wre n(Ml dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            return new C1166j(dispatcherProvider);
        }

        private j() {
        }
    }

    I28 n(q3M.n nVar, I28.j jVar);
}
