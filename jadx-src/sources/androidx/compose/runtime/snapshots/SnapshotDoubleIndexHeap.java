package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u001b\u0010\u0017\u001a\u00020\u00142\f\b\u0002\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\bR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010$\u001a\u00060!j\u0002`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0016\u0010\u0005\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", "index", "", "KN", "(I)V", "Uo", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "xMQ", "(II)V", "atLeast", "t", "rl", "()I", "handle", "nr", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "default", "O", "(J)J", "value", c.f62177j, "(J)I", "J2", "<set-?>", "I", "getSize", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "[J", IV8ValueMap.FUNCTION_VALUES, "", "[I", "handles", "firstFreeHandle", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotDoubleIndexHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,201:1\n65#2,2:202\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n*L\n171#1:202,2\n*E\n"})
public final class SnapshotDoubleIndexHeap {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int[] handles;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long[] values = SnapshotId_jvmKt.rl(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int[] index = new int[16];

    private final void KN(int index) {
        long[] jArr = this.values;
        long j2 = jArr[index];
        while (index > 0) {
            int i2 = ((index + 1) >> 1) - 1;
            if (jArr[i2] <= j2) {
                return;
            }
            xMQ(i2, index);
            index = i2;
        }
    }

    private final void Uo(int index) {
        long[] jArr = this.values;
        int i2 = this.size >> 1;
        while (index < i2) {
            int i3 = (index + 1) << 1;
            int i5 = i3 - 1;
            if (i3 < this.size) {
                long j2 = jArr[i3];
                if (j2 < jArr[i5]) {
                    if (j2 >= jArr[index]) {
                        return;
                    }
                    xMQ(i3, index);
                    index = i3;
                }
            }
            if (jArr[i5] >= jArr[index]) {
                return;
            }
            xMQ(i5, index);
            index = i5;
        }
    }

    private final void nr(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    private final int rl() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i2 = length * 2;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i5 = i3 + 1;
                iArr[i3] = i5;
                i3 = i5;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i7 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i7];
        return i7;
    }

    private final void t(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i2 = length * 2;
        long[] jArrRl = SnapshotId_jvmKt.rl(i2);
        int[] iArr = new int[i2];
        ArraysKt.copyInto$default(this.values, jArrRl, 0, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrRl;
        this.index = iArr;
    }

    private final void xMQ(int a2, int b2) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j2 = jArr[a2];
        jArr[a2] = jArr[b2];
        jArr[b2] = j2;
        int i2 = iArr[a2];
        int i3 = iArr[b2];
        iArr[a2] = i3;
        iArr[b2] = i2;
        iArr2[i3] = a2;
        iArr2[i2] = b2;
    }

    public final void J2(int handle) {
        int i2 = this.handles[handle];
        xMQ(i2, this.size - 1);
        this.size--;
        KN(i2);
        Uo(i2);
        nr(handle);
    }

    public final long O(long j2) {
        return this.size > 0 ? this.values[0] : j2;
    }

    public final int n(long value) {
        t(this.size + 1);
        int i2 = this.size;
        this.size = i2 + 1;
        int iRl = rl();
        this.values[i2] = value;
        this.index[i2] = iRl;
        this.handles[iRl] = i2;
        KN(i2);
        return iRl;
    }

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.handles = iArr;
    }
}
