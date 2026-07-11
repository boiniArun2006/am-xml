package androidx.compose.foundation.pager;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\b\tJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", c.f62177j, "(Landroidx/compose/ui/unit/Density;II)I", "Fill", "Fixed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PageSize {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", c.f62177j, "(Landroidx/compose/ui/unit/Density;II)I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/unit/Dp;", "F", "getPageSize-D9Ej5fM", "()F", "pageSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fixed implements PageSize {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float pageSize;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Fixed) {
                return Dp.mUb(this.pageSize, ((Fixed) other).pageSize);
            }
            return false;
        }

        public int hashCode() {
            return Dp.gh(this.pageSize);
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int n(Density density, int i2, int i3) {
            return density.How(this.pageSize);
        }
    }

    int n(Density density, int i2, int i3);

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", c.f62177j, "(Landroidx/compose/ui/unit/Density;II)I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fill implements PageSize {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Fill f18849n = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public int n(Density density, int i2, int i3) {
            return i2;
        }

        private Fill() {
        }
    }
}
