package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010 \u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "", "offset", "<init>", "(Landroidx/compose/runtime/Applier;I)V", "node", "", "KN", "(Ljava/lang/Object;)V", "gh", "()V", "index", "instance", "O", "(ILjava/lang/Object;)V", "Uo", JavetError.PARAMETER_COUNT, c.f62177j, "(II)V", "from", "to", "t", "(III)V", "clear", "Landroidx/compose/runtime/Applier;", "rl", "I", "nesting", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4643#2,5:290\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,5\n*E\n"})
public final class OffsetApplier<N> implements Applier<N> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Applier applier;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int offset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    @Override // androidx.compose.runtime.Applier
    public void KN(Object node) {
        this.nesting++;
        this.applier.KN(node);
    }

    @Override // androidx.compose.runtime.Applier
    public void O(int index, Object instance) {
        this.applier.O(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void Uo(int index, Object instance) {
        this.applier.Uo(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.Z("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void gh() {
        if (!(this.nesting > 0)) {
            ComposerKt.Z("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.gh();
    }

    @Override // androidx.compose.runtime.Applier
    public void n(int index, int count) {
        this.applier.n(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: rl */
    public Object getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void t(int from, int to, int count) {
        int i2 = this.nesting == 0 ? this.offset : 0;
        this.applier.t(from + i2, to + i2, count);
    }

    public OffsetApplier(Applier applier, int i2) {
        this.applier = applier;
        this.offset = i2;
    }
}
