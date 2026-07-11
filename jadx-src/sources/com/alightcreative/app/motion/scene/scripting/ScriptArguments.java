package com.alightcreative.app.motion.scene.scripting;

import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u0080\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006>"}, d2 = {"Lcom/alightcreative/app/motion/scene/scripting/ScriptArguments;", "", "element", "Lcom/alightcreative/app/motion/scene/SceneElement;", "time", "", "frame", "", "fphs", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "prevFrameTf", "Lcom/alightcreative/app/motion/scene/Transform;", "prevFrameTime", "renderMode", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "editMode", "selected", "", "runGroup", "Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "<init>", "(Lcom/alightcreative/app/motion/scene/SceneElement;FIILcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/Transform;FLcom/alightcreative/app/motion/scene/rendering/RenderMode;Ljava/lang/Integer;ZLcom/alightcreative/app/motion/scene/scripting/ScriptGroup;)V", "getElement", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "getTime", "()F", "getFrame", "()I", "getFphs", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "getPrevFrameTf", "()Lcom/alightcreative/app/motion/scene/Transform;", "getPrevFrameTime", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getEditMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelected", "()Z", "getRunGroup", "()Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/alightcreative/app/motion/scene/SceneElement;FIILcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/Transform;FLcom/alightcreative/app/motion/scene/rendering/RenderMode;Ljava/lang/Integer;ZLcom/alightcreative/app/motion/scene/scripting/ScriptGroup;)Lcom/alightcreative/app/motion/scene/scripting/ScriptArguments;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ScriptArguments {
    private final Integer editMode;
    private final SceneElement element;
    private final int fphs;
    private final int frame;
    private final Transform prevFrameTf;
    private final float prevFrameTime;
    private final RenderMode renderMode;
    private final ScriptGroup runGroup;
    private final Scene scene;
    private final boolean selected;
    private final float time;

    public static /* synthetic */ ScriptArguments copy$default(ScriptArguments scriptArguments, SceneElement sceneElement, float f3, int i2, int i3, Scene scene, Transform transform, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup scriptGroup, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            sceneElement = scriptArguments.element;
        }
        if ((i5 & 2) != 0) {
            f3 = scriptArguments.time;
        }
        if ((i5 & 4) != 0) {
            i2 = scriptArguments.frame;
        }
        if ((i5 & 8) != 0) {
            i3 = scriptArguments.fphs;
        }
        if ((i5 & 16) != 0) {
            scene = scriptArguments.scene;
        }
        if ((i5 & 32) != 0) {
            transform = scriptArguments.prevFrameTf;
        }
        if ((i5 & 64) != 0) {
            f4 = scriptArguments.prevFrameTime;
        }
        if ((i5 & 128) != 0) {
            renderMode = scriptArguments.renderMode;
        }
        if ((i5 & 256) != 0) {
            num = scriptArguments.editMode;
        }
        if ((i5 & 512) != 0) {
            z2 = scriptArguments.selected;
        }
        if ((i5 & 1024) != 0) {
            scriptGroup = scriptArguments.runGroup;
        }
        boolean z3 = z2;
        ScriptGroup scriptGroup2 = scriptGroup;
        RenderMode renderMode2 = renderMode;
        Integer num2 = num;
        Transform transform2 = transform;
        float f5 = f4;
        Scene scene2 = scene;
        int i7 = i2;
        return scriptArguments.copy(sceneElement, f3, i7, i3, scene2, transform2, f5, renderMode2, num2, z3, scriptGroup2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SceneElement getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ScriptGroup getRunGroup() {
        return this.runGroup;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrame() {
        return this.frame;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFphs() {
        return this.fphs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Scene getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Transform getPrevFrameTf() {
        return this.prevFrameTf;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getPrevFrameTime() {
        return this.prevFrameTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getEditMode() {
        return this.editMode;
    }

    public final ScriptArguments copy(SceneElement element, float time, int frame, int fphs, Scene scene, Transform prevFrameTf, float prevFrameTime, RenderMode renderMode, Integer editMode, boolean selected, ScriptGroup runGroup) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(prevFrameTf, "prevFrameTf");
        Intrinsics.checkNotNullParameter(runGroup, "runGroup");
        return new ScriptArguments(element, time, frame, fphs, scene, prevFrameTf, prevFrameTime, renderMode, editMode, selected, runGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptArguments)) {
            return false;
        }
        ScriptArguments scriptArguments = (ScriptArguments) other;
        return Intrinsics.areEqual(this.element, scriptArguments.element) && Float.compare(this.time, scriptArguments.time) == 0 && this.frame == scriptArguments.frame && this.fphs == scriptArguments.fphs && Intrinsics.areEqual(this.scene, scriptArguments.scene) && Intrinsics.areEqual(this.prevFrameTf, scriptArguments.prevFrameTf) && Float.compare(this.prevFrameTime, scriptArguments.prevFrameTime) == 0 && this.renderMode == scriptArguments.renderMode && Intrinsics.areEqual(this.editMode, scriptArguments.editMode) && this.selected == scriptArguments.selected && this.runGroup == scriptArguments.runGroup;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.element.hashCode() * 31) + Float.hashCode(this.time)) * 31) + Integer.hashCode(this.frame)) * 31) + Integer.hashCode(this.fphs)) * 31) + this.scene.hashCode()) * 31) + this.prevFrameTf.hashCode()) * 31) + Float.hashCode(this.prevFrameTime)) * 31;
        RenderMode renderMode = this.renderMode;
        int iHashCode2 = (iHashCode + (renderMode == null ? 0 : renderMode.hashCode())) * 31;
        Integer num = this.editMode;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected)) * 31) + this.runGroup.hashCode();
    }

    public String toString() {
        return "ScriptArguments(element=" + this.element + ", time=" + this.time + ", frame=" + this.frame + ", fphs=" + this.fphs + ", scene=" + this.scene + ", prevFrameTf=" + this.prevFrameTf + ", prevFrameTime=" + this.prevFrameTime + ", renderMode=" + this.renderMode + ", editMode=" + this.editMode + ", selected=" + this.selected + ", runGroup=" + this.runGroup + ")";
    }

    public ScriptArguments(SceneElement element, float f3, int i2, int i3, Scene scene, Transform prevFrameTf, float f4, RenderMode renderMode, Integer num, boolean z2, ScriptGroup runGroup) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(prevFrameTf, "prevFrameTf");
        Intrinsics.checkNotNullParameter(runGroup, "runGroup");
        this.element = element;
        this.time = f3;
        this.frame = i2;
        this.fphs = i3;
        this.scene = scene;
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

    public final SceneElement getElement() {
        return this.element;
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
}
