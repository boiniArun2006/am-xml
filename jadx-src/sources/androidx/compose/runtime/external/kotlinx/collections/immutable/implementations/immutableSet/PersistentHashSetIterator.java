package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0012R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u0010!\u0012\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "", "pathIndex", "Uo", "(I)I", "", "O", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "t", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", c.f62177j, "Ljava/util/List;", "J2", "()Ljava/util/List;", JavetError.PARAMETER_PATH, "I", "getPathLastIndex", "()I", "KN", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List path;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final void O() {
        if (((TrieNodeIterator) this.path.get(this.pathLastIndex)).nr()) {
            return;
        }
        for (int i2 = this.pathLastIndex; -1 < i2; i2--) {
            int iUo = Uo(i2);
            if (iUo == -1 && ((TrieNodeIterator) this.path.get(i2)).t()) {
                ((TrieNodeIterator) this.path.get(i2)).J2();
                iUo = Uo(i2);
            }
            if (iUo != -1) {
                this.pathLastIndex = iUo;
                return;
            }
            if (i2 > 0) {
                ((TrieNodeIterator) this.path.get(i2 - 1)).J2();
            }
            ((TrieNodeIterator) this.path.get(i2)).KN(TrieNode.INSTANCE.n().getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), 0);
        }
        this.hasNext = false;
    }

    private final int Uo(int pathIndex) {
        if (((TrieNodeIterator) this.path.get(pathIndex)).nr()) {
            return pathIndex;
        }
        if (!((TrieNodeIterator) this.path.get(pathIndex)).O()) {
            return -1;
        }
        TrieNode trieNodeRl = ((TrieNodeIterator) this.path.get(pathIndex)).rl();
        int i2 = pathIndex + 1;
        if (i2 == this.path.size()) {
            this.path.add(new TrieNodeIterator());
        }
        TrieNodeIterator.xMQ((TrieNodeIterator) this.path.get(i2), trieNodeRl.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), 0, 2, null);
        return Uo(i2);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    protected final List getPath() {
        return this.path;
    }

    protected final void KN(int i2) {
        this.pathLastIndex = i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        Object objUo = ((TrieNodeIterator) this.path.get(this.pathLastIndex)).Uo();
        O();
        return objUo;
    }

    public PersistentHashSetIterator(TrieNode trieNode) {
        List listMutableListOf = CollectionsKt.mutableListOf(new TrieNodeIterator());
        this.path = listMutableListOf;
        this.hasNext = true;
        TrieNodeIterator.xMQ((TrieNodeIterator) listMutableListOf.get(0), trieNode.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), 0, 2, null);
        this.pathLastIndex = 0;
        O();
    }

    protected final Object t() {
        CommonFunctionsKt.n(hasNext());
        return ((TrieNodeIterator) this.path.get(this.pathLastIndex)).n();
    }
}
