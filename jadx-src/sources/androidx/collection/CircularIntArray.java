package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "", "minCapacity", "<init>", "(I)V", "", "t", "()V", "element", c.f62177j, "O", "()I", "rl", "", "nr", "()Z", "", "[I", "elements", "I", TtmlNode.TAG_HEAD, "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,212:1\n59#2,5:213\n59#2,5:218\n24#3:223\n24#3:224\n24#3:225\n24#3:226\n24#3:227\n24#3:228\n24#3:229\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n37#1:213,5\n38#1:218,5\n101#1:223\n114#1:224\n138#1:225\n155#1:226\n168#1:227\n180#1:228\n192#1:229\n*E\n"})
public final class CircularIntArray {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] elements;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int capacityBitmask;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int tail;

    public CircularIntArray() {
        this(0, 1, null);
    }

    public CircularIntArray(int i2) {
        if (!(i2 >= 1)) {
            RuntimeHelpersKt.n("capacity must be >= 1");
        }
        if (!(i2 <= 1073741824)) {
            RuntimeHelpersKt.n("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.capacityBitmask = i2 - 1;
        this.elements = new int[i2];
    }

    private final void t() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i2 = this.head;
        int i3 = length - i2;
        int i5 = length << 1;
        if (i5 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i5];
        ArraysKt.copyInto(iArr, iArr2, 0, i2, length);
        ArraysKt.copyInto(this.elements, iArr2, i3, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i5 - 1;
    }

    public final int O() {
        int i2 = this.head;
        if (i2 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.f14671n;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.elements[i2];
        this.head = (i2 + 1) & this.capacityBitmask;
        return i3;
    }

    public final void n(int element) {
        int[] iArr = this.elements;
        int i2 = this.tail;
        iArr[i2] = element;
        int i3 = this.capacityBitmask & (i2 + 1);
        this.tail = i3;
        if (i3 == this.head) {
            t();
        }
    }

    public final boolean nr() {
        return this.head == this.tail;
    }

    public final void rl() {
        this.tail = this.head;
    }

    public /* synthetic */ CircularIntArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 8 : i2);
    }
}
