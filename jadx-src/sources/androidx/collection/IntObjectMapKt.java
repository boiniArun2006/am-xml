package androidx.collection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"V", "Landroidx/collection/IntObjectMap;", c.f62177j, "()Landroidx/collection/IntObjectMap;", "rl", "Landroidx/collection/MutableIntObjectMap;", "t", "()Landroidx/collection/MutableIntObjectMap;", "", "key1", "value1", "key2", "value2", "key3", "value3", "nr", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "", "Landroidx/collection/MutableIntObjectMap;", "EmptyIntObjectMap", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntObjectMap.kt\nandroidx/collection/IntObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
public final class IntObjectMapKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MutableIntObjectMap f14727n = new MutableIntObjectMap(0);

    public static final IntObjectMap n() {
        MutableIntObjectMap mutableIntObjectMap = f14727n;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    public static final MutableIntObjectMap nr(int i2, Object obj, int i3, Object obj2, int i5, Object obj3) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.r(i2, obj);
        mutableIntObjectMap.r(i3, obj2);
        mutableIntObjectMap.r(i5, obj3);
        return mutableIntObjectMap;
    }

    public static final IntObjectMap rl() {
        MutableIntObjectMap mutableIntObjectMap = f14727n;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    public static final MutableIntObjectMap t() {
        return new MutableIntObjectMap(0, 1, null);
    }
}
