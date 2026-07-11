package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "", "minCapacity", "<init>", "(I)V", "", "rl", "()V", "element", c.f62177j, "(Ljava/lang/Object;)V", "O", "()Ljava/lang/Object;", "index", "t", "(I)Ljava/lang/Object;", "J2", "()I", "", "nr", "()Z", "", "[Ljava/lang/Object;", "elements", "I", TtmlNode.TAG_HEAD, "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,266:1\n59#2,5:267\n59#2,5:272\n24#3:277\n24#3:278\n24#3:279\n24#3:280\n24#3:281\n24#3:282\n24#3:283\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n38#1:267,5\n39#1:272,5\n104#1:277\n121#1:278\n148#1:279\n183#1:280\n217#1:281\n231#1:282\n245#1:283\n*E\n"})
public final class CircularArray<E> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object[] elements;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int capacityBitmask;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int tail;

    public CircularArray(int i2) {
        if (!(i2 >= 1)) {
            RuntimeHelpersKt.n("capacity must be >= 1");
        }
        if (!(i2 <= 1073741824)) {
            RuntimeHelpersKt.n("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.capacityBitmask = i2 - 1;
        this.elements = new Object[i2];
    }

    private final void rl() {
        Object[] objArr = this.elements;
        int length = objArr.length;
        int i2 = this.head;
        int i3 = length - i2;
        int i5 = length << 1;
        if (i5 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i5];
        ArraysKt.copyInto(objArr, objArr2, 0, i2, length);
        ArraysKt.copyInto(this.elements, objArr2, i3, 0, this.head);
        this.elements = objArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i5 - 1;
    }

    public final int J2() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final Object O() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.f14671n;
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] objArr = this.elements;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.head = (i2 + 1) & this.capacityBitmask;
        return obj;
    }

    public final void n(Object element) {
        Object[] objArr = this.elements;
        int i2 = this.tail;
        objArr[i2] = element;
        int i3 = this.capacityBitmask & (i2 + 1);
        this.tail = i3;
        if (i3 == this.head) {
            rl();
        }
    }

    public final boolean nr() {
        return this.head == this.tail;
    }

    public final Object t(int index) {
        if (index < 0 || index >= J2()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.f14671n;
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.elements[this.capacityBitmask & (this.head + index)];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    public /* synthetic */ CircularArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 8 : i2);
    }
}
