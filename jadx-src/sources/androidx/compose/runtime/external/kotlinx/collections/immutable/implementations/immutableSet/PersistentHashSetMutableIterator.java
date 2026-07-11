package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "", "hashCode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "element", "pathIndex", "", "qie", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "", "gh", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "mUb", "()V", "xMQ", "next", "()Ljava/lang/Object;", "remove", "J2", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "r", "Ljava/lang/Object;", "lastIteratedElement", "o", "Z", "nextWasInvoked", "I", "expectedModCount", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final PersistentHashSetBuilder builder;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean nextWasInvoked;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Object lastIteratedElement;

    private final void mUb() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void xMQ() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount();
    }

    private final boolean gh(TrieNode node) {
        if (node.getBitmap() == 0) {
            return true;
        }
        return false;
    }

    private final void qie(int hashCode, TrieNode node, Object element, int pathIndex) {
        boolean z2 = true;
        if (gh(node)) {
            int iIndexOf = ArraysKt.indexOf(node.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), element);
            if (iIndexOf == -1) {
                z2 = false;
            }
            CommonFunctionsKt.n(z2);
            ((TrieNodeIterator) getPath().get(pathIndex)).KN(node.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), iIndexOf);
            KN(pathIndex);
            return;
        }
        int iCk = node.ck(1 << TrieNodeKt.nr(hashCode, pathIndex * 5));
        ((TrieNodeIterator) getPath().get(pathIndex)).KN(node.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), iCk);
        Object obj = node.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String()[iCk];
        if (obj instanceof TrieNode) {
            qie(hashCode, (TrieNode) obj, element, pathIndex + 1);
        } else {
            KN(pathIndex);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public Object next() {
        xMQ();
        Object next = super.next();
        this.lastIteratedElement = next;
        this.nextWasInvoked = true;
        return next;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        int iHashCode;
        mUb();
        if (getHasNext()) {
            Object objT = t();
            TypeIntrinsics.asMutableCollection(this.builder).remove(this.lastIteratedElement);
            if (objT != null) {
                iHashCode = objT.hashCode();
            } else {
                iHashCode = 0;
            }
            qie(iHashCode, this.builder.getNode(), objT, 0);
        } else {
            TypeIntrinsics.asMutableCollection(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
