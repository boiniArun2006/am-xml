package androidx.compose.ui.res;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "t", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Landroidx/compose/ui/graphics/vector/ImageVector;", "rl", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "", JavetError.PARAMETER_PATH, "Landroidx/compose/ui/graphics/ImageBitmap;", c.f62177j, "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/ImageBitmap;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n75#2:125\n75#2:126\n75#2:127\n75#2:134\n1247#3,6:128\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:125\n61#1:126\n63#1:127\n91#1:134\n74#1:128,6\n*E\n"})
public final class PainterResources_androidKt {
    private static final ImageBitmap n(CharSequence charSequence, Resources resources, int i2) {
        try {
            return ImageResources_androidKt.n(ImageBitmap.INSTANCE, resources, i2);
        } catch (Exception e2) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
        }
    }

    private static final ImageVector rl(Resources.Theme theme, Resources resources, int i2, int i3, Composer composer, int i5) throws XmlPullParserException, IOException {
        if (ComposerKt.v()) {
            ComposerKt.p5(21855625, i5, -1, pTYaLzzmJSGAPQ.BBTjPR);
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.ty(AndroidCompositionLocals_androidKt.KN());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntryRl = imageVectorCache.rl(key);
        if (imageVectorEntryRl == null) {
            XmlResourceParser xml = resources.getXml(i2);
            if (Intrinsics.areEqual(XmlVectorParser_androidKt.mUb(xml).getName(), "vector")) {
                imageVectorEntryRl = VectorResources_androidKt.n(theme, resources, xml, i3);
                imageVectorCache.nr(key, imageVectorEntryRl);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
        }
        ImageVector imageVector = imageVectorEntryRl.getImageVector();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return imageVector;
    }

    public static final Painter t(int i2, Composer composer, int i3) {
        Painter painterKN;
        if (ComposerKt.v()) {
            ComposerKt.p5(473971343, i3, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
        composer.ty(AndroidCompositionLocals_androidKt.J2());
        Resources resources = context.getResources();
        TypedValue typedValueRl = ((ResourceIdCache) composer.ty(AndroidCompositionLocals_androidKt.xMQ())).rl(resources, i2);
        CharSequence charSequence = typedValueRl.string;
        boolean z2 = true;
        if (charSequence != null && StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            composer.eF(-803043333);
            painterKN = VectorPainterKt.KN(rl(context.getTheme(), resources, i2, typedValueRl.changingConfigurations, composer, (i3 << 6) & 896), composer, 0);
            composer.Xw();
        } else {
            composer.eF(-802887899);
            Object theme = context.getTheme();
            boolean zP5 = composer.p5(charSequence);
            if ((((i3 & 14) ^ 6) <= 4 || !composer.t(i2)) && (i3 & 6) != 4) {
                z2 = false;
            }
            boolean zP52 = composer.p5(theme) | zP5 | z2;
            Object objIF = composer.iF();
            if (zP52 || objIF == Composer.INSTANCE.n()) {
                objIF = n(charSequence, resources, i2);
                composer.o(objIF);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) objIF, 0L, 0L, 6, null);
            composer.Xw();
            painterKN = bitmapPainter;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return painterKN;
    }
}
