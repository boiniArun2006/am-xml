package yc;

import android.view.MotionEvent;
import android.view.View;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.Vector2D;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yc.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C2445Dt implements a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MotionEvent f75719n;
    private final SceneHolder rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f75720t;

    public C2445Dt(MotionEvent originalEvent, SceneHolder sceneHolder, View previewView) {
        Intrinsics.checkNotNullParameter(originalEvent, "originalEvent");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.f75719n = originalEvent;
        this.rl = sceneHolder;
        this.f75720t = previewView;
    }

    @Override // yc.a
    public MotionEvent n() {
        return this.f75719n;
    }

    @Override // yc.a
    public Vector2D rl() {
        return RP.nr(this.rl, n().getX(), n().getY(), this.f75720t);
    }

    @Override // yc.a
    public Vector2D t(int i2) {
        return RP.nr(this.rl, n().getHistoricalX(i2), n().getHistoricalY(i2), this.f75720t);
    }
}
