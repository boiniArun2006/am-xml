package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_jvmKt;
import androidx.compose.runtime.internal.WeakReference;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "<init>", "()V", "value", "", "hash", "rl", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "t", "(ILjava/lang/Object;I)I", "", c.f62177j, "(Ljava/lang/Object;)Z", "I", "O", "()I", "Uo", "(I)V", "size", "", "[I", "nr", "()[I", "setHashes$runtime_release", "([I)V", "hashes", "", "Landroidx/compose/runtime/internal/WeakReference;", "[Landroidx/compose/runtime/internal/WeakReference;", "J2", "()[Landroidx/compose/runtime/internal/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/internal/WeakReference;)V", IV8ValueMap.FUNCTION_VALUES, "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotWeakSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n*L\n1#1,243:1\n27#2,2:244\n27#2,2:246\n27#2,2:248\n*S KotlinDebug\n*F\n+ 1 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n*L\n74#1:244,2\n80#1:246,2\n96#1:248,2\n*E\n"})
public final class SnapshotWeakSet<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int[] hashes = new int[16];

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private WeakReference[] values = new WeakReference[16];

    private final int rl(Object value, int hash) {
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) >>> 1;
            int i7 = this.hashes[i5];
            if (i7 < hash) {
                i3 = i5 + 1;
            } else {
                if (i7 <= hash) {
                    WeakReference weakReference = this.values[i5];
                    return value == (weakReference != null ? weakReference.get() : null) ? i5 : t(i5, value, hash);
                }
                i2 = i5 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r4 = r4 + 1;
        r0 = r3.size;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r4 >= r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3.hashes[r4] == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r2 = r3.values[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r2 = r2.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (r2 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r4 = r3.size;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int t(int midIndex, Object value, int valueHash) {
        int i2 = midIndex - 1;
        while (true) {
            if (-1 >= i2 || this.hashes[i2] != valueHash) {
                break;
            }
            WeakReference weakReference = this.values[i2];
            if ((weakReference != null ? weakReference.get() : null) == value) {
                return i2;
            }
            i2--;
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final WeakReference[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final void Uo(int i2) {
        this.size = i2;
    }

    public final boolean n(Object value) {
        int iRl;
        int i2 = this.size;
        int iN = Utils_jvmKt.n(value);
        if (i2 > 0) {
            iRl = rl(value, iN);
            if (iRl >= 0) {
                return false;
            }
        } else {
            iRl = -1;
        }
        int i3 = -(iRl + 1);
        WeakReference[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i2 == length) {
            int i5 = length * 2;
            WeakReference[] weakReferenceArr2 = new WeakReference[i5];
            int[] iArr = new int[i5];
            int i7 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr2, i7, i2 - i3);
            System.arraycopy(this.values, 0, weakReferenceArr2, 0, i3);
            ArraysKt.copyInto(this.hashes, iArr, i7, i3, i2);
            ArraysKt.copyInto$default(this.hashes, iArr, 0, 0, i3, 6, (Object) null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i8 = i3 + 1;
            System.arraycopy(weakReferenceArr, i3, weakReferenceArr, i8, i2 - i3);
            int[] iArr2 = this.hashes;
            ArraysKt.copyInto(iArr2, iArr2, i8, i3, i2);
        }
        this.values[i3] = new WeakReference(value);
        this.hashes[i3] = iN;
        this.size++;
        return true;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }
}
