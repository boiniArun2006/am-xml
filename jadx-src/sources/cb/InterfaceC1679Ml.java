package cb;

import HX.Dsr;
import android.content.Context;
import bV.I28;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cb.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface InterfaceC1679Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43655n = j.f43656n;

    /* JADX INFO: renamed from: cb.Ml$j */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f43656n = new j();

        public final InterfaceC1679Ml n(Context context, Map mockedIds) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
            return new I28(Dsr.f3907n.t(context, mockedIds), Fqb.n.f3221n.n(context), sJa.w6.rl);
        }

        private j() {
        }
    }

    Object O(Id.Predefined.Internal.j jVar, Continuation continuation);

    Object n(Continuation continuation);

    Object nr(Continuation continuation);

    Object rl(Continuation continuation);
}
