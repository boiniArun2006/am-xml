package com.alightcreative.app.motion.scene;

import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\bf\u0018\u00002\u00020\u0001J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0014\u0010+\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0014\u0010-\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0014\u0010/\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0014\u00101\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"R\u0014\u00103\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\"R\u0014\u00105\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0014\u00107\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\"R\u0014\u00109\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0014\u0010:\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0014\u0010<\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0014\u0010>\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\"R\u0014\u0010@\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0014\u0010B\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\"R\u0014\u0010D\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0014\u0010F\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\"¨\u0006G"}, d2 = {"Lcom/alightcreative/app/motion/scene/ISceneElementType;", "", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "renderOutline", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "getXmlTag", "()Ljava/lang/String;", "xmlTag", "getHasTransform", "()Z", "hasTransform", "getHasVisualContent", "hasVisualContent", "getHasFillColor", "hasFillColor", "getHasFillImage", "hasFillImage", "getHasFillVideo", "hasFillVideo", "getHasFillGradient", "hasFillGradient", "getHasFillType", "hasFillType", "getHasOutline", "hasOutline", "getHasStroke", "hasStroke", "getHasVolume", "hasVolume", "getHasBorderAndShadow", "hasBorderAndShadow", "getHasText", "hasText", "isRenderable", "getHasSourceMedia", "hasSourceMedia", "getHasNestedScene", "hasNestedScene", "getHasVisualEffects", "hasVisualEffects", "getHasBlendingMode", "hasBlendingMode", "getHasGain", "hasGain", "getHasOpacity", "hasOpacity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISceneElementType {
    boolean getHasBlendingMode();

    boolean getHasBorderAndShadow();

    boolean getHasFillColor();

    boolean getHasFillGradient();

    boolean getHasFillImage();

    boolean getHasFillType();

    boolean getHasFillVideo();

    boolean getHasGain();

    boolean getHasNestedScene();

    boolean getHasOpacity();

    boolean getHasOutline();

    boolean getHasSourceMedia();

    boolean getHasStroke();

    boolean getHasText();

    boolean getHasTransform();

    boolean getHasVisualContent();

    boolean getHasVisualEffects();

    boolean getHasVolume();

    String getXmlTag();

    boolean isRenderable();

    void render(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport);

    void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport);

    void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport);

    void serialize(SceneElement el, String namespace, XmlSerializer serializer);

    SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage);
}
