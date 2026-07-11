package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010=R\u001c\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010?R\u001c\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010?R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "<init>", "()V", "", "xMQ", "Landroidx/compose/ui/geometry/Rect;", "rect", "gh", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "qie", "(Landroidx/compose/ui/geometry/RoundRect;)V", "Landroidx/compose/ui/graphics/Path;", "composePath", "mUb", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "Landroidx/compose/ui/geometry/Size;", "size", "", "radius", "", "Uo", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "Landroidx/compose/ui/graphics/Outline;", "outline", "alpha", "clipToOutline", "elevation", "KN", "(Landroidx/compose/ui/graphics/Outline;FZFJ)Z", "position", "J2", "(J)Z", "Landroidx/compose/ui/graphics/Canvas;", "canvas", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/graphics/Canvas;)V", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "rl", "Landroid/graphics/Outline;", "cachedOutline", "t", "Landroidx/compose/ui/graphics/Outline;", "nr", "Landroidx/compose/ui/graphics/Path;", "cachedRrectPath", "O", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Landroidx/compose/ui/geometry/RoundRect;", "tmpRoundRect", "F", "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "az", "outlineNeeded", "ty", "tmpTouchPointPath", "HI", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 12 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n1#2:323\n65#3:324\n69#3:327\n65#3:329\n69#3:332\n65#3:335\n69#3:339\n65#3:347\n69#3:350\n65#3:353\n69#3:357\n65#3:404\n69#3:407\n65#3:410\n69#3:414\n60#4:325\n70#4:328\n60#4:330\n70#4:333\n60#4:336\n70#4:340\n53#4,3:344\n60#4:348\n70#4:351\n60#4:354\n70#4:358\n60#4:362\n70#4:365\n53#4,3:367\n53#4,3:377\n60#4:385\n53#4,3:388\n53#4,3:392\n60#4:405\n70#4:408\n60#4:411\n70#4:415\n60#4:419\n22#5:326\n22#5:331\n22#5:334\n22#5:337\n22#5:341\n22#5:349\n22#5:352\n22#5:355\n22#5:359\n22#5:363\n26#5:380\n26#5:381\n26#5:382\n26#5:383\n22#5:386\n26#5:395\n26#5:396\n26#5:397\n26#5:398\n22#5:406\n22#5:409\n22#5:412\n22#5:416\n22#5:420\n57#6:338\n61#6:342\n57#6:356\n61#6:360\n57#6:361\n61#6:364\n57#6:413\n61#6:417\n33#7:343\n30#8:366\n30#8:387\n56#9,6:370\n33#10:376\n33#10:391\n48#11:384\n48#11:418\n36#12,5:399\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n166#1:324\n166#1:327\n194#1:329\n195#1:332\n196#1:335\n197#1:339\n213#1:347\n214#1:350\n215#1:353\n216#1:357\n306#1:404\n307#1:407\n308#1:410\n309#1:414\n166#1:325\n166#1:328\n194#1:330\n195#1:333\n196#1:336\n197#1:340\n198#1:344,3\n213#1:348\n214#1:351\n215#1:354\n216#1:358\n231#1:362\n231#1:365\n249#1:367,3\n250#1:377,3\n260#1:385\n261#1:388,3\n262#1:392,3\n306#1:405\n307#1:408\n308#1:411\n309#1:415\n310#1:419\n166#1:326\n194#1:331\n195#1:334\n196#1:337\n197#1:341\n213#1:349\n214#1:352\n215#1:355\n216#1:359\n231#1:363\n252#1:380\n253#1:381\n254#1:382\n255#1:383\n260#1:386\n265#1:395\n266#1:396\n267#1:397\n268#1:398\n306#1:406\n307#1:409\n308#1:412\n309#1:416\n310#1:420\n196#1:338\n197#1:342\n215#1:356\n216#1:360\n231#1:361\n231#1:364\n308#1:413\n309#1:417\n198#1:343\n249#1:366\n261#1:387\n250#1:370,6\n250#1:376\n262#1:391\n260#1:384\n310#1:418\n286#1:399,5\n*E\n"})
public final class OutlineResolver {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private Path tmpOpPath;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean cacheIsDirty;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Path tmpPath;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Path outlinePath;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private boolean outlineNeeded;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private long rectTopLeft;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float roundedCornerRadius;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline = true;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Path cachedRrectPath;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long rectSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Outline cachedOutline;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.Outline outline;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private Path tmpTouchPointPath;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private RoundRect tmpRoundRect;

