package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.CarouselAlignment;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J[\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J(\u0010%\u001a\u00020 2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "<init>", "()V", "", "J2", "()I", "pivotIndex", "", "pivotOffset", "firstFocalIndex", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "itemSpacing", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "tmpKeylines", "Landroidx/compose/material3/carousel/Keyline;", "t", "(IFIIFFFLjava/util/List;)Ljava/util/List;", "size", "offset", "", "Uo", "(FF)Z", "KN", "(FFF)Z", "isAnchor", "", "rl", "(FZ)V", "Landroidx/compose/material3/carousel/KeylineList;", "O", "(FFIF)Landroidx/compose/material3/carousel/KeylineList;", "Landroidx/compose/material3/carousel/CarouselAlignment;", "carouselAlignment", "nr", "(FFI)Landroidx/compose/material3/carousel/KeylineList;", c.f62177j, "I", "F", "focalItemSize", "", "Ljava/util/List;", "TmpKeyline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1855#2,2:567\n1855#2,2:569\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n455#1:567,2\n483#1:569,2\n*E\n"})
final class KeylineListScopeImpl implements KeylineListScope {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float pivotOffset;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private float focalItemSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int firstFocalIndex = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int pivotIndex = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List tmpKeylines = new ArrayList();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "", "size", "", "isAnchor", "<init>", "(FZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "F", "()F", "rl", "Z", "()Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class TmpKeyline {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final float size;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final boolean isAnchor;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) other;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getIsAnchor() {
            return this.isAnchor;
        }

