package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "O", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "newPrevious", "J2", c.f62177j, "Ljava/lang/Object;", "nr", "()Ljava/lang/Object;", "rl", "t", "", "()Z", "hasNext", "hasPrevious", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Links {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object previous;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object next;

    public Links(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Links() {
        EndOfChain endOfChain = EndOfChain.f30683n;
        this(endOfChain, endOfChain);
    }

    public final Links J2(Object newPrevious) {
        return new Links(newPrevious, this.next);
    }

    public final Links O(Object newNext) {
        return new Links(this.previous, newNext);
    }

    public final boolean n() {
        return this.next != EndOfChain.f30683n;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Object getPrevious() {
        return this.previous;
    }

    public final boolean rl() {
        return this.previous != EndOfChain.f30683n;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    public Links(Object obj) {
        this(obj, EndOfChain.f30683n);
    }
}
