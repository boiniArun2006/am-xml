package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0004J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "<init>", "()V", "", V8ValueTypedArray.PROPERTY_BUFFER, "", "index", "", "KN", "([Ljava/lang/Object;I)V", "", "t", "()Z", "J2", "nr", c.f62177j, "()Ljava/lang/Object;", "Uo", "O", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "rl", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "[Ljava/lang/Object;", "I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrieNodeIterator<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer = TrieNode.INSTANCE.n().getCom.caoccao.javet.values.reference.V8ValueTypedArray.PROPERTY_BUFFER java.lang.String();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int index;

    public static /* synthetic */ void xMQ(TrieNodeIterator trieNodeIterator, Object[] objArr, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        trieNodeIterator.KN(objArr, i2);
    }

    public final void KN(Object[] buffer, int index) {
        this.buffer = buffer;
        this.index = index;
    }

    public final boolean t() {
        return this.index < this.buffer.length;
    }

    public final void J2() {
        CommonFunctionsKt.n(t());
        this.index++;
    }

    public final boolean O() {
        if (t() && (this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final Object Uo() {
        CommonFunctionsKt.n(nr());
        Object[] objArr = this.buffer;
        int i2 = this.index;
        this.index = i2 + 1;
        return objArr[i2];
    }

    public final Object n() {
        CommonFunctionsKt.n(nr());
        return this.buffer[this.index];
    }

    public final boolean nr() {
        if (t() && !(this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final TrieNode rl() {
        CommonFunctionsKt.n(O());
        Object obj = this.buffer[this.index];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }
}
