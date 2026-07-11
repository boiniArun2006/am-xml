package hrZ;

import android.content.Context;
import cA.I28;
import com.bendingspoons.spidersense.data.storageManager.internal.CompleteDebugEventDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface j extends AE.j, I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0961j f67998n = C0961j.f67999n;

    /* JADX INFO: renamed from: hrZ.j$j, reason: collision with other inner class name */
    public static final class C0961j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0961j f67999n = new C0961j();

        public final j n(Context context, Function0 timestampProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
            return new i1.I28(CompleteDebugEventDatabase.INSTANCE.n(context).p5(), 10000L, 1000L, timestampProvider);
        }

        private C0961j() {
        }
    }

    public static final class n {
        public static I28 n(j jVar) {
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type com.bendingspoons.spidersense.domain.internal.EventDeposit");
            return jVar;
        }

        public static AE.j rl(j jVar) {
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type com.bendingspoons.spidersense.domain.uploader.repository.EventRetriever");
            return jVar;
        }
    }

    I28 nr();

    AE.j rl();
}
