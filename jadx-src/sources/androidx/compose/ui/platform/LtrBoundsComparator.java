package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/LtrBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "<init>", "()V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LtrBoundsComparator implements Comparator<SemanticsNode> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LtrBoundsComparator f33002n = new LtrBoundsComparator();

    private LtrBoundsComparator() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compare(SemanticsNode a2, SemanticsNode b2) {
        Rect rectMUb = a2.mUb();
        Rect rectMUb2 = b2.mUb();
        int iCompare = Float.compare(rectMUb.getLeft(), rectMUb2.getLeft());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(rectMUb.getTop(), rectMUb2.getTop());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(rectMUb.xMQ(), rectMUb2.xMQ());
        if (iCompare3 != 0) {
            return iCompare3;
        }
        return Float.compare(rectMUb.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rectMUb2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
    }
}
