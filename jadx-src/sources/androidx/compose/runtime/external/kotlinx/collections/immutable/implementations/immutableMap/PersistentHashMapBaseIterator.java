package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0014\u0010$\u0012\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", JavetError.PARAMETER_PATH, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "", "pathIndex", "KN", "(I)I", "", "J2", "()V", "t", "O", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", c.f62177j, "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "Uo", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "I", "getPathLastIndex", "()I", "xMQ", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TrieNodeBaseIterator[] path;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final void J2() {
        if (this.path[this.pathLastIndex].KN()) {
            return;
        }
        for (int i2 = this.pathLastIndex; -1 < i2; i2--) {
            int iKN = KN(i2);
            if (iKN == -1 && this.path[i2].xMQ()) {
                this.path[i2].gh();
                iKN = KN(i2);
            }
            if (iKN != -1) {
                this.pathLastIndex = iKN;
                return;
            }
            if (i2 > 0) {
                this.path[i2 - 1].gh();
            }
            this.path[i2].qie(TrieNode.INSTANCE.n().getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), 0);
        }
        this.hasNext = false;
    }

    private final int KN(int pathIndex) {
        if (this.path[pathIndex].KN()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].xMQ()) {
            return -1;
        }
        TrieNode trieNodeO = this.path[pathIndex].O();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].qie(trieNodeO.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), trieNodeO.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String().length);
        } else {
            this.path[pathIndex + 1].qie(trieNodeO.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), trieNodeO.az() * 2);
        }
        return KN(pathIndex + 1);
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    protected final TrieNodeBaseIterator[] getPath() {
        return this.path;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    protected final void xMQ(int i2) {
        this.pathLastIndex = i2;
    }

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].qie(trieNode.getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String(), trieNode.az() * 2);
        this.pathLastIndex = 0;
        J2();
    }

    private final void t() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    protected final Object O() {
        t();
        return this.path[this.pathLastIndex].t();
    }

    @Override // java.util.Iterator
    public Object next() {
        t();
        T next = this.path[this.pathLastIndex].next();
        J2();
        return next;
    }
}
