package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "startLevel", "", "gh", "(II)V", "indexPredicate", "qie", "(I)V", "mUb", "()Ljava/lang/Object;", "az", "next", "previous", "O", "I", "J2", "[Ljava/lang/Object;", JavetError.PARAMETER_PATH, "", "r", "Z", "isInRightEdge", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrieIterator<E> extends AbstractListIterator<E> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Object[] path;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isInRightEdge;

    private final void qie(int indexPredicate) {
        int i2 = 0;
        while (UtilsKt.n(getIndex(), i2) == indexPredicate) {
            i2 += 5;
        }
        if (i2 > 0) {
            gh(getIndex(), ((this.height - 1) - (i2 / 5)) + 1);
        }
    }

    private final void gh(int index, int startLevel) {
        int i2 = (this.height - startLevel) * 5;
        while (startLevel < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[startLevel - 1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[startLevel] = ((Object[]) obj)[UtilsKt.n(index, i2)];
            i2 -= 5;
            startLevel++;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i2, int i3, int i5) {
        ?? r52;
        super(i2, i3);
        this.height = i5;
        Object[] objArr2 = new Object[i5];
        this.path = objArr2;
        if (i2 == i3) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.isInRightEdge = r52;
        objArr2[0] = objArr;
        gh(i2 - r52, 1);
    }

    private final Object mUb() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[index];
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void az(Object[] root, int index, int size, int height) {
        KN(index);
        xMQ(size);
        this.height = height;
        if (this.path.length < height) {
            this.path = new Object[height];
        }
        ?? r02 = 0;
        this.path[0] = root;
        if (index == size) {
            r02 = 1;
        }
        this.isInRightEdge = r02;
        gh(index - r02, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object objMUb = mUb();
            KN(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return objMUb;
            }
            qie(0);
            return objMUb;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (hasPrevious()) {
            KN(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
                return mUb();
            }
            qie(31);
            return mUb();
        }
        throw new NoSuchElementException();
    }
}
