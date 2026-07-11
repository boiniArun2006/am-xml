package yc;

import android.view.View;
import android.widget.FrameLayout;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ZX7 extends AbstractC2448d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TimelineLayoutManager.j.EnumC0632j f75908n;
    private int rl;

    /* JADX WARN: Illegal instructions before constructor call */
    public ZX7(SJ0.g62 itemBinding) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        FrameLayout root = itemBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f75908n = TimelineLayoutManager.j.EnumC0632j.J2;
        this.rl = -1;
    }

    @Override // yc.AbstractC2448d
    public int J2() {
        return this.rl;
    }

    @Override // yc.AbstractC2448d
    public TimelineLayoutManager.j.EnumC0632j Uo() {
        return this.f75908n;
    }

    @Override // yc.AbstractC2448d
    public void nr(Scene scene, SceneElement element, int i2, SceneThumbnailMaker sceneThumbnailMaker, List list, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        HI0.o7q.gh(itemView);
        this.rl = i2;
        View view = this.itemView;
        TimelineLayoutManager.j jVar = new TimelineLayoutManager.j(element.getStartTime(), element.getEndTime(), 0, null, 0, 0, 60, null);
        jVar.mUb(i2);
        jVar.gh(TimelineLayoutManager.j.EnumC0632j.J2);
        view.setLayoutParams(jVar);
    }
}
