package U5u;

import CuC.n;
import TFv.Wre;
import kotlin.jvm.internal.Intrinsics;
import rB.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0378j f10608n = C0378j.f10609n;

    /* JADX INFO: renamed from: U5u.j$j, reason: collision with other inner class name */
    public static final class C0378j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ C0378j f10609n = new C0378j();

        public final j n(Wre backendRawResponseFlow, HF.j settingsDeserializer, Ml ml) {
            Intrinsics.checkNotNullParameter(backendRawResponseFlow, "backendRawResponseFlow");
            Intrinsics.checkNotNullParameter(settingsDeserializer, "settingsDeserializer");
            return new n(backendRawResponseFlow, settingsDeserializer, ml);
        }

        private C0378j() {
        }
    }

    Wre n();
}
