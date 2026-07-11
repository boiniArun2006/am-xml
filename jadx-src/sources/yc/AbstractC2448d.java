package yc;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2448d extends RecyclerView.ViewHolder {
    public abstract int J2();

    public abstract TimelineLayoutManager.j.EnumC0632j Uo();

    public abstract void nr(Scene scene, SceneElement sceneElement, int i2, SceneThumbnailMaker sceneThumbnailMaker, List list, int i3, boolean z2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2448d(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public static /* synthetic */ void O(AbstractC2448d abstractC2448d, Scene scene, SceneElement sceneElement, int i2, SceneThumbnailMaker sceneThumbnailMaker, List list, int i3, boolean z2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i5 & 8) != 0) {
            sceneThumbnailMaker = null;
        }
        abstractC2448d.nr(scene, sceneElement, i2, sceneThumbnailMaker, list, i3, z2);
    }
}
