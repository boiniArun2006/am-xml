package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\bR\u0014\u0010 \u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/LayoutInfo;", "", "", "Landroidx/compose/ui/layout/ModifierInfo;", "Ik", "()Ljava/util/List;", "", "getWidth", "()I", "width", "getHeight", "height", "Landroidx/compose/ui/layout/LayoutCoordinates;", "r", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "HI", "()Z", "isPlaced", c.f62177j, "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "nr", "isAttached", "ck", "semanticsId", "o", "isDeactivated", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LayoutInfo {
    boolean HI();

    List Ik();

    int ck();

    int getHeight();

    LayoutDirection getLayoutDirection();

    int getWidth();

    LayoutInfo n();

    boolean nr();

    default boolean o() {
        return false;
    }

    LayoutCoordinates r();
}
