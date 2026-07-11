package six;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MutableState f73285n;
    private final MutableState rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final State f73286t;

    public static final class j extends I28 {
        private final List nr;

        /* JADX WARN: Illegal instructions before constructor call */
        public j() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker);
            int size = CN3.rl().size();
            ArrayList arrayList = new ArrayList(size);
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new LazyListState(i2, i2, 3, defaultConstructorMarker));
            }
            this.nr = arrayList;
        }

        public final List gh() {
            return this.nr;
        }
    }

    public static final class n extends I28 {
        private final LazyListState nr;

        /* JADX WARN: Illegal instructions before constructor call */
        public n() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(defaultConstructorMarker);
            int i2 = 0;
            this.nr = new LazyListState(i2, i2, 3, defaultConstructorMarker);
        }

        public final LazyListState gh() {
            return this.nr;
        }
    }

    public /* synthetic */ I28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I28() {
        this.f73285n = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.rl = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.f73286t = SnapshotStateKt.O(new Function0() { // from class: six.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(I28.J2(this.f73287n));
            }
        });
    }

    public final void mUb(boolean z2) {
        this.f73285n.setValue(Boolean.valueOf(z2));
    }

    public final boolean nr() {
        return ((Boolean) this.f73285n.getValue()).booleanValue();
    }

    public final boolean rl() {
        return ((Boolean) this.f73286t.getValue()).booleanValue();
    }

    public final Integer t() {
        return (Integer) this.rl.getValue();
    }

    public final void xMQ(Integer num) {
        this.rl.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J2(I28 i28) {
        if (!i28.nr() && i28.t() == null) {
            return true;
        }
        return false;
    }

    public final void KN() {
        mUb(!nr());
    }

    public final void O() {
        if (nr()) {
            mUb(false);
        }
    }

    public final void Uo(Integer num) {
        O();
        if (t() != null) {
            num = null;
        }
        xMQ(num);
    }
}
