package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "index", "", "nr", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "O", "(Ljava/util/List;II)V", "E", "Landroidx/collection/ObjectList;", "J2", "()Landroidx/collection/ObjectList;", "element1", "xMQ", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "Uo", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element2", "KN", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "", "", c.f62177j, "[Ljava/lang/Object;", "EmptyArray", "rl", "Landroidx/collection/ObjectList;", "EmptyObjectList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1548:1\n1#2:1549\n919#3,2:1550\n919#3,2:1552\n919#3,2:1554\n919#3,2:1556\n919#3,2:1558\n919#3,2:1560\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1521#1:1550,2\n1528#1:1552,2\n1529#1:1554,2\n1539#1:1556,2\n1540#1:1558,2\n1541#1:1560,2\n*E\n"})
public final class ObjectListKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object[] f14871n = new Object[0];
    private static final ObjectList rl = new MutableObjectList(0);

    public static final ObjectList J2() {
        ObjectList objectList = rl;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final MutableObjectList KN(Object obj, Object obj2) {
        MutableObjectList mutableObjectList = new MutableObjectList(2);
        mutableObjectList.ty(obj);
        mutableObjectList.ty(obj2);
        return mutableObjectList;
    }

    public static final MutableObjectList Uo(Object obj) {
        MutableObjectList mutableObjectList = new MutableObjectList(1);
        mutableObjectList.ty(obj);
        return mutableObjectList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(List list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            RuntimeHelpersKt.n("Indices are out of order. fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            RuntimeHelpersKt.t("fromIndex (" + i2 + ") is less than 0.");
        }
        if (i3 > size) {
            RuntimeHelpersKt.t("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(List list, int i2) {
        int size = list.size();
        if (i2 >= 0 && i2 < size) {
            return;
        }
        RuntimeHelpersKt.t("Index " + i2 + " is out of bounds. The list has " + size + " elements.");
    }

    public static final ObjectList xMQ(Object obj) {
        return Uo(obj);
    }
}