    private final boolean Uo(RoundRect roundRect, long j2, long j3, float f3) {
        if (roundRect != null && RoundRectKt.Uo(roundRect)) {
            int i2 = (int) (j2 >> 32);
            if (roundRect.getLeft() == Float.intBitsToFloat(i2)) {
                int i3 = (int) (j2 & 4294967295L);
                if (roundRect.getTop() == Float.intBitsToFloat(i3) && roundRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() == Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)) && roundRect.getBottom() == Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32)) == f3) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void mUb(Path composePath) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28 || composePath.rl()) {
            if (i2 >= 30) {
                OutlineVerificationHelper.f33012n.n(this.cachedOutline, composePath);
            } else {
                Outline outline = this.cachedOutline;
                if (!(composePath instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((AndroidPath) composePath).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void xMQ() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.t();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof Outline.Rectangle) {
                gh(((Outline.Rectangle) outline).rl());
            } else if (outline instanceof Outline.Rounded) {
                qie(((Outline.Rounded) outline).getRoundRect());
            } else if (outline instanceof Outline.Generic) {
                mUb(((Outline.Generic) outline).getPath());
            }
        }
    }

    public final boolean J2(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.rl(outline, Float.intBitsToFloat((int) (position >> 32)), Float.intBitsToFloat((int) (position & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean KN(androidx.compose.ui.graphics.Outline outline, float alpha, boolean clipToOutline, float elevation, long size) {
        this.cachedOutline.setAlpha(alpha);
        boolean zAreEqual = Intrinsics.areEqual(this.outline, outline);
        boolean z2 = !zAreEqual;
        if (!zAreEqual) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = size;
        boolean z3 = outline != null && (clipToOutline || elevation > 0.0f);
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        return z2;
    }

    public final boolean O() {
        return !this.usePathForClip;
    }

    public final void n(Canvas canvas) {
        OutlineResolver outlineResolver;
        Path pathNr = nr();
        if (pathNr != null) {
            Canvas.gh(canvas, pathNr, 0, 2, null);
            return;
        }
        float f3 = this.roundedCornerRadius;
        if (f3 <= 0.0f) {
            Canvas.ty(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), Float.intBitsToFloat((int) (this.rectSize >> 32)) + Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (this.rectTopLeft & 4294967295L)), 0, 16, null);
            return;
        }
        Path pathN = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (pathN != null) {
            outlineResolver = this;
            if (!Uo(roundRect, this.rectTopLeft, this.rectSize, f3)) {
            }
            Canvas.gh(canvas, pathN, 0, 2, null);
        }
        outlineResolver = this;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (outlineResolver.rectSize >> 32)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (outlineResolver.rectSize & 4294967295L)) + Float.intBitsToFloat((int) (outlineResolver.rectTopLeft & 4294967295L));
        float f4 = outlineResolver.roundedCornerRadius;
        RoundRect roundRectNr = RoundRectKt.nr(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.rl((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)));
        if (pathN == null) {
            pathN = AndroidPath_androidKt.n();
        } else {
            pathN.reset();
        }
        Path.ty(pathN, roundRectNr, null, 2, null);
        outlineResolver.tmpRoundRect = roundRectNr;
        outlineResolver.tmpPath = pathN;
        Canvas.gh(canvas, pathN, 0, 2, null);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public OutlineResolver() {
        android.graphics.Outline outline = new android.graphics.Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.INSTANCE.t();
        this.rectSize = Size.INSTANCE.rl();
    }

    private final void gh(Rect rect) {
        float left = rect.getLeft();
        this.rectTopLeft = Offset.O((((long) Float.floatToRawIntBits(rect.getTop())) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float f3 = rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - rect.getLeft();
        this.rectSize = Size.nr((((long) Float.floatToRawIntBits(rect.xMQ() - rect.getTop())) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(rect.xMQ()));
    }

    private final void qie(RoundRect roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float left = roundRect.getLeft();
        this.rectTopLeft = Offset.O((((long) Float.floatToRawIntBits(roundRect.getTop())) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float fMUb = roundRect.mUb();
        this.rectSize = Size.nr((((long) Float.floatToRawIntBits(roundRect.nr())) & 4294967295L) | (Float.floatToRawIntBits(fMUb) << 32));
        if (RoundRectKt.Uo(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(roundRect.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        Path pathN = this.cachedRrectPath;
        if (pathN == null) {
            pathN = AndroidPath_androidKt.n();
            this.cachedRrectPath = pathN;
        }
        pathN.reset();
        Path.ty(pathN, roundRect, null, 2, null);
        mUb(pathN);
    }

    public final Path nr() {
        xMQ();
        return this.outlinePath;
    }

    public final android.graphics.Outline rl() {
        xMQ();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }
}
