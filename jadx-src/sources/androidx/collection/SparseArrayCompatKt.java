package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"E", "Landroidx/collection/SparseArrayCompat;", "", "key", "t", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "nr", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "", "O", "(Landroidx/collection/SparseArrayCompat;)V", "", c.f62177j, "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 2 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,498:1\n217#1,6:499\n217#1,6:505\n327#1,30:511\n327#1,30:541\n422#1,9:572\n24#2:571\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n229#1:499,6\n235#1:505,6\n361#1:511,30\n369#1:541,30\n440#1:572,9\n399#1:571\n*E\n"})
public final class SparseArrayCompatKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f14917n = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(SparseArrayCompat sparseArrayCompat) {
        int i2 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr = sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i5];
            if (obj != f14917n) {
                if (i5 != i3) {
                    iArr[i3] = iArr[i5];
                    objArr[i3] = obj;
                    objArr[i5] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i3;
    }

    public static final Object nr(SparseArrayCompat sparseArrayCompat, int i2, Object obj) {
        Object obj2;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iN = ContainerHelpersKt.n(sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String, sparseArrayCompat.size, i2);
        return (iN < 0 || (obj2 = sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iN]) == f14917n) ? obj : obj2;
    }

    public static final Object t(SparseArrayCompat sparseArrayCompat, int i2) {
        Object obj;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iN = ContainerHelpersKt.n(sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String, sparseArrayCompat.size, i2);
        if (iN < 0 || (obj = sparseArrayCompat.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[iN]) == f14917n) {
            return null;
        }
        return obj;
    }
}
