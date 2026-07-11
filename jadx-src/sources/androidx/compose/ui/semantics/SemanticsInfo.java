package androidx.compose.ui.semantics;

import androidx.compose.ui.layout.LayoutInfo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/layout/LayoutInfo;", "", "I", "()Z", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "D", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", c.f62177j, "()Landroidx/compose/ui/semantics/SemanticsInfo;", "parentInfo", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "childrenInfo", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SemanticsInfo extends LayoutInfo {
    SemanticsConfiguration D();

    boolean I();

    List a();

    @Override // androidx.compose.ui.layout.LayoutInfo
    SemanticsInfo n();
}
