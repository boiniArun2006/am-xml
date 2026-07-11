package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RequiresApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Landroid/content/Context;", "context", "", "Landroid/graphics/fonts/FontVariationAxis;", "nr", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "Landroid/content/res/AssetManager;", "assetManager", "", JavetError.PARAMETER_PATH, "variationSettings", "Landroid/graphics/Typeface;", c.f62177j, "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Ljava/io/File;", FileUploadManager.f61570h, "rl", "(Ljava/io/File;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "t", "(Landroid/os/ParcelFileDescriptor;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,241:1\n150#2,3:242\n34#2,6:245\n153#2:251\n37#3,2:252\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.android.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n235#1:242,3\n235#1:245,6\n235#1:251\n238#1:252,2\n*E\n"})
final class TypefaceBuilderCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypefaceBuilderCompat f33732n = new TypefaceBuilderCompat();

    private final FontVariationAxis[] nr(FontVariation.Settings settings, Context context) {
        Density densityN;
        if (context != null) {
            densityN = AndroidDensity_androidKt.n(context);
        } else {
            if (settings.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            densityN = DensityKt.n(1.0f, 1.0f);
        }
        List settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i2 = 0; i2 < size; i2++) {
            FontVariation.Setting setting = (FontVariation.Setting) settings2.get(i2);
            CN3.n();
            arrayList.add(Wre.n(setting.getAxisName(), setting.rl(densityN)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    public final android.graphics.Typeface n(AssetManager assetManager, String path, Context context, FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return I28.n(assetManager, path).setFontVariationSettings(nr(variationSettings, context)).build();
    }

    public final android.graphics.Typeface rl(File file, Context context, FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return Ml.n(file).setFontVariationSettings(nr(variationSettings, context)).build();
    }

    public final android.graphics.Typeface t(ParcelFileDescriptor fileDescriptor, Context context, FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        Dsr.n();
        return fuX.n(fileDescriptor.getFileDescriptor()).setFontVariationSettings(nr(variationSettings, context)).build();
    }

    private TypefaceBuilderCompat() {
    }
}
