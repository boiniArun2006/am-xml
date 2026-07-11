package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "nr", "(J)Z", "index", "", "elements", "O", "(I[J)Z", "", "J2", "()V", "capacity", "Uo", "KN", "(I)J", TtmlNode.START, TtmlNode.END, "xMQ", "(II)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,972:1\n557#1:974\n364#2:973\n70#2:975\n237#2,6:978\n70#2:984\n70#2:985\n70#2:992\n13337#3,2:976\n1675#3,6:986\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n693#1:974\n629#1:973\n751#1:975\n764#1:978,6\n778#1:984\n824#1:985\n841#1:992\n759#1:976,2\n826#1:986,6\n*E\n"})
public final class MutableLongList extends LongList {
    public MutableLongList(int i2) {
        super(i2, null);
    }

    public final void J2() {
        this._size = 0;
    }

    public /* synthetic */ MutableLongList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public final long KN(int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.t("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j2 = jArr[index];
        int i2 = this._size;
        if (index != i2 - 1) {
            ArraysKt.copyInto(jArr, jArr, index, index + 1, i2);
        }
        this._size--;
        return j2;
    }

    public final boolean O(int index, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.t("");
        }
        if (elements.length == 0) {
            return false;
        }
        Uo(this._size + elements.length);
        long[] jArr = this.content;
        int i2 = this._size;
        if (index != i2) {
            ArraysKt.copyInto(jArr, jArr, elements.length + index, index, i2);
        }
        ArraysKt.copyInto$default(elements, jArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void Uo(int capacity) {
        long[] jArr = this.content;
        if (jArr.length < capacity) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(capacity, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final boolean nr(long element) {
        Uo(this._size + 1);
        long[] jArr = this.content;
        int i2 = this._size;
        jArr[i2] = element;
        this._size = i2 + 1;
        return true;
    }

    public final void xMQ(int start, int end) {
        int i2;
        if (start < 0 || start > (i2 = this._size) || end < 0 || end > i2) {
            RuntimeHelpersKt.t("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.n("The end index must be < start index");
        }
        if (end != start) {
            int i3 = this._size;
            if (end < i3) {
                long[] jArr = this.content;
                ArraysKt.copyInto(jArr, jArr, start, end, i3);
            }
            this._size -= end - start;
        }
    }
}
