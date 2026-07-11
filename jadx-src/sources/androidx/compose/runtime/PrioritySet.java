package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "rl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", "value", "", c.f62177j, "(Landroidx/collection/MutableIntList;I)V", "", "J2", "(Landroidx/collection/MutableIntList;)Z", "Uo", "(Landroidx/collection/MutableIntList;)I", "KN", "", "xMQ", "(Landroidx/collection/MutableIntList;)Ljava/lang/String;", "O", InneractiveMediationNameConsts.OTHER, "nr", "(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z", "Landroidx/collection/MutableIntList;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,3963:1\n366#2:3964\n65#2:3965\n65#2:3966\n363#2:3967\n366#2:3968\n65#2:3969\n366#2:3974\n65#2:3975\n65#2:3976\n65#2:3977\n65#2:3978\n4658#3,4:3970\n57#4,5:3979\n57#4,5:3984\n905#5:3989\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3875#1:3964\n3875#1:3965\n3877#1:3966\n3892#1:3967\n3894#1:3968\n3900#1:3969\n3907#1:3974\n3910#1:3975\n3912#1:3976\n3913#1:3977\n3944#1:3978\n3900#1:3970,4\n3948#1:3979,5\n3949#1:3984,5\n3871#1:3989\n*E\n"})
public final class PrioritySet {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableIntList list;

    public static int O(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    public static boolean nr(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && Intrinsics.areEqual(mutableIntList, ((PrioritySet) obj).getList());
    }

    public static MutableIntList rl(MutableIntList mutableIntList) {
        return mutableIntList;
    }

    public static /* synthetic */ MutableIntList t(MutableIntList mutableIntList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = 1;
        if ((i2 & 1) != 0) {
            mutableIntList = new MutableIntList(0, i3, null);
        }
        return rl(mutableIntList);
    }

    public static String xMQ(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    public boolean equals(Object obj) {
        return nr(this.list, obj);
    }

    public int hashCode() {
        return O(this.list);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final /* synthetic */ MutableIntList getList() {
        return this.list;
    }

    public String toString() {
        return xMQ(this.list);
    }

    public static final boolean J2(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    public static final int KN(MutableIntList mutableIntList) {
        int iO;
        int i2 = mutableIntList._size;
        int iO2 = mutableIntList.O(0);
        while (mutableIntList._size != 0 && mutableIntList.O(0) == iO2) {
            mutableIntList.Ik(0, mutableIntList.mUb());
            mutableIntList.ck(mutableIntList._size - 1);
            int i3 = mutableIntList._size;
            int i5 = i3 >>> 1;
            int i7 = 0;
            while (i7 < i5) {
                int iO3 = mutableIntList.O(i7);
                int i8 = (i7 + 1) * 2;
                int i9 = i8 - 1;
                int iO4 = mutableIntList.O(i9);
                if (i8 >= i3 || (iO = mutableIntList.O(i8)) <= iO4) {
                    if (iO4 > iO3) {
                        mutableIntList.Ik(i7, iO4);
                        mutableIntList.Ik(i9, iO3);
                        i7 = i9;
                    }
                } else if (iO > iO3) {
                    mutableIntList.Ik(i7, iO);
                    mutableIntList.Ik(i8, iO3);
                    i7 = i8;
                }
            }
        }
        return iO2;
    }

    public static final void n(MutableIntList mutableIntList, int i2) {
        if (mutableIntList._size == 0 || !(mutableIntList.O(0) == i2 || mutableIntList.O(mutableIntList._size - 1) == i2)) {
            int i3 = mutableIntList._size;
            mutableIntList.qie(i2);
            while (i3 > 0) {
                int i5 = ((i3 + 1) >>> 1) - 1;
                int iO = mutableIntList.O(i5);
                if (i2 <= iO) {
                    break;
                }
                mutableIntList.Ik(i3, iO);
                i3 = i5;
            }
            mutableIntList.Ik(i3, i2);
        }
    }

    public static final int Uo(MutableIntList mutableIntList) {
        return mutableIntList.nr();
    }
}
