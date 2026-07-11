package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Landroidx/collection/ArraySet;", "", "hash", "rl", "(Landroidx/collection/ArraySet;I)I", "", "key", "t", "(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I", "nr", "(Landroidx/collection/ArraySet;)I", "size", "", c.f62177j, "(Landroidx/collection/ArraySet;I)V", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ArraySetKt {
    public static final void n(ArraySet arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        arraySet.gh(new int[i2]);
        arraySet.mUb(new Object[i2]);
    }

    public static final int nr(ArraySet arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return t(arraySet, null, 0);
    }

    public static final int rl(ArraySet arraySet, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        try {
            return ContainerHelpersKt.n(arraySet.getHashes(), arraySet.get_size(), i2);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int t(ArraySet arraySet, Object obj, int i2) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i3 = arraySet.get_size();
        if (i3 == 0) {
            return -1;
        }
        int iRl = rl(arraySet, i2);
        if (iRl < 0 || Intrinsics.areEqual(obj, arraySet.getArray()[iRl])) {
            return iRl;
        }
        int i5 = iRl + 1;
        while (i5 < i3 && arraySet.getHashes()[i5] == i2) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i7 = iRl - 1; i7 >= 0 && arraySet.getHashes()[i7] == i2; i7--) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i7])) {
                return i7;
            }
        }
        return ~i5;
    }
}
