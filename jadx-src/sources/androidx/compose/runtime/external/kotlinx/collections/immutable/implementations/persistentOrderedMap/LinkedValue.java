package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "KN", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "newPrevious", "Uo", "newNext", "J2", c.f62177j, "Ljava/lang/Object;", "O", "()Ljava/lang/Object;", "rl", "nr", "t", "", "()Z", "hasNext", "hasPrevious", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkedValue<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object previous;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object next;

    public LinkedValue(Object obj, Object obj2, Object obj3) {
        this.value = obj;
        this.previous = obj2;
        this.next = obj3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkedValue(Object obj) {
        EndOfChain endOfChain = EndOfChain.f30683n;
        this(obj, endOfChain, endOfChain);
    }

    public final LinkedValue J2(Object newNext) {
        return new LinkedValue(this.value, this.previous, newNext);
    }

    public final LinkedValue KN(Object newValue) {
        return new LinkedValue(newValue, this.previous, this.next);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final LinkedValue Uo(Object newPrevious) {
        return new LinkedValue(this.value, newPrevious, this.next);
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

    public LinkedValue(Object obj, Object obj2) {
        this(obj, obj2, EndOfChain.f30683n);
    }
}
