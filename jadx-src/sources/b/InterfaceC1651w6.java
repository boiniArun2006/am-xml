package b;

import La.Ml;
import b.InterfaceC1651w6;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import q3M.I28;

/* JADX INFO: renamed from: b.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface InterfaceC1651w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43133n = j.f43134n;

    /* JADX INFO: renamed from: b.w6$j */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43134n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final double O() {
            return new Date().getTime() / 1000.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double nr() {
            return new Date().getTime() / 1000.0d;
        }

        public final InterfaceC1651w6 t(ao3.n picoEventRetriever, Ml.n.InterfaceC0214n.AbstractC0215n uploadMode, Ml.n.InterfaceC0214n.j clientIdentifiers, Ml.n.j backendConfig, rB.Ml spiderSense, OkHttpClient okHttpClient, v8.j localLogger) {
            Intrinsics.checkNotNullParameter(picoEventRetriever, "picoEventRetriever");
            Intrinsics.checkNotNullParameter(uploadMode, "uploadMode");
            Intrinsics.checkNotNullParameter(clientIdentifiers, "clientIdentifiers");
            Intrinsics.checkNotNullParameter(backendConfig, "backendConfig");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(localLogger, "localLogger");
            PMG.n nVarRl = PMG.n.f7696n.rl(clientIdentifiers, backendConfig, spiderSense, okHttpClient, localLogger);
            if (uploadMode instanceof Ml.n.InterfaceC0214n.AbstractC0215n.j) {
                Ml.n.InterfaceC0214n.AbstractC0215n.j jVar = (Ml.n.InterfaceC0214n.AbstractC0215n.j) uploadMode;
                return new kk.j(picoEventRetriever, jT.j.f69447n.n(), nVarRl, InterfaceC1648Ml.f43127n.n(jVar.n(), jVar.rl()), new Function0() { // from class: b.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(InterfaceC1651w6.j.nr());
                    }
                }, sJa.w6.rl);
            }
            if (uploadMode instanceof Ml.n.InterfaceC0214n.AbstractC0215n.C0216n) {
                return new kk.w6(picoEventRetriever, jT.j.f69447n.n(), nVarRl, I28.n(q3M.n.rl, ((Ml.n.InterfaceC0214n.AbstractC0215n.C0216n) uploadMode).n()), new Function0() { // from class: b.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(InterfaceC1651w6.j.O());
                    }
                }, sJa.w6.rl);
            }
            throw new NoWhenBranchMatchedException();
        }

        private j() {
        }
    }

    void n();
}
