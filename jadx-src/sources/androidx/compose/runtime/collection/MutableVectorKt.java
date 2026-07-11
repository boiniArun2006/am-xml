package androidx.compose.runtime.collection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\b\u001a\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"", "", "index", "", c.f62177j, "(Ljava/util/List;I)V", "size", "t", "(II)V", "fromIndex", "toIndex", "rl", "(Ljava/util/List;II)V", "O", "nr", "(I)V", "J2", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1110:1\n1083#1,2:1111\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1101#1:1111,2\n*E\n"})
public final class MutableVectorKt {
    private static final void J2(int i2, int i3) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    private static final void O(int i2, int i3) {
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + i3 + ')');
    }

    private static final void nr(int i2) {
        throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than 0.");
    }

    public static final void rl(List list, int i2, int i3) {
        if (i2 > i3) {
            J2(i2, i3);
        }
        if (i2 < 0) {
            nr(i2);
        }
        if (i3 > list.size()) {
            O(i3, list.size());
        }
    }

    private static final void t(int i2, int i3) {
        throw new IndexOutOfBoundsException("Index " + i2 + " is out of bounds. The list has " + i3 + " elements.");
    }

    public static final void n(List list, int i2) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            return;
        }
        t(i2, size);
    }
}
