package com.alightcreative.app.motion.scene.scripting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/alightcreative/app/motion/scene/scripting/ScriptEnv;", "", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "time", "", "frame", "", "fphs", "prevFrameTf", "Lcom/alightcreative/app/motion/scene/Transform;", "prevFrameTime", "renderMode", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "editMode", "selected", "", "runGroup", "Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "<init>", "(Lcom/alightcreative/app/motion/scene/Scene;FIILcom/alightcreative/app/motion/scene/Transform;FLcom/alightcreative/app/motion/scene/rendering/RenderMode;Ljava/lang/Integer;ZLcom/alightcreative/app/motion/scene/scripting/ScriptGroup;)V", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "getTime", "()F", "getFrame", "()I", "getFphs", "getPrevFrameTf", "()Lcom/alightcreative/app/motion/scene/Transform;", "getPrevFrameTime", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getEditMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelected", "()Z", "getRunGroup", "()Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScriptEnv {
    public static final int $stable = 8;
    private final Integer editMode;
    private final int fphs;
    private final int frame;
    private final Transform prevFrameTf;
    private final float prevFrameTime;
    private final RenderMode renderMode;
    private final ScriptGroup runGroup;
    private final Scene scene;
    private final boolean selected;
    private final float time;

    public ScriptEnv(Scene scene, float f3, int i2, int i3, Transform prevFrameTf, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup runGroup) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(prevFrameTf, "prevFrameTf");
        Intrinsics.checkNotNullParameter(runGroup, "runGroup");
        this.scene = scene;
        this.time = f3;
        this.frame = i2;
        this.fphs = i3;
        this.prevFrameTf = prevFrameTf;
        this.prevFrameTime = f4;
        this.renderMode = renderMode;
        this.editMode = num;
        this.selected = z2;
        this.runGroup = runGroup;
    }

    public final Integer getEditMode() {
        return this.editMode;
    }

    public final int getFphs() {
        return this.fphs;
    }

    public final int getFrame() {
        return this.frame;
    }

    public final Transform getPrevFrameTf() {
        return this.prevFrameTf;
    }

    public final float getPrevFrameTime() {
        return this.prevFrameTime;
    }

    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    public final ScriptGroup getRunGroup() {
        return this.runGroup;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final float getTime() {
        return this.time;
    }

    public /* synthetic */ ScriptEnv(Scene scene, float f3, int i2, int i3, Transform transform, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup scriptGroup, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(scene, f3, i2, i3, transform, (i5 & 32) != 0 ? f3 : f4, (i5 & 64) != 0 ? null : renderMode, (i5 & 128) != 0 ? 0 : num, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? ScriptGroup.All : scriptGroup);
    }
}
