package androidx.compose.foundation.gestures;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u001a\u0010+\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010#¨\u0006,"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DraggableAnchors;", "", IV8ValueMap.FUNCTION_KEYS, "", "anchors", "<init>", "(Ljava/util/List;[F)V", "anchor", "", "t", "(Ljava/lang/Object;)F", "", "nr", "(Ljava/lang/Object;)Z", "position", "rl", "(F)Ljava/lang/Object;", "searchUpwards", c.f62177j, "(FZ)Ljava/lang/Object;", "O", "()F", "J2", "", "index", "Uo", "(I)Ljava/lang/Object;", "xMQ", "(I)F", "", InneractiveMediationNameConsts.OTHER, "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "[F", "I", "KN", "size", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n+ 2 AnchoredDraggable.jvm.kt\nandroidx/compose/foundation/gestures/AnchoredDraggable_jvmKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1753:1\n31#2,2:1754\n13424#3,3:1756\n13424#3,3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n*L\n1572#1:1754,2\n1588#1:1756,3\n1601#1:1759,3\n*E\n"})
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List keys;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float[] anchors;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) other;
        return Intrinsics.areEqual(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float J2() {
        Float fMaxOrNull = ArraysKt.maxOrNull(this.anchors);
        if (fMaxOrNull != null) {
            return fMaxOrNull.floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float O() {
        Float fMinOrNull = ArraysKt.minOrNull(this.anchors);
        if (fMinOrNull != null) {
            return fMinOrNull.floatValue();
        }
        return Float.NaN;
    }

    public Object Uo(int index) {
        return CollectionsKt.getOrNull(this.keys, index);
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public Object n(float position, boolean searchUpwards) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i2 = -1;
        int i3 = 0;
        float f3 = Float.POSITIVE_INFINITY;
        int i5 = 0;
        while (i3 < length) {
            float f4 = fArr[i3];
            int i7 = i5 + 1;
            float f5 = searchUpwards ? f4 - position : position - f4;
            if (f5 < 0.0f) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if (f5 <= f3) {
                i2 = i5;
                f3 = f5;
            }
            i3++;
            i5 = i7;
        }
        return this.keys.get(i2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean nr(Object anchor) {
        return this.keys.indexOf(anchor) != -1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public Object rl(float position) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i2 = -1;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i7 = i5 + 1;
            float fAbs = Math.abs(position - fArr[i3]);
            if (fAbs <= f3) {
                i2 = i5;
                f3 = fAbs;
            }
            i3++;
            i5 = i7;
        }
        return this.keys.get(i2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float t(Object anchor) {
        int iIndexOf = this.keys.indexOf(anchor);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf > ArraysKt.getLastIndex(fArr)) ? ((Number) AnchoredDraggableKt.rl.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Uo(i2));
            sb2.append('=');
            sb2.append(xMQ(i2));
            sb.append(sb2.toString());
            if (i2 < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public float xMQ(int index) {
        float[] fArr = this.anchors;
        return (index < 0 || index > ArraysKt.getLastIndex(fArr)) ? ((Number) AnchoredDraggableKt.rl.invoke(Integer.valueOf(index))).floatValue() : fArr[index];
    }

    public DefaultDraggableAnchors(List list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        list.size();
        int length = fArr.length;
        this.size = fArr.length;
    }
}
