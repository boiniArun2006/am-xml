package yc;

import android.view.View;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Z5b extends AbstractC2448d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TimelineLayoutManager.j.EnumC0632j f75907n;
    private int rl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5b(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f75907n = TimelineLayoutManager.j.EnumC0632j.f45181O;
        this.rl = -1;
    }

    @Override // yc.AbstractC2448d
    public int J2() {
        return this.rl;
    }

    @Override // yc.AbstractC2448d
    public TimelineLayoutManager.j.EnumC0632j Uo() {
        return this.f75907n;
    }

    @Override // yc.AbstractC2448d
    public void nr(Scene scene, SceneElement element, int i2, SceneThumbnailMaker sceneThumbnailMaker, List list, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        this.rl = i2;
        if (z2) {
            View view = this.itemView;
            view.setBackgroundColor(view.getResources().getColor(2131099722, null));
        } else {
            this.itemView.setBackgroundColor(0);
        }
        View view2 = this.itemView;
        TimelineLayoutManager.j jVar = new TimelineLayoutManager.j(element.getStartTime(), element.getEndTime(), 0, null, 0, 0, 60, null);
        jVar.mUb(i2);
        jVar.gh(TimelineLayoutManager.j.EnumC0632j.f45181O);
        view2.setLayoutParams(jVar);
    }
}
