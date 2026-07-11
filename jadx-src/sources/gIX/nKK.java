package gIX;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.CameraElementKt;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.FillType;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.ShapeElementKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.TrimmingKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.ads.internal.protos.Sdk;
import d.AbstractC1951j;
import gIX.rv6;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import yc.m8h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class nKK {
    private static final void KN(Context context, Bitmap bitmap, rv6.w6 w6Var, TextPaint textPaint, Canvas canvas) {
        Drawable drawableJ2;
        textPaint.setShader(null);
        textPaint.setAlpha(255);
        Rect rectO = w6Var.O();
        int color = context.getResources().getColor(2131100859, null);
        int color2 = context.getResources().getColor(2131100857, null);
        rv6.w6.C0944w6 c0944w6 = rv6.w6.C0944w6.KN;
        if (Intrinsics.areEqual(w6Var, c0944w6) || Intrinsics.areEqual(w6Var, rv6.w6.Ml.KN)) {
            drawableJ2 = ResourcesCompat.J2(context.getResources(), 2131230978, null);
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.n.KN)) {
            drawableJ2 = AppCompatResources.rl(context, 2131230979);
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.I28.KN)) {
            drawableJ2 = AppCompatResources.rl(context, 2131230980);
        } else {
            if (!(w6Var instanceof rv6.w6.j)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableJ2 = AppCompatResources.rl(context, ((rv6.w6.j) w6Var).Uo());
        }
        if (drawableJ2 != null) {
            drawableJ2.setBounds(w6Var.J2());
        }
        if (drawableJ2 != null) {
            drawableJ2.draw(canvas);
        }
        if (Intrinsics.areEqual(w6Var, c0944w6)) {
            textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.n.KN)) {
            textPaint.setXfermode(null);
            bitmap = r(bitmap, color);
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.I28.KN)) {
            textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
            bitmap = nr(bitmap);
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.Ml.KN)) {
            textPaint.setXfermode(null);
            bitmap = r(bitmap, color);
        } else {
            if (!(w6Var instanceof rv6.w6.j)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setXfermode(null);
            bitmap = r(bitmap, color2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rectO, textPaint);
        textPaint.setXfermode(null);
    }

    private static final void ty(TextPaint textPaint, Canvas canvas) {
        textPaint.setAntiAlias(true);
        textPaint.setFilterBitmap(true);
        canvas.drawColor(-1);
    }

    private static final void xMQ(rv6 rv6Var, TextPaint textPaint, Canvas canvas) {
        textPaint.setShader(null);
        textPaint.setAlpha(255);
        textPaint.setXfermode(null);
        textPaint.setColor(-3355444);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(3.0f);
        canvas.drawRoundRect(new RectF(rv6Var.rl()), rv6Var.nr(), rv6Var.nr(), textPaint);
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExportedVideoAttachment.values().length];
            try {
                iArr[ExportedVideoAttachment.QR_CODE_INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExportedVideoAttachment.QR_CODE_OUTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExportedVideoAttachment.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Bitmap HI(String link, Integer num) {
        Map mapMutableMapOf;
        Intrinsics.checkNotNullParameter(link, "link");
        if (num != null) {
            try {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(WS.n.MARGIN, Integer.valueOf(num.intValue())));
                if (mapMutableMapOf == null) {
                    mapMutableMapOf = new LinkedHashMap();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else {
            mapMutableMapOf = new LinkedHashMap();
        }
        b1b.n nVarN = new WS.w6().n(link, WS.j.QR_CODE, 500, 500, mapMutableMapOf);
        int iO = nVarN.O();
        int iNr = nVarN.nr();
        int[] iArr = new int[iO * iNr];
        for (int i2 = 0; i2 < iNr; i2++) {
            int i3 = i2 * iO;
            for (int i5 = 0; i5 < iO; i5++) {
                iArr[i3 + i5] = nVarN.t(i2, i5) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iO, iNr, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, 500, 0, 0, iO, iNr);
        return bitmapCreateBitmap;
    }

    public static final File Ik(String filename, Bitmap bitmap, Context context) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(context, "context");
        if (StringsKt.contains$default((CharSequence) filename, (CharSequence) "/", false, 2, (Object) null) || filename.length() <= 0) {
            throw new IllegalArgumentException(("'filename' must be not be empty and may not contain slashes: '" + filename + "'").toString());
        }
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(FilesKt.resolve(FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK), "t" + System.currentTimeMillis()), filename + ".jpg");
        if (fileResolve.exists()) {
            throw new IllegalStateException("Check failed.");
        }
        File parentFile = fileResolve.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (fileResolve.exists()) {
            return fileResolve;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            CloseableKt.closeFinally(fileOutputStream, null);
            return fileResolve;
        } finally {
        }
    }

    private static final void J2(Bitmap bitmap, rv6.w6 w6Var, TextPaint textPaint, Canvas canvas) {
        if (bitmap == null) {
            if (Intrinsics.areEqual(w6Var, rv6.w6.n.KN)) {
                textPaint.setShader(new LinearGradient(0.0f, 0.0f, w6Var.t(), w6Var.n(), -9831273, -10689025, Shader.TileMode.CLAMP));
            } else if (Intrinsics.areEqual(w6Var, rv6.w6.C0944w6.KN)) {
                textPaint.setShader(new LinearGradient(0.0f, 0.0f, w6Var.t(), w6Var.n(), -11350895, -11690314, Shader.TileMode.CLAMP));
            } else {
                if (!Intrinsics.areEqual(w6Var, rv6.w6.Ml.KN) && !Intrinsics.areEqual(w6Var, rv6.w6.I28.KN) && !(w6Var instanceof rv6.w6.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                textPaint.setShader(null);
            }
        }
        RectF rectF = new RectF(w6Var.rl());
        float fNr = w6Var.nr();
        if (Intrinsics.areEqual(w6Var, rv6.w6.C0944w6.KN)) {
            canvas.drawRect(w6Var.O(), textPaint);
        } else if (Intrinsics.areEqual(w6Var, rv6.w6.n.KN)) {
            canvas.drawRoundRect(rectF, fNr, fNr, textPaint);
        }
    }

    public static final rv6.w6.j O(Scene scene) {
        int width;
        int iRoundToInt;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        double width2 = ((double) scene.getWidth()) / ((double) scene.getHeight());
        int i2 = width2 >= 1.7777777777777777d ? 2131232208 : width2 >= 1.3333333333333333d ? 2131232210 : width2 > 0.5625d ? 2131232209 : 2131232211;
        if (width2 >= 1.0d) {
            iRoundToInt = scene.getHeight();
            width = MathKt.roundToInt(((double) iRoundToInt) * Z(i2));
        } else {
            width = scene.getWidth();
            iRoundToInt = MathKt.roundToInt(((double) width) / Z(i2));
        }
        int i3 = iRoundToInt;
        int i5 = width;
        double d2 = i5;
        double dXQ = XQ(i2) * d2;
        double dS = S(i2) * d2;
        Rect rect = new Rect();
        rect.top = 0;
        rect.bottom = i3;
        rect.left = 0;
        rect.right = i5;
        return new rv6.w6.j(i5, i3, (int) dXQ, (int) dS, i2, rect);
    }

    public static final void aYN(Context context, Throwable throwable, String title, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        String message2 = throwable.getMessage();
        if (message2 == null && (message2 = throwable.getLocalizedMessage()) == null) {
            message2 = throwable.getClass().getSimpleName();
        }
        new AlertDialog.Builder(context).setTitle(title).setMessage(message + "\n\nReason: " + message2 + "\n\nVersion: 5.0.273.1028425(1028425)").setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: gIX.Ew
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                nKK.ViF(dialogInterface, i2);
            }
        }).create().show();
    }

    public static /* synthetic */ Bitmap ck(String str, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return HI(str, num);
    }

    public static final Bitmap gh(Context context, String title, String str, rv6.w6 qrCodeStyle, Bitmap bitmap, Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(qrCodeStyle, "qrCodeStyle");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(qrCodeStyle.t(), qrCodeStyle.n(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        TextPaint textPaint = new TextPaint();
        ty(textPaint, canvas);
        boolean z2 = qrCodeStyle instanceof rv6.w6.j;
        if (!z2) {
            J2(bitmap2, qrCodeStyle, textPaint, canvas);
            if (bitmap2 != null) {
                Uo(bitmap2, qrCodeStyle, textPaint, canvas);
            }
        }
        if (bitmap != null) {
            KN(context, bitmap, qrCodeStyle, textPaint, canvas);
        }
        if (!z2) {
            xMQ(qrCodeStyle, textPaint, canvas);
            az(context, title, str, qrCodeStyle, textPaint, canvas);
        }
        return bitmapCreateBitmap;
    }

    public static final Bitmap mUb(Context context, String link, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        rv6.n nVar = rv6.n.KN;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(nVar.t(), nVar.n(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        TextPaint textPaint = new TextPaint();
        ty(textPaint, canvas);
        if (bitmap != null) {
            Uo(bitmap, nVar, textPaint, canvas);
        }
        xMQ(nVar, textPaint, canvas);
        az(context, link, null, nVar, textPaint, canvas);
        return bitmapCreateBitmap;
    }

    private static final Bitmap nr(Bitmap bitmap) {
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    private static final Pair o(ExportedVideoAttachment exportedVideoAttachment) {
        int i2 = j.$EnumSwitchMapping$0[exportedVideoAttachment.ordinal()];
        if (i2 == 1) {
            return TuplesKt.to(Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS), 0);
        }
        if (i2 == 2) {
            return TuplesKt.to(0, Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        }
        if (i2 == 3) {
            return TuplesKt.to(0, 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Bitmap qie(Context context, String str, String str2, rv6.w6 w6Var, Bitmap bitmap, Bitmap bitmap2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            bitmap2 = null;
        }
        return gh(context, str, str2, w6Var, bitmap, bitmap2);
    }

    public static final Pair rl(Activity activity, Scene scene, ExportParams params, ExportedVideoAttachment exportedVideoAttachment, File file, rv6.w6.j qrStyle) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(exportedVideoAttachment, "exportedVideoAttachment");
        Intrinsics.checkNotNullParameter(qrStyle, "qrStyle");
        if (file == null) {
            return TuplesKt.to(scene, params);
        }
        Pair pairO = o(exportedVideoAttachment);
        int iIntValue = ((Number) pairO.component1()).intValue();
        int iIntValue2 = ((Number) pairO.component2()).intValue();
        if (iIntValue == 0 && iIntValue2 == 0) {
            return TuplesKt.to(scene, params);
        }
        SceneHolder SceneHolder = SceneKt.SceneHolder(scene);
        if (iIntValue != 0) {
            t(SceneHolder);
            WPU(SceneHolder, iIntValue);
        }
        Pair pairUo = AbstractC1951j.Uo(qrStyle.xMQ(), qrStyle.KN(), SceneHolder.getScene().getWidth(), SceneHolder.getScene().getHeight());
        int iIntValue3 = ((Number) pairUo.component1()).intValue();
        int iIntValue4 = ((Number) pairUo.component2()).intValue();
        int color = activity.getColor(2131100858);
        int i2 = 0;
        Iterator it = CollectionsKt.zip(CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(SceneHolder.getRootScene().getTotalTime())}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)})).iterator();
        ExportParams exportParamsCopy$default = params;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int iIntValue5 = ((Number) pair.component1()).intValue();
            int iIntValue6 = ((Number) pair.component2()).intValue();
            if (iIntValue6 != 0) {
                SceneElement sceneElementMakeDefaultCamera = CameraElementKt.makeDefaultCamera(scene);
                int i3 = iIntValue5 + iIntValue6;
                SceneHolder.DefaultImpls.add$default(SceneHolder, SceneElement.copy$default(sceneElementMakeDefaultCamera, null, iIntValue5, i3, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null), i2, 2, null);
                SceneHolder.DefaultImpls.add$default(SceneHolder, ShapeElementKt.ShapeElement(m8h.n(activity, scene, sceneElementMakeDefaultCamera), iIntValue5, i3, CubicBSplineKt.toCompound(tTF.j.n((-SceneHolder.getScene().getWidth()) / 2.0f, (-SceneHolder.getScene().getHeight()) / 2.0f, SceneHolder.getScene().getWidth() / 2.0f, SceneHolder.getScene().getHeight() / 2.0f)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : KeyableKt.keyable(HI0.qf.t(color)), (55264 & 32) != 0 ? null : null, (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : null, (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : FillType.COLOR, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(SceneHolder.getScene().getWidth() / 2.0f, SceneHolder.getScene().getHeight() / 2.0f))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null);
                float f3 = iIntValue3 / 2.0f;
                float f4 = iIntValue4 / 2.0f;
                i2 = 0;
                SceneHolder.DefaultImpls.add$default(SceneHolder, ShapeElementKt.ShapeElement(m8h.n(activity, scene, sceneElementMakeDefaultCamera), iIntValue5, i3, CubicBSplineKt.toCompound(tTF.j.n((-iIntValue3) / 2.0f, (-iIntValue4) / 2.0f, f3, f4)), (55264 & 16) != 0 ? KeyableKt.keyable(new SolidColor(1.0f, 1.0f, 1.0f, 1.0f)) : null, (55264 & 32) != 0 ? null : Uri.fromFile(file), (55264 & 64) != 0 ? null : null, (55264 & 128) != 0 ? 0L : 0L, (55264 & 256) != 0 ? "" : null, (55264 & 512) != 0 ? 0 : 0, (55264 & 1024) != 0 ? Integer.MAX_VALUE : 0, (55264 & 2048) != 0 ? FillType.COLOR : FillType.MEDIA, (55264 & 4096) != 0 ? false : false, (55264 & 8192) != 0 ? LiveShapeRef.INSTANCE.getNONE() : new LiveShapeRef("com.alightcreative.shapes.rect", MapsKt.mapOf(TuplesKt.to("size", new KeyableUserParameterValue(new Vector2D(f3, f4))))), (55264 & 16384) != 0 ? BlendingMode.NORMAL : null, (55264 & 32768) != 0 ? KeyableEdgeDecoration.INSTANCE.getNO_STROKE() : null), 0, 2, null);
                exportParamsCopy$default = ExportParams.copy$default(exportParamsCopy$default, 0, 0, 0, 0, 0, 0, null, false, false, 0, 0, null, null, 0, 0, iIntValue5, iIntValue6, 0, false, 425983, null);
                it = it;
            }
        }
        return TuplesKt.to(SceneHolder.getRootScene(), ExportParams.copy$default(exportParamsCopy$default, 0, 0, 0, 0, 0, 0, null, false, false, 0, TimeKt.frameNumberFromTime(SceneHolder.getRootScene().getTotalTime(), scene.getFramesPerHundredSeconds()) - 1, null, null, 0, 0, 0, 0, 0, false, 523263, null));
    }

    private static final double S(int i2) {
        switch (i2) {
            case 2131232208:
                return 0.262d;
            case 2131232209:
                return 0.5189777777777778d;
            case 2131232210:
                return 0.34340000000000004d;
            case 2131232211:
                return 0.9048d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static final void Uo(Bitmap bitmap, rv6 rv6Var, TextPaint textPaint, Canvas canvas) {
        Rect rectRl = rv6Var.rl();
        float fNr = rv6Var.nr();
        RectF rectF = new RectF(rectRl);
        textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rectRl, rectRl, textPaint);
        textPaint.setXfermode(null);
        if (Intrinsics.areEqual(rv6Var, rv6.w6.I28.KN)) {
            textPaint.setColor(-16777216);
            textPaint.setAlpha(180);
        } else {
            textPaint.setColor(-1);
            textPaint.setAlpha(190);
        }
        canvas.drawRoundRect(rectF, fNr, fNr, textPaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private static final void WPU(SceneHolder sceneHolder, int i2) {
        for (SceneElement sceneElement : sceneHolder.getScene().getElements()) {
            sceneHolder.update(SceneElement.copy$default(sceneElement, null, sceneElement.getStartTime() + i2, sceneElement.getEndTime() + i2, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -7, 127, null));
        }
    }

    private static final double XQ(int i2) {
        switch (i2) {
            case 2131232208:
                return 0.21050000000000002d;
            case 2131232209:
                return 0.3368d;
            case 2131232210:
                return 0.2526d;
            case 2131232211:
                return 0.4116444444444445d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static final double Z(int i2) {
        switch (i2) {
            case 2131232208:
                return 1.7777777777777777d;
            case 2131232209:
                return 1.0d;
            case 2131232210:
                return 1.3333333333333333d;
            case 2131232211:
                return 0.5625d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static final void az(Context context, String str, String str2, rv6 rv6Var, TextPaint textPaint, Canvas canvas) {
        int i2;
        Layout.Alignment alignment;
        int iT = rv6Var.t();
        int iN = rv6Var.n();
        int color = context.getResources().getColor(2131100859, null);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(35.0f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        if (Intrinsics.areEqual(rv6Var, rv6.w6.I28.KN)) {
            color = -1;
        }
        textPaint.setColor(color);
        canvas.save();
        int iMeasureText = iT - 21;
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Integer.min((int) textPaint.measureText(str), iMeasureText));
        boolean z2 = rv6Var instanceof rv6.n;
        if (z2) {
            i2 = 10;
        } else if (str2 != null) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        StaticLayout.Builder maxLines = builderObtain.setMaxLines(i2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout.Builder ellipsize = maxLines.setEllipsize(truncateAt);
        if (z2) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        StaticLayout staticLayoutBuild = ellipsize.setAlignment(alignment).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        if (rv6Var instanceof rv6.w6) {
            canvas.translate((iT - staticLayoutBuild.getWidth()) / 2, 21.0f);
        } else {
            canvas.translate(21, (iN - staticLayoutBuild.getHeight()) / 2.0f);
        }
        staticLayoutBuild.draw(canvas);
        if (str2 != null) {
            canvas.translate(-((iT - staticLayoutBuild.getWidth()) / 2), 0.0f);
            if (textPaint.measureText(str2) <= iMeasureText) {
                iMeasureText = (int) textPaint.measureText(str2);
            }
            StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, iMeasureText).setMaxLines(1).setEllipsize(truncateAt).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild2, "build(...)");
            canvas.translate((iT - staticLayoutBuild2.getWidth()) / 2, staticLayoutBuild.getHeight());
            staticLayoutBuild2.draw(canvas);
        }
        canvas.restore();
    }

    private static final Bitmap r(Bitmap bitmap, int i2) {
        float fRed = Color.red(i2);
        float fGreen = Color.green(i2);
        float fBlue = Color.blue(i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fRed, 0.0f, 0.0f, 0.0f, 0.0f, fGreen, 0.0f, 0.0f, 0.0f, 0.0f, fBlue, -0.33f, -0.34f, -0.33f, 0.0f, 255.0f}));
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), paint);
        return bitmapCreateBitmap;
    }

    private static final void t(SceneHolder sceneHolder) {
        for (SceneElement sceneElement : sceneHolder.getScene().getElements()) {
            SceneElement sceneElementTrimStart = TrimmingKt.trimStart(sceneElement, 0, false);
            if (sceneElementTrimStart == null) {
                sceneElementTrimStart = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
            }
            sceneHolder.update(sceneElementTrimStart);
        }
    }
}
