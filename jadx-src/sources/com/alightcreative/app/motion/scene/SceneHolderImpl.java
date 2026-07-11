package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.caoccao.javet.utils.Float16;
import com.safedk.android.analytics.brandsafety.l;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J#\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010#J#\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070%H\u0016¢\u0006\u0004\b)\u0010*R*\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00103\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010A\u001a\u00020@2\u0006\u0010,\u001a\u00020@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010H\u001a\u00020G2\u0006\u0010,\u001a\u00020G8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00104R0\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR(\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u00120\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010SR\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010[\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010\u0005R$\u0010a\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010]\"\u0004\b`\u0010\u0005¨\u0006b"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneHolderImpl;", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "Lcom/alightcreative/app/motion/scene/Scene;", "initialScene", "<init>", "(Lcom/alightcreative/app/motion/scene/Scene;)V", "", "", "sceneIdsFromRoot", "getNestedScene", "(Ljava/util/List;)Lcom/alightcreative/app/motion/scene/Scene;", "", "dispatchStateChange", "()V", "elementId", "editNestedScene", "(J)V", "endEditingNestedScene", "Lkotlin/Function1;", "Lcom/alightcreative/app/motion/scene/SceneHolderState;", "callback", "subscribe", "(Lkotlin/jvm/functions/Function1;)V", "scene", "copyFrom", "unsubscribe", "Lcom/alightcreative/app/motion/scene/SceneElement;", "element", "", "insertIndex", l.f62657l, "(Lcom/alightcreative/app/motion/scene/SceneElement;I)Lcom/alightcreative/app/motion/scene/SceneElement;", "nextAvailableId", "()J", "update", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "remove", "", "elementIds", "removeAll", "(Ljava/lang/Iterable;)Ljava/util/List;", "duplicateAll", "(Ljava/lang/Iterable;)V", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "value", "spoidEnv", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "setSpoidEnv", "(Lcom/alightcreative/app/motion/scene/SpoidEnv;)V", "editMode", "I", "getEditMode", "()I", "setEditMode", "(I)V", "Lcom/alightcreative/app/motion/scene/EditCategory;", "editCategory", "Lcom/alightcreative/app/motion/scene/EditCategory;", "getEditCategory", "()Lcom/alightcreative/app/motion/scene/EditCategory;", "setEditCategory", "(Lcom/alightcreative/app/motion/scene/EditCategory;)V", "Lyc/nKE;", "userPreviewMode", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "setUserPreviewMode", "(Lyc/nKE;)V", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "getSelection", "()Lcom/alightcreative/app/motion/scene/SceneSelection;", "setSelection", "(Lcom/alightcreative/app/motion/scene/SceneSelection;)V", "_scene", "Lcom/alightcreative/app/motion/scene/Scene;", "_rootScene", "_editingSerial", "editingNestedSceneIds", "Ljava/util/List;", "getEditingNestedSceneIds", "()Ljava/util/List;", "callbacks", "sceneHolderState", "Lcom/alightcreative/app/motion/scene/SceneHolderState;", "getEditingSerial", "setEditingSerial", "editingSerial", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "setScene", "getRootScene", "setRootScene", "rootScene", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneHolderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1120:1\n1797#2,3:1121\n1863#2,2:1125\n774#2:1127\n865#2,2:1128\n774#2:1130\n865#2,2:1131\n1279#2,2:1133\n1293#2,4:1135\n1368#2:1139\n1454#2,2:1140\n1755#2,3:1146\n1456#2,3:1149\n1#3:1124\n389#4,4:1142\n*S KotlinDebug\n*F\n+ 1 Scene.kt\ncom/alightcreative/app/motion/scene/SceneHolderImpl\n*L\n410#1:1121,3\n439#1:1125,2\n482#1:1127\n482#1:1128,2\n489#1:1130\n489#1:1131,2\n492#1:1133,2\n492#1:1135,4\n494#1:1139\n494#1:1140,2\n500#1:1146,3\n494#1:1149,3\n496#1:1142,4\n*E\n"})
public final class SceneHolderImpl implements SceneHolder {
    public static final int $stable = 8;
    private int _editingSerial;
    private Scene _rootScene;
    private Scene _scene;
    private List<? extends Function1<? super SceneHolderState, Unit>> callbacks;
    private EditCategory editCategory;
    private int editMode;
    private List<Long> editingNestedSceneIds;
    private SceneHolderState sceneHolderState;
    private SceneSelection selection;
    private SpoidEnv spoidEnv;
    private nKE userPreviewMode;

