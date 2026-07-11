package sJa;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73207n = j.f73208n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f73208n = new j();

        /* JADX INFO: renamed from: sJa.n$j$j, reason: collision with other inner class name */
        public static final class C1167j implements n {
            final /* synthetic */ Ml rl;

            C1167j(Ml ml) {
                this.rl = ml;
            }

            @Override // sJa.n
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public p5A.j n(Function2 processingBlock) {
                Intrinsics.checkNotNullParameter(processingBlock, "processingBlock");
                return new p5A.j(processingBlock, this.rl);
            }
        }

        public final n n(Ml dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            return new C1167j(dispatcherProvider);
        }

        private j() {
        }
    }

    sJa.j n(Function2 function2);
}
