package androidx.compose.ui.platform;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0007R\u0017\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010!\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0007R\u0017\u0010$\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0007R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00104\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\"\u00108\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\"\u0010<\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\"\u0010A\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0013\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0013\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010'\u001a\u0004\bG\u0010)\"\u0004\bH\u0010+R\"\u0010M\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010'\u001a\u0004\bK\u0010)\"\u0004\bL\u0010+R\"\u0010Q\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010'\u001a\u0004\bO\u0010)\"\u0004\bP\u0010+R\"\u0010U\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010'\u001a\u0004\bS\u0010)\"\u0004\bT\u0010+R\"\u0010Y\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010'\u001a\u0004\bW\u0010)\"\u0004\bX\u0010+R\"\u0010]\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010'\u001a\u0004\b[\u0010)\"\u0004\b\\\u0010+R\"\u0010c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Z\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR\"\u0010k\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010'\u001a\u0004\bi\u0010)\"\u0004\bj\u0010+R$\u0010s\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR(\u0010x\u001a\u00020t8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bu\u0010\u0013\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "J", "getUniqueId", "()J", "uniqueId", "rl", "I", "getLeft", TtmlNode.LEFT, "t", "getTop", "top", "nr", "getRight", TtmlNode.RIGHT, "O", "getBottom", "bottom", "J2", "getWidth", "width", "Uo", "getHeight", "height", "", "KN", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "xMQ", "getScaleY", "setScaleY", "scaleY", "mUb", "getTranslationX", "setTranslationX", "translationX", "gh", "getTranslationY", "setTranslationY", "translationY", "qie", "getElevation", "setElevation", "elevation", "az", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "ambientShadowColor", "ty", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "HI", "getRotationZ", "setRotationZ", "rotationZ", "ck", "getRotationX", "setRotationX", "rotationX", "Ik", "getRotationY", "setRotationY", "rotationY", "r", "getCameraDistance", "setCameraDistance", "cameraDistance", "o", "getPivotX", "setPivotX", "pivotX", "Z", "getPivotY", "setPivotY", "pivotY", "XQ", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToOutline", "S", "getClipToBounds", "setClipToBounds", "clipToBounds", "WPU", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "aYN", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "ViF", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeviceRenderNodeData {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int ambientShadowColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long uniqueId;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float elevation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int spotShadowColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private float scaleY;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.J2(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((iHashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.Uo(this.compositingStrategy);
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + pTYaLzzmJSGAPQ.HaRXdiTum + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.KN(this.compositingStrategy)) + ')';
    }
}
