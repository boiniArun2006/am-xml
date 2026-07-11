package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ¥\u00012\u00020\u0001:\u0002Ä\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0010JA\u00102\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b0ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\f2\u0006\u00105\u001a\u0002042\b\u00108\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010\u0010J\u0015\u0010=\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b=\u0010>J.\u0010C\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020?2\b\b\u0002\u0010\u000b\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020Aø\u0001\u0000¢\u0006\u0004\bC\u0010DJ$\u0010E\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020?2\b\b\u0002\u0010\u000b\u001a\u00020@ø\u0001\u0000¢\u0006\u0004\bE\u0010\u000eJ\u0010\u0010G\u001a\u00020FH\u0086@¢\u0006\u0004\bG\u0010HR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010QR'\u0010S\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010RR%\u0010T\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010XR\u001c\u0010[\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u0010ZR\u001c\u0010\\\u001a\u00020@8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010ZR\u0016\u0010_\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0016\u0010j\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010XR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010~\u001a\u00020W2\u0006\u0010{\u001a\u00020W8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010X\u001a\u0004\b|\u0010}R5\u0010\t\u001a\u00020\b2\u0006\u0010\u007f\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0080\u0001\u0010Z\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0085\u0001\u0010Z\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001\"\u0006\b\u0087\u0001\u0010\u0084\u0001R5\u0010\u008a\u0001\u001a\u00020?2\u0006\u0010\u007f\u001a\u00020?8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0088\u0001\u0010Z\u001a\u0005\bp\u0010\u0082\u0001\"\u0006\b\u0089\u0001\u0010\u0084\u0001R5\u0010\u008e\u0001\u001a\u00020W2\u0006\u0010\u007f\u001a\u00020W8F@FX\u0086\u000e¢\u0006\u001c\n\u0005\b\u0086\u0001\u0010X\u0012\u0005\b\u008d\u0001\u0010\u0010\u001a\u0004\bd\u0010}\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u008f\u0001R0\u0010\u0095\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u007f\u001a\u00030\u0091\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bi\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R(\u0010\u0099\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b]\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R0\u0010\u009c\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u007f\u001a\u00030\u009a\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\ba\u0010\u0092\u0001\"\u0006\b\u009b\u0001\u0010\u0094\u0001R.\u0010¡\u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010\u009d\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bg\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R)\u0010£\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0096\u0001\"\u0006\b¢\u0001\u0010\u0098\u0001R(\u0010¤\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0085\u0001\u0010\u0096\u0001\"\u0005\bZ\u0010\u0098\u0001R)\u0010§\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¥\u0001\u0010\u0096\u0001\"\u0006\b¦\u0001\u0010\u0098\u0001R)\u0010ª\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010\u0096\u0001\"\u0006\b©\u0001\u0010\u0098\u0001R)\u0010¬\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0096\u0001\"\u0006\b«\u0001\u0010\u0098\u0001R(\u0010®\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bt\u0010\u0096\u0001\"\u0006\b\u00ad\u0001\u0010\u0098\u0001R(\u0010°\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0096\u0001\"\u0006\b¯\u0001\u0010\u0098\u0001R(\u0010²\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bX\u0010\u0096\u0001\"\u0006\b±\u0001\u0010\u0098\u0001R)\u0010µ\u0001\u001a\u00020A2\u0006\u0010\u007f\u001a\u00020A8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b³\u0001\u0010\u0096\u0001\"\u0006\b´\u0001\u0010\u0098\u0001R/\u0010»\u0001\u001a\u0005\u0018\u00010¶\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010¶\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u0013\u0010½\u0001\u001a\u00020`8F¢\u0006\u0007\u001a\u0005\bl\u0010¼\u0001R1\u0010Á\u0001\u001a\u00030¾\u00012\u0007\u0010\u007f\u001a\u00030¾\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u001a\u0006\b¿\u0001\u0010\u0082\u0001\"\u0006\bÀ\u0001\u0010\u0084\u0001R0\u0010Ã\u0001\u001a\u00030¾\u00012\u0007\u0010\u007f\u001a\u00030¾\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0006\bÂ\u0001\u0010\u0082\u0001\"\u0005\bu\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Å\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "Landroidx/compose/ui/graphics/layer/LayerManager;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "Landroidx/compose/ui/unit/IntSize;", "size", "", "P5", "(JJ)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "mUb", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "graphicsLayer", "nr", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "dR0", "(Landroid/graphics/Canvas;)V", "N", "E2", "e", "Landroid/graphics/RectF;", "fD", "()Landroid/graphics/RectF;", "O", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "Landroid/graphics/Outline;", "z", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "iF", "()Landroid/graphics/Outline;", "J2", "s7N", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "X", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "xMQ", "(Landroidx/compose/ui/graphics/Canvas;)V", "parentLayer", "KN", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "nHg", "Uo", "jB", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "", "cornerRadius", "FX", "(JJF)V", "M7", "Landroidx/compose/ui/graphics/ImageBitmap;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "rl", "Landroidx/compose/ui/graphics/layer/LayerManager;", "t", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/jvm/functions/Function1;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "Z", "outlineDirty", "J", "roundRectOutlineTopLeft", "roundRectOutlineSize", "gh", "F", "roundRectCornerRadius", "Landroidx/compose/ui/graphics/Outline;", "qie", "Landroidx/compose/ui/graphics/Outline;", "internalOutline", "az", "Landroidx/compose/ui/graphics/Path;", "outlinePath", "ty", "roundRectClipPath", "HI", "usePathForClip", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "ck", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareDrawScope", "Landroidx/compose/ui/graphics/Paint;", "Ik", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "", "r", "I", "parentLayerUsages", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "o", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "childDependenciesTracker", "<set-?>", "te", "()Z", "isReleased", "value", "XQ", "ViF", "()J", "GR", "(J)V", "S", "aYN", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "WPU", "U", "pivotOffset", "bzg", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "()I", "Xw", "(I)V", "compositingStrategy", "()F", "wTp", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "B", "scaleX", "scaleY", "nY", "Nxk", "translationX", "g", "Y", "translationY", "D", "shadowElevation", "eF", "rotationX", "E", "rotationY", "M", "rotationZ", "getCameraDistance", "rV9", "cameraDistance", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "p5", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "v", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "spotShadowColor", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,1018:1\n640#1,6:1109\n646#1,3:1116\n644#1,7:1119\n640#1,6:1190\n646#1,3:1197\n644#1,7:1200\n153#2:1019\n153#2:1115\n153#2:1150\n153#2:1196\n44#3,6:1020\n50#3,14:1027\n64#3,4:1066\n104#3,6:1156\n110#3,3:1187\n1#4:1026\n1#4:1074\n231#5,3:1041\n200#5,7:1044\n211#5,3:1052\n214#5,9:1056\n234#5:1065\n231#5,3:1162\n200#5,7:1165\n211#5,3:1173\n214#5,9:1177\n234#5:1186\n1399#6:1051\n1270#6:1055\n1399#6:1172\n1270#6:1176\n54#7:1070\n59#7:1072\n85#8:1071\n90#8:1073\n80#8:1108\n60#8:1127\n70#8:1134\n60#8:1141\n70#8:1146\n60#8:1208\n70#8:1211\n60#8:1214\n70#8:1217\n53#8,3:1220\n305#9,26:1075\n36#10,5:1101\n36#10,5:1151\n26#11:1106\n22#11,5:1128\n22#11,5:1135\n22#11:1142\n26#11:1144\n22#11:1147\n26#11:1149\n22#11:1209\n22#11:1212\n22#11:1215\n22#11:1218\n30#12:1107\n65#13:1126\n69#13:1133\n65#13:1140\n69#13:1145\n65#13:1207\n69#13:1210\n57#14:1143\n61#14:1148\n57#14:1213\n61#14:1216\n33#15:1219\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n620#1:1109,6\n620#1:1116,3\n620#1:1119,7\n746#1:1190,6\n746#1:1197,3\n746#1:1200,7\n153#1:1019\n620#1:1115\n645#1:1150\n746#1:1196\n440#1:1020,6\n440#1:1027,14\n440#1:1066,4\n710#1:1156,6\n710#1:1187,3\n440#1:1026\n440#1:1041,3\n440#1:1044,7\n440#1:1052,3\n440#1:1056,9\n440#1:1065\n710#1:1162,3\n710#1:1165,7\n710#1:1173,3\n710#1:1177,9\n710#1:1186\n440#1:1051\n440#1:1055\n710#1:1172\n710#1:1176\n456#1:1070\n457#1:1072\n456#1:1071\n457#1:1073\n605#1:1108\n622#1:1127\n623#1:1134\n625#1:1141\n627#1:1146\n747#1:1208\n748#1:1211\n749#1:1214\n750#1:1217\n754#1:1220,3\n558#1:1075,26\n600#1:1101,5\n663#1:1151,5\n605#1:1106\n622#1:1128,5\n623#1:1135,5\n625#1:1142\n625#1:1144\n627#1:1147\n627#1:1149\n747#1:1209\n748#1:1212\n749#1:1215\n750#1:1218\n605#1:1107\n622#1:1126\n623#1:1133\n625#1:1140\n627#1:1145\n747#1:1207\n748#1:1210\n625#1:1143\n627#1:1148\n749#1:1213\n750#1:1216\n754#1:1219\n*E\n"})
public final class GraphicsLayer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final LayerSnapshotImpl f31664g;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private Paint softwareLayerPaint;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Outline androidOutline;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private RectF pathBounds;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private long topLeft;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private Path outlinePath;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private CanvasDrawScope softwareDrawScope;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private float roundRectCornerRadius;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private long roundRectOutlineSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final GraphicsLayerImpl impl;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ChildLayerDependenciesTracker childDependenciesTracker;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Outline internalOutline;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int parentLayerUsages;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final LayerManager layerManager;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private Path roundRectClipPath;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Density density = DrawContextKt.n();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private LayoutDirection layoutDirection = LayoutDirection.f34160n;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function1 drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void n(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            n(drawScope);
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Function1 clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            n(drawScope);
            return Unit.INSTANCE;
        }

        public final void n(DrawScope drawScope) {
            Path path = this.f31672n.outlinePath;
            if (!this.f31672n.usePathForClip || !this.f31672n.getClip() || path == null) {
                this.f31672n.mUb(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.f31672n;
            int iRl = ClipOp.INSTANCE.rl();
            DrawContext drawContext = drawScope.getDrawContext();
            long jT2 = drawContext.t();
            drawContext.KN().O();
            try {
                drawContext.getTransform().t(path, iRl);
                graphicsLayer.mUb(drawScope);
            } finally {
                drawContext.KN().n();
                drawContext.xMQ(jT2);
            }
        }
    };

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean outlineDirty = true;

    private final void s7N() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.n();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.t();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void M7(long topLeft, long size) {
        FX(topLeft, size, 0.0f);
    }

    static {
        f31664g = LayerManager.INSTANCE.n() ? LayerSnapshotV21.f31713n : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.f31723n : SurfaceUtils.f31732n.n() ? LayerSnapshotV22.f31714n : LayerSnapshotV21.f31713n;
    }

    private final void E2() {
        this.parentLayerUsages++;
    }

    private final void J2() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.J2(this);
            } else {
                Uo();
            }
        }
    }

    private final void N() {
        if (this.impl.HI()) {
            return;
        }
        try {
            T();
        } catch (Throwable unused) {
        }
    }

    private final void O() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || WPU() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFFD = fD();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFFD, false);
                    Outline outlineZ = z(path);
                    if (outlineZ != null) {
                        outlineZ.setAlpha(gh());
                        outline = outlineZ;
                    }
                    this.impl.te(outline, IntSize.t((4294967295L & ((long) Math.round(rectFFD.height()))) | (((long) Math.round(rectFFD.width())) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.X(false);
                        this.impl.J2();
                    } else {
                        this.impl.X(this.clip);
                    }
                } else {
                    this.impl.X(this.clip);
                    Size.INSTANCE.rl();
                    Outline outlineIF = iF();
                    long jO = IntSizeKt.O(this.size);
                    long j2 = this.roundRectOutlineTopLeft;
                    long j3 = this.roundRectOutlineSize;
                    long j4 = j3 == 9205357640488583168L ? jO : j3;
                    int i2 = (int) (j2 >> 32);
                    int i3 = (int) (j2 & 4294967295L);
                    outlineIF.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j4 >> 32))), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 & 4294967295L))), this.roundRectCornerRadius);
                    outlineIF.setAlpha(gh());
                    this.impl.te(outlineIF, IntSizeKt.t(j4));
                }
            } else {
                this.impl.X(false);
                this.impl.te(null, IntSize.INSTANCE.n());
            }
        }
        this.outlineDirty = false;
    }

    private final void P5(long topLeft, long size) {
        this.impl.Z(IntOffset.gh(topLeft), IntOffset.qie(topLeft), size);
    }

    private final void T() {
        this.impl.r(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void a(long j2) {
        if (IntSize.O(this.size, j2)) {
            return;
        }
        this.size = j2;
        P5(this.topLeft, j2);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            O();
        }
    }

    private final void dR0(Canvas androidCanvas) {
        Canvas canvas;
        float fGh = IntOffset.gh(this.topLeft);
        float fQie = IntOffset.qie(this.topLeft);
        float fGh2 = IntOffset.gh(this.topLeft) + ((int) (this.size >> 32));
        float fQie2 = IntOffset.qie(this.topLeft) + ((int) (this.size & 4294967295L));
        float fGh3 = gh();
        ColorFilter colorFilterTy = ty();
        int iQie = qie();
        if (fGh3 < 1.0f || !BlendMode.e(iQie, BlendMode.INSTANCE.te()) || colorFilterTy != null || CompositingStrategy.J2(HI(), CompositingStrategy.INSTANCE.t())) {
            Paint paintN = this.softwareLayerPaint;
            if (paintN == null) {
                paintN = AndroidPaint_androidKt.n();
                this.softwareLayerPaint = paintN;
            }
            paintN.rl(fGh3);
            paintN.r(iQie);
            paintN.fD(colorFilterTy);
            canvas = androidCanvas;
            canvas.saveLayer(fGh, fQie, fGh2, fQie2, paintN.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fGh, fQie);
        canvas.concat(this.impl.aYN());
    }

    private final void e() {
        this.parentLayerUsages--;
        J2();
    }

    private final RectF fD() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final Outline iF() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mUb(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null && mutableScatterSet.J2()) {
            MutableScatterSet mutableScatterSetN = childLayerDependenciesTracker.oldDependenciesSet;
            if (mutableScatterSetN == null) {
                mutableScatterSetN = ScatterSetKt.n();
                childLayerDependenciesTracker.oldDependenciesSet = mutableScatterSetN;
            }
            mutableScatterSetN.mUb(mutableScatterSet);
            mutableScatterSet.ty();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.e();
        }
        MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.oldDependenciesSet;
        if (mutableScatterSet2 == null || !mutableScatterSet2.J2()) {
            return;
        }
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            ((GraphicsLayer) objArr[(i2 << 3) + i5]).e();
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        mutableScatterSet2.ty();
    }

    private final void nr(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.xMQ(graphicsLayer)) {
            graphicsLayer.E2();
        }
    }

    private final Outline z(Path path) {
        Outline outline;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28 || path.rl()) {
            Outline outlineIF = iF();
            if (i2 >= 30) {
                OutlineVerificationHelper.f31727n.n(outlineIF, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineIF.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineIF.canClip();
            outline = outlineIF;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.g(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    public final void B(float f3) {
        if (this.impl.getScaleX() == f3) {
            return;
        }
        this.impl.Uo(f3);
    }

    public final void D(float f3) {
        if (this.impl.getShadowElevation() == f3) {
            return;
        }
        this.impl.wTp(f3);
        this.outlineDirty = true;
        O();
    }

    public final void E(float f3) {
        if (this.impl.getRotationY() == f3) {
            return;
        }
        this.impl.gh(f3);
    }

    public final void FX(long topLeft, long size, float cornerRadius) {
        if (Offset.mUb(this.roundRectOutlineTopLeft, topLeft) && Size.KN(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        s7N();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        O();
    }

    public final void GR(long j2) {
        if (IntOffset.mUb(this.topLeft, j2)) {
            return;
        }
        this.topLeft = j2;
        P5(j2, this.size);
    }

    public final int HI() {
        return this.impl.getCompositingStrategy();
    }

    public final void I(long j2) {
        if (Color.HI(j2, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.T(j2);
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final void J(float f3) {
        if (this.impl.getScaleY() == f3) {
            return;
        }
        this.impl.az(f3);
    }

    public final void KN(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        boolean z2;
        boolean z3;
        if (this.isReleased) {
            return;
        }
        O();
        N();
        boolean z4 = WPU() > 0.0f;
        if (z4) {
            canvas.az();
        }
        Canvas canvasNr = AndroidCanvas_androidKt.nr(canvas);
        boolean zIsHardwareAccelerated = canvasNr.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            dR0(canvasNr);
        }
        boolean z5 = !zIsHardwareAccelerated && this.clip;
        if (z5) {
            canvas.O();
            androidx.compose.ui.graphics.Outline outlineCk = ck();
            if (outlineCk instanceof Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.r(canvas, outlineCk.getRect(), 0, 2, null);
            } else if (outlineCk instanceof Outline.Rounded) {
                Path pathN = this.roundRectClipPath;
                if (pathN != null) {
                    pathN.gh();
                } else {
                    pathN = AndroidPath_androidKt.n();
                    this.roundRectClipPath = pathN;
                }
                Path.ty(pathN, ((Outline.Rounded) outlineCk).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.gh(canvas, pathN, 0, 2, null);
            } else if (outlineCk instanceof Outline.Generic) {
                androidx.compose.ui.graphics.Canvas.gh(canvas, ((Outline.Generic) outlineCk).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.nr(this);
        }
        if (AndroidCanvas_androidKt.nr(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z2 = z4;
            z3 = z5;
            this.impl.nHg(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            DrawScope drawScope = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jO = IntSizeKt.O(this.size);
            Density density2 = drawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = drawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvasKN = drawScope.getDrawContext().KN();
            long jT2 = drawScope.getDrawContext().t();
            z2 = z4;
            GraphicsLayer graphicsLayerMUb = drawScope.getDrawContext().getGraphicsLayer();
            z3 = z5;
            DrawContext drawContextMx = drawScope.getDrawContext();
            drawContextMx.O(density);
            drawContextMx.rl(layoutDirection);
            drawContextMx.gh(canvas);
            drawContextMx.xMQ(jO);
            drawContextMx.Uo(this);
            canvas.O();
            try {
                mUb(drawScope);
            } finally {
                canvas.n();
                DrawContext drawContextMx2 = drawScope.getDrawContext();
                drawContextMx2.O(density2);
                drawContextMx2.rl(layoutDirection2);
                drawContextMx2.gh(canvasKN);
                drawContextMx2.xMQ(jT2);
                drawContextMx2.Uo(graphicsLayerMUb);
            }
        }
        if (z3) {
            canvas.n();
        }
        if (z2) {
            canvas.o();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasNr.restore();
    }

    public final void M(float f3) {
        if (this.impl.getRotationZ() == f3) {
            return;
        }
        this.impl.qie(f3);
    }

    public final void Nxk(float f3) {
        if (this.impl.getTranslationX() == f3) {
            return;
        }
        this.impl.ty(f3);
    }

    public final float S() {
        return this.impl.getScaleY();
    }

    public final void U(long j2) {
        if (Offset.mUb(this.pivotOffset, j2)) {
            return;
        }
        this.pivotOffset = j2;
        this.impl.fD(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Uo() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.e();
            childLayerDependenciesTracker.dependency = null;
        }
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null) {
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                ((GraphicsLayer) objArr[(i2 << 3) + i5]).e();
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            mutableScatterSet.ty();
        }
        this.impl.J2();
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float WPU() {
        return this.impl.getShadowElevation();
    }

    public final float XQ() {
        return this.impl.getScaleX();
    }

    public final void Xw(int i2) {
        if (CompositingStrategy.J2(this.impl.getCompositingStrategy(), i2)) {
            return;
        }
        this.impl.e(i2);
    }

    public final void Y(float f3) {
        if (this.impl.getTranslationY() == f3) {
            return;
        }
        this.impl.O(f3);
    }

    public final float Z() {
        return this.impl.getRotationZ();
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final void bzg(boolean z2) {
        if (this.clip != z2) {
            this.clip = z2;
            this.outlineDirty = true;
            O();
        }
    }

    public final androidx.compose.ui.graphics.Outline ck() {
        androidx.compose.ui.graphics.Outline rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jO = IntSizeKt.O(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != 9205357640488583168L) {
            jO = j3;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jO >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jO & 4294967295L));
        float f3 = this.roundRectCornerRadius;
        if (f3 > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.nr(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.rl((((long) Float.floatToRawIntBits(f3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f3))))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final void eF(float f3) {
        if (this.impl.getRotationX() == f3) {
            return;
        }
        this.impl.mUb(f3);
    }

    public final float g() {
        return this.impl.getTranslationY();
    }

    public final float gh() {
        return this.impl.getAlpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Continuation continuation) {
        GraphicsLayer$toImageBitmap$1 graphicsLayer$toImageBitmap$1;
        if (continuation instanceof GraphicsLayer$toImageBitmap$1) {
            graphicsLayer$toImageBitmap$1 = (GraphicsLayer$toImageBitmap$1) continuation;
            int i2 = graphicsLayer$toImageBitmap$1.f31674O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphicsLayer$toImageBitmap$1.f31674O = i2 - Integer.MIN_VALUE;
            } else {
                graphicsLayer$toImageBitmap$1 = new GraphicsLayer$toImageBitmap$1(this, continuation);
            }
        }
        Object objN = graphicsLayer$toImageBitmap$1.f31675n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = graphicsLayer$toImageBitmap$1.f31674O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            LayerSnapshotImpl layerSnapshotImpl = f31664g;
            graphicsLayer$toImageBitmap$1.f31674O = 1;
            objN = layerSnapshotImpl.n(this, graphicsLayer$toImageBitmap$1);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        return AndroidImageBitmap_androidKt.t((Bitmap) objN);
    }

    public final void nHg() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        J2();
    }

    public final float nY() {
        return this.impl.getTranslationX();
    }

    public final float o() {
        return this.impl.getRotationY();
    }

    public final void p5(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.KN(renderEffect);
    }

    public final int qie() {
        return this.impl.getBlendMode();
    }

    public final float r() {
        return this.impl.getRotationX();
    }

    public final void rV9(float f3) {
        if (this.impl.getCameraDistance() == f3) {
            return;
        }
        this.impl.xMQ(f3);
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    public final ColorFilter ty() {
        return this.impl.getColorFilter();
    }

    public final void v(long j2) {
        if (Color.HI(j2, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.iF(j2);
    }

    public final void wTp(float f3) {
        if (this.impl.getAlpha() == f3) {
            return;
        }
        this.impl.rl(f3);
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.INSTANCE;
        this.roundRectOutlineTopLeft = companion.t();
        this.roundRectOutlineSize = Size.INSTANCE.n();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.X(false);
        this.topLeft = IntOffset.INSTANCE.rl();
        this.size = IntSize.INSTANCE.n();
        this.pivotOffset = companion.rl();
    }

    public final void X(Density density, LayoutDirection layoutDirection, long size, Function1 block) {
        a(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.g(true);
        T();
    }

    public final void jB(Path path) {
        s7N();
        this.outlinePath = path;
        O();
    }

    public final void xMQ(androidx.compose.ui.graphics.Canvas canvas) {
        if (!AndroidCanvas_androidKt.nr(canvas).isHardwareAccelerated() && !this.impl.getSupportsSoftwareRendering()) {
            return;
        }
        N();
        this.impl.nHg(canvas);
    }
}
