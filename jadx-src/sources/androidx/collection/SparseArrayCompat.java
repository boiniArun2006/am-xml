package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J!\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0016\u0010-\u001a\u00020+8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u001e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\n\u00100R\u0016\u00103\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0011\u00105\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b4\u0010\u001a¨\u00066"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "", "initialCapacity", "<init>", "(I)V", "t", "()Landroidx/collection/SparseArrayCompat;", "key", "O", "(I)Ljava/lang/Object;", "defaultValue", "J2", "(ILjava/lang/Object;)Ljava/lang/Object;", "index", "", "ty", "value", "HI", "az", "(ILjava/lang/Object;)V", "ck", "()I", "", "gh", "()Z", "qie", "(I)I", "Ik", "xMQ", "mUb", "(Ljava/lang/Object;)I", "nr", "(I)Z", "rl", "()V", c.f62177j, "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", IV8ValueMap.FUNCTION_KEYS, "", "", "[Ljava/lang/Object;", IV8ValueMap.FUNCTION_VALUES, "I", "size", "KN", "isEmpty", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,263:1\n250#2,9:264\n263#2,5:273\n271#2,5:278\n279#2,7:283\n294#2,9:290\n327#2,30:299\n360#2,2:329\n327#2,37:331\n367#2,3:368\n327#2,30:371\n371#2:401\n376#2,4:402\n383#2:406\n387#2,4:407\n395#2,5:411\n401#2:417\n406#2,5:418\n414#2,4:423\n422#2,9:427\n435#2:436\n440#2:437\n422#2,9:438\n445#2,8:447\n456#2,17:455\n476#2,21:472\n24#3:416\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n123#1:264,9\n126#1:273,5\n135#1:278,5\n144#1:283,7\n155#1:290,9\n161#1:299,30\n168#1:329,2\n168#1:331,37\n179#1:368,3\n179#1:371,30\n179#1:401\n182#1:402,4\n198#1:406\n204#1:407,4\n210#1:411,5\n210#1:417\n216#1:418,5\n226#1:423,4\n238#1:427,9\n241#1:436\n244#1:437\n244#1:438,9\n247#1:447,8\n253#1:455,17\n261#1:472,21\n210#1:416\n*E\n"})
public class SparseArrayCompat<E> implements Cloneable {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public /* synthetic */ int size;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int[] keys;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public SparseArrayCompat(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.f14931n;
            this.values = ContainerHelpersKt.f14932t;
        } else {
            int iO = ContainerHelpersKt.O(i2);
            this.keys = new int[iO];
            this.values = new Object[iO];
        }
    }

    public Object Ik(int index) {
        if (this.garbage) {
            SparseArrayCompatKt.O(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return objArr[index];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.f14671n;
        throw new ArrayIndexOutOfBoundsException();
    }

    public void az(int key, Object value) {
        int iN = ContainerHelpersKt.n(this.keys, this.size, key);
        if (iN >= 0) {
            this.values[iN] = value;
            return;
        }
        int i2 = ~iN;
        if (i2 < this.size && this.values[i2] == SparseArrayCompatKt.f14917n) {
            this.keys[i2] = key;
            this.values[i2] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.O(this);
            i2 = ~ContainerHelpersKt.n(this.keys, this.size, key);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int iO = ContainerHelpersKt.O(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iO);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iO);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i5 = this.size;
        if (i5 - i2 != 0) {
            int[] iArr = this.keys;
            int i7 = i2 + 1;
            ArraysKt.copyInto(iArr, iArr, i7, i2, i5);
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i7, i2, this.size);
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size++;
    }

    public int ck() {
        if (this.garbage) {
            SparseArrayCompatKt.O(this);
        }
        return this.size;
    }

    public int mUb(Object value) {
        if (this.garbage) {
            SparseArrayCompatKt.O(this);
        }
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.values[i3] == value) {
                return i3;
            }
        }
        return -1;
    }

    public void n(int key, Object value) {
        int i2 = this.size;
        if (i2 != 0 && key <= this.keys[i2 - 1]) {
            az(key, value);
            return;
        }
        if (this.garbage && i2 >= this.keys.length) {
            SparseArrayCompatKt.O(this);
        }
        int i3 = this.size;
        if (i3 >= this.keys.length) {
            int iO = ContainerHelpersKt.O(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iO);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iO);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i3] = key;
        this.values[i3] = value;
        this.size = i3 + 1;
    }

    public int qie(int index) {
        if (this.garbage) {
            SparseArrayCompatKt.O(this);
        }
        return this.keys[index];
    }

    public void rl() {
        int i2 = this.size;
        Object[] objArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void ty(int index) {
        if (this.values[index] != SparseArrayCompatKt.f14917n) {
            this.values[index] = SparseArrayCompatKt.f14917n;
            this.garbage = true;
        }
    }

    public int xMQ(int key) {
        if (this.garbage) {
            SparseArrayCompatKt.O(this);
        }
        return ContainerHelpersKt.n(this.keys, this.size, key);
    }

    public Object HI(int key, Object value) {
        int iXMQ = xMQ(key);
        if (iXMQ >= 0) {
            Object[] objArr = this.values;
            Object obj = objArr[iXMQ];
            objArr[iXMQ] = value;
            return obj;
        }
        return null;
    }

    public Object J2(int key, Object defaultValue) {
        return SparseArrayCompatKt.nr(this, key, defaultValue);
    }

    public final boolean KN() {
        return gh();
    }

    public Object O(int key) {
        return SparseArrayCompatKt.t(this, key);
    }

    public boolean gh() {
        if (ck() == 0) {
            return true;
        }
        return false;
    }

    public boolean nr(int key) {
        if (xMQ(key) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public String toString() {
        if (ck() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(qie(i3));
            sb.append('=');
            Object objIk = Ik(i3);
            if (objIk != this) {
                sb.append(objIk);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public /* synthetic */ SparseArrayCompat(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
