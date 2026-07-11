package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "<init>", "()V", "", "index", "", c.f62177j, "(I)Ljava/lang/String;", "rl", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchorFunctions {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnchorFunctions f34404n = new AnchorFunctions();

    public final String rl(int index) {
        if (index == -2) {
            return TtmlNode.START;
        }
        if (index == -1) {
            return TtmlNode.END;
        }
        if (index == 0) {
            return TtmlNode.LEFT;
        }
        if (index == 1) {
            return TtmlNode.RIGHT;
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return TtmlNode.START;
    }

    public final String n(int index) {
        if (index == 0) {
            return "top";
        }
        if (index == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    private AnchorFunctions() {
    }
}