    public SceneHolderImpl(Scene initialScene) {
        Intrinsics.checkNotNullParameter(initialScene, "initialScene");
        this.spoidEnv = new SpoidEnv(null, null, null, null, 15, null);
        this.userPreviewMode = new nKE(0.0f, null, 0.0f, null, false, false, false, 0.0f, 0.0f, null, 0.0f, null, false, false, null, Float16.EXPONENT_SIGNIFICAND_MASK, null);
        this.selection = SceneKt.getEMPTY_SCENE_SELECTION();
        this._scene = initialScene;
        this._rootScene = initialScene;
        this.editingNestedSceneIds = CollectionsKt.emptyList();
        this.callbacks = CollectionsKt.emptyList();
        this.sceneHolderState = new SceneHolderState(this._scene, getSelection(), getEditMode(), getUserPreviewMode(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_editMode_$lambda$0(SceneHolderImpl sceneHolderImpl, int i2) {
        String str;
        String methodName = new Throwable().getStackTrace()[1].getMethodName();
        String str2 = "0";
        if (sceneHolderImpl.editMode == 0) {
            str = "0";
        } else {
            String resourceName = IvA.n.rl().getResources().getResourceName(sceneHolderImpl.editMode);
            Intrinsics.checkNotNullExpressionValue(resourceName, "getResourceName(...)");
            str = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) resourceName, new String[]{"/"}, false, 0, 6, (Object) null));
        }
        if (i2 != 0) {
            String resourceName2 = IvA.n.rl().getResources().getResourceName(i2);
            Intrinsics.checkNotNullExpressionValue(resourceName2, "getResourceName(...)");
            str2 = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) resourceName2, new String[]{"/"}, false, 0, 6, (Object) null));
        }
        return "SceneHolder:EditMode Changed -- " + str + " -> " + str2 + " (by " + methodName + ")";
    }

    private static final String _set_scene_$lambda$3() {
        return "Update Scene (BEFORE) : (ROOT)";
    }

    private static final String _set_scene_$lambda$5$lambda$4(List list, SceneElement sceneElement) {
        return "Update Scene (BEFORE) : " + StringsKt.repeat(".   ", list.size()) + "." + sceneElement.getId() + " (" + sceneElement.getType().name() + ":" + sceneElement.getLabel() + ")";
    }

    private static final String _set_scene_$lambda$6() {
        return "Update Scene (AFTER)  : (ROOT)";
    }

    private static final String _set_scene_$lambda$8$lambda$7(List list, SceneElement sceneElement) {
        return "Update Scene (AFTER)  : " + StringsKt.repeat(".   ", list.size()) + "." + sceneElement.getId() + " (" + sceneElement.getType().name() + ":" + sceneElement.getLabel() + ")";
    }

    private final void dispatchStateChange() {
        this.sceneHolderState = new SceneHolderState(this._scene, getSelection(), getEditMode(), getUserPreviewMode(), getEditCategory());
        Iterator<T> it = this.callbacks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.sceneHolderState);
        }
    }

    private final Scene getNestedScene(List<Long> sceneIdsFromRoot) {
        SceneElement sceneElementElementById;
        Scene nestedSceneApplyingClipping = this._rootScene;
        Iterator<T> it = sceneIdsFromRoot.iterator();
        while (it.hasNext()) {
            nestedSceneApplyingClipping = (nestedSceneApplyingClipping == null || (sceneElementElementById = SceneKt.elementById(nestedSceneApplyingClipping, Long.valueOf(((Number) it.next()).longValue()))) == null) ? null : NestedSceneClippingKt.getNestedSceneApplyingClipping(sceneElementElementById);
        }
        return nestedSceneApplyingClipping;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public SceneElement add(SceneElement element, int insertIndex) {
        Intrinsics.checkNotNullParameter(element, "element");
        SceneElement sceneElementPrepElementForAdd = SceneKt.prepElementForAdd(this._scene, element);
        setScene(SceneKt.uniquifyIds(Scene.copy$default(get_scene(), null, 0, 0, 0, 0, 0, insertIndex >= 0 ? HI0.rv6.n(this._scene.getElements(), insertIndex, sceneElementPrepElementForAdd) : CollectionsKt.plus((Collection<? extends SceneElement>) this._scene.getElements(), sceneElementPrepElementForAdd), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null)));
        return sceneElementPrepElementForAdd;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void copyFrom(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        setScene(scene);
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void duplicateAll(Iterable<Long> elementIds) {
        List listListOf;
        String strSubstring;
        Intrinsics.checkNotNullParameter(elementIds, "elementIds");
        List<SceneElement> elements = this._scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (CollectionsKt.contains(elementIds, Long.valueOf(((SceneElement) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(elementIds, 10)), 16));
        for (Long l2 : elementIds) {
            l2.longValue();
            linkedHashMap.put(l2, Long.valueOf(SceneKt.getNextAvailableId(this._scene)));
        }
        Scene scene = this._scene;
        List<SceneElement> elements2 = scene.getElements();
        ArrayList arrayList3 = new ArrayList();
        for (SceneElement sceneElement : elements2) {
            if (arrayList.contains(sceneElement)) {
                String displayLabel = SceneElementKt.getDisplayLabel(sceneElement);
                int lastIndex = StringsKt.getLastIndex(displayLabel);
                while (true) {
                    if (-1 >= lastIndex) {
                        strSubstring = "";
                        break;
                    }
                    char cCharAt = displayLabel.charAt(lastIndex);
                    if (!CharsKt.isWhitespace(cCharAt) && !Character.isDigit(cCharAt)) {
                        strSubstring = displayLabel.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    lastIndex--;
                }
                String string = StringsKt.trim((CharSequence) (StringsKt.endsWith$default(strSubstring, " Copy", false, 2, (Object) null) ? StringsKt.removeSuffix(strSubstring, (CharSequence) " Copy") : SceneElementKt.getDisplayLabel(sceneElement))).toString();
                String str = string + " Copy";
                int i2 = 1;
                while (true) {
                    if (!arrayList2.contains(str)) {
                        List<SceneElement> elements3 = this._scene.getElements();
                        if (elements3 != null && elements3.isEmpty()) {
                            break;
                        }
                        Iterator<T> it = elements3.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) SceneElementKt.getDisplayLabel((SceneElement) it.next())).toString(), str)) {
                            }
                        }
                        break;
                    }
                    i2++;
                    str = string + " Copy " + i2;
                    sceneElement = sceneElement;
                }
                arrayList2.add(str);
                Object obj2 = linkedHashMap.get(Long.valueOf(sceneElement.getId()));
                Intrinsics.checkNotNull(obj2);
                SceneElement sceneElement2 = sceneElement;
                listListOf = CollectionsKt.listOf((Object[]) new SceneElement[]{sceneElement2, SceneElementKt.recreateEngineState(SceneElement.copy$default(sceneElement2, null, 0, 0, ((Number) obj2).longValue(), null, str, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, (sceneElement.getParent() == null || !CollectionsKt.contains(elementIds, sceneElement.getParent())) ? sceneElement.getParent() : (Long) linkedHashMap.get(sceneElement.getParent()), false, null, null, -41, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null))});
            } else {
                listListOf = CollectionsKt.listOf(sceneElement);
            }
            CollectionsKt.addAll(arrayList3, listListOf);
        }
        setScene(SceneKt.uniquifyIds(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, arrayList3, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null)));
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void editNestedScene(final long elementId) {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.Mf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneHolderImpl.editNestedScene$lambda$9(elementId, this);
            }
        });
        if (!SceneKt.isNestedSceneValid(this)) {
            throw new IllegalStateException("Check failed.");
        }
        List<Long> listPlus = CollectionsKt.plus((Collection<? extends Long>) getEditingNestedSceneIds(), Long.valueOf(elementId));
        Scene nestedScene = getNestedScene(listPlus);
        if (nestedScene != null) {
            this.editingNestedSceneIds = listPlus;
            this._scene = nestedScene;
            dispatchStateChange();
        } else {
            throw new IllegalArgumentException("No element with ID=" + elementId);
        }
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public EditCategory getEditCategory() {
        return this.editCategory;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public int getEditMode() {
        return this.editMode;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public List<Long> getEditingNestedSceneIds() {
        return this.editingNestedSceneIds;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    /* JADX INFO: renamed from: getEditingSerial, reason: from getter */
    public int get_editingSerial() {
        return this._editingSerial;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    /* JADX INFO: renamed from: getRootScene, reason: from getter */
    public Scene get_rootScene() {
        return this._rootScene;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    /* JADX INFO: renamed from: getScene, reason: from getter */
    public Scene get_scene() {
        return this._scene;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public SceneSelection getSelection() {
        return this.selection;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public SpoidEnv getSpoidEnv() {
        return this.spoidEnv;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public nKE getUserPreviewMode() {
        return this.userPreviewMode;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public long nextAvailableId() {
        return SceneKt.getNextAvailableId(this._scene);
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void remove(SceneElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this._scene.getElements().contains(element)) {
            Scene scene = this._scene;
            setScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, CollectionsKt.minus(scene.getElements(), element), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
        }
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public List<SceneElement> removeAll(Iterable<Long> elementIds) {
        Intrinsics.checkNotNullParameter(elementIds, "elementIds");
        List<SceneElement> elements = this._scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (CollectionsKt.contains(elementIds, Long.valueOf(((SceneElement) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Scene scene = this._scene;
        setScene(Scene.copy$default(scene, null, 0, 0, 0, 0, 0, CollectionsKt.minus((Iterable) scene.getElements(), (Iterable) CollectionsKt.toSet(arrayList)), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
        return arrayList;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setEditCategory(EditCategory editCategory) {
        this.editCategory = editCategory;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setEditMode(final int i2) {
        if (this.editMode != i2) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.KH
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneHolderImpl._set_editMode_$lambda$0(this.f45958n, i2);
                }
            });
            this.editMode = i2;
            if (Intrinsics.areEqual(getSpoidEnv(), new SpoidEnv(null, null, null, null, 15, null))) {
                dispatchStateChange();
            } else {
                setSpoidEnv(new SpoidEnv(null, null, null, null, 15, null));
            }
        }
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setEditingSerial(int i2) {
        this._editingSerial = i2;
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setRootScene(Scene value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this._rootScene != value) {
            this._rootScene = value;
            while (!getEditingNestedSceneIds().isEmpty() && getNestedScene(getEditingNestedSceneIds()) == null) {
                this.editingNestedSceneIds = CollectionsKt.dropLast(getEditingNestedSceneIds(), 1);
            }
            Scene nestedScene = getNestedScene(getEditingNestedSceneIds());
            if (nestedScene == null) {
                nestedScene = this._rootScene;
            }
            this._scene = nestedScene;
            if (nestedScene == this._rootScene) {
                this.editingNestedSceneIds = CollectionsKt.emptyList();
            }
            dispatchStateChange();
        }
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setScene(Scene value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this._scene != value) {
            final Scene scenePerformAssociatedEdit = AssociatedEditKt.performAssociatedEdit(value, getEditCategory());
            if (this._scene == this._rootScene) {
                Scene sceneCopy$default = Scene.copy$default(scenePerformAssociatedEdit, null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, System.currentTimeMillis(), null, null, 917503, null);
                this._scene = sceneCopy$default;
                this._rootScene = sceneCopy$default;
            } else {
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.o7q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SceneHolderImpl._set_scene_$lambda$2(scenePerformAssociatedEdit);
                    }
                });
                this._rootScene = Scene.copy$default(SceneKt.copyUpdatingNestedScene(this._rootScene, getEditingNestedSceneIds(), scenePerformAssociatedEdit), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, System.currentTimeMillis(), null, null, 917503, null);
                this._scene = scenePerformAssociatedEdit;
                if (!SceneKt.isNestedSceneValid(this)) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            dispatchStateChange();
        }
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setSelection(SceneSelection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.selection, value)) {
            return;
        }
        this.selection = value;
        dispatchStateChange();
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setSpoidEnv(SpoidEnv value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.spoidEnv, value)) {
            return;
        }
        this.spoidEnv = value;
        dispatchStateChange();
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void setUserPreviewMode(nKE value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.userPreviewMode, value)) {
            return;
        }
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.YzO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneHolderImpl._set_userPreviewMode_$lambda$1(this.f46054n);
            }
        });
        this.userPreviewMode = value;
        dispatchStateChange();
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void subscribe(Function1<? super SceneHolderState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks = CollectionsKt.plus((Collection<? extends Function1<? super SceneHolderState, Unit>>) this.callbacks, callback);
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void unsubscribe(Function1<? super SceneHolderState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks = CollectionsKt.minus(this.callbacks, callback);
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void update(final SceneElement element) {
        Object next;
        SceneElement sceneElement;
        SceneElement sceneElementCopy$default;
        Intrinsics.checkNotNullParameter(element, "element");
        Iterator<T> it = this._scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SceneElement) next).getId() == element.getId()) {
                    break;
                }
            }
        }
        SceneElement sceneElement2 = (SceneElement) next;
        if (sceneElement2 == null) {
            XoT.C.HI(this, new Function0() { // from class: com.alightcreative.app.motion.scene.M5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneHolderImpl.update$lambda$15(element);
                }
            });
            return;
        }
        if (sceneElement2.getLiveShape().getId() == null || sceneElement2.getLiveShape().getParamValues() == element.getLiveShape().getParamValues()) {
            sceneElement = sceneElement2;
            sceneElementCopy$default = element;
        } else {
            sceneElement = sceneElement2;
            sceneElementCopy$default = SceneElement.copy$default(element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, CubicBSplineKt.keyable(LiveShapeScriptKt.getShapeOutline(element, 0.0f)), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
        }
        setScene(Scene.copy$default(get_scene(), null, 0, 0, 0, 0, 0, HI0.rv6.nr(this._scene.getElements(), sceneElement, sceneElementCopy$default), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
        XoT.C.qie(this, new Function0() { // from class: com.alightcreative.app.motion.scene.xZD
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneHolderImpl.update$lambda$14(element);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_scene_$lambda$2(Scene scene) {
        return "Update scene: layers=" + scene.getElements().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_userPreviewMode_$lambda$1(SceneHolderImpl sceneHolderImpl) {
        return "userPreviewMode changed: " + sceneHolderImpl.getUserPreviewMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String editNestedScene$lambda$9(long j2, SceneHolderImpl sceneHolderImpl) {
        boolean z2;
        List<Long> editingNestedSceneIds = sceneHolderImpl.getEditingNestedSceneIds();
        int iIdentityHashCode = System.identityHashCode(sceneHolderImpl.get_rootScene());
        int iIdentityHashCode2 = System.identityHashCode(sceneHolderImpl.get_scene());
        boolean zAreEqual = Intrinsics.areEqual(sceneHolderImpl.get_rootScene(), sceneHolderImpl.get_scene());
        if (sceneHolderImpl.get_rootScene() == sceneHolderImpl.get_scene()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return "editNestedScene(" + j2 + "):  editingNestedSceneIds=" + editingNestedSceneIds + " rootScene=" + iIdentityHashCode + " scene=" + iIdentityHashCode2 + " rootScene==scene:" + zAreEqual + " rootScene===scene:" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String update$lambda$14(SceneElement sceneElement) {
        return "Updated element " + sceneElement.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String update$lambda$15(SceneElement sceneElement) {
        return "Warning: Skip update of element id=" + sceneElement.getId() + " because it was not found in scene";
    }

    @Override // com.alightcreative.app.motion.scene.SceneHolder
    public void endEditingNestedScene() {
        Scene sceneWithUpdatedTrimmingFor;
        if (SceneKt.isNestedSceneValid(this)) {
            List<Long> listDropLast = CollectionsKt.dropLast(getEditingNestedSceneIds(), 1);
            Scene nestedScene = getNestedScene(listDropLast);
            if (nestedScene != null) {
                Long l2 = (Long) CollectionsKt.lastOrNull((List) getEditingNestedSceneIds());
                if (l2 != null && (sceneWithUpdatedTrimmingFor = SceneKt.withUpdatedTrimmingFor(nestedScene, l2.longValue())) != null) {
                    nestedScene = sceneWithUpdatedTrimmingFor;
                }
                this.editingNestedSceneIds = listDropLast;
                this._scene = nestedScene;
                dispatchStateChange();
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Check failed.");
    }
}