        public TmpKeyline(float f3, boolean z2) {
            this.size = f3;
            this.isAnchor = z2;
        }
    }

    private final boolean KN(float size, float offset, float carouselMainAxisSize) {
        float f3 = size / 2;
        return offset - f3 < carouselMainAxisSize && offset + f3 > carouselMainAxisSize;
    }

    private final boolean Uo(float size, float offset) {
        float f3 = size / 2;
        return offset - f3 < 0.0f && offset + f3 > 0.0f;
    }

    private final int J2() {
        int i2 = this.firstFocalIndex;
        while (i2 < CollectionsKt.getLastIndex(this.tmpKeylines)) {
            int i3 = i2 + 1;
            if (((TmpKeyline) this.tmpKeylines.get(i3)).getSize() != this.focalItemSize) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List t(int pivotIndex, float pivotOffset, int firstFocalIndex, int lastFocalIndex, float itemMainAxisSize, float carouselMainAxisSize, float itemSpacing, List tmpKeylines) {
        TmpKeyline tmpKeyline;
        float f3;
        float size;
        TmpKeyline tmpKeyline2;
        TmpKeyline tmpKeyline3;
        boolean z2;
        Iterator<Integer> it;
        Iterator<Integer> it2;
        TmpKeyline tmpKeyline4 = (TmpKeyline) tmpKeylines.get(pivotIndex);
        ArrayList arrayList = new ArrayList();
        if (Uo(tmpKeyline4.getSize(), pivotOffset)) {
            size = pivotOffset - (tmpKeyline4.getSize() / 2);
        } else {
            if (!KN(tmpKeyline4.getSize(), pivotOffset, carouselMainAxisSize)) {
                tmpKeyline = tmpKeyline4;
                f3 = 0.0f;
                tmpKeyline2 = tmpKeyline;
                float size2 = tmpKeyline2.getSize();
                if (firstFocalIndex <= pivotIndex || pivotIndex > lastFocalIndex) {
                    tmpKeyline3 = tmpKeyline2;
                    z2 = false;
                } else {
                    tmpKeyline3 = tmpKeyline2;
                    z2 = true;
                }
                arrayList.add(new Keyline(size2, pivotOffset, pivotOffset, z2, tmpKeyline3.getIsAnchor(), true, f3));
                float f4 = 2;
                float f5 = itemMainAxisSize / f4;
                float size3 = (pivotOffset - f5) - itemSpacing;
                it = RangesKt.downTo(pivotIndex - 1, 0).iterator();
                float f6 = size3;
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    TmpKeyline tmpKeyline5 = (TmpKeyline) tmpKeylines.get(iNextInt);
                    float size4 = size3 - (tmpKeyline5.getSize() / f4);
                    arrayList.add(0, new Keyline(tmpKeyline5.getSize(), size4, f6 - f5, firstFocalIndex <= iNextInt && iNextInt <= lastFocalIndex, tmpKeyline5.getIsAnchor(), false, Uo(tmpKeyline5.getSize(), size4) ? Math.abs(size4 - (tmpKeyline5.getSize() / f4)) : 0.0f));
                    size3 -= tmpKeyline5.getSize() + itemSpacing;
                    f6 -= itemMainAxisSize + itemSpacing;
                }
                float size5 = pivotOffset + f5 + itemSpacing;
                it2 = RangesKt.until(pivotIndex + 1, tmpKeylines.size()).iterator();
                float f7 = size5;
                while (it2.hasNext()) {
                    int iNextInt2 = ((IntIterator) it2).nextInt();
                    TmpKeyline tmpKeyline6 = (TmpKeyline) tmpKeylines.get(iNextInt2);
                    float size6 = (tmpKeyline6.getSize() / f4) + size5;
                    arrayList.add(new Keyline(tmpKeyline6.getSize(), size6, f7 + f5, firstFocalIndex <= iNextInt2 && iNextInt2 <= lastFocalIndex, tmpKeyline6.getIsAnchor(), false, KN(tmpKeyline6.getSize(), size6, carouselMainAxisSize) ? ((tmpKeyline6.getSize() / f4) + size6) - carouselMainAxisSize : 0.0f));
                    size5 += tmpKeyline6.getSize() + itemSpacing;
                    f7 += itemMainAxisSize + itemSpacing;
                }
                return arrayList;
            }
            size = ((tmpKeyline4.getSize() / 2) + pivotOffset) - carouselMainAxisSize;
        }
        f3 = size;
        tmpKeyline = tmpKeyline4;
        tmpKeyline2 = tmpKeyline;
        float size22 = tmpKeyline2.getSize();
        if (firstFocalIndex <= pivotIndex) {
            tmpKeyline3 = tmpKeyline2;
            z2 = false;
        }
        arrayList.add(new Keyline(size22, pivotOffset, pivotOffset, z2, tmpKeyline3.getIsAnchor(), true, f3));
        float f42 = 2;
        float f53 = itemMainAxisSize / f42;
        float size32 = (pivotOffset - f53) - itemSpacing;
        it = RangesKt.downTo(pivotIndex - 1, 0).iterator();
        float f62 = size32;
        while (it.hasNext()) {
        }
        float size52 = pivotOffset + f53 + itemSpacing;
        it2 = RangesKt.until(pivotIndex + 1, tmpKeylines.size()).iterator();
        float f72 = size52;
        while (it2.hasNext()) {
        }
        return arrayList;
    }

    public final KeylineList O(float carouselMainAxisSize, float itemSpacing, int pivotIndex, float pivotOffset) {
        return new KeylineList(t(pivotIndex, pivotOffset, this.firstFocalIndex, J2(), this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void rl(float size, boolean isAnchor) {
        this.tmpKeylines.add(new TmpKeyline(size, isAnchor));
        if (size > this.focalItemSize) {
            this.firstFocalIndex = CollectionsKt.getLastIndex(this.tmpKeylines);
            this.focalItemSize = size;
        }
    }

    public final KeylineList nr(float carouselMainAxisSize, float itemSpacing, int carouselAlignment) {
        float f3;
        int iJ2 = J2();
        int i2 = this.firstFocalIndex;
        int i3 = iJ2 - i2;
        this.pivotIndex = i2;
        CarouselAlignment.Companion companion = CarouselAlignment.INSTANCE;
        if (CarouselAlignment.J2(carouselAlignment, companion.n())) {
            float f4 = 0.0f;
            if (itemSpacing != 0.0f) {
                int i5 = i3 % 2;
                if (i5 + ((((i5 ^ 2) & ((-i5) | i5)) >> 31) & 2) != 0) {
                    f4 = itemSpacing / 2.0f;
                }
            }
            float f5 = 2;
            f3 = ((carouselMainAxisSize / f5) - ((this.focalItemSize / f5) * i3)) - f4;
        } else if (CarouselAlignment.J2(carouselAlignment, companion.rl())) {
            f3 = carouselMainAxisSize - (this.focalItemSize / 2);
        } else {
            f3 = this.focalItemSize / 2;
        }
        this.pivotOffset = f3;
        return new KeylineList(t(this.pivotIndex, f3, this.firstFocalIndex, iJ2, this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    }
}
