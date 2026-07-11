package QVk;

import Hr.CQ.USEaHtCMH;
import QVk.n;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Ml extends QVk.j {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f8183O = new ArrayList(2);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final synchronized void M7(n listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8183O.add(listener);
    }

    public final synchronized void p5(n listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8183O.remove(listener);
    }

    @Override // QVk.j, QVk.n
    public void T(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).T(id);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // QVk.j, QVk.n
    public void Uo(String id, n.j jVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).Uo(id, jVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // QVk.j, QVk.n
    public void Z(String id, Object obj, n.j jVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).Z(id, obj, jVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // QVk.j, QVk.n
    public void jB(String id, Object obj, n.j jVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).jB(id, obj, jVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", USEaHtCMH.MWSgAvVutRjCAF + "onSubmit", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // QVk.j, QVk.n
    public void n(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).n(id, obj);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // QVk.j, QVk.n
    public void rl(String id, Throwable th, n.j jVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        int size = this.f8183O.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((n) this.f8183O.get(i2)).rl(id, th, jVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e2);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
