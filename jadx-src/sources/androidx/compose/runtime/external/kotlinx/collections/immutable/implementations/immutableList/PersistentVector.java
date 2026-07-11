package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010/R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\bD\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010C¨\u0006E"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "HI", "()I", "filledTail", "newTail", "gh", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", IV8ValueArray.FUNCTION_SHIFT, "qie", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "KN", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "index", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "Uo", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rootSize", "ty", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "mUb", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "tailCarry", "xMQ", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "az", "O", "(I)[Ljava/lang/Object;", "e", "ck", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", l.f62657l, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Z", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "fcU", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "J2", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", c.f62177j, "[Ljava/lang/Object;", "t", "I", "getSize", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n33#2,5:329\n1#3:334\n*S KotlinDebug\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n*L\n30#1:329,5\n*E\n"})
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int rootShift;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object[] root;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList add(Object element) {
        int size = size() - HI();
        if (size >= 32) {
            return gh(this.root, this.tail, UtilsKt.t(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = element;
        return new PersistentVector(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    private final PersistentList mUb(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(root, "copyOf(...)");
            }
            return new SmallPersistentVector(root);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrXMQ = xMQ(root, shift, rootSize - 1, objectRef);
        Intrinsics.checkNotNull(objArrXMQ);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrXMQ[1] != null) {
            return new PersistentVector(objArrXMQ, objArr, rootSize, shift);
        }
        Object obj = objArrXMQ[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj, objArr, rootSize, shift - 5);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public PersistentVectorBuilder n() {
        return new PersistentVectorBuilder(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public PersistentVector(Object[] objArr, Object[] objArr2, int i2, int i3) {
        boolean z2;
        this.root = objArr;
        this.tail = objArr2;
        this.size = i2;
        this.rootShift = i3;
        if (size() > 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.n("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        CommonFunctionsKt.n(size() - UtilsKt.nr(size()) <= RangesKt.coerceAtMost(objArr2.length, 32));
    }

    private final int HI() {
        return UtilsKt.nr(size());
    }

    private final PersistentVector KN(Object[] root, int tailIndex, Object element) {
        int size = size() - HI();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new PersistentVector(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.copyInto(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return gh(root, objArrCopyOf, UtilsKt.t(obj));
    }

    private final Object[] O(int index) {
        if (HI() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.n(index, i2)];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] Uo(Object[] root, int shift, int index, Object element, ObjectRef elementCarry) {
        Object[] objArrCopyOf;
        int iN = UtilsKt.n(index, shift);
        if (shift == 0) {
            if (iN == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.copyInto(root, objArrCopyOf, iN + 1, iN, 31);
            elementCarry.rl(root[31]);
            objArrCopyOf[iN] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i2 = shift - 5;
        Object obj = root[iN];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iN] = Uo((Object[]) obj, i2, index, element, elementCarry);
        while (true) {
            iN++;
            if (iN >= 32 || objArrCopyOf2[iN] == null) {
                break;
            }
            Object obj2 = root[iN];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iN] = Uo((Object[]) obj2, i2, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    private final Object[] az(Object[] root, int shift, int index, ObjectRef tailCarry) {
        Object[] objArrCopyOf;
        int iN = UtilsKt.n(index, shift);
        int iN2 = 31;
        if (shift == 0) {
            if (iN == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            }
            ArraysKt.copyInto(root, objArrCopyOf, iN, iN + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.rl(root[iN]);
            return objArrCopyOf;
        }
        if (root[31] == null) {
            iN2 = UtilsKt.n(HI() - 1, shift);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        int i2 = shift - 5;
        int i3 = iN + 1;
        if (i3 <= iN2) {
            while (true) {
                Object obj = objArrCopyOf2[iN2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iN2] = az((Object[]) obj, i2, 0, tailCarry);
                if (iN2 == i3) {
                    break;
                }
                iN2--;
            }
        }
        Object obj2 = objArrCopyOf2[iN];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iN] = az((Object[]) obj2, i2, index, tailCarry);
        return objArrCopyOf2;
    }

    private final Object[] ck(Object[] root, int shift, int index, Object e2) {
        int iN = UtilsKt.n(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        if (shift == 0) {
            objArrCopyOf[iN] = e2;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iN];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iN] = ck((Object[]) obj, shift - 5, index, e2);
        return objArrCopyOf;
    }

    private final PersistentVector gh(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            Object[] objArrT = UtilsKt.t(root);
            int i3 = this.rootShift + 5;
            return new PersistentVector(qie(objArrT, i3, filledTail), newTail, size() + 1, i3);
        }
        return new PersistentVector(qie(root, i2, filledTail), newTail, size() + 1, this.rootShift);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object[] qie(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iN = UtilsKt.n(size() - 1, shift);
        if (root != null) {
            objArrCopyOf = Arrays.copyOf(root, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        }
        if (shift == 5) {
            objArrCopyOf[iN] = tail;
            return objArrCopyOf;
        }
        objArrCopyOf[iN] = qie((Object[]) objArrCopyOf[iN], shift - 5, tail);
        return objArrCopyOf;
    }

    private final PersistentList ty(Object[] root, int rootSize, int shift, int index) {
        boolean z2;
        int size = size() - rootSize;
        if (index < size) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommonFunctionsKt.n(z2);
        if (size == 1) {
            return mUb(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int i2 = size - 1;
        if (index < i2) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i2] = null;
        return new PersistentVector(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final Object[] xMQ(Object[] root, int shift, int index, ObjectRef tailCarry) {
        Object[] objArrXMQ;
        int iN = UtilsKt.n(index, shift);
        if (shift == 5) {
            tailCarry.rl(root[iN]);
            objArrXMQ = null;
        } else {
            Object obj = root[iN];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrXMQ = xMQ((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrXMQ == null && iN == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iN] = objArrXMQ;
        return objArrCopyOf;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList Z(int index) {
        ListImplementation.n(index, size());
        int iHI = HI();
        if (index >= iHI) {
            return ty(this.root, iHI, this.rootShift, index - iHI);
        }
        return ty(az(this.root, this.rootShift, index, new ObjectRef(this.tail[0])), iHI, this.rootShift, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList fcU(Function1 predicate) {
        PersistentVectorBuilder persistentVectorBuilderN = n();
        persistentVectorBuilderN.E2(predicate);
        return persistentVectorBuilderN.build();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int index) {
        ListImplementation.n(index, size());
        return O(index)[index & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator(int index) {
        ListImplementation.rl(index, size());
        return new PersistentVectorIterator(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList set(int index, Object element) {
        ListImplementation.n(index, size());
        if (HI() <= index) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[index & 31] = element;
            return new PersistentVector(this.root, objArrCopyOf, size(), this.rootShift);
        }
        return new PersistentVector(ck(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList add(int index, Object element) {
        ListImplementation.rl(index, size());
        if (index == size()) {
            return add(element);
        }
        int iHI = HI();
        if (index >= iHI) {
            return KN(this.root, index - iHI, element);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return KN(Uo(this.root, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }
}
