package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u0091\u00012\u00020\u0001:\u0002¦\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J@\u0010/\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0+¢\u0006\u0002\b-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010I\u001a\n G*\u0004\u0018\u00010F0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010?R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b^\u0010;R\u0016\u0010`\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u001eR\"\u0010b\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010\u001e\u001a\u0004\bb\u0010\u0015\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\u001eR\u0016\u0010g\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u001a\u0010j\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010;\u001a\u0004\bi\u0010=R0\u0010o\u001a\u00020k2\u0006\u0010l\u001a\u00020k8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\\\u001a\u0004\ba\u0010m\"\u0004\bn\u0010\u0010R.\u0010v\u001a\u0004\u0018\u00010p2\b\u0010l\u001a\u0004\u0018\u00010p8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\b>\u0010s\"\u0004\bt\u0010uR0\u0010\r\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bw\u0010\\\u001a\u0004\bh\u0010m\"\u0004\bx\u0010\u0010R*\u0010\u007f\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b9\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001eR7\u0010\u0086\u0001\u001a\u00030\u0081\u00012\u0007\u0010l\u001a\u00030\u0081\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010;\u001a\u0005\b\u0083\u0001\u0010=\"\u0006\b\u0084\u0001\u0010\u0085\u0001R-\u0010\u0089\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0087\u0001\u0010{\u001a\u0005\b\u0088\u0001\u0010}\"\u0004\bK\u0010~R+\u0010\u008a\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bc\u0010{\u001a\u0004\b;\u0010}\"\u0004\b]\u0010~R,\u0010\u008c\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b#\u0010{\u001a\u0005\b\u008b\u0001\u0010}\"\u0004\b^\u0010~R-\u0010\u008f\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008d\u0001\u0010{\u001a\u0005\b\u008e\u0001\u0010}\"\u0004\bC\u0010~R.\u0010\u0092\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010{\u001a\u0005\b\u0090\u0001\u0010}\"\u0005\b\u0091\u0001\u0010~R6\u0010\u0095\u0001\u001a\u00030\u0093\u00012\u0007\u0010l\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010;\u001a\u0004\bq\u0010=\"\u0006\b\u008d\u0001\u0010\u0085\u0001R5\u0010\u0097\u0001\u001a\u00030\u0093\u00012\u0007\u0010l\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bx\u0010;\u001a\u0004\bw\u0010=\"\u0006\b\u0096\u0001\u0010\u0085\u0001R-\u0010\u009a\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0098\u0001\u0010{\u001a\u0005\b\u0099\u0001\u0010}\"\u0004\bV\u0010~R,\u0010\u009b\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0096\u0001\u0010{\u001a\u0004\bz\u0010}\"\u0004\bY\u0010~R-\u0010\u009c\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0090\u0001\u0010{\u001a\u0005\b\u0087\u0001\u0010}\"\u0004\b[\u0010~R4\u0010¡\u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010l\u001a\u0005\u0018\u00010\u009d\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b3\u0010\u009e\u0001\u001a\u0005\be\u0010\u009f\u0001\"\u0005\bO\u0010 \u0001R\u001d\u0010¢\u0001\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u001e\u001a\u0005\b\u0082\u0001\u0010\u0015R&\u0010£\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u0094\u0001\u0010}\"\u0004\bS\u0010~R'\u0010¥\u0001\u001a\u00020\u00132\u0006\u0010l\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b¤\u0001\u0010\u0015\"\u0005\b\u0098\u0001\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006§\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "", "t", "(I)V", "U", "()V", "", "bzg", "()Z", "Xw", "rV9", "jB", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "Z", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "te", "(Landroid/graphics/Outline;J)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "r", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "nHg", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "aYN", "()Landroid/graphics/Matrix;", "J2", "rl", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "J", "getOwnerId", "()J", "nr", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "O", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "Uo", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "KN", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "xMQ", "Landroid/graphics/Picture;", "picture", "mUb", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "pictureDrawScope", "gh", "pictureCanvasHolder", "qie", "I", "az", "ty", "HI", "clipBoundsInvalidated", "ck", "isInvalidated", "g", "(Z)V", "Ik", "outlineIsProvided", "clipToBounds", "o", "getLayerId", "layerId", "Landroidx/compose/ui/graphics/BlendMode;", "value", "()I", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "XQ", "Landroidx/compose/ui/graphics/ColorFilter;", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "S", "e", "", "WPU", "F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Landroidx/compose/ui/geometry/Offset;", "ViF", "getPivotOffset-F1C5BW0", "fD", "(J)V", "pivotOffset", "nY", "s7N", "scaleX", "scaleY", "p5", "translationX", "iF", "M7", "translationY", "N", "wTp", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "E2", "ambientShadowColor", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "spotShadowColor", "X", "eF", "rotationX", "rotationY", "rotationZ", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "()Landroidx/compose/ui/graphics/RenderEffect;", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "supportsSoftwareRendering", "cameraDistance", "v", "clip", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n1#2:584\n278#3:585\n54#4:586\n59#4:588\n54#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:604\n59#4:606\n85#5:587\n90#5:589\n60#5:591\n70#5:594\n85#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:605\n90#5:607\n65#6:590\n69#6:593\n22#7:592\n22#7:595\n41#8,3:608\n44#8,2:637\n41#8,5:639\n305#9,26:611\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n266#1:585\n271#1:586\n272#1:588\n377#1:596\n377#1:598\n380#1:600\n381#1:602\n437#1:604\n437#1:606\n271#1:587\n272#1:589\n276#1:591\n277#1:594\n377#1:597\n377#1:599\n380#1:601\n381#1:603\n437#1:605\n437#1:607\n276#1:590\n277#1:593\n276#1:592\n277#1:595\n439#1:608,3\n439#1:637,2\n460#1:639,5\n440#1:611,26\n*E\n"})
public final class GraphicsViewLayer implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ViewLayer viewLayer;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Rect clipRect;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int y;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final CanvasHolder pictureCanvasHolder;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final CanvasDrawScope pictureDrawScope;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final CanvasHolder canvasHolder;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int x;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DrawChildContainer layerContainer;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private final boolean supportsSoftwareRendering;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Picture picture;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f31698v = !SurfaceUtils.f31732n.n();
    private static final Canvas rV9 = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z2 = f31698v;
        this.picture = z2 ? new Picture() : null;
        this.pictureDrawScope = z2 ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z2 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.INSTANCE.n();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.INSTANCE.te();
        this.compositingStrategy = CompositingStrategy.INSTANCE.n();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.INSTANCE.t();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.INSTANCE;
        this.ambientShadowColor = companion.n();
        this.spotShadowColor = companion.n();
        this.supportsSoftwareRendering = z2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void X(boolean z2) {
        boolean z3 = false;
        this.clipToBounds = z2 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z2 && this.outlineIsProvided) {
            z3 = true;
        }
        viewLayer.setClipToOutline(z3);
    }

    private final void jB() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!v() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void rV9() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = rV9;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().te(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.n(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().te(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final void t(int compositingStrategy) {
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        boolean z2 = true;
        if (CompositingStrategy.J2(compositingStrategy, companion.t())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (CompositingStrategy.J2(compositingStrategy, companion.rl())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z2 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: E2 */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: Ik, reason: from getter */
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void J2() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void KN(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.f31745n.n(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: M7, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: N, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void O(float f3) {
        this.translationY = f3;
        this.viewLayer.setTranslationY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: S, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void T(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j2;
            ViewLayerVerificationHelper28.f31744n.t(this.viewLayer, ColorKt.mUb(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void Uo(float f3) {
        this.scaleX = f3;
        this.viewLayer.setScaleX(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: ViF, reason: from getter */
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: WPU, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: XQ, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void Z(int x2, int y2, long size) {
        if (IntSize.O(this.size, size)) {
            int i2 = this.x;
            if (i2 != x2) {
                this.viewLayer.offsetLeftAndRight(x2 - i2);
            }
            int i3 = this.y;
            if (i3 != y2) {
                this.viewLayer.offsetTopAndBottom(y2 - i3);
            }
        } else {
            if (v()) {
                this.clipBoundsInvalidated = true;
            }
            int i5 = (int) (size >> 32);
            int i7 = (int) (4294967295L & size);
            this.viewLayer.layout(x2, y2, x2 + i5, y2 + i7);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i5 / 2.0f);
                this.viewLayer.setPivotY(i7 / 2.0f);
            }
        }
        this.x = x2;
        this.y = y2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix aYN() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void az(float f3) {
        this.scaleY = f3;
        this.viewLayer.setScaleY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: ck, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void e(int i2) {
        this.compositingStrategy = i2;
        U();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: eF, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void fD(long j2) {
        this.pivotOffset = j2;
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.f31744n.n(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void g(boolean z2) {
        this.isInvalidated = z2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void gh(float f3) {
        this.rotationY = f3;
        this.viewLayer.setRotationY(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void iF(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j2;
            ViewLayerVerificationHelper28.f31744n.rl(this.viewLayer, ColorKt.mUb(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void mUb(float f3) {
        this.rotationX = f3;
        this.viewLayer.setRotationX(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: n, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: nY, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: nr, reason: from getter */
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: o, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: p5, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void qie(float f3) {
        this.rotationZ = f3;
        this.viewLayer.setRotation(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void r(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1 block) {
        CanvasHolder canvasHolder;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.t(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            rV9();
            Picture picture = this.picture;
            if (picture != null) {
                long j2 = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j2 >> 32), (int) (j2 & 4294967295L));
                try {
                    CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
                    if (canvasHolder2 != null) {
                        Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                        canvasHolder2.getAndroidCanvas().te(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long jO = IntSizeKt.O(this.size);
                            Density density2 = canvasDrawScope.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvasKN = canvasDrawScope.getDrawContext().KN();
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                            long jT2 = canvasDrawScope.getDrawContext().t();
                            GraphicsLayer graphicsLayerMUb = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            drawContext.O(density);
                            drawContext.rl(layoutDirection);
                            drawContext.gh(androidCanvas);
                            drawContext.xMQ(jO);
                            drawContext.Uo(layer);
                            androidCanvas.O();
                            try {
                                block.invoke(canvasDrawScope);
                                androidCanvas.n();
                                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                                drawContext2.O(density2);
                                drawContext2.rl(layoutDirection2);
                                drawContext2.gh(canvasKN);
                                drawContext2.xMQ(jT2);
                                drawContext2.Uo(graphicsLayerMUb);
                            } catch (Throwable th) {
                                androidCanvas.n();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.O(density2);
                                drawContext3.rl(layoutDirection2);
                                drawContext3.gh(canvasKN);
                                drawContext3.xMQ(jT2);
                                drawContext3.Uo(graphicsLayerMUb);
                                throw th;
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                        }
                        canvasHolder.getAndroidCanvas().te(canvas);
                        Unit unit = Unit.INSTANCE;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void rl(float f3) {
        this.alpha = f3;
        this.viewLayer.setAlpha(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: s7N, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void te(Outline outline, long outlineSize) {
        boolean zNr = this.viewLayer.nr(outline);
        if (v() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zNr) {
            return;
        }
        this.viewLayer.invalidate();
        rV9();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void ty(float f3) {
        this.translationX = f3;
        this.viewLayer.setTranslationX(f3);
    }

    public boolean v() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void wTp(float f3) {
        this.shadowElevation = f3;
        this.viewLayer.setElevation(f3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void xMQ(float f3) {
        this.viewLayer.setCameraDistance(f3 * this.resources.getDisplayMetrics().densityDpi);
    }

    private final void U() {
        if (bzg()) {
            t(CompositingStrategy.INSTANCE.t());
        } else {
            t(getCompositingStrategy());
        }
    }

    private final boolean Xw() {
        if (BlendMode.e(getBlendMode(), BlendMode.INSTANCE.te()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final boolean bzg() {
        if (!CompositingStrategy.J2(getCompositingStrategy(), CompositingStrategy.INSTANCE.t()) && !Xw()) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void nHg(androidx.compose.ui.graphics.Canvas canvas) {
        jB();
        Canvas canvasNr = AndroidCanvas_androidKt.nr(canvas);
        if (canvasNr.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.n(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasNr.drawPicture(picture);
            }
        }
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
