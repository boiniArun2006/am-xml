package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "O", "[Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "J2", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "trieIterator", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TrieIterator trieIterator;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    public PersistentVectorIterator(Object[] objArr, Object[] objArr2, int i2, int i3, int i5) {
        super(i2, i3);
        this.tail = objArr2;
        int iNr = UtilsKt.nr(i3);
        this.trieIterator = new TrieIterator(objArr, RangesKt.coerceAtMost(i2, iNr), iNr, i5);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public Object next() {
        t();
        if (this.trieIterator.hasNext()) {
            KN(getIndex() + 1);
            return this.trieIterator.next();
        }
        Object[] objArr = this.tail;
        int index = getIndex();
        KN(index + 1);
        return objArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        O();
        if (getIndex() > this.trieIterator.getSize()) {
            Object[] objArr = this.tail;
            KN(getIndex() - 1);
            return objArr[getIndex() - this.trieIterator.getSize()];
        }
        KN(getIndex() - 1);
        return this.trieIterator.previous();
    }
}
