package Pr;

import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import java.util.List;
import kHp.Wre;
import kHp.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7853n = j.f7854n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f7854n = new j();

        public final w6 n(Context context, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return new o(Wre.f69813n.n(context, spiderSense));
        }

        private j() {
        }
    }

    Object J2(String str, boolean z2, Continuation continuation);

    List KN();

    Object O(Continuation continuation);

    Object Uo(Continuation continuation);

    Object n(Continuation continuation);

    Object nr(Tracker tracker, Continuation continuation);

    Object rl(boolean z2, Continuation continuation);

    Object t(Continuation continuation);
}
