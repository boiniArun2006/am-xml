package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.utils.Float16;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017¨\u0006,"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneHolderState;", "", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "", "editMode", "Lyc/nKE;", "userPreviewMode", "Lcom/alightcreative/app/motion/scene/EditCategory;", "editCategory", "<init>", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneSelection;ILyc/nKE;Lcom/alightcreative/app/motion/scene/EditCategory;)V", "component1", "()Lcom/alightcreative/app/motion/scene/Scene;", "component2", "()Lcom/alightcreative/app/motion/scene/SceneSelection;", "component3", "()I", "component4", "()Lyc/nKE;", "component5", "()Lcom/alightcreative/app/motion/scene/EditCategory;", "copy", "(Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneSelection;ILyc/nKE;Lcom/alightcreative/app/motion/scene/EditCategory;)Lcom/alightcreative/app/motion/scene/SceneHolderState;", "", "toString", "()Ljava/lang/String;", "hashCode", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "getSelection", "I", "getEditMode", "Lyc/nKE;", "getUserPreviewMode", "Lcom/alightcreative/app/motion/scene/EditCategory;", "getEditCategory", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SceneHolderState {
    public static final int $stable = 8;
    private final EditCategory editCategory;
    private final int editMode;
    private final Scene scene;
    private final SceneSelection selection;
    private final nKE userPreviewMode;

    public SceneHolderState(Scene scene, SceneSelection selection, int i2, nKE userPreviewMode, EditCategory editCategory) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        this.scene = scene;
        this.selection = selection;
        this.editMode = i2;
        this.userPreviewMode = userPreviewMode;
        this.editCategory = editCategory;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Scene getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SceneSelection getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEditMode() {
        return this.editMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EditCategory getEditCategory() {
        return this.editCategory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneHolderState)) {
            return false;
        }
        SceneHolderState sceneHolderState = (SceneHolderState) other;
        return Intrinsics.areEqual(this.scene, sceneHolderState.scene) && Intrinsics.areEqual(this.selection, sceneHolderState.selection) && this.editMode == sceneHolderState.editMode && Intrinsics.areEqual(this.userPreviewMode, sceneHolderState.userPreviewMode) && Intrinsics.areEqual(this.editCategory, sceneHolderState.editCategory);
    }

    public int hashCode() {
        int iHashCode = ((((((this.scene.hashCode() * 31) + this.selection.hashCode()) * 31) + Integer.hashCode(this.editMode)) * 31) + this.userPreviewMode.hashCode()) * 31;
        EditCategory editCategory = this.editCategory;
        return iHashCode + (editCategory == null ? 0 : editCategory.hashCode());
    }

    public String toString() {
        return "SceneHolderState(scene=" + this.scene + ", selection=" + this.selection + ", editMode=" + this.editMode + ", userPreviewMode=" + this.userPreviewMode + ", editCategory=" + this.editCategory + ")";
    }

    public static /* synthetic */ SceneHolderState copy$default(SceneHolderState sceneHolderState, Scene scene, SceneSelection sceneSelection, int i2, nKE nke, EditCategory editCategory, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            scene = sceneHolderState.scene;
        }
        if ((i3 & 2) != 0) {
            sceneSelection = sceneHolderState.selection;
        }
        if ((i3 & 4) != 0) {
            i2 = sceneHolderState.editMode;
        }
        if ((i3 & 8) != 0) {
            nke = sceneHolderState.userPreviewMode;
        }
        if ((i3 & 16) != 0) {
            editCategory = sceneHolderState.editCategory;
        }
        EditCategory editCategory2 = editCategory;
        int i5 = i2;
        return sceneHolderState.copy(scene, sceneSelection, i5, nke, editCategory2);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final nKE getUserPreviewMode() {
        return this.userPreviewMode;
    }

    public final SceneHolderState copy(Scene scene, SceneSelection selection, int editMode, nKE userPreviewMode, EditCategory editCategory) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(userPreviewMode, "userPreviewMode");
        return new SceneHolderState(scene, selection, editMode, userPreviewMode, editCategory);
    }

    public final EditCategory getEditCategory() {
        return this.editCategory;
    }

    public final int getEditMode() {
        return this.editMode;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final SceneSelection getSelection() {
        return this.selection;
    }

    public final nKE getUserPreviewMode() {
        return this.userPreviewMode;
    }

    public /* synthetic */ SceneHolderState(Scene scene, SceneSelection sceneSelection, int i2, nKE nke, EditCategory editCategory, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(scene, (i3 & 2) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : sceneSelection, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new nKE(0.0f, null, 0.0f, null, false, false, false, 0.0f, 0.0f, null, 0.0f, null, false, false, null, Float16.EXPONENT_SIGNIFICAND_MASK, null) : nke, (i3 & 16) != 0 ? null : editCategory);
    }
}
