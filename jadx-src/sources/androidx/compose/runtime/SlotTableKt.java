package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0004\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a#\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0004\u001a#\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001aK\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010!\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010#\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"", "", SafeDKWebAppInterface.f62924j, "o", "([II)I", "", "value", "", "ViF", "([IIZ)V", "WPU", "ty", "XQ", "nY", "([III)V", "ck", "aYN", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "Ik", "([IIIZZZII)V", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "HI", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/Anchor;", "location", "Z", "(Ljava/util/ArrayList;II)I", "r", "S", "()V", "", c.f62177j, "[J", "EmptyLongArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3723#1:3965\n3810#1:3966\n3810#1:3967\n3723#1:3968\n3723#1:3969\n3810#1:3990\n3810#1:3991\n3810#1:3992\n1#2:3964\n4663#3:3970\n4658#3,4:3971\n4663#3:3985\n4658#3,4:3986\n81#4,3:3975\n33#4,6:3978\n84#4:3984\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3677#1:3965\n3694#1:3966\n3704#1:3967\n3715#1:3968\n3720#1:3969\n3802#1:3990\n3803#1:3991\n3804#1:3992\n3736#1:3970\n3736#1:3971,4\n3759#1:3985\n3759#1:3986,4\n3742#1:3975,3\n3742#1:3978,6\n3742#1:3984\n*E\n"})
public final class SlotTableKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long[] f30389n = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(int[] iArr, int i2, int i3, boolean z2, boolean z3, boolean z4, int i5, int i7) {
        int i8 = i2 * 5;
        iArr[i8] = i3;
        iArr[i8 + 1] = ((z2 ? 1 : 0) << 30) | ((z3 ? 1 : 0) << 29) | ((z4 ? 1 : 0) << 28);
        iArr[i8 + 2] = i5;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i7;
    }

    public static final void S() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z2 ? 1 : 0) << 27) | (iArr[i3] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WPU(int[] iArr, int i2, boolean z2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = ((z2 ? 1 : 0) << 26) | (iArr[i3] & (-67108865));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int XQ(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 3] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ck(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(int[] iArr, int i2, int i3) {
        if (i3 >= 0) {
        }
        int i5 = (i2 * 5) + 1;
        iArr[i5] = i3 | (iArr[i5] & (-67108864));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ty(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return i3 >= iArr.length ? iArr.length : iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor HI(ArrayList arrayList, int i2, int i3) {
        int iZ = Z(arrayList, i2, i3);
        if (iZ >= 0) {
            return (Anchor) arrayList.get(iZ);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(ArrayList arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i7 = (i5 + size) >>> 1;
            int iN = ((Anchor) arrayList.get(i7)).getLocation();
            if (iN < 0) {
                iN += i3;
            }
            int iCompare = Intrinsics.compare(iN, i2);
            if (iCompare < 0) {
                i5 = i7 + 1;
            } else if (iCompare > 0) {
                size = i7 - 1;
            } else {
                return i7;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(ArrayList arrayList, int i2, int i3) {
        int iZ = Z(arrayList, i2, i3);
        if (iZ >= 0) {
            return iZ;
        }
        return -(iZ + 1);
    }
}
