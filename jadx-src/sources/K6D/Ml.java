package K6D;

import K6D.Ml;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4830n = j.f4831n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f4831n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Log.e(LHbnkhI.PXWWliX, it);
            return Unit.INSTANCE;
        }

        public final Ml O(Function1 track, WD.Ml failableOperationInMemoryStorage) {
            Intrinsics.checkNotNullParameter(track, "track");
            Intrinsics.checkNotNullParameter(failableOperationInMemoryStorage, "failableOperationInMemoryStorage");
            return new WD.j(failableOperationInMemoryStorage, track, new Function0() { // from class: K6D.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Double.valueOf(Ml.j.t());
                }
            }, new Function1() { // from class: K6D.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ml.j.nr((String) obj);
                }
            });
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double t() {
            return q3M.j.n();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n {
        public static /* synthetic */ void n(Ml ml, ajd.j jVar, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(YjqZUJsVmhcjko.KcpFaen);
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            ml.O(jVar, str);
        }

        public static /* synthetic */ K6D.j nr(Ml ml, ajd.j jVar, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackStarted");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return ml.rl(jVar, str);
        }

        public static /* synthetic */ void rl(Ml ml, ajd.j jVar, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackCompleted");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            ml.t(jVar, str);
        }

        public static /* synthetic */ void t(Ml ml, ajd.j jVar, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackFailed");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            ml.nr(jVar, str);
        }
    }

    void O(ajd.j jVar, String str);

    WD.Ml n();

    void nr(ajd.j jVar, String str);

    K6D.j rl(ajd.j jVar, String str);

    void t(ajd.j jVar, String str);
}
