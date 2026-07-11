package androidx.compose.runtime.snapshots;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001dR*\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\u001a\u0012\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u001dR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "set", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "", "t", "()V", "O", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", c.f62177j, "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "Ljava/lang/Object;", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "current", "J2", "getNext", "setNext", "getNext$annotations", "", "r", "I", "getModification", "()I", "setModification", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n258#1,2:269\n1#2:271\n1#2:272\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n*L\n241#1:269,2\n241#1:271\n*E\n"})
final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Object next;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Object current;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateSet set;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Iterator iterator;

    private final void O() {
        if (this.set.O() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    private final void t() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    public StateSetIterator(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = snapshotStateSet.O();
        t();
    }

    @Override // java.util.Iterator
    public Object next() {
        O();
        t();
        Object obj = this.current;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        O();
        Object obj = this.current;
        if (obj != null) {
            this.set.remove(obj);
            this.current = null;
            Unit unit = Unit.INSTANCE;
            this.modification = this.set.O();
            return;
        }
        throw new IllegalStateException();
    }
}
