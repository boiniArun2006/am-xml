package kHp;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f69813n = j.f69814n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f69814n = new j();

        public final Wre n(Context context, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return new CN3(new I28(Dsr.nr(context)), spiderSense);
        }

        private j() {
        }
    }

    Object J2(int i2, Continuation continuation);

    Object O(Map map, Continuation continuation);

    Object Uo(Continuation continuation);

    Object n(Continuation continuation);

    Object nr(Map map, int i2, Continuation continuation);

    Object rl(Continuation continuation);

    Object t(Continuation continuation);
}
