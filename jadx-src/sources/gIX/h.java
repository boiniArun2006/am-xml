package gIX;

import HI0.AbstractC1370c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.palette.graphics.Palette;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.MediaUriInfoKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import d.AbstractC1951j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class h {
    public static final Pair n(Context context, List list, List scenes, SceneThumbnailMaker sceneThumbnailMaker) {
        List listListOf;
        Palette.Swatch swatchXMQ;
        List selectedProjects = list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        SceneThumbnailMaker thumbnailMaker = sceneThumbnailMaker;
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        List listTake = CollectionsKt.take(selectedProjects, 9);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProjectInfo projectInfo = (ProjectInfo) next;
            Scene sceneUnserializeScene$default = (Scene) CollectionsKt.getOrNull(scenes, i2);
            if (sceneUnserializeScene$default == null) {
                sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(context, projectInfo.getId()), null, 1, null), false, false, false, 14, null);
            }
            Iterator<T> it2 = sceneUnserializeScene$default.getMediaInfo().values().iterator();
            while (it2.hasNext()) {
                MediaUriInfoKt.updateCache((MediaUriInfo) it2.next());
            }
            Integer numValueOf = Integer.valueOf(SceneKt.getThumbTime(sceneUnserializeScene$default));
            if (sceneUnserializeScene$default.getType() == SceneType.ELEMENT) {
                z2 = false;
            }
            arrayList.add(SceneThumbnailMaker.makeThumbnail$default(thumbnailMaker, sceneUnserializeScene$default, null, numValueOf, z2, 2, null));
            thumbnailMaker = sceneThumbnailMaker;
            i2 = i3;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1200, 1200, Bitmap.Config.ARGB_8888);
        String str = "createBitmap(...)";
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-14736582);
        char c2 = 2;
        switch (arrayList.size()) {
            case 1:
                listListOf = CollectionsKt.listOf(1);
                break;
            case 2:
                listListOf = CollectionsKt.listOf(2);
                break;
            case 3:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{1, 2});
                break;
            case 4:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{2, 2});
                break;
            case 5:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{2, 3});
                break;
            case 6:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{3, 3});
                break;
            case 7:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{2, 2, 3});
                break;
            case 8:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{2, 3, 3});
                break;
            case 9:
                listListOf = CollectionsKt.listOf((Object[]) new Integer[]{3, 3, 3});
                break;
            default:
                listListOf = CollectionsKt.emptyList();
                break;
        }
        if (!listListOf.isEmpty()) {
            float height = bitmapCreateBitmap.getHeight() / listListOf.size();
            Paint paint = new Paint(1);
            Iterator it3 = listListOf.iterator();
            int i5 = 0;
            int i7 = 0;
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i8 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int iIntValue = ((Number) next2).intValue();
                char c4 = c2;
                float width = bitmapCreateBitmap.getWidth() / iIntValue;
                int i9 = 0;
                while (i9 < iIntValue) {
                    int i10 = i7 + 1;
                    ProjectInfo projectInfo2 = (ProjectInfo) selectedProjects.get(i7);
                    Bitmap bitmapNr = (Bitmap) arrayList.get(i7);
                    if (projectInfo2.getType() == SceneType.ELEMENT) {
                        bitmapNr = AbstractC1370c.nr(bitmapNr, MathKt.roundToInt(width), MathKt.roundToInt(height));
                    }
                    Bitmap bitmap = bitmapNr;
                    float f3 = i5 * height;
                    float f4 = i9 * width;
                    Iterator it4 = it3;
                    float f5 = height;
                    Pair pairUo = AbstractC1951j.Uo(MathKt.roundToInt(width), MathKt.roundToInt(height), bitmap.getWidth(), bitmap.getHeight());
                    int iIntValue2 = ((Number) pairUo.component1()).intValue();
                    int iIntValue3 = ((Number) pairUo.component2()).intValue();
                    int width2 = (bitmap.getWidth() - iIntValue2) / 2;
                    int height2 = (bitmap.getHeight() - iIntValue3) / 2;
                    float f6 = width;
                    Rect rect = new Rect(width2, height2, iIntValue2 + width2, height2 + iIntValue3);
                    Palette paletteN = Palette.rl(bitmapCreateBitmap).n();
                    Intrinsics.checkNotNullExpressionValue(paletteN, "generate(...)");
                    Palette.Swatch swatchKN = paletteN.KN();
                    boolean z3 = swatchKN == null || ((double) swatchKN.t()[c4]) > 0.5d;
                    if (z3) {
                        swatchXMQ = paletteN.J2();
                        if (swatchXMQ == null && (swatchXMQ = paletteN.xMQ()) == null && (swatchXMQ = paletteN.mUb()) == null && (swatchXMQ = paletteN.qie()) == null && (swatchXMQ = paletteN.Uo()) == null) {
                            swatchXMQ = paletteN.KN();
                        }
                    } else {
                        swatchXMQ = paletteN.xMQ();
                        if (swatchXMQ == null && (swatchXMQ = paletteN.J2()) == null && (swatchXMQ = paletteN.Uo()) == null && (swatchXMQ = paletteN.qie()) == null && (swatchXMQ = paletteN.mUb()) == null) {
                            swatchXMQ = paletteN.KN();
                        }
                    }
                    int iO = swatchXMQ != null ? swatchXMQ.O() : z3 ? -12303292 : -6710887;
                    int i11 = ColorKt.toInt(ColorKt.atop(HI0.qf.t(1073741823 & iO), SolidColor.INSTANCE.getWHITE()));
                    int i12 = 536870911 & iO;
                    int i13 = iO & 805306367;
                    float fMax = Math.max(bitmap.getWidth(), bitmap.getHeight()) / 20.0f;
                    int iCeil = (int) Math.ceil(r7 / fMax);
                    int i14 = i5;
                    ArrayList arrayList2 = arrayList;
                    int iCeil2 = (int) Math.ceil(r4 / fMax);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, str);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    canvas2.drawColor(i11);
                    paint.setStyle(Paint.Style.FILL);
                    int i15 = 0;
                    while (i15 < iCeil2) {
                        float f7 = i15 * fMax;
                        String str2 = str;
                        int i16 = 0;
                        while (i16 < iCeil) {
                            int i17 = iCeil2;
                            float f8 = i16 * fMax;
                            int i18 = i16;
                            paint.setColor(((i15 % 2) + i16) % 2 == 0 ? i12 : i13);
                            int i19 = i9;
                            float f9 = f7;
                            canvas2.drawRect(f8, f9, f8 + fMax, f7 + fMax, paint);
                            iIntValue = iIntValue;
                            i16 = i18 + 1;
                            f7 = f9;
                            i9 = i19;
                            iCeil2 = i17;
                        }
                        i15++;
                        str = str2;
                        iCeil2 = iCeil2;
                    }
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmapCreateBitmap2, rect, new RectF(f4, f3, f4 + f6, f3 + f5), paint);
                    i9++;
                    selectedProjects = list;
                    it3 = it4;
                    height = f5;
                    i7 = i10;
                    width = f6;
                    i5 = i14;
                    arrayList = arrayList2;
                    str = str;
                }
                c2 = c4;
                selectedProjects = list;
                i5 = i8;
            }
        }
        Bitmap bitmapT = AbstractC1370c.t(bitmapCreateBitmap, 512, 512);
        Bitmap bitmapT2 = AbstractC1370c.t(bitmapT, 256, 256);
        Bitmap bitmapT3 = AbstractC1370c.t(bitmapT, 128, 128);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        bitmapCreateBitmap.compress(compressFormat, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        bitmapT.compress(compressFormat, 80, byteArrayOutputStream);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        bitmapT2.compress(compressFormat, 90, byteArrayOutputStream);
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        bitmapT3.compress(compressFormat, 90, byteArrayOutputStream);
        byte[] byteArray4 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNull(byteArray);
        Intrinsics.checkNotNull(byteArray2);
        Intrinsics.checkNotNull(byteArray3);
        Intrinsics.checkNotNull(byteArray4);
        new Lu(byteArray, byteArray2, byteArray3, byteArray4);
        return new Pair(new Lu(byteArray, byteArray2, byteArray3, byteArray4), new aC(bitmapCreateBitmap, bitmapT, bitmapT2, bitmapT3));
    }
}
