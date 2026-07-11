package zk;

import CZF.I28;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rB.Ml;
import sqD.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1305j f76717n = new C1305j(null);

    /* JADX INFO: renamed from: zk.j$j, reason: collision with other inner class name */
    public static final class C1305j {
        public /* synthetic */ C1305j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1305j() {
        }

        public final List n(c8G.j linksProvider) {
            Intrinsics.checkNotNullParameter(linksProvider, "linksProvider");
            return CollectionsKt.listOf(linksProvider);
        }

        public final sqD.n rl(Context context, Wre factory, Ml spiderSense, I28 pico) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(pico, "pico");
            return sqD.n.f73321n.t(context, factory, pico, spiderSense);
        }
    }
}
