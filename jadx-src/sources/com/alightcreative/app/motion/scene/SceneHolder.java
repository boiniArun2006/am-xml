package com.alightcreative.app.motion.scene;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000b\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H&¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0012H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H&¢\u0006\u0004\b&\u0010'R\u001c\u0010 \u001a\u00020\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\"R\u001c\u00100\u001a\u00020+8&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00105\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010;\u001a\u0004\u0018\u0001068&@&X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010A\u001a\u00020<8&@&X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010D\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00102\"\u0004\bC\u00104R\u001c\u0010G\u001a\u00020\u001f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u0010)\"\u0004\bF\u0010\"R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010P\u001a\u00020K8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneHolder;", "", "Lkotlin/Function1;", "Lcom/alightcreative/app/motion/scene/SceneHolderState;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "newState", "", "callback", "subscribe", "(Lkotlin/jvm/functions/Function1;)V", "unsubscribe", "Lcom/alightcreative/app/motion/scene/SceneElement;", "element", "", "insertIndex", l.f62657l, "(Lcom/alightcreative/app/motion/scene/SceneElement;I)Lcom/alightcreative/app/motion/scene/SceneElement;", "", "nextAvailableId", "()J", "update", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "remove", "", "elementIds", "", "removeAll", "(Ljava/lang/Iterable;)Ljava/util/List;", "duplicateAll", "(Ljava/lang/Iterable;)V", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "copyFrom", "(Lcom/alightcreative/app/motion/scene/Scene;)V", "elementId", "editNestedScene", "(J)V", "endEditingNestedScene", "()V", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "setScene", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "getSelection", "()Lcom/alightcreative/app/motion/scene/SceneSelection;", "setSelection", "(Lcom/alightcreative/app/motion/scene/SceneSelection;)V", "selection", "getEditMode", "()I", "setEditMode", "(I)V", "editMode", "Lcom/alightcreative/app/motion/scene/EditCategory;", "getEditCategory", "()Lcom/alightcreative/app/motion/scene/EditCategory;", "setEditCategory", "(Lcom/alightcreative/app/motion/scene/EditCategory;)V", "editCategory", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "setUserPreviewMode", "(Lyc/nKE;)V", "userPreviewMode", "getEditingSerial", "setEditingSerial", "editingSerial", "getRootScene", "setRootScene", "rootScene", "getEditingNestedSceneIds", "()Ljava/util/List;", "editingNestedSceneIds", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "setSpoidEnv", "(Lcom/alightcreative/app/motion/scene/SpoidEnv;)V", "spoidEnv", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SceneHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SceneElement add$default(SceneHolder sceneHolder, SceneElement sceneElement, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i3 & 2) != 0) {
                i2 = -1;
            }
            return sceneHolder.add(sceneElement, i2);
        }
    }

    SceneElement add(SceneElement element, int insertIndex);

    void copyFrom(Scene scene);

    void duplicateAll(Iterable<Long> elementIds);

    void editNestedScene(long elementId);

    void endEditingNestedScene();

    EditCategory getEditCategory();

    int getEditMode();

    List<Long> getEditingNestedSceneIds();

    int getEditingSerial();

    Scene getRootScene();

    Scene getScene();

    SceneSelection getSelection();

    SpoidEnv getSpoidEnv();

    nKE getUserPreviewMode();

    long nextAvailableId();

    void remove(SceneElement element);

    List<SceneElement> removeAll(Iterable<Long> elementIds);

    void setEditCategory(EditCategory editCategory);

    void setEditMode(int i2);

    void setEditingSerial(int i2);

    void setRootScene(Scene scene);

    void setScene(Scene scene);

    void setSelection(SceneSelection sceneSelection);

    void setSpoidEnv(SpoidEnv spoidEnv);

    void setUserPreviewMode(nKE nke);

    void subscribe(Function1<? super SceneHolderState, Unit> callback);

    void unsubscribe(Function1<? super SceneHolderState, Unit> callback);

    void update(SceneElement element);
}
