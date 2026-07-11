package androidx.collection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000b\u001a\u00020\n\"\u00020\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/collection/IntList;", c.f62177j, "()Landroidx/collection/IntList;", "", "element1", "rl", "(I)Landroidx/collection/IntList;", "element2", "t", "(II)Landroidx/collection/IntList;", "", "elements", "nr", "([I)Landroidx/collection/IntList;", "Landroidx/collection/MutableIntList;", "O", "(I)Landroidx/collection/MutableIntList;", "J2", "(II)Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "EmptyIntList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,968:1\n1#2:969\n672#3,2:970\n712#3,2:972\n712#3,2:974\n712#3,2:976\n712#3,2:978\n712#3,2:980\n712#3,2:982\n672#3,2:984\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n902#1:970,2\n910#1:972,2\n917#1:974,2\n918#1:976,2\n927#1:978,2\n928#1:980,2\n929#1:982,2\n935#1:984,2\n*E\n"})
public final class IntListKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final IntList f14719n = new MutableIntList(0);

    public static final MutableIntList J2(int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.qie(i2);
        mutableIntList.qie(i3);
        return mutableIntList;
    }

    public static final MutableIntList O(int i2) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.qie(i2);
        return mutableIntList;
    }

    public static final IntList n() {
        return f14719n;
    }

    public static final IntList nr(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.az(mutableIntList._size, elements);
        return mutableIntList;
    }

    public static final IntList rl(int i2) {
        return O(i2);
    }

    public static final IntList t(int i2, int i3) {
        return J2(i2, i3);
    }
}
