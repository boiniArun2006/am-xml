package f0P;

import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class F8 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorOf f64191n;
    private final oA.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f64192t;

    public F8(AnimatorOf animatorOf, oA.j lens, Set tabIds) {
        Intrinsics.checkNotNullParameter(animatorOf, "animatorOf");
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(tabIds, "tabIds");
        this.f64191n = animatorOf;
        this.rl = lens;
        this.f64192t = tabIds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F8)) {
            return false;
        }
        F8 f8 = (F8) obj;
        return this.f64191n == f8.f64191n && Intrinsics.areEqual(this.rl, f8.rl) && Intrinsics.areEqual(this.f64192t, f8.f64192t);
    }

    public int hashCode() {
        return (((this.f64191n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f64192t.hashCode();
    }

    public final AnimatorOf n() {
        return this.f64191n;
    }

    public final oA.j rl() {
        return this.rl;
    }

    public final Set t() {
        return this.f64192t;
    }

    public String toString() {
        return "KeyableSetting(animatorOf=" + this.f64191n + ", lens=" + this.rl + ", tabIds=" + this.f64192t + ")";
    }

    public /* synthetic */ F8(AnimatorOf animatorOf, oA.j jVar, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(animatorOf, jVar, (i2 & 4) != 0 ? SetsKt.emptySet() : set);
    }
}
