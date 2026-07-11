package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "initialCapacity", "<init>", "(I)V", "element", "", "qie", "(I)Z", "index", "", "gh", "(II)V", "", "elements", "az", "(I[I)Z", "capacity", "ty", "HI", "ck", "(I)I", "Ik", "(II)I", "r", "()V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,968:1\n556#1:970\n363#2:969\n70#2:971\n237#2,6:974\n70#2:980\n70#2:981\n70#2:988\n13330#3,2:972\n1663#3,6:982\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n628#1:969\n749#1:971\n762#1:974,6\n776#1:980\n822#1:981\n839#1:988\n757#1:972,2\n824#1:982,6\n*E\n"})
public final class MutableIntList extends IntList {
    public MutableIntList(int i2) {
        super(i2, null);
    }

    public /* synthetic */ MutableIntList(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    public final int Ik(int index, int element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.t("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i2 = iArr[index];
        iArr[index] = element;
        return i2;
    }

    public final boolean az(int index, int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.t("");
        }
        if (elements.length == 0) {
            return false;
        }
        ty(this._size + elements.length);
        int[] iArr = this.content;
        int i2 = this._size;
        if (index != i2) {
            ArraysKt.copyInto(iArr, iArr, elements.length + index, index, i2);
        }
        ArraysKt.copyInto$default(elements, iArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final int ck(int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.t("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i2 = iArr[index];
        int i3 = this._size;
        if (index != i3 - 1) {
            ArraysKt.copyInto(iArr, iArr, index, index + 1, i3);
        }
        this._size--;
        return i2;
    }

    public final void gh(int index, int element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.t("Index must be between 0 and size");
        }
        ty(this._size + 1);
        int[] iArr = this.content;
        int i2 = this._size;
        if (index != i2) {
            ArraysKt.copyInto(iArr, iArr, index + 1, index, i2);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean qie(int element) {
        ty(this._size + 1);
        int[] iArr = this.content;
        int i2 = this._size;
        iArr[i2] = element;
        this._size = i2 + 1;
        return true;
    }

    public final void r() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, i2);
    }

    public final void ty(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final boolean HI(int element) {
        int iUo = Uo(element);
        if (iUo >= 0) {
            ck(iUo);
            return true;
        }
        return false;
    }
}
