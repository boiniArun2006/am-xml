package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.V8ValueError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0017\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "KN", "gh", "()V", "clear", "az", c.f62177j, "Ljava/lang/Object;", "qie", "()Ljava/lang/Object;", "Landroidx/compose/runtime/Stack;", "rl", "Ljava/util/ArrayList;", V8ValueError.STACK, "<set-?>", "t", "ty", "current", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractApplier<T> implements Applier<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object root;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ArrayList stack = Stack.t(null, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object current;

    protected abstract void az();

    @Override // androidx.compose.runtime.Applier
    public void KN(Object node) {
        Stack.qie(this.stack, getCurrent());
        ty(node);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.n(this.stack);
        ty(this.root);
        az();
    }

    @Override // androidx.compose.runtime.Applier
    public void gh() {
        ty(Stack.gh(this.stack));
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final Object getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Object getCurrent() {
        return this.current;
    }

    protected void ty(Object obj) {
        this.current = obj;
    }

    public AbstractApplier(Object obj) {
        this.root = obj;
        this.current = obj;
    }
}
