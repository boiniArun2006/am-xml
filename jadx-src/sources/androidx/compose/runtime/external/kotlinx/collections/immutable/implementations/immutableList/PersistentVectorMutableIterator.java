package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", "index", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "", "qie", "()V", "az", "mUb", "gh", "previous", "()Ljava/lang/Object;", "next", "element", l.f62657l, "(Ljava/lang/Object;)V", "remove", "set", "O", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "J2", "I", "expectedModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "r", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "trieIterator", "o", "lastIteratedIndex", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final PersistentVectorBuilder builder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private TrieIterator trieIterator;

    private final void az() {
        Object[] objArrUo = this.builder.getRoot();
        if (objArrUo == null) {
            this.trieIterator = null;
            return;
        }
        int iNr = UtilsKt.nr(this.builder.size());
        int iCoerceAtMost = RangesKt.coerceAtMost(getIndex(), iNr);
        int iKN = (this.builder.getRootShift() / 5) + 1;
        TrieIterator trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator(objArrUo, iCoerceAtMost, iNr, iKN);
        } else {
            Intrinsics.checkNotNull(trieIterator);
            trieIterator.az(objArrUo, iCoerceAtMost, iNr, iKN);
        }
    }

    private final void gh() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void mUb() {
        if (this.expectedModCount != this.builder.J2()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void qie() {
        xMQ(this.builder.size());
        this.expectedModCount = this.builder.J2();
        this.lastIteratedIndex = -1;
        az();
    }

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i2) {
        super(i2, persistentVectorBuilder.size());
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.J2();
        this.lastIteratedIndex = -1;
        az();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(Object element) {
        mUb();
        this.builder.add(getIndex(), element);
        KN(getIndex() + 1);
        qie();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public Object next() {
        mUb();
        t();
        this.lastIteratedIndex = getIndex();
        TrieIterator trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] objArrXMQ = this.builder.getTail();
            int index = getIndex();
            KN(index + 1);
            return objArrXMQ[index];
        }
        if (trieIterator.hasNext()) {
            KN(getIndex() + 1);
            return trieIterator.next();
        }
        Object[] objArrXMQ2 = this.builder.getTail();
        int index2 = getIndex();
        KN(index2 + 1);
        return objArrXMQ2[index2 - trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        mUb();
        O();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] objArrXMQ = this.builder.getTail();
            KN(getIndex() - 1);
            return objArrXMQ[getIndex()];
        }
        if (getIndex() > trieIterator.getSize()) {
            Object[] objArrXMQ2 = this.builder.getTail();
            KN(getIndex() - 1);
            return objArrXMQ2[getIndex() - trieIterator.getSize()];
        }
        KN(getIndex() - 1);
        return trieIterator.previous();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        mUb();
        gh();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            KN(this.lastIteratedIndex);
        }
        qie();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(Object element) {
        mUb();
        gh();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.J2();
        az();
    }
}
