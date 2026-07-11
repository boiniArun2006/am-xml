package c8G;

import Pb7.Pl;
import Pb7.o;
import Pb7.qz;
import QmE.iF;
import QmE.j;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sqD.fuX;
import xAo.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f43544n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0586j f43543t = new C0586j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: c8G.j$j, reason: collision with other inner class name */
    public static final class C0586j {
        public /* synthetic */ C0586j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0586j() {
        }
    }

    static final class n implements Function1 {
        n() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((o) obj).J2());
        }

        public final Pl n(String hook) {
            Intrinsics.checkNotNullParameter(hook, "hook");
            j.this.rl.n(new j.Ln(hook, ot.j.rl(j.this.f43544n)));
            return qz.f7710n;
        }
    }

    public j(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f43544n = context;
        this.rl = eventLogger;
    }

    @Override // xAo.w6
    public void n(fuX registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        registry.rl("Links", "openAppStoreLink", new n());
    }
}
